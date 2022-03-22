package practicum.practicum10.userinterface;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import practicum.practicum10.model.Boeking;
import practicum.practicum10.model.Hotel;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class HotelOverzichtController {
    @FXML private Label hotelnaamLabel;
    @FXML private ListView boekingenListView;
    @FXML private DatePicker overzichtDatePicker;

    private Hotel hotel = Hotel.getHotel();

    public void initialize() {
        hotelnaamLabel.setText("Boekingen hotel " + hotel.getNaam());
        overzichtDatePicker.setValue(LocalDate.now());
        toonBoekingen();
    }

    public void toonVorigeDag(ActionEvent actionEvent) {
        LocalDate dagEerder = overzichtDatePicker.getValue().minusDays(1);
        overzichtDatePicker.setValue(dagEerder);
    }

    public void toonVolgendeDag(ActionEvent actionEvent) {
        LocalDate dagLater = overzichtDatePicker.getValue().plusDays(1);
        overzichtDatePicker.setValue(dagLater);
    }

    public void nieuweBoeking(ActionEvent actionEvent) {
        try {
                FXMLLoader loader =
                        new FXMLLoader(getClass().getResource("Boekingen.fxml"));
                Parent root = loader.load();

                Stage newStage = new Stage();
                newStage.setScene(new Scene(root));
                newStage.initModality(Modality.APPLICATION_MODAL);
                newStage.showAndWait();
                initialize();

        } catch (IOException e) {
            System.out.println("fout");
        }
    }


    public void toonBoekingen() {
        ObservableList<String> boekingen = FXCollections.observableArrayList();
        List<Boeking> boek = Hotel.getHotel().getBoekingen();

        for (Boeking boeking : boek){
            LocalDate aankomst = boeking.getAankomstDatum();
            LocalDate vertrek = boeking.getVertrekDatum();
            LocalDate pickedDate = overzichtDatePicker.getValue();

            if ((pickedDate.isAfter(aankomst) && pickedDate.isBefore(vertrek)) || (pickedDate.equals(aankomst)) || pickedDate.equals(vertrek)){

                String s = aankomst + " " + vertrek + " " + boeking.getKamer() + " " + boeking.getBoeker().getNaam();
                boekingen.add(s);
            }
        }


        boekingenListView.setItems(boekingen);
    }
}
