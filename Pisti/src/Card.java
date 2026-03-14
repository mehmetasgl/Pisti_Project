public class Card {
    private String Name;
    private int Number;
    private int point;

    public Card(String name, int point, int number) {
        Name = name;
        Number = number;
        this.point = point;
    }

    @Override
    public String toString() {
        return getName();
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getNumber() {
        return Number;
    }
    public void setNumber(int number) {
        Number = number;
    }
    public int getPoint() {
        return point;
    }
    public void setPoint(int point) {
        this.point = point;
    }
}