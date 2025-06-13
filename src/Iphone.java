import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("RING RING, Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone();
        int opcao;
        do {
            System.out.println("Opções:\n +" + "1: Efetuar ligação \n +"
                    + "2: Atender ligação \n +" + "3: Iniciar correio de voz \n +" + "4: Selecionar música \n +"
                    + "5: Tocar música \n +" + "6: Pausar música \n +" + "7: Exibir página no navegador \n +"
                    + "8: Abrir nova aba no navegador \n +" + "9: Atualizar página no navegador \n +" + "0: Desligar");

            System.out.print("\nOpção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    iphone.ligar();
                    Thread.sleep(1500);
                    break;
                case 2:
                    iphone.atender();
                    Thread.sleep(1500);
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                    Thread.sleep(1500);
                    break;
                case 4:
                    iphone.selecionarMusica();
                    Thread.sleep(1500);
                    break;
                case 5:
                    iphone.tocar();
                    Thread.sleep(1500);
                    break;
                case 6:
                    iphone.pausar();
                    Thread.sleep(1500);
                    break;
                case 7:
                    iphone.exibirPagina();
                    Thread.sleep(1500);
                    break;
                case 8:
                    iphone.adicionarNovaAba();
                    Thread.sleep(1500);
                    break;
                case 9:
                    iphone.atualizarPagina();
                    Thread.sleep(1500);
                    break;
                case 0:
                    System.out.println("Desligando...");
                    Thread.sleep(1000);
                    break;
                default:
                    System.out.println("Opção inválida. Insira um número de 0 a 9.");
                    Thread.sleep(500);
            }
        } while (opcao != 0);
        sc.close();
    }
}
