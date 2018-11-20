package aplicativo;

import java.lang.String;

import entidades.Listagem;
import entidades.Quadro;
import entidades.Cartao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aplicacao {


    public static void main(String[] args) {
        System.out.println("*+++==========================================================================+++");
        System.out.println("                     *  Seja Bem-Vindo ao Trello  *");
        System.out.println("*+++==========================================================================+++");

        System.out.println("Menu():" +
                "\n1 - Criar Quadro \n2 - Adicionar Listagem \n3 - Remover Listagem \n4 - Mostra Quadro " +
                "\n5 - Criar Listagem \n6 - Adicionar Cartão \n7 - Remover Cartao \n8 - Mostra Listagem" +
                "\n9 - Sair");
        Scanner sc = new Scanner(System.in);
        System.out.print(" Digite a a Opção desejada:");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o nome do Quadro: ");
                sc.nextLine();
                String nomeQuadro = sc.nextLine();
                List<Listagem> novoQuadro = new ArrayList<>();
                List<Quadro> novoTrello = new ArrayList<>();
                novoTrello.adicionarLis;
                break;
            case 2:
                listarQuadros();
                break;
            case 3:
                selecionarQuadro();
                break;
            case 4:
                criarTarefa();
                break;
            case 5:
                listarTarefas();
                break;
            case 6:
                selecionarTarefa();
                break;
            case 7:
                criarCartao();
                break;
            case 8:
                listagemCompletaDeCartoes();
                break;
            case 9:
                selecionarCartao();
                break;
            case 10:
                adicionarDescricao();
                break;



        System.out.print("Deseja inserir um Quadro: Digite s - sim / n - não  ");






    sc.close();
    }
}
