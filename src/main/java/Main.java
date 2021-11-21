/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guiau
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Boas vindas
        System.out.println("Seja bem vindo");

        // Entrada
        Scanner entrada = new Scanner(System.in);
        Scanner dado = new Scanner(System.in);

        int continua = 1;

        while (continua != 10) {
            // Menu
            System.out.println(" 1- Inicializar jogo\n 2- Sobre o jogo\n 3- Desenvolvedores\n 4- Sair\n Opção:");

            int escolhaOpcao = entrada.nextInt();

            switch (escolhaOpcao) {
            case 1:
                // Menu de escolha de Quantidade de jogadores
                System.out.println("Quantos jogadores?(Máximo 2): ");
                System.out.println("0- Voltar ao menu");
                int quantJogadores = entrada.nextInt();

                // Jogador Solo
                if (quantJogadores == 1) {
                    Jogador jogador1 = new Jogador();

                    System.out.println("Digite seu nome:");
                    String nomeJ = dado.nextLine();
                    jogador1.setNomeJ(nomeJ);

                    System.out.println("Digite seu apelido:");
                    String apelido = dado.nextLine();
                    jogador1.setApelido(apelido);

                    System.out.println("Digite seu telefone:");
                    String telefone = dado.nextLine();
                    jogador1.setTelefone(telefone);

                    System.out.println("Digite seu email:");
                    String email = dado.nextLine();
                    jogador1.setTelefone(email);

                    System.out.println("Jogador " + apelido + " cadastrado com sucesso");

                    System.out.println("----------------------------------------------");

                    // Menu de escolha de personagem
                    System.out.println(apelido
                            + " Escolha seu personagem: \n 1- Mjackson:\n Habilidade: Thriller(Cura seu personagem em 10%)");
                    System.out.println("\n 2- Simpson\n Bulacha Envenenada(Diminui a vida do inimigo em 10%)");
                    int escolhaPersonagem1 = entrada.nextInt();

                } else if (quantJogadores == 2) {

                } else if (quantJogadores == 0) {
                    System.out.println("tchau");
                }

                else {
                    System.out.println("Não é possivel criar partida com mais de 2 jogadores");
                }

            }

        }

        continua = 10;
    }
}
