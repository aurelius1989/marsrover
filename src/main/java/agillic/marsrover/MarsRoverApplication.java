package agillic.marsrover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static agillic.marsrover.CardinalPoint.E;
import static agillic.marsrover.CardinalPoint.N1;

@SpringBootApplication
public class MarsRoverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarsRoverApplication.class, args);

		PlateauCoordinates plateauCoordinates = new PlateauCoordinates(5, 5);

		Position position1 = new Position(1, 2, N1);
		Rover rover1 = new Rover(position1, plateauCoordinates);
		Position endPosition1 = rover1.followTheRoute("LMLMLMLMM");
		System.out.println("-------------------------");
		System.out.println(endPosition1);

		Position position2 = new Position(3, 3, E);
		Rover rover2 = new Rover(position2, plateauCoordinates);
		Position endPosition2 = rover2.followTheRoute("MMRMMRMRRM");
		System.out.println("-------------------------");
		System.out.println(endPosition2);

	}
}