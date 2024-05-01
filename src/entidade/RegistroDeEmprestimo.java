package entidade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RegistroDeEmprestimo implements OperacoesDeRegistro {

    private Map<Livro, AluguelLivro> registrosEmprestimo = new HashMap<>();
    private List<AluguelLivro> historicoDeEmprestimosAluguel = new ArrayList<>();
    private Set<Livro> livrosEmprestados = new HashSet<>(); 
    
    public void emprestarLivro(AluguelLivro registroAluguel) {
        Livro livro = registroAluguel.getLivro();
        if(!livro.isLivroEmprestado()){
            livro.setLivroEmprestado(true);
        }else{
            System.out.println("status do livro esta como |EMPRESTADO| VERIFIQUE POSSIVEIS ERROS"+ 
            "STATUS CONTINUA COMO: | EMPRETADO|");
        }
        registrarAluguelLivro(registroAluguel);
        livrosEmprestados.add(registroAluguel.getLivro());
        historicoDeEmprestimosAluguel.add(registroAluguel);  // Adiciona ao histórico no momento do empréstimo
    }
    public Map<Livro, AluguelLivro> getRegistrosEmprestimo() {
        return registrosEmprestimo;
    }
    public void addRegistro(Livro livro, AluguelLivro aluguel) {
       registrosEmprestimo.put(livro,aluguel);
    }
    @Override
    public AluguelLivro registrarAluguelLivro(AluguelLivro aluguelLivro) {
        Livro livro = aluguelLivro.getLivro();
        if (registrosEmprestimo.containsKey(livro)) {
            System.out.println("Erro: Livro já emprestado.");
        } else {
            addRegistro(livro, aluguelLivro);
            System.out.println("Registro gravado.");
        }
        return aluguelLivro;
    }
    @Override
    public String verificarRegistroExistente(Livro livro) {
    if (livro == null) {
        throw new IllegalArgumentException("O livro fornecido é nulo.");
    }
    if (registrosEmprestimo.containsKey(livro)) {
        return "Livro está emprestado.";
    } else {
        return "Livro disponível para empréstimo.";
    }}
    @Override
    public void devolverLivro(Livro livro) {

        // TODO Auto-generated method  new UnsupportedOperationException("Unimplemented method 'devolverLivro'");
    }
    @Override
    public List<AluguelLivro> listarRegistrosPorUsuario(Usuario usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarRegistrosPorUsuario'");
    }

    @Override
    public String verificarStatusEmprestimo(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verificarStatusEmprestimo'");
    }
    
    @Override
    public Set<Livro> listarLivrosEmprestados() {
        return getLivrosEmprestados();
    }

    @Override
    public void renovarEmprestimo(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'renovarEmprestimo'");
    }

    @Override
    public double calcularMulta(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularMulta'");
    }

    @Override
    public void removerRegistro(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerRegistro'");
    }
    public Set<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
   

    
}
