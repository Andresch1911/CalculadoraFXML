package principal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CalculadoraController implements Initializable {
	
	private DoubleProperty salida = new SimpleDoubleProperty();
	private DoubleProperty numero = new SimpleDoubleProperty();
	Calculadora cal = new Calculadora();
	  @FXML
	    private VBox View = new VBox();
	  	
	    @FXML
	    private TextField salidaLabel;

	    @FXML
	    private HBox princiHBox;

	    @FXML
	    private VBox botonesVBox;

	    @FXML
	    private VBox gridVBox;

	    @FXML
	    private GridPane botonesPane;

	    @FXML
	    private Button Button7;

	    @FXML
	    private Button Button8;

	    @FXML
	    private Button Button9;

	    @FXML
	    private Button ButtonCE;

	    @FXML
	    private Button Button4;

	    @FXML
	    private Button Button5;

	    @FXML
	    private Button Button6;

	    @FXML
	    private Button multiButton;

	    @FXML
	    private Button Button1;

	    @FXML
	    private Button Button2;

	    @FXML
	    private Button Button3;

	    @FXML
	    private Button resButton;

	    @FXML
	    private Button Button0;

	    @FXML
	    private Button comaButton;

	    @FXML
	    private Button masButton;

	    @FXML
	    private Button cButton;

	    @FXML
	    private Button divButton;

	    @FXML
	    private Button igualButton;

	    @FXML
	    void onButton0Action(ActionEvent event) {
	    	numero.set(0);
	    	cal.insertar('0');
	    	System.out.println("0");
	    }

	    @FXML
	    void onButton1Action(ActionEvent event) {
	    	numero.set(1);
	    	cal.insertar('1');
	    	System.out.println("1");cal.getPantalla();
	    }

	    @FXML
	    void onButton2Action(ActionEvent event) {
	    	cal.insertar('2');cal.getPantalla();
	    }

	    @FXML
	    void onButton3Action(ActionEvent event) {
	    	cal.insertar('3');cal.getPantalla();
	    }

	    @FXML
	    void onButton4Action(ActionEvent event) {
	    	cal.insertar('4');cal.getPantalla();
	    }

	    @FXML
	    void onButton5Action(ActionEvent event) {
	    	cal.insertar('5');cal.getPantalla();
	    }

	    @FXML
	    void onButton6Action(ActionEvent event) {
	    	cal.insertar('6');cal.getPantalla();
	    }

	    @FXML
	    void onButton7Action(ActionEvent event) {
	    	cal.insertar('7');cal.getPantalla();
	    }

	    @FXML
	    void onButton8Action(ActionEvent event) {
	    	cal.insertar('8');cal.getPantalla();
	    }

	    @FXML
	    void onButton9Action(ActionEvent event) {
	    	cal.insertar('9');cal.getPantalla();
	    }

	    @FXML
	    void onButtonCAction(ActionEvent event) {
	    	cal.borrar();cal.getPantalla();
	    }

	    @FXML
	    void onButtonCEAction(ActionEvent event) {
	    	cal.borrarTodo();cal.getPantalla();
	    }

	    @FXML
	    void onButtondivAction(ActionEvent event) {
	    	cal.operar('/');cal.getPantalla();
	    }
	    
	    @FXML
	    void onButtonigualAction(ActionEvent event) {
	    	cal.operar('=');cal.getPantalla();
	    }

	    @FXML
	    void onButtonmaasAction(ActionEvent event) {
	    	cal.operar('+');
	    	cal.getPantalla();
	    }

	    @FXML
	    void onButtonmultiAction(ActionEvent event) {
	    	cal.operar('*');
	    	cal.getPantalla();
	    }

	    @FXML
	    void onButtonrestarAction(ActionEvent event) {
	    	cal.operar('-');
	    	cal.getPantalla();
	    }

	    @FXML
	    void oncomaButtonAction(ActionEvent event) {
	    	cal.insertarComa();
	    	cal.getPantalla();
	    }

	
	public CalculadoraController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Calculadora.fxml"));
		loader.setController(this);
		loader.load();
	}
	public VBox getView() {
		return View;
	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Funciona");
		
		salida.bindBidirectional(numero);
		salidaLabel.textProperty().bindBidirectional(cal.pantalla);
		cal.getPantalla();
		
		
	}
	
	

}
