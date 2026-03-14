import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Board {
    Play player1;
    Play computer;
    Card[] game;

    public Board(Play player1, Play computer, Card[] game) {
        this.player1 = player1;
        this.computer = computer;
        this.game = game;
    }

    public void Welcome(Play player, Play computer,Card[] game, List table){
        shuffle(game);
        table.reset();
        cut(game);
        boolean gather = true;
        int startdeal =0;
        for (int z=0; z<game.length;z++){
            if(game[z] != null){
                startdeal =z;
                break;
            }
        }
        for (int x=0; x<4;x++){
            table.add(game[startdeal]);
            game[startdeal]= null;
            startdeal++;
        }
        for(int s=0; s<6;s++){
            deal(player,computer,game);
            for (int t=0;t<4;t++){
                gather = player.Player(table,gather);
                gather = computer.computer(table,gather);
            }
        }
        System.out.println("Your score " + player.getPoint());
        if(gather){
            System.out.println("You gather the table because you took the cards off the table last time.");
            for (int x=0;x<table.list.length;x++){
                player.setPoint(table.list[x].getPoint()+ player.getPoint());
            }
        }
        System.out.println("Your score " + player.getPoint());
        System.out.println("********************************");
        System.out.println("TOP SCORES");
        Writer.writeTop(player.getPoint());



    }
    public void shuffle(Card[] deck) {
        Random random = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        game = deck;
    }
    public void cut(Card[] deck) {
        int cutPoint = deck.length/2;
          Card[] cuttedDeck = new Card[deck.length];
          for (int i = 0; i < deck.length - cutPoint; i++) {
              cuttedDeck[i] = deck[cutPoint + i];
          }
          for (int i = 0; i < cutPoint; i++) {
              cuttedDeck[deck.length - cutPoint + i] = deck[i];
          }
          game = cuttedDeck;
        }

    public void print(Card[] deck){
        for (int z=0; z<deck.length;z++){
            if (deck[z] != null){
                System.out.println(deck[z].getName());
            }
        }
    }

    public void deal(Play player,Play computer,Card[] deck){
        deck = game;
        int startdeal =0;
        for (int z=0; z<deck.length;z++){
            if(deck[z] != null){
                startdeal =z;
                break;
            }
        }
        for (int g =0; g<player.getPlayerdeck().length;g++){
            player.getPlayerdeck()[g]=deck[startdeal];
            deck[startdeal]=null;
            startdeal++;

        }
        for (int z=0; z<deck.length;z++){
            if(deck[z] != null){
                startdeal =z;
                break;
            }
        }
        for (int h =0; h<computer.getPlayerdeck().length;h++){
            computer.getPlayerdeck()[h]=deck[startdeal];
            deck[startdeal]=null;
            startdeal++;
        }
    }
}