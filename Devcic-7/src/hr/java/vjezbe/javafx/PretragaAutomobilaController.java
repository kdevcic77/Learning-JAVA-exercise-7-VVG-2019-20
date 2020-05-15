package hr.java.vjezbe.javafx;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import hr.java.vjezbe.entitet.Automobil;
import hr.java.vjezbe.entitet.Stanje;
import hr.java.vjezbe.util.Datoteke;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PretragaAutomobilaController {
    @FXML
    private TableView<Automobil> automobilTableView;
    @FXML
    private TableColumn<Automobil, String> naslovTableColumn;
    @FXML
    private TableColumn<Automobil, String> opisTableColumn;
    @FXML
    private TableColumn<Automobil, BigDecimal> snagaKsTableColumn;
    @FXML
    private TableColumn<Automobil, Stanje> stanjeTableColumn;
    @FXML
    private TableColumn<Automobil, BigDecimal> cijenaTableColumn;


    public void initialize() {
	naslovTableColumn.setCellValueFactory(new PropertyValueFactory<Automobil, String>("naslov"));
	opisTableColumn.setCellValueFactory(new PropertyValueFactory<Automobil, String>("opis"));
	snagaKsTableColumn.setCellValueFactory(new PropertyValueFactory<Automobil, BigDecimal>("snagaKs"));
	stanjeTableColumn.setCellValueFactory(new PropertyValueFactory<Automobil, Stanje>("stanje"));
	cijenaTableColumn.setCellValueFactory(new PropertyValueFactory<Automobil, BigDecimal>("cijena"));

	List<Automobil> listaAutomobila = Datoteke.dohvatiArtikle().stream().filter(p -> p instanceof Automobil)
		.map(sc -> (Automobil) sc).collect(Collectors.toList());
	
	ObservableList<Automobil> listaAutomobilaObservable = FXCollections.observableList(listaAutomobila);
	
	automobilTableView.setItems(listaAutomobilaObservable);
    }
}
