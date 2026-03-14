import java.util.Scanner;

public class Play {
    private String Name;

    private Card lastcard;

    private Card[] playerdeck;

    private int point;


    public Play(String name, Card[] playerdeck, int point) {
        Name = name;
        this.playerdeck = playerdeck;
        this.point = point;
    }

    public Play(Card[] playerdeck) {
        this.playerdeck = playerdeck;
    }

    public Card[] getPlayerdeck() {
        return playerdeck;
    }

    public void setPlayerdeck(Card[] playerdeck) {
        this.playerdeck = playerdeck;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean Player(List table, boolean t) {
        Scanner user = new Scanner(System.in);
        String userString = "";
        int userchoice = 31;
        boolean error = true;
        while (error) {
            try {
                if (table.list.length == 0) {
                    System.out.println("Table empty");
                    System.out.println("Your hand:");
                    for (int i = 0; i < playerdeck.length; i++) {
                        if (playerdeck[i] != null) {
                            System.out.println((i + 1) + ". " + playerdeck[i].getName());
                        } else {
                            System.out.println((i + 1) + ". ØØØØ");
                        }
                    }
                    System.out.println("Please choose your card with a number between 1-4");
                    userString = user.nextLine();
                    userchoice = Integer.parseInt(userString);
                    userchoice--;
                    System.out.println(playerdeck[userchoice].getName());
                    error = false;

                } else {
                    System.out.println("Top card: ");
                    table.lastelement();
                    System.out.println("Full table:");
                    table.printlist();
                    System.out.println("Your hand:");
                    for (int i = 0; i < playerdeck.length; i++) {
                        if (playerdeck[i] != null) {
                            System.out.println((i + 1) + ". " + playerdeck[i].getName());
                        } else {
                            System.out.println((i + 1) + ". ØØØØ");
                        }
                    }
                    System.out.println("Please choose your card with a number between 1-4");
                    userString = user.nextLine();
                    userchoice = Integer.parseInt(userString);
                    userchoice--;
                    System.out.println(playerdeck[userchoice].getName());
                    error = false;
                }
                error = false;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Please choose valid card");
                error = true;
            }
        }


        if (table.list.length == 0) {
            System.out.println("Your card: " + playerdeck[userchoice].getName());
            table.add(playerdeck[userchoice]);
            playerdeck[userchoice] = null;

        } else {
            lastcard = table.list[table.list.length-1];
            if (playerdeck[userchoice].getNumber() == lastcard.getNumber()) {
                System.out.println("Your card: " + playerdeck[userchoice].getName());
                System.out.println("Your card matches the card on the table!");
                if (table.list.length ==1){
                    System.out.println("PİŞTİİİİİİ!!!");
                    System.out.println("You got 10 points");
                    point = point +10;
                    t = true;
                }
                for (int r =0; r<table.list.length;r++){
                    point = table.list[r].getPoint() + point;
                }
                playerdeck[userchoice] = null;
                t = true;
                table.reset();
                return t;
            } else if (playerdeck[userchoice].getNumber() == 11) {
                System.out.println("Your card: " + playerdeck[userchoice].getName());
                System.out.println("Your card is jack! So you win all cards!");
                t = true;
                playerdeck[userchoice] = null;
                for (int x = 0; x < table.list.length; x++) {
                    point = point + table.list[x].getPoint();
                }
                table.reset();
                return t;
            }else {
                table.add(playerdeck[userchoice]);
                playerdeck[userchoice] = null;
            }

        }
        return t;
    }

    public boolean computer(List table, boolean t){
        System.out.println("Computer's turn");
        if(table.list.length ==0){
            for(int i=0;i<playerdeck.length;i++){
                if(playerdeck[i] == null){

                }else if(playerdeck[i] != null){
                    System.out.println("Computer plays: " + playerdeck[i].getName());
                   table.add(playerdeck[i]);
                   playerdeck[i] = null;
                   return t;
                }
            }
        }else {
            lastcard = table.list[table.list.length-1];
            for (int x=0; x<playerdeck.length;x++){
                if(playerdeck[x]!= null){
                    if(playerdeck[x].getNumber() == lastcard.getNumber()){
                        System.out.println("Computer plays: " + playerdeck[x].getName());
                        if (table.list.length == 1){
                            System.out.println("Pişti! Computer make pişti!");
                        }
                        System.out.println("Computer got the cards");
                        playerdeck[x] = null;
                        table.reset();
                        t = false;
                        return t;
                    }
                }
            }
            for (int z= 0; z<playerdeck.length;z++){
                if(playerdeck[z]!= null){
                    if(playerdeck[z].getNumber() == 11){
                        System.out.println("Computer plays: " + playerdeck[z].getName());
                        System.out.println("Computer got the cards");
                        playerdeck[z] = null;
                        table.reset();
                        t = false;
                        return t;
                    }
                }
            }
            for(int i=0;i<playerdeck.length;i++){
                if(playerdeck[i] == null){

                }else if(playerdeck[i] != null){
                    System.out.println("Computer plays: " + playerdeck[i].getName());
                    table.add(playerdeck[i]);
                    playerdeck[i] = null;
                    return t;
                }
            }
        }
        return t;
    }

}
