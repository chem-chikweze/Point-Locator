import java.lang.Math;
public class Line{
  Point a;
  Point b;
  Double slope;
  Line(){
  }
  Line(Point c, Point d){
    a = c;
    b = d; 
    slope = (b.y-a.y)/(b.x-a.x);
    

  }
  
  boolean inter(Line one, Line two){
   double x1 = one.a.x;
    double x2 = one.b.x;
    double y1 = one.a.y;
    double y2 = one.b.y;
     double x3 = two.a.x;
    double x4 = two.b.x;
    double y3 = two.a.y;
    double y4 = two.b.y;
    if(x1==x2 && x3==x4){
      if(x1 != x3) return false;
    }
    if(y1==y2 && y3==y4){
      if(y1 != y3) return false;
    }
    double a1 = one.slope;
    double b1 = y1 - a1*x1 ;
    double a2 = two.slope;
    double b2 = y3 - a2*x3;
    if(a1 == a2){
      if (b1 == b2){
        return false;
      } 
      else return false;
    
    }
    double x0 = -(b1-b2)/(a1-a2);
   if((Math.min(x1, x2) < x0 && x0 < Math.max(x1, x2)) && (Math.min(x3, x4) < x0 && x0 < Math.max(x3, x4))){
     return true;
   }
   else return false;

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


}

