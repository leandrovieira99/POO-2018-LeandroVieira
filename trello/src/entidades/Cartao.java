package entidades;

public class Cartao {
    private String cartao;
    private String corEtiqueta;
    private String comentario;

    public Cartao(){
    }

    public Cartao(String cartao) {
        this.cartao = cartao;
    }

    public String getCartao() {
        return cartao;
    }

    public String getCorEtiqueta(){
        return corEtiqueta;
    }

    public void alteraCartao(String cartao){
        this.cartao = cartao;
    }

    public void setCorEtiqueta(String  corEtiqueta){
        this.corEtiqueta = corEtiqueta;
    }

    public void excluirCartao(){
        this.cartao = null;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String toString(){
        return "Lembrete de Cartão:"+ this.cartao + "\nEtiqueta:" + this.corEtiqueta + "\nComentario"+ this.comentario;
    }

}
