/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author aluno
 */
public class Player {
    private Card card1;
    private Card card2;
    private Deck deck;
    private int score;
    
    public Player (Deck deck){
        this.score = 0;
        card1 = new Card("",0);
        card2 = new Card("",0);
        this.deck = deck;
    }
    
    public void pickCard (){
        this.card1 = deck.collectCard();
        this.card2 = deck.collectCard();
    }
    
    public int returnNumber1 (){
        return this.card1.getNumber();
    }

    public int returnNumber2 (){
        return this.card2.getNumber();
    }
    
    public String returnSuit1 (){
        return this.card1.getSuit();
    }
    
    public String returnSuit2 (){
        return this.card2.getSuit();
    }
    
    public void scoreUp(){
        score++;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public Card getCard1(){
        return this.card1;
    }
    
    public Card getCard2(){
        return this.card2;
    }
}
