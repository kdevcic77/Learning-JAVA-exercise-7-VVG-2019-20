package hr.java.vjezbe.javafx;

import java.util.List;
import java.util.stream.Collectors;

import hr.java.vjezbe.entitet.PoslovniKorisnik;
import hr.java.vjezbe.util.Datoteke;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PretragaPoslovnihKorisnikaController {
    @FXML
    private TableView<PoslovniKorisnik> poslovniKorisnikTableView;
    @FXML
    private TableColumn<PoslovniKorisnik, String> nazivTableColumn;
    @FXML
    private TableColumn<PoslovniKorisnik, String> webTableColumn;
    @FXML
    private TableColumn<PoslovniKorisnik, String> emailTableColumn;
    @FXML
    private TableColumn<PoslovniKorisnik, String> telefonTableColumn;

    public void initialize() {
	nazivTableColumn.setCellValueFactory(new PropertyValueFactory<PoslovniKorisnik, String>("naziv"));
	webTableColumn.setCellValueFactory(new PropertyValueFactory<PoslovniKorisnik, String>("web"));
	emailTableColumn.setCellValueFactory(new PropertyValueFactory<PoslovniKorisnik, String>("email"));
	telefonTableColumn.setCellValueFactory(new PropertyValueFactory<PoslovniKorisnik, String>("telefon"));


	List<PoslovniKorisnik> listaPoslovnihKorisnika = Datoteke.dohvatiKorisnike().stream().filter(p -> p instanceof PoslovniKorisnik).map(sc -> (PoslovniKorisnik) sc)
		.collect(Collectors.toList());

	ObservableList<PoslovniKorisnik> listaPoslovnihKorisnikaObservable = FXCollections.observableArrayList(listaPoslovnihKorisnika);

	poslovniKorisnikTableView.setItems(listaPoslovnihKorisnikaObservable);
    }
}
