package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Random;

public class Controller {

    @FXML
    Button closeButton;

/*    public void closeButtonAction(){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }*/


    public void runButton(ActionEvent actionEvent) {
        Random rand=new Random();
        closeButton.setLayoutX((rand.nextDouble()*400)-closeButton.getLayoutBounds().getMinX());
        closeButton.setLayoutY((rand.nextDouble()*400)-closeButton.getLayoutBounds().getMinY());

    }
}
