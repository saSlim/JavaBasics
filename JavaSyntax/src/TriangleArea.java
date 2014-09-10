import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {

		Point pointA = new Point();
		Point pointB = new Point();
		Point pointC = new Point();
		
		Point[] points = { pointA, pointB, pointC };

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		for (Point point : points) {
			point.setX(input.nextInt());
			point.setY(input.nextInt());
		}

		System.out.println(calcTriangleArea(pointA, pointB, pointC));
	}

	 static class Point {

		private int x = 0;
		private int y = 0;

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

	}

	 static int calcTriangleArea(Point a, Point b, Point c) {
		int area = (a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2;

		return Math.abs(area);
	}
}
