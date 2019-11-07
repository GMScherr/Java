/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deck deck = new Deck();
        Player player1 = new Player(deck);
        Player player2 = new Player(deck);
        int option = 0;
        int player1value = 0;
        int player2value = 0;
        
        System.out.println("Bem vindo ao jogo!");
        for (int i = 0;i<5;i++){
            player1.pickCard();
            player2.pickCard();
            System.out.printf("O jogador 1 tem as cartas : %d de %s e %d de %s\n",player1.returnNumber1(),player1.returnSuit1(),player1.returnNumber2(),player1.returnSuit2());
            System.out.printf("O jogador 2 tem as cartas : %d de %s e %d de %s\n",player2.returnNumber1(),player2.returnSuit1(),player2.returnNumber2(),player2.returnSuit2());
            System.out.println("Selecionar operação :");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            option = scan.nextInt();
            switch (option){
                case 1:{
                    player1value = player1.returnNumber1() + player1.returnNumber2();
                    player2value = player2.returnNumber1() + player2.returnNumber2();
                } break;
                case 2:{
                    player1value = Math.abs( player1.returnNumber1() - player1.returnNumber2());
                    player2value = Math.abs( player2.returnNumber1() - player2.returnNumber2());
                } break;
                case 3:{
                    player1value = player1.returnNumber1() * player1.returnNumber2();
                    player2value = player2.returnNumber1() * player2.returnNumber2();
                } break;
                case 4:{
                    player1value = player1.returnNumber1() / player1.returnNumber2();
                    player2value = player2.returnNumber1() / player2.returnNumber2();
                } break;
            }
            System.out.printf("O resultado do jogador 1 é : %d\n",player1value);
            System.out.printf("O resultado do jogador 2 é : %d\n",player2value);
            
            if (player1value>player2value){
                System.out.printf("O jogador 1 ganhou a rodada!\n\n\n");
                player1.scoreUp();
            }
            else {
               System.out.printf("O jogador 2 ganhou a rodada!\n\n\n");
                player2.scoreUp(); 
            }
        }
        System.out.println("O jogo está encerrado. O vencedor é :");
        if (player1.getScore() > player2.getScore()){
            System.out.println("O jogador 1!");
        }
        else {
            System.out.println("O jogador 2!");
        }
    }
}
