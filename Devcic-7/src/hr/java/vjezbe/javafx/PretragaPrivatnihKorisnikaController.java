package hr.java.vjezbe.javafx;

import java.util.List;
import java.util.stream.Collectors;

import hr.java.vjezbe.entitet.PrivatniKorisnik;
import hr.java.vjezbe.util.Datoteke;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PretragaPrivatnihKorisnikaController {
    @FXML
    private TableView<PrivatniKorisnik> privatniKorisnikTableView;
    @FXML
    private TableColumn<PrivatniKorisnik, String> imeTableColumn;
    @FXML
    private TableColumn<PrivatniKorisnik, String> prezimeTableColumn;
    @FXML
    private TableColumn<PrivatniKorisnik, String> emailTableColumn;
    @FXML
    private TableColumn<PrivatniKorisnik, String> telefonTableColumn;

    public void initialize() {
	imeTableColumn.setCellValueFactory(new PropertyValueFactory<PrivatniKorisnik, String>("ime"));
	prezimeTableColumn.setCellValueFactory(new PropertyValueFactory<PrivatniKorisnik, String>("prezime"));
	emailTableColumn.setCellValueFactory(new PropertyValueFactory<PrivatniKorisnik, String>("email"));
	telefonTableColumn.setCellValueFactory(new PropertyValueFactory<PrivatniKorisnik, String>("telefon"));


	List<PrivatniKorisnik> listaPrivatnihKorisnika = Datoteke.dohvatiKorisnike().stream().filter(p -> p instanceof PrivatniKorisnik).map(sc -> (PrivatniKorisnik) sc)
		.collect(Collectors.toList());

	ObservableList<PrivatniKorisnik> listaPrivatnihKorisnikaObservable = FXCollections.observableArrayList(listaPrivatnihKorisnika);

	privatniKorisnikTableView.setItems(listaPrivatnihKorisnikaObservable);
    }
}
