package entidade;
import java.util.*;

public interface OperacoesDeRegistro {
    
    AluguelLivro registrarAluguelLivro(AluguelLivro aluguelLivro);

    String verificarRegistroExistente(Livro livro);

    void devolverLivro(Livro livro);

    List<AluguelLivro> listarRegistrosPorUsuario(Usuario usuario);

    String verificarStatusEmprestimo(Livro livro);

     Set<Livro>listarLivrosEmprestados();

    void renovarEmprestimo(Livro livro);

    double calcularMulta(Livro livro);

    void removerRegistro(Livro livro);
}
