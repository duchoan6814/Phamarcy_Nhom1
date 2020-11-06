package GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import entity.NhanVienBanThuoc;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TaoHoaDonControl implements Initializable {
	
	private NhanVienBanThuoc nhanVienBanThuoc;
	
	public Button btnThanhToan;
//	public Text txtMaNhanVien;
//	public Text txtTenNhanVien;
	
	@FXML
	public void showDialogThanhToan() {
		try {
			Stage thanhToanStage = FXMLLoader.load(getClass().getResource("DialogThanhToan.fxml"));
			thanhToanStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}

	public void setNhanVienBanThuoc(NhanVienBanThuoc nhanVienBanThuoc) {
		// TODO Auto-generated method stub
		this.nhanVienBanThuoc = nhanVienBanThuoc;
	}

}
