/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swudeckbuilder;
import java.util.ArrayList;

/**
 *
 * @author seanc
 */
public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();
    
     public void addCard(Card card) {
        deck.add(card);
     }

     public void drawHand() {
         System.out.println(deck.subList(0, 5));
         deck.subList(0, 5).clear();
     }
     
     public void getCards() {
        deck.forEach(card -> {
            System.out.println(card);
        });
     }
     
    public void removeCard(Card card) {
        deck.remove(card);
     }
    // shuffle 
    
    
    // draw
    
    // discard?
    
//    System.out.println(deck.toString());
}
