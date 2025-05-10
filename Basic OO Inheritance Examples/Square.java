
/**
 * The Class square is simplified representation of a two dimensional square.
 * This Square class will inherit from the TwoDShape class.
 * 
 * @author Colm Mooney
 */
public class Square extends TwoDShape
{
    private double length; // the length attribute of a square
    /**
     * Constructor for objects of class Square
     */
    public Square(double num)
    {
        length = num; // set length to the passed value of num
    }
    /**
     * Square constructor : 
     * @param len the length of the side of the square
     */
    public Square(double len, String colourValue) //Notice there is NO return type for a class constructor.
    {
        super(colourValue); // use the constructor in the parent (super class)
        length = len; // set the class attribute (variable) radius equal to len
    }
    /**
     * setter method for the class instance variable length
     * @param  length   the value to set the class instance variable length to.
     */
    public void setLength(double num)
    {
       length = num ; // set the class instance variable to the value in the formal parameter num.
    }
    /**
     * getter method for the class instance variable length
     * @return the value of the class instance variable length
     */
    public double getLength()
    {
        return length; // return the value in the class instance variable length
    }
}
