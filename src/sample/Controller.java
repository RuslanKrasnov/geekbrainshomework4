package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;
    @FXML
    public void btnClickSend() {
            textArea.appendText(textField.getText() + "\n");
            textField.clear();
            textField.requestFocus();
    }

}
