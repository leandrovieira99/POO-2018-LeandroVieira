package aplicativo;

import java.lang.String;

import entidades.Quadro;
import entidades.Cartao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aplicacao {


    public static void main(String[] args) {
        // criar uma lista de cartao
        List<Cartao> novoCartao = new ArrayList<>();


        //criar um quadro para receber cada bloco
        Quadro[] vetquadro = new Quadro[3];



        Scanner sc = new Scanner(System.in);



        System.out.print("Deseja inserir um Quadro: Digite s - sim / n - não  ");
        char ponto = sc.next().charAt(0);
        char comparacao = "s" ;


        System.out.println("Digite o nome do novo quadro");
        sc.nextLine();
        String nomequadros = sc.nextLine();
        quadros.setNomeQuadro(nomequadros);



    sc.close();
    }
}
