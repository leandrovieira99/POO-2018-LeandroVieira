package entidades;

import java.util.ArrayList;
import java.util.List;

public class Quadro {

    private String nomeQuadro;
    List<Listagem> novoquadro = new ArrayList<>();


    public Quadro() {
    }

    public Quadro(String nomeQuadro, ArrayList novoquadro) {

        this.nomeQuadro = nomeQuadro;
        this.novoquadro = novoquadro;

    }

    public String getNomeQuadro() {
        return nomeQuadro;
    }

    public void setNomeQuadro(String nomeQuadro) {
        this.nomeQuadro = nomeQuadro;
    }


}