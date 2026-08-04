//Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
//  The dimensions of the Box are width, height, depth.
//  The class should have a method that can return the volume of the box.
//  Create an object of the Box class and test the functionalities.

 class Box {
    double width,height,depth;
    Box(double w,double h,double d)
    {
      this.width=w;
     this.height=h;
     this.depth=d;
    }
    public double volume()
    {
        return width*height*depth;
    }


public static void main(String[] args)
{
    Box ob = new Box(5.0,6.0,7.0);
    double x=ob.volume();
    System.out.println("the volume of box is "+x);

}
}
