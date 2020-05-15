package hr.java.vjezbe.javafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class PocetniEkranController {

    public void prikaziEkranZaPretraguAutomobila() {
	try {
	    BorderPane ekranZaPretraguAutomobila = (BorderPane) FXMLLoader
		    .load(getClass().getResource("pretragaAutomobila.fxml"));
	    Scene scenaZaPretraguAutomobila = new Scene(ekranZaPretraguAutomobila);
	    Main.getMainStage().setScene(scenaZaPretraguAutomobila);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
