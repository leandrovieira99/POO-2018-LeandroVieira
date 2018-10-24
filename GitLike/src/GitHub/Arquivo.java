package GitHub;

import java.util.Scanner;

public class Arquivo {
    private String n_Arquivo;
    private String cont_Texto;
    private String data;
    private String codigo;


    //construtor
    public Arquivo(String A, String T,String data, String codigo ){
        this.n_Arquivo = A;
        this.cont_Texto = T;
        this.data = data;
        this.codigo = codigo;


    }

    public Arquivo(String A ) {
        this.n_Arquivo = A;
    }

    //metodo mostrar os dados do arquivo
    public String ArquivoInfo(){
        return "Arquivo:"+ this.n_Arquivo + "\nConteudo do Texto:" + this.cont_Texto + "\nData"+ this.data +
                "\nCodigo"+ this.codigo;
    }

    //metodo get
    public String getN_Arquivo() {
        return n_Arquivo;
    }

    public void setN_Arquivo(String n_Arquivo) {
        this.n_Arquivo = n_Arquivo;
    }
    //metodo get
    public String getCont_Texto() {
        return cont_Texto;
    }

    public void setCont_Texto(String cont_Texto) {
        this.cont_Texto = cont_Texto;
    }
    //metodo get
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }





}


