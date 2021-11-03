package agillic.marsrover;

import java.util.Arrays;

public class Rover {

    private Position currentPosition;
    private final PlateauCoordinates plateauCoordinates;

    public Rover(Position currentPosition, PlateauCoordinates plateauCoordinates) {
        this.currentPosition = currentPosition;
        this.plateauCoordinates = plateauCoordinates;
    }

    public Position followTheRoute(final String route) {
        Arrays.stream(route.split("")).forEach(this::executeCommand);

        return this.currentPosition;
    }

    private Position executeCommand(final String command) {
        if (command.equalsIgnoreCase("M")) {
            final Position nextCalculatedPosition = calculateNextPosition(this.currentPosition);
            if (isPositionValid(nextCalculatedPosition)) {
//                System.out.println("-------------------------");
//                System.out.println("current position: " + nextCalculatedPosition);
                this.currentPosition = nextCalculatedPosition;
            } else {
                System.out.println("Position is not valid: " + nextCalculatedPosition);
                System.out.println("Rover will remain at the current position: " + this.currentPosition);
            }
        } else {
            calculateNewCardinalPoint(command);
        }
        return this.currentPosition;
    }

    private Position calculateNextPosition(Position currentPosition) {
        return PositionCalculator.calculateNextPosition(currentPosition);
    }

    private Boolean isPositionValid(Position nextCalculatedPosition) {
        return Math.abs(nextCalculatedPosition.getxAxes()) <= this.plateauCoordinates.getxAxes() &&
                Math.abs(nextCalculatedPosition.getyAxes()) <= this.plateauCoordinates.getyAxes();
    }

    private void calculateNewCardinalPoint(final String wayToTurn) {
//        System.out.println("current cardinal point " + this.currentPosition.getCardinalPoint());
//        System.out.println(wayToTurn);

        this.currentPosition.setCardinalPoint(CardinalPointCalculator.calculateNewCardinalPoint(currentPosition, wayToTurn));

//        System.out.println("new current cardinal point " + this.currentPosition.getCardinalPoint());
    }


}
