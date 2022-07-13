
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RemoverController {

    @FXML
    private Button botao;

    @FXML
    private TextField texto;

    @FXML
    void botao(ActionEvent event) {
        String textoA = texto.getText();
        App.BD.remover(textoA);
    }
}