package agillic.marsrover;

import org.junit.Test;

import static agillic.marsrover.CardinalPoint.*;
import static org.junit.Assert.assertEquals;


public class CardinalPointCalculatorTest {

    @Test
    public void calculateNewCardinalPoint() {
        // given
        Position position = new Position(0, 1, N1);

        // when
        CardinalPoint cardinalPoint = CardinalPointCalculator.calculateNewCardinalPoint(position, "L");

        // then
        assertEquals(V, cardinalPoint);
        position.setCardinalPoint(cardinalPoint);

        // when
        cardinalPoint = CardinalPointCalculator.calculateNewCardinalPoint(position, "R");

        // then
        assertEquals(N2, cardinalPoint);
        position.setCardinalPoint(cardinalPoint);

        // when
        cardinalPoint = CardinalPointCalculator.calculateNewCardinalPoint(position, "R");

        // then
        assertEquals(E, cardinalPoint);
        position.setCardinalPoint(cardinalPoint);

        // when
        cardinalPoint = CardinalPointCalculator.calculateNewCardinalPoint(position, "R");

        // then
        assertEquals(S, cardinalPoint);
        position.setCardinalPoint(cardinalPoint);

        // when
        cardinalPoint = CardinalPointCalculator.calculateNewCardinalPoint(position, "L");

        // then
        assertEquals(E, cardinalPoint);
    }
}