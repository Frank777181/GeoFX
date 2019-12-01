package dad.javafx.aplicacion;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class GeoFxConnectionController implements Initializable {

	@FXML
	private BorderPane view;

	@FXML
	private ImageView iconoWifiView,worldView;

	@FXML
	private TextField ipText;

	@FXML
	private Button checkIpButton;

	@FXML
	private Label direccionLabel,tipoLabel,autonomoLabel,nombreHostLabel,servicioLabel;

	public GeoFxConnectionController() throws IOException {

		FXMLLoader load = new FXMLLoader(getClass().getResource("/fxml/geoFXConnectionView.fxml"));
		load.setController(this);
		load.load();

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		Image image = new Image("/image/Wifi-icon.png");
		iconoWifiView.setImage(image);
		
		Image image2 = new Image("/image/Globe-icon.png");
		worldView.setImage(image2);
		

	}

	public BorderPane getView() {
		return view;
	}

}
