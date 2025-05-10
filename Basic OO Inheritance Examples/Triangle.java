
/**
 * The class Triangle is a simplified representation of a two dimensional triangle shape
 * 
 * @author Colm mooney
 */
public class Triangle extends TwoDShape
{
    // instance variables -
    private double perpendicular; //the perpendicular height attribute of the triangle
    private double base; // the base length attribute of the triangle
    /**
     * Constructor for objects of class Triangle
     */
    public Triangle(double a, double b)
    {
        perpendicular = a;
        base = b;
    }

    /**
     * setter method for the class instance variable perpendicular
     * 
     * @param  perpendicular   the value to set the class instance variable x to.
     * @return void
     */
    public void setPerpendicular(double num)
    {
        perpendicular = num ; // set the class instance variable to the value in the formal parameter num.
    }
    /**
     * getter method for the class instance variable perpendicular
     * 
     * @param  empty
     * @return the value of the class instance variable perpendicular
     */
    public double getPerpendicular()
    {
        return perpendicular; // return the value in the class instance variable perpendicular
    }
     /**
     * setter method for the class instance variable base
     * 
     * @param  base the value to set the class instance variable base to.
     * @return void
     */
    public void setBase(double num)
    {
        base = num ; // set the class instance variable to the value in the formal parameter num.
    }
    /**
     * getter method for the class instance variable base
     * 
     * @param  empty
     * @return the value of the class instance variable base
     */
    public double getBase()
    {
        return base; // return the value in the class instance variable base
    }
}
