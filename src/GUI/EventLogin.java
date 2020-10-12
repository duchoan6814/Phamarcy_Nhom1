package GUI;

import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class EventLogin {
	@FXML
	public void printHelloWorld(ActionEvent event) {
		event.consume();
		System.out.println("Hello world");
	}
	
	public void btnExit(ActionEvent event) {
		event.consume();
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Bạn có chắc muốn thoát!");
		alert.setHeaderText("Bạn có chắc muốn thoát!");
		Optional<ButtonType> option = alert.showAndWait();
		System.out.println(option.get().getButtonData());
		if(option.get().getButtonData().toString().equals("OK_DONE")) {
			System.exit(0);
		}
//		System.exit(0);
	}
}
