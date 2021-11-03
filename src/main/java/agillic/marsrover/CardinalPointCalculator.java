package agillic.marsrover;

public class CardinalPointCalculator {

    public static CardinalPoint calculateNewCardinalPoint(final Position currentPosition, final String wayToTurn) {
        CardinalPoint calculatedCardinalPoint = null;

        if (wayToTurn.equalsIgnoreCase("L")) {
            if (currentPosition.getCardinalPoint().value == 0) {
                currentPosition.setCardinalPoint(CardinalPoint.N2);
                Integer newValue = currentPosition.getCardinalPoint().value - 90;
                calculatedCardinalPoint = CardinalPoint.getCardinalPointForValue(newValue);
            } else {
                Integer newValue = currentPosition.getCardinalPoint().value - 90;
                calculatedCardinalPoint = CardinalPoint.getCardinalPointForValue(newValue);
            }
        }

        if (wayToTurn.equalsIgnoreCase("R")) {
            if (currentPosition.getCardinalPoint().value == 360) {
                currentPosition.setCardinalPoint(CardinalPoint.N1);
                Integer newValue = currentPosition.getCardinalPoint().value + 90;
                calculatedCardinalPoint = CardinalPoint.getCardinalPointForValue(newValue);
            } else {
                Integer newValue = currentPosition.getCardinalPoint().value + 90;
                calculatedCardinalPoint = CardinalPoint.getCardinalPointForValue(newValue);
            }
        }

        return calculatedCardinalPoint;
    }
}
