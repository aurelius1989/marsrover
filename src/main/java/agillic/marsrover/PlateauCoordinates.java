package agillic.marsrover;

public class PlateauCoordinates {

    private int xAxes;
    private int yAxes;

    public PlateauCoordinates(int xAxes, int yAxes) {
        this.xAxes = xAxes;
        this.yAxes = yAxes;
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
}
