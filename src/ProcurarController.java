
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ProcurarController {

    @FXML
    private Button botao;

    @FXML
    private TextField texto;

    @FXML
    private Label mensagem;

    @FXML
        void botao(ActionEvent event) {
            String textoA = texto.getText();
            mensagem.setText(App.BD.procurar(textoA));
    }
}
