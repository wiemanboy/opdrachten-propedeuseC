package practicum.practicum10.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import practicum.practicum10.model.Hotel;
import practicum.practicum10.model.Kamer;
import practicum.practicum10.model.KamerType;

import java.time.LocalDate;
import java.util.List;

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
            System.out.println("u heeft iets niet ingevuld");
        }
        else {
            try {
                //Hotel.getHotel().voegBoekingToe(aankomst, vertrek, naam, adres, kamertype);
            }
            catch (Exception e){}
        }



    }

    public void reset(ActionEvent actionEvent){
    }
}
