package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.util.Random;

public class Controller {

    @FXML
    Button closeButton;
    @FXML
    Pane pane;

    public void runButton() {
        Random rand=new Random();
        closeButton.setLayoutX((rand.nextDouble()*(pane.getWidth()-closeButton.getWidth())+closeButton.getWidth())
                -closeButton
                .getLayoutBounds()
                .getMaxX());
        closeButton.setLayoutY((rand.nextDouble()*(pane.getHeight()-closeButton.getHeight())+closeButton.getHeight())
                -closeButton
                .getLayoutBounds()
                .getMaxY());
    }
}
