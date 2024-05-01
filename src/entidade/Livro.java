package entidade;

public class Livro implements Comparable<Livro> {
    
    
    private String nomeLivro;
    private Temas tema;
    private Integer numeroPaginas;
    private int numDeIdentificacao = 0;
    private boolean isLivroEmprestado = false;
    

    
    public Livro(String nomeLivro, int numDeIdentificacao,boolean isLivroEmprestado ) {
        this.nomeLivro = nomeLivro;
        this.numDeIdentificacao = numDeIdentificacao;
        this.isLivroEmprestado = isLivroEmprestado;
       
    }
    public Livro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
        numDeIdentificacao = 0;
        this.isLivroEmprestado = false;
        
       
    }
  
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public Temas getTema() {
        return tema;
    }
    public void setTema(Temas tema) {
        this.tema = tema;
    }
    public int getNumDeIdentificacao() {
        return numDeIdentificacao;
    }
    public void setNumDeIdentificacao(int numDeIdentificacao) {
        this.numDeIdentificacao = numDeIdentificacao;
    }
    public String getNomeLivro() {
        return nomeLivro;
    }
    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }
    public int getNumDeIdentificação() {
        return numDeIdentificacao;
    }
    public void setNumDeIdentificação(int numDeIdentificação) {
        this.numDeIdentificacao = numDeIdentificação;
    }
    public boolean isLivroEmprestado() {
        return isLivroEmprestado;
    }
    public void setLivroEmprestado(boolean isLivroEmprestado) {
        this.isLivroEmprestado = isLivroEmprestado;
    }
    @Override
    public String toString() {
        return "Livro [nomeLivro=" + nomeLivro + ", tema=" + tema + ", numeroPaginas=" + numeroPaginas
                + ", numDeIdentificacao=" + numDeIdentificacao + ", isLivroEmprestado=" + isLivroEmprestado + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeLivro == null) ? 0 : nomeLivro.hashCode());
        result = prime * result + ((tema == null) ? 0 : tema.hashCode());
        result = prime * result + (isLivroEmprestado ? 1231 : 1237);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nomeLivro == null) {
            if (other.nomeLivro != null)
                return false;
        } else if (!nomeLivro.equals(other.nomeLivro))
            return false;
        if (tema != other.tema)
            return false;
        if (isLivroEmprestado != other.isLivroEmprestado)
            return false;
        return true;
    }
    @Override
    public int compareTo(Livro outroLivro) {
        int comparacaoNomes = this.nomeLivro.toUpperCase().compareTo(outroLivro.getNomeLivro().toLowerCase());
        if (comparacaoNomes != 0) {
            return comparacaoNomes;
        }
        // Se os nomes são iguais, compara por número de identificação
        return Integer.compare(this.numDeIdentificacao, outroLivro.numDeIdentificacao);
    }
    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
   
    

 

}
