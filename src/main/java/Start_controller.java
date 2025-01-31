import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
 
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Start_controller {
	
	@FXML
    // The reference of inputText will be injected by the FXML loader
	private TextField pseudo;
     
    // The reference of outputText will be injected by the FXML loader
	// a faire apr�s, afficher un message sur l'�cran d'accueil
    //@FXML
    //private TextArea outputText;
     
    // location and resources will be automatically injected by the FXML loader 
    @FXML
    private URL location;
     
    @FXML
    private ResourceBundle resources;
     
    // Add a public no-args constructor
    public void FxFXMLController() 
    {
    }
     
    @FXML
    private void initialize() 
    {
    }
     
    @FXML
    private void handler() 
    {
    	String pseudo1= pseudo.getText();
    	if (!User.PseudoValide(pseudo1)) {
    		// message d'erreur: pseudo non valide
    	} else {
    		// set pseudo pour le user
    		// la classe doit avoir un attribut pseudo
    	}
        //outputText.setText(inputText.getText());
    }

    @FXML
    private void switchToAuthentification() throws IOException {
        App.setRoot("Start");
    }
}