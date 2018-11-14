package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    private String operand = "";
    private SimpleStringProperty result;
    private String operator = "";
    private String previousResult = "";

    public Label display;

    public Controller() {
        result = new SimpleStringProperty();
        result.set("0");
    }

    public String getResult() {
        return result.get();
    }

    public SimpleStringProperty resultProperty() {
        return result;
    }

    public void three(ActionEvent actionEvent) {
        operand += "3";
        result.set(operand);
    }

    public void two(ActionEvent actionEvent) {
        operand += "2";
        result.set(operand);
    }

    public void one(ActionEvent actionEvent) {
        operand += "1";
        result.set(operand);
    }

    public void six(ActionEvent actionEvent) {
        operand += "6";
        result.set(operand);
    }

    public void five(ActionEvent actionEvent) {
        operand += "5";
        result.set(operand);
    }

    public void four(ActionEvent actionEvent) {
        operand += "4";
        result.set(operand);
    }

    public void nine(ActionEvent actionEvent) {
        operand += "9";
        result.set(operand);
    }

    public void eight(ActionEvent actionEvent) {
        operand += "8";
        result.set(operand);
    }

    public void seven(ActionEvent actionEvent) {
        operand += "7";
        result.set(operand);
    }

    public void nil(ActionEvent actionEvent) {
        if (!operand.equals("")) {
            operand += "0";
            result.set(operand);
        }
    }

    public void dot(ActionEvent actionEvent) {
        if (!operand.contains(".")) operand += ".";
        if (!operand.equals("")) {
            result.set(operand);
        }
    }

    public void plus(ActionEvent actionEvent) {
        operator = "+";
        previousResult = getResult();
    }

    public void equals(ActionEvent actionEvent) {
        if (operator.e)
    }
}
