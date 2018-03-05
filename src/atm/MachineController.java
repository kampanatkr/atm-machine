package atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class MachineController {

    @FXML
    protected Button number1;
    @FXML
    protected Label numberLabel;

    private InputNumber input = new InputNumber();

    @FXML
    public void handleBtnNumber1(ActionEvent event) {
        appendNumberToInput("1");
    }
    @FXML
    public void handleBtnNumber2(ActionEvent event) {
        appendNumberToInput("2");
    }
    @FXML
    public void handleBtnNumber3(ActionEvent event) {
        appendNumberToInput("3");
    }
    @FXML
    public void handleBtnNumber4(ActionEvent event) {
        appendNumberToInput("4");
    }
    @FXML
    public void handleBtnNumber5(ActionEvent event) {
        appendNumberToInput("5");
    }
    @FXML
    public void handleBtnNumber6(ActionEvent event) {
        appendNumberToInput("6");
    }
    @FXML
    public void handleBtnNumber7(ActionEvent event) {
        appendNumberToInput("7");
    }
    @FXML
    public void handleBtnNumber8(ActionEvent event) {
        appendNumberToInput("8");
    }
    @FXML
    public void handleBtnNumber9(ActionEvent event) {
        appendNumberToInput("9");
    }
    @FXML
    public void handleBtnNumber0(ActionEvent event) {
        appendNumberToInput("0");
    }
    @FXML
    public void handleBtnClear (ActionEvent event) {clearText();}
    @FXML
    public void handleBtnBackSpace (ActionEvent event) {}

    private void appendNumberToInput(String n) {
        input.appendNumber(n);
        numberLabel.setText(input.toString());
    }

    private void appendFloatToInput() {
        input.appendDot();
    }

    private void clearText() { numberLabel.setText ("0");}
}
