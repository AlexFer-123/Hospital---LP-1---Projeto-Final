import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AlterarMController {

    @FXML
    private Button alterar;

    @FXML
    private TextField bairro;

    @FXML
    private TextField cep;

    @FXML
    private TextField cpf;

    @FXML
    private TextField crm;

    @FXML
    private TextField especializacao;

    @FXML
    private TextField idade;

    @FXML
    private Label label;

    @FXML
    private TextField nome;

    @FXML
    private TextField numero;


    @FXML
    void alterar(ActionEvent event) {
        String bairroA = bairro.getText();
        String cepS = cep.getText();
        int cepA = Integer.parseInt(cepS);
        String cpfA = cpf.getText();
        String idadeS = idade.getText();
        int idadeA = Integer.parseInt(idadeS);
        String nomeA = nome.getText();
        String numeroS = numero.getText();
        int numeroA = Integer.parseInt(numeroS);
        String crmA = crm.getText();
        String especializacaoA = especializacao.getText();
        Endereco end = new Endereco(bairroA, numeroA, cepA);
        Medico velho = new Medico(nomeA,cpfA,idadeA,end,especializacaoA,crmA);
        App.BD.inserirA(velho);
        label.setText("Alterado!");     
        }
    }

  

