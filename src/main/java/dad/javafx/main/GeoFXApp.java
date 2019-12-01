package dad.javafx.main;

import dad.javafx.aplicacion.GeoFxConnectionController;
import dad.javafx.aplicacion.GeoFxLocationController;
import dad.javafx.aplicacion.GeoFxSecurityController;
import javafx.application.Application;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.stage.Stage;

public class GeoFXApp extends Application{
	
	GeoFxLocationController locationController;
	GeoFxConnectionController connectionController;
	GeoFxSecurityController securityController;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		locationController = new GeoFxLocationController();
		connectionController = new GeoFxConnectionController();
		securityController = new GeoFxSecurityController();
		
		TabPane root = new TabPane();
		root.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		root.setSide(Side.BOTTOM);
		
		Tab tab1 = new Tab("Location", locationController.getView());
		Tab tab2 = new Tab("Connection",connectionController.getView());
		Tab tab3 = new Tab("Security",securityController.getView());

		root.getTabs().addAll(tab1,tab2,tab3);
		
		Scene scene = new Scene(root);
		primaryStage.setTitle("GeoFX.fxml");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
