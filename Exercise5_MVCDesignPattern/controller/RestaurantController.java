package controller;

import javax.swing.text.html.ImageView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class RestaurantController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    BurgerKing burgerking = new BurgerKing();
    Jollibee jollibee = new Jollibee();
    KFC kfc = new KFC();
    MangInasal manginasal = new MangInasal();
    Mcdo mcdo = new Mcdo ();


    public void initialize() {

        burgerking.setService("Excellent");
        burgerking.setTaste("Healthy-like <3");

        jollibee.setService("Friendly");
        jollibee.setTaste("Yummyy ^^");

        kfc.setService("Neutral, needs Improvement");
        kfc.setTaste("Full of spice~");

        manginasal.setService("Missing in Action");
        manginasal.setTaste("Very Pinoy Taste");

        mcdo.setService("Fast and Furious ");
        mcdo.setTaste("Typical Fast Food Taste");        
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("CUSTOMER SERVICE: " + burgerking.getService() + " TASTE: " + burgerking.getTaste());
        }

        if (sourceButton.equals (btn2)) {
            alert.setContentText("CUSTOMER SERVICE: " + jollibee.getService() + " TASTE: " + jollibee.getTaste());
        }
        
        if (sourceButton.equals (btn3)) {
            alert.setContentText("CUSTOMER SERVICE: " + kfc.getService() + " TASTE: " + kfc.getTaste());
        }

        if (sourceButton.equals (btn4)) {
            alert.setContentText("CUSTOMER SERVICE: " + manginasal.getService() + " TASTE: " + manginasal.getTaste());
        }

        if (sourceButton.equals (btn5)) {
            alert.setContentText("CUSTOMER SERVICE: " + mcdo.getService() + " TASTE: " + mcdo.getTaste());
        }

        alert.showAndWait();

    }
}
