package hr.java.vjezbe.javafx;


import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class PocetniEkranController {
    

    public void prikaziEkranZaPretraguAutomobila() {
	BorderPane root;
	
	try {
	    root = (BorderPane) FXMLLoader.load(getClass().getResource("pocetniEkran.fxml"));
	    BorderPane ekranZaPretraguAutomobila = (BorderPane) FXMLLoader
		    .load(getClass().getResource("pretragaAutomobila.fxml"));
	    root.setCenter(ekranZaPretraguAutomobila);
//	    Scene scenaZaPretraguAutomobila = new Scene(ekranZaPretraguAutomobila);
//	    Main.getMainStage().setScene(scenaZaPretraguAutomobila);
	    Main.setMainStage(root);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public void prikaziEkranZaPretraguStanova() {
	BorderPane root;
	try {
	    root = (BorderPane) FXMLLoader.load(getClass().getResource("pocetniEkran.fxml"));
	    BorderPane ekranZaPretraguStanova = (BorderPane) FXMLLoader
		    .load(getClass().getResource("pretragaStanova.fxml"));
	    root.setCenter(ekranZaPretraguStanova);
//	    Scene scenaZaPretraguStanova = new Scene(ekranZaPretraguStanova);
//	    Main.getMainStage().setScene(scenaZaPretraguStanova);
	    Main.setMainStage(root);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public void prikaziEkranZaPretraguUsluga() {
	BorderPane root;
	try {
	    root = (BorderPane) FXMLLoader.load(getClass().getResource("pocetniEkran.fxml"));
	    BorderPane ekranZaPretraguUsluga = (BorderPane) FXMLLoader
		    .load(getClass().getResource("pretragaUsluga.fxml"));
	    root.setCenter(ekranZaPretraguUsluga);
//	    Scene scenaZaPretraguUsluga = new Scene(ekranZaPretraguUsluga);
//	    Main.getMainStage().setScene(scenaZaPretraguUsluga);
	    Main.setMainStage(root);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public void prikaziEkranZaPretraguPrivatnihKorisnika() {
	BorderPane root;
	try {
	    root = (BorderPane) FXMLLoader.load(getClass().getResource("pocetniEkran.fxml"));
	    BorderPane ekranZaPretraguPrivatnihKorisnika = (BorderPane) FXMLLoader
		    .load(getClass().getResource("pretragaPrivatnihKorisnika.fxml"));
	    root.setCenter(ekranZaPretraguPrivatnihKorisnika);
//	    Scene scenaZaPretraguPrivatnihKorisnika = new Scene(ekranZaPretraguPrivatnihKorisnika);
//	    Main.getMainStage().setScene(scenaZaPretraguPrivatnihKorisnika);
	    Main.setMainStage(root);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    public void prikaziEkranZaPretraguPoslovnihKorisnika() {
 	BorderPane root;
 	try {
 	    root = (BorderPane) FXMLLoader.load(getClass().getResource("pocetniEkran.fxml"));
 	    BorderPane ekranZaPretraguPoslovnihKorisnika = (BorderPane) FXMLLoader
 		    .load(getClass().getResource("pretragaPoslovnihKorisnika.fxml"));
 	    root.setCenter(ekranZaPretraguPoslovnihKorisnika);
// 	    Scene scenaZaPretraguPoslovnihKorisnika = new Scene(ekranZaPretraguPoslovnihKorisnika);
// 	    Main.getMainStage().setScene(cenaZaPretraguPoslovnihKorisnika);
 	    Main.setMainStage(root);
 	} catch (Exception e) {
 	    e.printStackTrace();
 	}
     }
}
