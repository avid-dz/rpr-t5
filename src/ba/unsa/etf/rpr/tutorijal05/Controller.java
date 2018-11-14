package ba.unsa.etf.rpr.tutorijal05;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private String operand = "";
    private String result = "0";
    private String operator = "";

    public Label display;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        display.setText("0");
    }

    public void three(ActionEvent actionEvent) {
        operand += "3";
        display.setText(operand);
    }
}
