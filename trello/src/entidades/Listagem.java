package entidades;

import java.util.ArrayList;
import java.util.List;

public class Listagem extends Cartao{
    private String nomeLista;
    List<Cartao> relacaoCartao = new ArrayList<>();

    public Listagem(){}

    public Listagem(String nomeLista, ArrayList relacaoCartao) {
        this.nomeLista = nomeLista;
        this.relacaoCartao = relacaoCartao;
    }

    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }


    public void setRelacaoCartao(ArrayList relacaoCartao) {
        this.relacaoCartao = relacaoCartao;
    }
}
