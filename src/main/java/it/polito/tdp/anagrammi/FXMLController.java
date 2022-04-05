package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import it.polito.tdp.anagrammi.model.StatoParole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea txtCorretti;

    @FXML
    private TextArea txtErrati;

    @FXML
    private TextField txtParola;

    @FXML
    void handleCalcolaAnagrammi(ActionEvent event) {
    	//PROVA DELL'ALGORITMO DELLA RICORSIONE
    	
    	txtCorretti.clear();
    	txtErrati.clear();
    	
    	List<String> anagrammi = model.getAnagrammi(txtParola.getText());
    	txtParola.clear();
    	StatoParole sp = model.getParoleCorrette(anagrammi);
    	
    	List<String> paroleCorrette = sp.getParoleCorrette();
    	List<String> paroleErrate = sp.getParoleErrate();
    	
    	for(String s : paroleCorrette)
    		txtCorretti.appendText(s+"\n");
    	for(String s : paroleErrate)
    		txtErrati.appendText(s+"\n");

    }

    @FXML
    void handleReset(ActionEvent event) {
    	txtCorretti.clear();
    	txtErrati.clear();
    	txtParola.clear();

    }
    
    void setModel(Model model) {
    	this.model=model;
    }

    @FXML
    void initialize() {
        assert txtCorretti != null : "fx:id=\"txtCorretti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtErrati != null : "fx:id=\"txtErrati\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";

    }

}
