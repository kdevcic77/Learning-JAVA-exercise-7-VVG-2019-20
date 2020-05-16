package hr.java.vjezbe.javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

    private static Stage mainStage;
    
    @Override
    public void start(Stage primaryStage) {
	mainStage = primaryStage;
	try {
	    BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("pocetniEkran.fxml"));
	    Scene scene = new Scene(root, 400, 500);
	    scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	    mainStage.setTitle("Oglasnik");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public static void main(String[] args) {
	launch(args);
    }

    public static void setMainStage(BorderPane root) {
	Scene scene = new Scene(root,400,500);
	mainStage.setScene(scene);
	mainStage.show();
    }
    
    /*
     * public static Stage getMainStage() { return mainStage; }
     */
}
