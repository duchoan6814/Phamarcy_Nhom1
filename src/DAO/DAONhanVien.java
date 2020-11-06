package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAONhanVien extends DAO {

	public boolean kiemTraNhanVien(String maNhanVien) {
		String sql = "SELECT * from NhaVienBanThuoc WHERE NhanVienBanThuocId = ?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, maNhanVien);
			ResultSet result = ps.executeQuery();
			if (result.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
	}


	public int getTotalHoaDonByNhanVien(String maNhanVien) {
		String sql = "SELECT count(*) as TongSoHoaDon from HoaDon where NhanVienBanThuocId = ?";

		if (!kiemTraNhanVien(maNhanVien)) {
			return -1;
		}else {
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, maNhanVien);
				ResultSet result = ps.executeQuery();
				if (result.next()) {
					return result.getInt("TongSoHoaDon");
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return -1;
			}
		}
		return -1;
	}
}
