package hr.java.vjezbe.javafx;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import hr.java.vjezbe.entitet.Stan;
import hr.java.vjezbe.entitet.Stanje;
import hr.java.vjezbe.util.Datoteke;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PretragaStanovaController {

    @FXML
    private TableView<Stan> stanTableView;
    @FXML
    private TableColumn<Stan, String> naslovTableColumn;
    @FXML
    private TableColumn<Stan, String> opisTableColumn;
    @FXML
    private TableColumn<Stan, Integer> kvadraturaTableColumn;
    @FXML
    private TableColumn<Stan, Stanje> stanjeTableColumn;
    @FXML
    private TableColumn<Stan, BigDecimal> cijenaTableColumn;

    public void initialize() {
	naslovTableColumn.setCellValueFactory(new PropertyValueFactory<Stan, String>("naslov"));
	opisTableColumn.setCellValueFactory(new PropertyValueFactory<Stan, String>("opis"));
	kvadraturaTableColumn.setCellValueFactory(new PropertyValueFactory<Stan, Integer>("kvadratura"));
	stanjeTableColumn.setCellValueFactory(new PropertyValueFactory<Stan, Stanje>("stanje"));
	cijenaTableColumn.setCellValueFactory(new PropertyValueFactory<Stan, BigDecimal>("cijena"));

	List<Stan> listaStanova = Datoteke.dohvatiArtikle().stream().filter(p -> p instanceof Stan).map(sc -> (Stan) sc)
		.collect(Collectors.toList());

	ObservableList<Stan> listaStanovaObservable = FXCollections.observableArrayList(listaStanova);

	stanTableView.setItems(listaStanovaObservable);
    }
}
