package tictactoe.core;

public enum Coordinate {
	A1, A2, A3, B1, B2, B3, C1, C2, C3;

	private static char firstCoordinate[] = { 'A', 'B', 'C'};
//	private char first;
//	private char second;
//	
//	private Coordinate () {
//		first = this.name().charAt(0);
//		second = this.name().charAt(1);
//	}
//	
//	public static Coordinate valueFrom (int x, int y) {
//		Coordinate result = A1;
//		result.first = firstCoordinate[x];
//		result.second = (char)y;
//		
//		return result;
//	}
	
	public static Coordinate valueOf(int x, int y) {
		String value = String.valueOf(firstCoordinate[x]) + (y + 1); 
		return Coordinate.valueOf(value);
	}
	
	String getX () {
//		return String.valueOf(first);
		return name().substring(0, 1);
	}
	
	public int getXcartesian () {
		// TODO Improve this!
		char first = name().charAt(0);
		for (int i = 0; i < 3; i++) {
			if (firstCoordinate[i] == first) {
				return i;
			}
		}
		
		return -1;
	}
	
	public String getY () {
//		return String.valueOf(second);
		return name().substring(1, 2);
	}
	
	public int getYcartesian () {
		char second = name().charAt(1);
		return ((int)second - (int)'1');
	}
}
