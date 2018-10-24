package GitHub;
import GitHub.StageZone;
import java.util.Scanner;
import GitHub.Git;


public class StageZone {
    Arquivo[] preparando_Arquivo = new Arquivo[10];
    private int quant_Alteracoes;
    private int codigost;


    public StageZone( int a, int b){
        this.quant_Alteracoes = a;
        this.codigost = b;

    }

    public StageZone(Arquivo[] preparando_Arquivo){
        this.preparando_Arquivo = preparando_Arquivo;

    }



    public int getQuant_Alteracoes() {
        return quant_Alteracoes;
    }

    public void setQuant_Alteracoes(int quant_Alteracoes) {
        this.quant_Alteracoes = quant_Alteracoes;
    }

    public int getCodigo() {
        return codigost;
    }

    public void setCodigo(int codigost) {
        this.codigost = codigost;
    }

    public void criar_Arquivo(String n_Arquivo, String cont_Texto, String data, String codigo){
        int i;
        for(i = 0; i < this.preparando_Arquivo.length;i++) {
            if (this.preparando_Arquivo[i] != null) {
                Arquivo arquivo = new Arquivo(n_Arquivo, cont_Texto, data, codigo);
                this.preparando_Arquivo[i] = arquivo;

            }
        }}


    public void removerArquivo(int i) {
        this.preparando_Arquivo[i] = null;
    }

    public void listarArquivo(int entrada_ListaArquivo){
        int i;
        for(i = 0; i < this.preparando_Arquivo.length;i++) {
               System.out.printf("Arquivo numero: %d, nome do arquivo: %d \n",i , this.preparando_Arquivo[i] );
            }
    }

    public void modificarArquivo(){

    }



    //ls = ver os arquivos
    //git status
    //git commit -m "texto"
}
