// PointDriver for CMP112
// Jared Smith :)
// 30 Jan 15

public class PointDriver {

// Make three ponts
	public static void main(String[] args ) {
	Point lowerLeft = new Point();
	Point upperRight = new Point();
	Point middlePoint = new Point();

// Give them some values
	lowerLeft.x = 0.0;
	lowerLeft.y = 0.0;

	upperRight.x = 1280.0;
	upperRight.y = 1024.0;

	middlePoint.x = 640.0;
	middlePoint.y = 512.0;

//Print out one of the points
	upperRight.printPoint();
//Clear the point
	upperRight.clear();
// Print out the new point
	upperRight.printPoint();
	}
}
