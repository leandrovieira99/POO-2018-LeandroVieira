package Aplicacao;
import java.net.SocketOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import GitHub.Arquivo;
import GitHub.StageZone;
import GitHub.Git;
import java.lang.String;

public class Aplicativo {


    public static void main(String[] args) {
        StageZone novo_StageZone = new StageZone(2, 3);


        String usuario = "rogerio";
        String email_Usuario = "rogeriosilva@hotmail.com";

        //Pedir int para executar função logar
        Scanner dejLogar = new Scanner(System.in);
        int entrada_Logar;
        System.out.println("Digite 1 para Logar:");
        entrada_Logar = dejLogar.nextInt();

        //Logan
        public void logarSistema (int entrada_Logar){
            if (entrada_Logar == 1) {
                Scanner nome = new Scanner(System.in);
                String entrada_nome;
                System.out.println("git config — global user.name");
                entrada_nome = nome.nextLine();

                Scanner email = new Scanner(System.in);
                String entrada_email;
                System.out.println("git config — global user.email");
                entrada_email = email.nextLine();

                if (entrada_nome == usuario && entrada_email == email_Usuario) {
                    System.out.println("Logado com Sucesso");

                    Scanner dejRepositorio = new Scanner(System.in);
                    int entrada_Repositor;
                    System.out.println("Digite 1 para git init:");
                    entrada_Repositor = dejRepositorio.nextInt();

                    public void criarRepositorio(int entrada_Repositor){
                        if(entrada_Repositor == 1){
                            Git[] preparando_Git = new Git[10]; }
                            else{
                            System.out.println("Não foi criado nenhum repositorio");
                        }

                    Scanner nome_Arquivo = new Scanner(System.in);
                    String entrada_nomeArquivo;
                    System.out.println("Digite nome do arquivo: ");
                    entrada_nomeArquivo = nome_Arquivo.nextLine();

                    Scanner criar_Conteudo = new Scanner(System.in);
                    String entrada_CriarConteudo;
                    System.out.println("Digite conteudo do arquivo: ");
                    entrada_CriarConteudo = criar_Conteudo.nextLine();

                    Scanner criar_Data = new Scanner(System.in);
                    String entrada_Data;
                    System.out.println("Digite data do arquivo: ");
                    entrada_Data = criar_Data.nextLine();

                    Scanner criar_Codigo = new Scanner(System.in);
                    String entrada_Codigo;
                    System.out.println("Digite data o codigo: ");
                    entrada_Codigo = criar_Codigo.nextLine();

                    novo_StageZone.criar_Arquivo(entrada_nomeArquivo, entrada_CriarConteudo, entrada_Data, entrada_Codigo);

                    Scanner remover_Arquivo = new Scanner(System.in);
                    int entrada_RemArquivo;
                    System.out.println("Digite número da localização do arquivo:");
                    entrada_RemArquivo = remover_Arquivo.nextInt();
                    novo_StageZone.removerArquivo(entrada_RemArquivo);

                    Scanner modificar_Arquivo = new Scanner(System.in);
                    int entrada_ModArquivo;
                    System.out.println("Digite número da localização do arquivo:");
                    entrada_ModArquivo = modificar_Arquivo.nextInt();
                    novo_StageZone.removerArquivo(entrada_RemArquivo);

                    Scanner listArquivo = new Scanner(System.in);
                    int entrada_ListaArquivo;
                    System.out.println("Digite numero 1 se desejar: ");
                    entrada_ListaArquivo = listArquivo.nextInt();



                    }


            }
            }
            else{
                System.out.println("Não deseja Logar");
        }

    }
}}




