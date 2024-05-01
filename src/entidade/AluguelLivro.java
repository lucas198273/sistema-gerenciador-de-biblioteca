package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AluguelLivro {
    
    private Usuario usuario;
    private Date dtInicio;
    private Date dtFim;

    private Livro livro;

    //  Gravar registro é uma interface 
    

    public AluguelLivro(Usuario usuario, Date dtInicio, Date dtFim, Livro livro) {
        this.usuario = usuario;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.livro = livro;
      
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getDtInicio() {
        return dtInicio;
    }
    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }
    public Date getDtFim() {
        return dtFim;
    }
    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

  

}
