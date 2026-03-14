import java.util.Arrays;

public class List {
    Card[] list;

    public List(Card[] list) {
        this.list = list;
    }

    public void add(Card card){
        if(list.length == 0){
            Card[] newlist = new Card[1];
            list = newlist;
            list[0] = card;
        }else {
            int oldindex = list.length;
            int newindex = list.length + 1;
            Card[] newlist = new Card[newindex];
            for (int l=0; l<oldindex;l++){
                newlist[l]=list[l];
            }
            list = newlist;
            list[oldindex] = card;
        }
    }

    public void reset(){
        Card[] reset_list = new Card[0];
        list = reset_list;
    }

    public void lastelement(){
        int last_element = list.length -1;
        System.out.println(list[last_element].getName());
    }

    public void printlist(){
        for(int x=0; x<list.length;x++){
            System.out.println(list[x].getName());
        }
    }
    public void makelastelement(Card make){
        make = list[list.length-1];
    }
}
