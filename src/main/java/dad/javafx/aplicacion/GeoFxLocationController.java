package dad.javafx.aplicacion;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class GeoFxLocationController implements Initializable {
	
	@FXML
	private BorderPane view;
	
	@FXML
	private ImageView iconoWifiView;
	
	@FXML
	private TextField ipText;
	
	@FXML
	private Button checkIpButton;
	
	@FXML
	private Label latitudLabel,longitudLabel,paisLabel,ciudadLabel,zipLabel,idiomaLabel,climaLabel,telefonoLabel,monedaLabel;
	
	@FXML
	private ListView<Image> ImagenLista;
	
	
	public GeoFxLocationController() throws IOException {

		FXMLLoader load = new FXMLLoader(getClass().getResource("/fxml/geoFXLocationView.fxml"));
		load.setController(this);
		load.load();

	}
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		Image image = new Image("/image/Wifi-icon.png");
		iconoWifiView.setImage(image);
		
		
	}
	
	public BorderPane getView() {
		return view;
	}

}
