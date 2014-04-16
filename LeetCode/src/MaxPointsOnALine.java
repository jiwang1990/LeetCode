import java.util.HashMap;
import java.util.Map;

class Point {
	int x;
	int y;

	Point() {
		x = 0;
		y = 0;
	}

	Point(int a, int b) {
		x = a;
		y = b;
	}
}

public class MaxPointsOnALine {
	public int maxPoints(Point[] points) {
		HashMap<Double, Integer> slopeMap = new HashMap<Double, Integer>();
		int maxPointsNum = 0;
		if(points.length != 0)
			maxPointsNum = 1;
		
		for (int i = 0; i < points.length; i++) {
			slopeMap.clear();
			Point anchor = points[i];
			int samePointNum = 1;
			for(int j = i+1; j < points.length; j++) {
				if(anchor.x == points[j].x && anchor.y == points[j].y){
					samePointNum++;
					if(samePointNum > maxPointsNum)
						maxPointsNum = samePointNum;
				}
					
				else if(anchor.x == points[j].x){
					if(slopeMap.containsKey(Double.MAX_VALUE)){
						slopeMap.put(Double.MAX_VALUE, (slopeMap.get(Double.MAX_VALUE)+1));
					}
							
					else
							slopeMap.put(Double.MAX_VALUE, 1);
				}else{
					double slope = (double)(points[j].y - anchor.y)/(points[j].x-anchor.x);
					if(points[j].y == anchor.y)
						slope = 0.0;
					if (slopeMap.containsKey(slope)) {
						slopeMap.put(slope, slopeMap.get(slope)+1);
					}
					else
							slopeMap.put(slope, 1);
				}
			}
			for(Map.Entry<Double, Integer> entry : slopeMap.entrySet()){
				if(entry.getValue()+ samePointNum > maxPointsNum)
					maxPointsNum = entry.getValue() + samePointNum;
			}
		}
		return maxPointsNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] points = {new Point(2, 3), new Point(3, 3), new Point(-5, 3)};
		MaxPointsOnALine obj = new MaxPointsOnALine();
		System.out.println(obj.maxPoints(points));
	}
}
