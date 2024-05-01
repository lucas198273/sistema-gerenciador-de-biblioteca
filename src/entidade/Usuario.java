package entidade;

import java.util.Date;

public class Usuario{
    
    private boolean usuarioOn = false;
    private String senhaUsuaripo;
    private String nomeUsuario;
    private int idade;
    private Date dataNascimento;
    private double valorEmConta = 0.0;

    lis
    public Usuario( String senhaUsuaripo, String nomeUsuario, int idade, Date dataNascimento) {
        
        this.senhaUsuaripo = senhaUsuaripo;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        
    }
    public boolean isUsuarioOn() {
        return usuarioOn;
    }
    public String getSenhaUsuaripo() {
        return senhaUsuaripo;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public int getIdade() {
        return idade;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public double getValorEmConta() {
        return valorEmConta;
    }
    public void setUsuarioOn(boolean usuarioOn) {
        this.usuarioOn = usuarioOn;
    }
    public void setSenhaUsuaripo(String senhaUsuaripo) {
        this.senhaUsuaripo = senhaUsuaripo;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setValorEmConta(double valorEmConta) {
        this.valorEmConta = valorEmConta;
    }
    

    

}
