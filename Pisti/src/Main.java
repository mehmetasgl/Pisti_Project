import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Card[] game = new Card[52];
        Card dia1 = new Card("♦Ace♦", 1,1);
        Card dia2 = new Card("♦Two♦", 1,2);
        Card dia3 = new Card("♦Three♦", 1,3);
        Card dia4 = new Card("♦Four♦", 1,4);
        Card dia5 = new Card("♦Five♦", 1,5);
        Card dia6 = new Card("♦Six♦", 1,6);
        Card dia7 = new Card("♦Seven♦", 1,7);
        Card dia8 = new Card("♦Eight♦", 1,8);
        Card dia9 = new Card("♦Nine♦", 1,9);
        Card dia10= new Card("♦Ten♦", 3,10);
        Card dia11 = new Card("♦Jack♦", 1,11);
        Card dia12 = new Card("♦Queen♦", 1,12);
        Card dia13 = new Card("♦King♦", 1,13);
        Card clubs1 = new Card("♣Ace♣", 1,1);
        Card clubs2 = new Card("♣Two♣", 2,2);
        Card clubs3 = new Card("♣Three♣", 1,3);
        Card clubs4 = new Card("♣Four♣", 1,4);
        Card clubs5 = new Card("♣Five♣", 1,5);
        Card clubs6 = new Card("♣Six♣", 1,6);
        Card clubs7 = new Card("♣Seven♣", 1,7);
        Card clubs8 = new Card("♣Eight♣", 1,8);
        Card clubs9 = new Card("♣Nine♣", 1,9);
        Card clubs10 = new Card("♣Ten♣", 1,10);
        Card clubs11 = new Card("♣Jack♣", 1,11);
        Card clubs12 = new Card("♣Queen♣", 1,12);
        Card clubs13 = new Card("♣King♣", 1,13);
        Card spa1 = new Card("♠Ace♠", 1,1);
        Card spa2 = new Card("♠Two♠", 1,2);
        Card spa3 = new Card("♠Three♠", 1,3);
        Card spa4 = new Card("♠Four♠", 1,4);
        Card spa5 = new Card("♠Five♠", 1,5);
        Card spa6 = new Card("♠Six♠", 1,6);
        Card spa7 = new Card("♠Seven♠", 1,7);
        Card spa8 = new Card("♠Eight♠", 1,8);
        Card spa9 = new Card("♠Nine♠", 1,9);
        Card spa10 = new Card("♠Ten♠", 1,10);
        Card spa11 = new Card("♠Jack♠", 1,11);
        Card spa12 = new Card("♠Queen♠", 1,12);
        Card spa13 = new Card("♠King♠", 1,13);
        Card hearts1 = new Card("♥Ace♥", 1,1);
        Card hearts2 = new Card("♥Two♥", 1,2);
        Card hearts3 = new Card("♥Three ♥", 1,3);
        Card hearts4 = new Card("♥Four♥", 1,4);
        Card hearts5 = new Card("♥Five♥", 1,5);
        Card hearts6 = new Card("♥Six♥", 1,6);
        Card hearts7 = new Card("♥Seven♥", 1,7);
        Card hearts8 = new Card("♥Eight♥", 1,8);
        Card hearts9 = new Card("♥Nine♥", 1,9);
        Card hearts10 = new Card("♥Ten♥", 1,10);
        Card hearts11 = new Card("♥Jack♥", 1,11);
        Card hearts12 = new Card("♥Queen♥", 1,12);
        Card hearts13 = new Card("♥King♥", 1,13);
        game[0] =  dia1;       game[1] =  dia2;       game[2] =  dia3;       game[3] =  dia4;       game[4] =  dia5;       game[5] =  dia6;       game[6] =  dia7;       game[7] =  dia8;       game[8] =  dia9;       game[9] =  dia10;      game[10] = dia11;      game[11] = dia12;      game[12] = dia13;      game[13] = clubs1;     game[14] = clubs2;     game[15] = clubs3;     game[16] = clubs4;     game[17] = clubs5;     game[18] = clubs6;     game[19] = clubs7;     game[20] = clubs8;     game[21] = clubs9;     game[22] = clubs10;    game[23] = clubs11;    game[24] = clubs12;    game[25] = clubs13;    game[26] = hearts1;    game[27] = hearts2;    game[28] = hearts3;    game[29] = hearts4;    game[30] = hearts5;    game[31] = hearts6;    game[32] = hearts7;    game[33] = hearts8;    game[34] = hearts9;    game[35] = hearts10;   game[36] = hearts11;   game[37] = hearts12;   game[38] = hearts13;   game[39] = spa1;       game[40] = spa2;       game[41] = spa3;       game[42] = spa4;       game[43] = spa5;       game[44] = spa6;       game[45] = spa7;       game[46] = spa8;       game[47] = spa9;       game[48] = spa10;      game[49] = spa11;      game[50] = spa12;      game[51] = spa13;
        Card[] playerDeck = new Card[4];
        Card[] computerDeck = new Card[4];
        Card[] pocket = new Card[4];
        Card[] tabledeck = new Card[100];
        Play[] players = new Play[20];
        List table = new List(tabledeck);
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Please, take a seat");
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Start!!");
        Play player = new Play(name,playerDeck,0);
        Play computer = new Play(computerDeck);
        Board gameboard = new Board(player,computer,game);
        gameboard.Welcome(player,computer,game,table);

        























        







    }
}
