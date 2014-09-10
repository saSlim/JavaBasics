import java.util.Scanner;

public class PointsInsideFigure {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		Point myPoint = new Point();
		myPoint.setX(input.nextDouble());
		myPoint.setY(input.nextDouble());

		Boolean inside = isInside(myPoint);

		String result = inside ? "Inside" : "Outside";
		System.out.println(result);
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

	static Boolean isInside(Point p) {
		if ((p.x >= 12.5 && p.x <= 22.5) && (p.y >= 6 && p.y <= 13.5)) {
			if (p.y > 8.5 && (p.x > 17.5 && p.x < 20)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
