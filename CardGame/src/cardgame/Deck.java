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

import java.util.ArrayList;
import java.security.SecureRandom;

public class Deck {
    private ArrayList <Card> deck;
    private int deckSize;
    
    public Deck (){
        deckSize = 52;
        deck = new ArrayList <>();
        createDeck();
        for (int i = 0;i<500;i++)
            shuffleDeck();
    }
    
    private void createDeck (){
        Card card;
        for (int i = 0;i < 13;i++){
         card = new Card("Diamonds",i+1);
         deck.add(card);
        }
        for (int i = 0;i < 13;i++){
         card = new Card("Spades",i+1);
         deck.add(card);
        }
        for (int i = 0;i < 13;i++){
         card = new Card("Hearts",i+1);
         deck.add(card);
        }
        for (int i = 0;i < 13;i++){
         card = new Card("Clubs",i+1);
         deck.add(card);
        }
    }
    
    private void shuffleDeck (){
        SecureRandom randomizer = new SecureRandom();
        Card aux;
        int i ;
        i = randomizer.nextInt(52);
        aux = deck.get(i);
        deck.remove(i);
        deck.add(aux);
    }
    
    
    public Card collectCard (){
        Card card = new Card("",0);
        SecureRandom randomizer = new SecureRandom();
        int i;
        i = randomizer.nextInt(deckSize);
        card = deck.get(i);
        return card;
    }
}