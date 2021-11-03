package agillic.marsrover;

import java.util.Arrays;

public enum CardinalPoint {

    N1("N", 0),
    E("E", 90),
    S("S", 180),
    V("V", 270),
    N2("N", 360);

    public final String cardinalPoint;
    public final Integer value;

    CardinalPoint(String cardinalPoint, Integer value) {
        this.cardinalPoint = cardinalPoint;
        this.value = value;
    }

    public static CardinalPoint getCardinalPointForValue(Integer value) {
        return Arrays.stream(CardinalPoint.values()).filter(cardinalPoint -> cardinalPoint.value.equals(value)).findFirst().get();
    }

    @Override
    public String toString() {
        return "CardinalPoint{" +
                "cardinalPoint='" + cardinalPoint + '\'' +
                ", value=" + value +
                '}';
    }
}
