package GUI;

import java.net.URL;
import java.util.ResourceBundle;

import DAO.DAONhanVien;
import entity.NhanVienBanThuoc;
import javafx.fxml.Initializable;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Shadow;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class MainSenceControl implements Initializable {
	private NhanVienBanThuoc nhanVienBanThuoc;
	private DAONhanVien daoNhanVien = new DAONhanVien();

	public Text lblTenNhanVien1;
	public Text lblTenNhanVien2;
	public Text lblId;
	public Text lblSoHoaDon;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		lblTenNhanVien1.setText(nhanVienBanThuoc.getHoTenDem()+" "+nhanVienBanThuoc.getTen());
		lblTenNhanVien2.setText(nhanVienBanThuoc.getHoTenDem()+" "+nhanVienBanThuoc.getTen());
		lblId.setText("ID: "+nhanVienBanThuoc.getId());
		lblSoHoaDon.setText("Số hóa đơn: "+daoNhanVien.getTotalHoaDonByNhanVien(nhanVienBanThuoc.getId()));
	}

	public void setNhanVienBanThuoc(NhanVienBanThuoc nhanVienBanThuoc) {
		// TODO Auto-generated method stub
		this.nhanVienBanThuoc = nhanVienBanThuoc;
		
	}

	
	
}
