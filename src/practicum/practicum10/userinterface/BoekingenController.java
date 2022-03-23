package practicum.practicum10.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import practicum.practicum10.model.Hotel;
import practicum.practicum10.model.KamerType;

import java.time.LocalDate;


public class BoekingenController {
    @FXML private TextField naamVeld;
    @FXML private TextField adresVeld;
    @FXML private DatePicker aankomstDatumVeld;
    @FXML private DatePicker vertrekDatumVeld;
    @FXML private ComboBox kamertypeBox;

    public void initialize(){
            kamertypeBox.getItems().addAll(Hotel.getHotel().getKamerTypen());
    }

    public void boek(ActionEvent actionEvent){
        String naam = naamVeld.getText();
        String adres = adresVeld.getText();
        LocalDate aankomst = aankomstDatumVeld.getValue();
        LocalDate vertrek = vertrekDatumVeld.getValue();
        KamerType kamertype = (KamerType) kamertypeBox.getValue();

        if (naam == "" || adres == "" || aankomst == null || vertrek == null || kamertype == null){
            Alert nietsingevuld = new Alert(Alert.AlertType.ERROR);
            nietsingevuld.setTitle("Error");
            nietsingevuld.setContentText("u heeft iets niet ingevuld");

            nietsingevuld.showAndWait();
        }
        else {
            if (aankomst.isAfter(vertrek)){
                Alert aankomstvoorvertrek = new Alert(Alert.AlertType.ERROR);
                aankomstvoorvertrek.setTitle("Error");
                aankomstvoorvertrek.setContentText("aankomstdatum ligt voor vertrek datum");

                aankomstvoorvertrek.showAndWait();
            }
            else {
                if (LocalDate.now().isAfter(aankomst)){
                    Alert datumvooraankomst = new Alert(Alert.AlertType.ERROR);
                    datumvooraankomst.setTitle("Error");
                    datumvooraankomst.setContentText("huidige datum ligt voor aankomst datum");

                    datumvooraankomst.showAndWait();

                }
                else{
                try {
                    Hotel.getHotel().voegBoekingToe(aankomst, vertrek, naam, adres, kamertype);

                    Alert gelukt = new Alert(Alert.AlertType.INFORMATION);
                    gelukt.setTitle("gelukt!");
                    gelukt.setContentText("gelukt!");

                    gelukt.showAndWait();

                } catch (Exception e) {
                    Alert geenkamer = new Alert(Alert.AlertType.ERROR);
                    geenkamer.setTitle("Error");
                    geenkamer.setContentText("er zijn geen kamers van dit type besschikbaar");

                    geenkamer.showAndWait();

                }
                }
                }
            }
        }





    public void reset(ActionEvent actionEvent){
        naamVeld.clear();
        adresVeld.clear();
        aankomstDatumVeld.setValue(null);
        vertrekDatumVeld.setValue(null);
        kamertypeBox.setValue(null);

    }
}
