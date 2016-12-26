package xml_separator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    private TextArea taInput;

    @FXML
    private TextArea taOutput;

    //Событие нажатия на кнопку фильтрации
    @FXML
    private void onFilterClicked(ActionEvent event) {
        String input = taInput.getText();
        taOutput.setText(input);
    }

    //Событие нажатия на кнопку фильтрации
    @FXML
    private void onRestoreClicked(ActionEvent event) {
        String input = taInput.getText();
        taOutput.setText(input);
    }
}
