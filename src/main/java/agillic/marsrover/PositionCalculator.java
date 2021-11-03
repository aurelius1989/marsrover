package agillic.marsrover;

public class PositionCalculator {

    public static Position calculateNextPosition(Position currentPosition) {
        Position newPosition = new Position();

        if (currentPosition.getCardinalPoint() == CardinalPoint.N1 ||
                currentPosition.getCardinalPoint() == CardinalPoint.N2) {
            newPosition.setyAxes(currentPosition.getyAxes() + 1);
            newPosition.setxAxes(currentPosition.getxAxes());
            newPosition.setCardinalPoint(currentPosition.getCardinalPoint());

        }
        if (currentPosition.getCardinalPoint() == CardinalPoint.S) {
            newPosition.setyAxes(currentPosition.getyAxes() - 1);
            newPosition.setxAxes(currentPosition.getxAxes());
            newPosition.setCardinalPoint(currentPosition.getCardinalPoint());
        }
        if (currentPosition.getCardinalPoint() == CardinalPoint.E) {
            newPosition.setyAxes(currentPosition.getyAxes());
            newPosition.setxAxes(currentPosition.getxAxes() + 1);
            newPosition.setCardinalPoint(currentPosition.getCardinalPoint());
        }
        if (currentPosition.getCardinalPoint() == CardinalPoint.V) {
            newPosition.setyAxes(currentPosition.getyAxes());
            newPosition.setxAxes(currentPosition.getxAxes() - 1);
            newPosition.setCardinalPoint(currentPosition.getCardinalPoint());
        }

        return newPosition;
    }
}
