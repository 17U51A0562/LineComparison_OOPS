package oopsday1;

public class Line {
		Point  p1;
		Point p2;
		
		public float lineLength() {
			float value = (float) Math.sqrt(Math.pow( (p1.x - p1.y) , 2 ) + Math.pow ( (p2.x - p2.y ), 2));
			return value;
		}
	}

