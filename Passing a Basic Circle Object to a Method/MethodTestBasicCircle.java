
/**
 * The class MethodTestBasicCircle is used to illustrate what happens when you pass 
 * an object reference to a method and use this reference to access the attributes 
 * of the object using the setter methods.
 * The main method in MethodTestBasicCircle does the following in sequence:
 * 1) creates a BasicCircle object with a radius of 10
 * 2) prints the radius of this object by passing a reference to this object to a method printCircleContents
 * and allow this method to access the objects's radius attribute using the reference passed to it.
 * 3) changes the value in the radius attribute of the object by calling the method changeCircleContents
 * passing it the reference to the object. changeCircleContents uses this reference to make and object method
 * call to set the radius of the object to the value store in a second parameter.
 * 4) repeat step 2) to prove that the objects data attribute has changed due to a call of the method changeCircleContents.
 * 
 * @author Colm Mooney
 */
public class MethodTestBasicCircle
{
    public static void main(String [] args)
    {
        BasicCircle circle1 = new BasicCircle(10); // (1) Create a BasicCircle object with a radius of 10, referred to by circle1
        
        printCircleContents(circle1); // (2) print out the details available for the object referenced by circle1
        
        System.out.println("\n\n About to change the contents of the object");
        
        changeCircleContents(circle1, 256); // (3) call a method, passing it the object reference and a value.
        
        printCircleContents(circle1); // (4) print out the details once again for this BasicCircle object.
    }
    /**
     * used to change the data attributes of an object by using a passed in object reference and 
     * a value to change the attribute to.
     * @param myCircle a reference to the object to be manipulated.
     * @param value the replacement value for the object's radius attribute.
     * @return void 
     */
    public static void changeCircleContents(BasicCircle myCircle, int value){
        
        myCircle.setRadius(value);//call setRadius method on the reference variable myCircle to change the radius value
    } 
    /**
     *  used to print the contents of the data attributes of the object whose reference is passed to the method.
     *  @param myCircle the (reference to) object whose data needs to be printed.
     *  @return void
     */
    public static void printCircleContents(BasicCircle myCircle){
      int temp = myCircle.getRadius(); // retrieve the radius value from the BasicCircle object using the getter method.
      System.out.println("\n\n The value of the circle radius is " + temp);
    }
}