package entidades;

import java.util.ArrayList;
import java.util.List;

public class Quadro {

    private String nomeQuadro;
    List<Listagem> novoQuadro = new ArrayList<>();


    public Quadro() {
    }

    public Quadro(String nomeQuadro, ArrayList novoquadro) {

        this.nomeQuadro = nomeQuadro;
        this.novoQuadro = novoquadro;

    }

    public String getNomeQuadro() {
        return nomeQuadro;
    }

    public void setNomeQuadro(String nomeQuadro) {
        this.nomeQuadro = nomeQuadro;
    }

    public void adicionarListagem(String nomeQuadro, ArrayList novaLista){
        Listagem relacaoLista = new Listagem(nomeQuadro, novaLista);
        novoQuadro.add(relacaoLista);
    }

    public void removerListagem(String removeLista){
        novoQuadro.remove(removeLista);
    }

    public void mostraQuadro(){
        System.out.println("Relação do Quadro :" + getNomeQuadro());
        for(Listagem listagem: novoQuadro ){
            System.out.println(listagem);
        }
    }


}