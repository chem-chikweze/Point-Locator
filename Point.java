public class Point{
 public final Double x;
    public final Double y;

  Point(Double a,Double b){
   x = b;
   y = a;
  }

  public int ccw(Point p0, Point p1, Point p2) {
 double dx1 = p1.x - p0.x;
 double dy1 = p1.y - p0.y;
 double dx2 = p2.x - p0.x;
 double dy2 = p2.y - p0.y;
 if (dx1*dy2 > dy1*dx2) return 1;
 else if (dx1*dy2 < dy1*dx2) return -1;
 else if ((dx1*dx2 < 0) || (dy1*dy2 < 0)) return -1;
 else if ((dx1*dx1+dy1*dy1) < (dx2*dx2+dy2*dy2)) return 1;
 else return 0;
}
 public boolean between(Point a, Point b, Point c) {
  if (ccw(a, b, c) != 0) return false;
    if (a.x == b.x && a.y == b.y) {
        return a.x == c.x && a.y == c.y;
    }
    else if (a.x != b.x) {
            
     return (a.x <= c.x && c.x <= b.x) || (a.x >= c.x && c.x >= b.x);
    }
      else {
            
        return (a.y <= c.y && c.y <= b.y) || (a.y >= c.y && c.y >= b.y);
        }
 
 }
 


}

