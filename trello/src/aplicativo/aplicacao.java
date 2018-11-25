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
        ArrayList<Listagem> novaLista = new ArrayList<Listagem>();
        ArrayList<Quadro> novoTrello = new ArrayList<Quadro>();
        ArrayList<Cartao> novoCartao = new ArrayList<Cartao>();

        System.out.println("*+++==========================================================================+++");
        System.out.println("                     *  Seja Bem-Vindo ao Trello  *");
        System.out.println("*+++==========================================================================+++");

        System.out.println("Menu():" +
                "\n1 - Criar Quadro \n2 - Adicionar Listagem \n3 - Remover Listagem \n4 - Mostra Quadro " +
                "\n5 - Adicionar Cartão \n6 - Remover Cartao \n7 - Mostra Listagem \n8 - Inserir Comentários"+
                "\n9 - Inserir Etiqueta \n10 - Sair");
        Scanner sc = new Scanner(System.in);
        System.out.print(" Digite a a Opção desejada:");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o nome do Quadro: ");
                sc.nextLine();
                String nomeQuadro = sc.nextLine();
                Quadro quadro = new Quadro(nomeQuadro);
                novoTrello.add(quadro);
                break;
            case 2:
                System.out.print("Digite o nome da Lista: ");
                sc.nextLine();
                String nomeLista = sc.nextLine();
                System.out.print("Digite o numero do quadro para colocar a lista: ");
                int posicao = sc.nextInt();
                //pedir o numero do quadro onde vai ser adicionado
                novoTrello.get(posicao).adicionarListagem(posicao, nomeLista);
                break;
            case 3:
                System.out.print("Digite o nome da Lista remover: ");
                sc.nextLine();
                String nomeLista1 = sc.nextLine();
                System.out.print("Digite o numero do quadro que será removido a lista: ");
                int posicao1 = sc.nextInt();
                novoTrello.get(posicao1).removerListagem(posicao1, nomeLista1);
                break;
            case 4:
                novoTrello.toString();
                break;
            case 5:
                System.out.print("Digite o nome do Cartão a ser adicionado: ");
                sc.nextLine();
                String adicCartao = sc.nextLine();
                System.out.print("Digite o número da Lista que colocará o Cartão: ");
                int posicao3 = sc.nextInt();
                novaLista.get(posicao3).adicionarCartao(adicCartao);
                break;
            case 6:
                System.out.print("Digite o nome do Cartão a ser removido: ");
                sc.nextLine();
                String removerCartao = sc.nextLine();
                System.out.print("Digite o número da Lista que removerá Cartão: ");
                int posicao4 = sc.nextInt();
                novaLista.get(posicao4).removerCartao(removerCartao);
                break;
            case 7:
                novaLista.toString();
                break;
            case 8:
                System.out.print("Digite o nome do Cartão para inserir comentário: ");
                sc.nextLine();
                String nomeCartao = sc.nextLine();
                for(Listagem Cartao: novaLista){
                    if(Cartao.getCartao() == nomeCartao){
                        System.out.print("Digite o comentário : ");
                        sc.nextLine();
                        String comentario = sc.nextLine();
                        Cartao.setComentario(comentario);
                       } }
                break;
            case 9:
                System.out.print("Digite o nome do Cartão para inserir cor etiqueta: ");
                sc.nextLine();
                String nomeCartao1 = sc.nextLine();
                for(Listagem Cartao: novaLista){
                    if(Cartao.getCartao() == nomeCartao1){
                        System.out.print("Digite a cor etiqueta : ");
                        sc.nextLine();
                        String corEtiqueta = sc.nextLine();
                        Cartao.setCorEtiqueta(corEtiqueta);
                    } }
                break;
            case 10:
                System.out.println("Saindo o Sistema !");
                break;
        }

    sc.close();
    }
}
