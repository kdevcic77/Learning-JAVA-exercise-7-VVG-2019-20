package hr.java.vjezbe.javafx;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import hr.java.vjezbe.entitet.Stan;
import hr.java.vjezbe.entitet.Stanje;
import hr.java.vjezbe.entitet.Usluga;
import hr.java.vjezbe.util.Datoteke;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PretragaUslugaController {
    @FXML
    private TableView<Usluga> uslugaTableView;
    @FXML
    private TableColumn<Usluga, String> naslovTableColumn;
    @FXML
    private TableColumn<Usluga, String> opisTableColumn;
    @FXML
    private TableColumn<Usluga, Stanje> stanjeTableColumn;
    @FXML
    private TableColumn<Usluga, BigDecimal> cijenaTableColumn;
    
    public void initialize() {
	naslovTableColumn.setCellValueFactory(new PropertyValueFactory<Usluga, String>("naslov"));
	opisTableColumn.setCellValueFactory(new PropertyValueFactory<Usluga, String>("opis"));
	stanjeTableColumn.setCellValueFactory(new PropertyValueFactory<Usluga, Stanje>("stanje"));
	cijenaTableColumn.setCellValueFactory(new PropertyValueFactory<Usluga, BigDecimal>("cijena"));

	List<Usluga> listaUsluga = Datoteke.dohvatiArtikle().stream().filter(p -> p instanceof Usluga).map(sc -> (Usluga) sc)
		.collect(Collectors.toList());

	ObservableList<Usluga> listaUslugaObservable = FXCollections.observableArrayList(listaUsluga);

	uslugaTableView.setItems(listaUslugaObservable);
    }
}
