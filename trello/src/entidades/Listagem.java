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

    public void adicionarCartao(String nomeCartao){
        Cartao novaCartao = new Cartao(nomeCartao);
        relacaoCartao.add(novaCartao);
    }

    public void removerCartao(String removerCartao){
        relacaoCartao.remove(removerCartao);
    }

    public void mostraLista(){
        System.out.println("Relação da Listagem :" + getNomeLista());
        for(Cartao lista: relacaoCartao ){
            System.out.println(lista.toString());
        }
    }
}
