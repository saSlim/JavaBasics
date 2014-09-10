import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaintHouseSvg {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int pointsNumber = input.nextInt();

		List<Point> points = new ArrayList<Point>();

		for (int i = 0; i < pointsNumber; i++) {
			Point p = new Point();
			p.setX(input.nextDouble());
			p.setY(input.nextDouble());
			points.add(p);
		}

		//
		// TODO Implement The SVG part

		// For test Only
		for (Point p : points) {

			System.out.printf("%s\n", isInsideHouse(p) ? "Inside" : "Outside");
		}

	}

	static class Point {

		private Double x;
		private Double y;

		public Double getX() {
			return x;
		}

		public void setX(Double x) {
			this.x = x;
		}

		public Double getY() {
			return y;
		}

		public void setY(Double y) {
			this.y = y;
		}

	}

	static Boolean isInsideHouse(Point p) {
		return isInBody(p) || isInRoof(p);
	}

	static Boolean isInBody(Point p) {
		if ((p.x >= 12.5 && p.x <= 22.5) && (p.y >= 8.5 && p.y <= 13.5)) {
			if (p.y > 8.5 && (p.x > 17.5 && p.x < 20)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	static Boolean isInRoof(Point p) {
		Point a = new Point();
		Point b = new Point();
		Point c = new Point();

		a.setX(12.5);
		a.setY(8.5);
		b.setX(22.5);
		b.setY(8.5);
		c.setX(17.5);
		c.setY(3.5);

		Double A = calcTriangleArea(a, b, c);
		Double A1 = calcTriangleArea(p, b, c);
		Double A2 = calcTriangleArea(a, p, c);
		Double A3 = calcTriangleArea(a, b, p);

		return (A == A1 + A2 + A3);
	}

	static Double calcTriangleArea(Point a, Point b, Point c) {
		Double area = (a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x
				* (a.y - b.y)) / 2;

		return Math.abs(area);
	}

}
