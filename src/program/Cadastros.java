package program;

import arquivos.ProdutoArquivo;
import arquivos.UserArquivo;
import cadastro.Produto;
import cadastro.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Cadastros{

    static List<User> users = new ArrayList<>();
    static List<Produto> produtos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static String caminhoArquivo = "usuarios.txt";
    static String caminhoArquivoProduto = "produtos.txt";

    public static void main(String[] args) {

        int opcoes;

        do {
            System.out.println();
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar usuários");
            System.out.println("2 - Cadastrar produtos");
            System.out.println("3 - Listar usuários");
            System.out.println("4 - Listar produtos");
            System.out.println("5 - Excluir usuários");
            System.out.println("5 - Excluir produtos");
            System.out.println("6 - sair");
            System.out.print("Opção: ");

            opcoes = sc.nextInt();

            switch (opcoes) {
                case 1:
                    cadastroUsuario();
                    break;
                case 2:
                    cadastrarProdutos();
                    break;
                case 3:
                    listarUsuarios();
                    break;
                case 4:
                    listarProdutos();
                    break;
                case 5:
                    excluirUsuario();
                    break;
                case 6:
                    excluirProduto();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcoes != 0);
    }

    public static void cadastroUsuario() {

        int n;
        System.out.print("Quantidade de usuarios a serem cadastrados: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Cadastro de usuário: #" +(i + 1));

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("gênero: ");
            String genero = sc.next();

            System.out.print("E-mail: ");
            String email = sc.next();
            sc.nextLine();

            users.add(new User(nome, idade, genero, email));
        }
        System.out.println();
        System.out.println("Usuários cadastrados: " + users.size());
        System.out.println();
        UserArquivo.salvarListaUser(users, caminhoArquivo);
    }

    public static void listarUsuarios() {

        if (users.isEmpty()) {
            System.out.println();
            System.out.println("Não há usuarios cadastrados");
        }else {
            for (int i = 0; i < users.size(); i++) {
                System.out.println("\n[" + (i + 1 + "°") + " usuário]");
                System.out.println(users.get(i));
            }
        }
    }

    public static void cadastrarProdutos() {

        int n;
        System.out.print("Quantidade de produtos a serem cadastrados: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Cadastro de produto: #" +(i + 1));

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("preço: ");
            int preco = sc.nextInt();

            System.out.print("quantidade: ");
            int quantidade = sc.nextInt();

            System.out.print("perecível: ");
            String perecivel = sc.next();
            sc.nextLine();

            produtos.add(new Produto(nome, preco, quantidade, perecivel));
        }
        System.out.println();
        System.out.println("Produtos cadastrados: " + produtos.size());
        ProdutoArquivo.salvarListaProduto(produtos, caminhoArquivoProduto);
    }

    public static void listarProdutos() {

        if (produtos.isEmpty()) {
            System.out.println();
            System.out.println("Não há produtos cadastrados");
        } else {
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println("\n[" + (i + 1 + "°") + " produtos]");
                System.out.println(produtos.get(i));
            }
        }
    }

    public static void excluirUsuario() {

        if (users.isEmpty()) {
            System.out.println();
            System.out.println("Não há usuarios cadastrados");
        }else  {
            System.out.println("Usuários cadastrados:");
            for (int i = 0; i < users.size(); i++) {
                System.out.println((i + 1) + " - " + users.get(i).getName());
            }

            System.out.print("Digite o número do usuário que deseja excluir: ");
            int indice = sc.nextInt();
            sc.nextLine();

            if (indice > 0 && indice <= users.size()) {
                User removido = users.remove(indice - 1);
                System.out.println("Usuário '" + removido.getName() + "' removido com sucesso!");
                UserArquivo.salvarListaUser(users, caminhoArquivo);
            } else {
                System.out.println("Índice inválido!");
            }
        }
    }

    public static void excluirProduto() {

        if (produtos.isEmpty()) {
            System.out.println();
            System.out.println("Não há produtos cadastrados");
        }else  {
            System.out.println("produtos cadastrados:");
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println((i + 1) + " - " + produtos.get(i).getNome());
            }

            System.out.print("Digite o número do produto que deseja excluir: ");
            int indice = sc.nextInt();
            sc.nextLine();

            if (indice > 0 && indice <= produtos.size()) {
                Produto removido = produtos.remove(indice - 1);
                System.out.println("Usuário '" + removido.getNome() + "' removido com sucesso!");
                ProdutoArquivo.salvarListaProduto(produtos, caminhoArquivoProduto);
            } else {
                System.out.println("Índice inválido!");
            }
        }
    }
}

