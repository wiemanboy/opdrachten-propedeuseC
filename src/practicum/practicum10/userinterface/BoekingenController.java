package practicum.practicum10.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

import javax.swing.*;
import java.awt.*;

public class BoekingenController {
    @FXML private ComboBox kamertypeBox;


    public void initialize(){
        kamertypeBox.getItems().addAll("type 1", "type 2", "type 3");

    }

    public void boek(ActionEvent actionEvent){}

    public void reset(ActionEvent actionEvent){
    }
}
