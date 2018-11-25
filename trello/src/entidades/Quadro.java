package entidades;

import java.util.ArrayList;
import java.util.List;

public class Quadro {

    private String nomeQuadro;
    List<Listagem> Lista = new ArrayList<>();


    public Quadro() {
    }

    public Quadro(String nomeQuadro) {

        this.nomeQuadro = nomeQuadro;

    }

    public String getNomeQuadro() {
        return nomeQuadro;
    }

    public void setNomeQuadro(String nomeQuadro) {
        this.nomeQuadro = nomeQuadro;
    }

    public void adicionarListagem(int posicao, String nomeLista){
        Listagem relacaoLista = new Listagem(nomeLista);
        this.Lista.add(relacaoLista);
    }

    public void removerListagem(int posicao1, String removeLista){
        Lista.remove(removeLista);
    }

    @Override
    public String toString() {
        return "Quadro{" +
                "nomeQuadro='" + nomeQuadro + '\'' +
                ", Lista=" + Lista +
                '}';
    }
}