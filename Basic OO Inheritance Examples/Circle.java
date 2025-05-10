public class Circle extends TwoDShape
{
    private double radius; // private Class variable, only methods inside the class can access this.
    /**
     * Circle constructor : 
     * @param r the radius of the circle
     */
    public Circle(double r) //Notice there is NO return type for a class constructor.
    {
        radius = r; // set the class attribute (variable) radius equal to r
    }
    /**
     * Circle constructor : 
     * @param r the radius of the circle
     */
    public Circle(double r, String colourValue) //Notice there is NO return type for a class constructor.
    {
        super(colourValue); // use the constructor in the parent (super class)
        radius = r; // set the class attribute (variable) radius equal to r
    }
    /**
     * This provides the radius of the circle
     * @return the radius of the circle.
     */
    public double getRadius(){ // getter method
        return radius; // return the value of the class attribute radius
    }
    /**
     * This sets the radius of the circle
     * @param num the new value for the radius of the circle.
     */
    public void setRadius(double num){ // Setter method
        radius = num; // set the class attribute (variable) radius equal to num
    } 
}