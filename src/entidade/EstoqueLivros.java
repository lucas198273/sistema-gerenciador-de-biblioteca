package entidade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class EstoqueLivros {

    public Map<Integer, Livro> estoqueMap = new HashMap<>();

    public Map<Integer, Livro> getMap(){
        return estoqueMap;
    }
    public List<Livro> getEstoque() {
        return new ArrayList<>(estoqueMap.values());
    }
    public void populandoEstoque(){
        Livro l1 = new Livro("Persi Jackson");
        Livro l2  = new Livro("Persi Jackson2" );
        Livro l3 = new Livro("Mundo dos Gigantes");
        Livro l4 = new Livro("Mitologia Nordica");
        Livro l5 = new Livro("Thor vs Loki");
        Livro l6= new Livro("Pesadelo");

        Livro l7= new Livro("Aranhas motiferas");
        adicionarLivro(l1);
        adicionarLivro(l2);
        adicionarLivro(l3);
        adicionarLivro(l4);
        adicionarLivro(l5);
        adicionarLivro(l6);
        adicionarLivro(l7);
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
        System.out.println(l3.hashCode());
        System.out.println(l4.hashCode());
        System.out.println(l5.hashCode());
        System.out.println(l6.hashCode());
        System.out.println(l7.hashCode());
    }
   
    public void setEstoqueMap(Map<Integer, Livro> estoqueMap) {
        this.estoqueMap = estoqueMap;
    }

    // Método para encontrar o maior ID no estoque
    public int getMaximoId() {
        return estoqueMap.isEmpty() ? 0 : Collections.max(estoqueMap.keySet());
    }

    public void adicionarLivro(Livro livro) {
        int novoId = getMaximoId() + 1;
        estoqueMap.put(novoId, livro);
    }

}
