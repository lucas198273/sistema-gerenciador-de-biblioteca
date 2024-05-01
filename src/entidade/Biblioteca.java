package entidade;


import java.util.Scanner;

import javax.swing.text.html.ListView;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    
    // private RegistroDeEmprestimo registro = null;
    // private List<RegistroDeEmprestimo> listaDeEmprestimos = new ArrayList<>();
    public EstoqueLivros estoque = new EstoqueLivros(); // sempre acessar o estoque pela classe biblioteca 
    
    public void inserirItensNoEstoque() { // METODO PARA ADMINISTRADOR DO SISTEMA ACESSAR
        Scanner sc = new Scanner(System.in);
        boolean isCadastroOk = false; // trocar para true quando cadastro estiver finalizado 
        int unidadeDeCadastros = 0;
        
        while (!isCadastroOk) {
            System.out.println("Quantos Livros Deseja Cadastrar?");
            unidadeDeCadastros = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < unidadeDeCadastros; i++) {
                System.out.println("Número de identificação será gerado automaticamente.");
                boolean isnomeConfirmado = false; // trocar para true quando confirmar o nome
                
                while (!isnomeConfirmado) {
                    System.out.println("Registre o nome do livro:");
                    String nome = sc.nextLine();
                    System.out.println("Nome digitado: " + nome);
                    System.out.println("Y para confirmar o nome, N para digitar novamente:");
                    String inputConfirmacao = sc.nextLine();
                 
                    if (!inputConfirmacao.equalsIgnoreCase("Y")) {
                        System.out.println("Digite novamente!");
                    } else {
                        isnomeConfirmado = true;
                        System.out.println("Registro do próximo livro:");
                    }
                }
            }
            System.out.println("Cadastros realizados: " + unidadeDeCadastros);
            isCadastroOk = true; // Aqui é onde você pode definir isCadastroOk para true após o término dos cadastros
        } 
        sc.close();
    }
    public List<Livro> filtrarPorTipo(Temas tema) {
        List<Livro> list = new ArrayList<>();
        for (Livro livro : estoque.getEstoque()) {
            if (livro.getTema().equals(tema)) {
                list.add(livro);
            }
        }
        return list;
    }
    public List<Livro> filtrarPorNumeroDePaginas(int quantidadeMinima, int quantidadeMaxima) {
        List<Livro> list = new ArrayList<>();
        for (Livro livro : estoque.getMap().values()) {
            if (livro.getNumeroPaginas() >= quantidadeMinima && livro.getNumeroPaginas() <= quantidadeMaxima) {
                list.add(livro);
            }
        }
        return list;
    }
    public List<Livro >filtraPorTema(Temas tema){
        List<Livro> list = new ArrayList<>(); 
        for (Livro livro : estoque.getEstoque()) {
            if (livro.getTema().equals(tema)) {
                list.add(livro);
            }
        }
        return list;
    }
    public String consultarPorId(int numero){
        Livro livro = estoque.getMap().get(numero);
        if(livro != null){
            return estoque.getMap().get(numero).toString();
        }else{
            return "Id nao relacionado a nenhum livro";
        }
    }
    public void adicionarLivro(Livro livro) {
        estoque.adicionarLivro(livro);
    }
    public List<Temas> consultarTemasNoEstoque(){
        List<Temas> list = new ArrayList<>();
        for (Livro livro : estoque.getMap().values()) {
            list.add(livro.getTema());
        }
        return list;
    }


}
