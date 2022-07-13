
public class Medico extends Pessoa {
    private String Especializacao, num_crm;
    public Medico(String nome, String cpf, int idade, Endereco end,String Especializacao,String num_crm) {
        super(nome, cpf, idade, end);
        this.Especializacao=Especializacao;
        this.num_crm=num_crm;
        
    }
    public String Relatorio(){
        String i = ("Nome : "+this.nome+"\n"+"Cpf : "+this.cpf+"\n"+"Idade : "+this.idade+"\n"+"Endereço : "+this.end+"\n"+"Especialização :"+this.Especializacao+"\n"+"CRM : "+this.num_crm);
        return i;
    }
    public String getEspecializacao(){
        return Especializacao;
    }
    public void setEspecializacao(String Especializacao){
        this.Especializacao=Especializacao;
    }
    public String getNum_crm(){
        return num_crm;
    }
    public void setNum_crm(String num_crm){
        this.num_crm=num_crm;
    }
    @Override
    public String getNome() {
        return super.getNome();
    }
    @Override
    public String getCpf() {
        return super.getCpf();
    }
    @Override
    public int getIdade() {
        return super.getIdade();
    }
    public Endereco getEnd(){
        return end;
    }
    @Override
    public String toString() {
        String a;
        a = (getNome()+getCpf()+getIdade()+getEnd()+getNum_crm());
        return a;
    }

}
