import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entidade.Biblioteca;
import entidade.EstoqueLivros;
import entidade.Livro;
import entidade.Usuario;

public class App {  
     
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Biblioteca adm = new Biblioteca();
        List<Livro> livrosEmEstoque = adm.estoque.getEstoque();
        Set<Livro> setLivrosOrdenados = new TreeSet<>();
        Scanner sc = new Scanner( System.in);
      
        new Usuario( "125484","joão cleber",45,sdf.parse("01/02/2012"));
        // adm.inserirItensNoEstoque();
        adm.estoque.populandoEstoque();

        System.out.println("=====Listagem de livros ordenada=====");
        for(Livro livro: livrosEmEstoque){
            setLivrosOrdenados.add(livro);
        }
        for (Livro livro : setLivrosOrdenados) {
            System.out.println( livro.toString() );
        }
        boolean isSelecaoDeLivroOk = false;
        while (!isSelecaoDeLivroOk) {

            System.out.println("selecone o livro pelo codigo de identificação");
            int codigoId = sc.nextInt();
            Livro verificacao = livrosEmEstoque.get(codigoId);
        
        }
        System.out.println("selecone o livro pelo codigo de identificação");
        

       
        

       
    }
}
