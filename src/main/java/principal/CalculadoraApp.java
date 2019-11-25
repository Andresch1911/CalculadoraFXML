package principal;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraApp extends Application{
	private CalculadoraController controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		controller = new CalculadoraController();
		
		Scene scene = new Scene(controller.getView(), 640, 440);
		
		
		primaryStage.setTitle("HolaMundo con FXML");
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
