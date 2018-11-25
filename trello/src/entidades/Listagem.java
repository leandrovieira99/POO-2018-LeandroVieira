package entidades;

import java.util.ArrayList;
import java.util.List;

public class Listagem extends Cartao{
    private String nomeLista;
    List<Cartao> relacaoCartao = new ArrayList<>();

    public Listagem(){}

    public Listagem(String nomeLista) {
        this.nomeLista = nomeLista;
    }

    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }


    public void adicionarCartao(String nomeCartao){
        Cartao novaCartao = new Cartao(nomeCartao);
        relacaoCartao.add(novaCartao);
    }

    public void removerCartao(String removerCartao){
        relacaoCartao.remove(removerCartao);
    }


    @Override
    public String toString() {
        return "Listagem{" +
                "nomeLista='" + nomeLista + '\'' +
                ", relacaoCartao=" + relacaoCartao +
                '}';
    }
}
