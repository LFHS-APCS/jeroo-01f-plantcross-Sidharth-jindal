/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    
    public void plantCross() {
  //getting the jeroo to the right place to start the cross
  hop();
  hop();
  hop();
  hop();
  hop();
  hop();
  turnright();
  hop();
  hop();
  //the first section of the cross
  hopplant();
  ninetydegreecross();
  //next section
  endsofthecross();
  //southwest section
  ninetydegreecross();
  //bottom of cross
  endsofthecross();
  //southeast section
  ninetydegreecross();
  //right of cross
  endsofthecross();
  //last part!
  ninetydegreecross();
  //top of cross
  turn(LEFT);
  hopplant();
  turn(RIGHT);
  hopplant();
    }
  // Put any helpermethods here


public void hopplant(){
  hop();
  plant();
}
public void turnright(){
  turn(LEFT);
  turn(LEFT);
  turn(LEFT);
}
public void ninetydegreecross(){
  hopplant();
  hopplant();
  hopplant();
  turnright();
  hopplant();
  hopplant();
  hopplant();
}
public void endsofthecross(){
  turn(LEFT);
  hopplant();
  hopplant();
  turn(LEFT);
}
    
    
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
