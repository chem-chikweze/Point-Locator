
import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
/*
 System.out.println("Number of Lines: ");
 Scanner in = new Scanner(System.in);
 int numLines = in.nextInt();
 RedBlackBST tree = new RedBlackBST();
 
for(int i=0;i<numLines;i++){
  System.out.println("Enter a line");
  Double x1 = in.nextDouble();
  Double y1 = in.nextDouble();
  Point p1 =  new Point(x1,y1);
  Double x2 = in.nextDouble();
  Double y2 = in.nextDouble();
  Point p2 =  new Point(x2,y2);
  Line line = new Line(p1,p2);
  tree.put(line,i);
  }
  System.out.println("Enter a pair of points");
 Double x1 = in.nextDouble();
  Double y1 = in.nextDouble();
  Point p1 =  new Point(x1,y1);
  Double x2 = in.nextDouble();
  Double y2 = in.nextDouble();
  Point p2 =  new Point(x2,y2);
  tree.compare(p1,p2);

  
  
  int exNode = tree.size()-numLines;
  int average= tree.epl()/exNode;
  System.out.println("Average path length = " + average);
  


in.close();


  
  }
*/


RedBlackBST tree = new RedBlackBST();
Point p1 = new Point(0.00 ,0.12 );
Point p2 = new Point(0.23, 1.00  );
Point p3= new Point(1.00, 0.41  );
Point p4 = new Point(0.00, 0.52 );
Point p5 = new Point(1.00, 0.20 );
Point p6 = new Point(0.30, 1.00);
Point p7 = new Point(0.00, 0.40);
Point p8 = new Point(0.10, 0.00);
Point p9 = new Point(1.00, 0.35 );
Point p10 = new Point(0.10, 1.00);

Point a1 = new Point( 0.60, 0.50);
Point a2 = new Point(0.25, 0.80  );
Point a3= new Point(0.95, 0.10  );
Point a4 = new Point(0.11, 0.50 );


Line l0 = new Line(p1,p2);
Line l1 = new Line(p3,p4);
Line l2 = new Line(p5,p6);
Line l3 = new Line(p7,p8);
Line l4 = new Line(p9,p10);
Line z3 = new Line(a1,a2);
Line z4 = new Line(a3,a4);

tree.put(l0,0);
tree.put(l1,1);
tree.put(l2,2);
tree.put(l3,3);
tree.put(l4,4);

//tree.compare(a1,a2);
tree.puy(a2,a2);

 
  
 

 }
}