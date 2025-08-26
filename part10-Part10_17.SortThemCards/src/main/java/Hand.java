
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sierra02
 */
public class Hand implements Comparable<Hand> {

    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {

        for (Card card : this.hand) {
            System.out.println(card);
        }
//        this.hand.stream()
//                .forEach(card -> System.out.println(card));
    }

    public void sort() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);
        Collections.sort(hand, comparator);
    }
    
    private int sumTotal(){
        int sum = 0;
        for(Card card: hand){
            sum += card.getValue();
        }
        return sum;
    }

    public int compareTo(Hand hand) {
        return this.sumTotal() - hand.sumTotal();

    }
    public void sortBySuit(){
        Collections.sort(hand, new BySuitInValueOrder());
    }
}
