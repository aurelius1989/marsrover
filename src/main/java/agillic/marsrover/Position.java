package agillic.marsrover;

public class Position {

    private int xAxes;
    private int yAxes;
    private CardinalPoint cardinalPoint;

    public Position(int xAxes, int yAxes, CardinalPoint cardinalPoint) {
        this.xAxes = xAxes;
        this.yAxes = yAxes;
        this.cardinalPoint = cardinalPoint;
    }

    public Position() {

    }

    public int getxAxes() {
        return xAxes;
    }

    public void setxAxes(int xAxes) {
        this.xAxes = xAxes;
    }

    public int getyAxes() {
        return yAxes;
    }

    public void setyAxes(int yAxes) {
        this.yAxes = yAxes;
    }

    public CardinalPoint getCardinalPoint() {
        return cardinalPoint;
    }

    public void setCardinalPoint(CardinalPoint cardinalPoint) {
        this.cardinalPoint = cardinalPoint;
    }

    @Override
    public String toString() {
        return "Position{" +
                "xAxes=" + xAxes +
                ", yAxes=" + yAxes +
                ", cardinalPoint=" + cardinalPoint +
                '}';
    }
}
