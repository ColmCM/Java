
public class BasicCircleTester
{
    public static void main(String [] args){
        // 1) Declare a variable to be a link reference to a BasicCircle
        // 2) Create a BasicCircle object using the BasicCircle(5) class constructor
        //    and pass the reference to this newly created object to the myCircle variable
        BasicCircle myCircle; //Step (1)
        
        myCircle = new BasicCircle(5); // Step (2)
        
        //int x = myCircle.radius; // is an error as Radius is a private variable
        
        int number = myCircle.getRadius();// use getRadius to access radius
        
        System.out.println("The value of the Circle radius is " + number);
        // myCircle.radius = 10; // is an error as Radius is a private variable
        myCircle.setRadius(10); // use setRadius to change the radius value
        
        number = myCircle.getRadius(); // use getRadius again
        
       System.out.println("\n\n The value of the Circle radius is now " + number);
    
    }
}
