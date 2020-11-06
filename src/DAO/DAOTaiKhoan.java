package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.DiaChi;
import entity.NhanVienBanThuoc;

public class DAOTaiKhoan extends DAO {
	public boolean login(String userName, String password) {
		String sql = "select * from TaiKhoan where TenDangNhap = ? and MatKhau = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, password);
			ResultSet result = ps.executeQuery();
			return result.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public NhanVienBanThuoc getNhanVienBanThuocByUserName(String userName) {
		String sql = "SELECT nv.*, dc.* from NhaVienBanThuoc nv join TaiKhoan tk on nv.NhanVienBanThuocId = tk.NhanVienBanThuocId left join DiaChi dc on dc.DiaChiId = tk.NhanVienBanThuocId where tk.TenDangNhap = ?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
			ResultSet result = ps.executeQuery();
			if (result.next()) {
				NhanVienBanThuoc nhanVienBanThuoc = new NhanVienBanThuoc();
				nhanVienBanThuoc.setId(result.getString("NhanVienBanThuocId"));
				nhanVienBanThuoc.setHoTenDem(result.getString("HoTenDem"));
				nhanVienBanThuoc.setTen(result.getString("Ten"));
				nhanVienBanThuoc.setNgaySinh(result.getDate("NgaySinh"));
				nhanVienBanThuoc.setSoDienThoai(result.getString("SoDienThoai"));
				nhanVienBanThuoc.setSoCMND(result.getString("SoCMND"));
				nhanVienBanThuoc.setGioiTinh(result.getBoolean("GioiTinh"));
				DiaChi diaChi = new DiaChi();
				if (result.getString("DiaChiId")==null) {
					return nhanVienBanThuoc;
				}
				try {
					diaChi.setChiTiet(result.getString("ChiTiet"));
				}catch (Exception e) {
					// TODO: handle exception
					;
				}

				diaChi.setXaPhuong(result.getString("XaPhuong"));
				diaChi.setQuanHuyen(result.getString("XaPhuong"));
				diaChi.setTinhThanhPho(result.getString("TinhThanhPho"));
				System.out.println(diaChi);
				nhanVienBanThuoc.setDiaChi(diaChi);

				return nhanVienBanThuoc;
			}
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		DAOTaiKhoan dtk = new DAOTaiKhoan();
		System.out.println(dtk.login("duchoan6814", "sapassword"));
	}
}
