
/**
 * Write a description of class Animal here.
 * 
 * @author Colm Mooney
 *
 * 
 */
public class Animal
{
    // instance variables - replace the example below with your own
    private String animalSound;
    private String animalCategory;
    
    private static int animalsCreated;

    /**
     * Constructor for objects of class Animal
     */
    public Animal(){
    
        animalSound = "<undefined>";
        animalCategory = "<undefined>";
        // do nothing except create the object.
        animalsCreated++; // increment the number of animals created
    }
    
    public Animal(String a,String b){
    
        animalSound = a;
        animalCategory = b;
        animalsCreated++; // increment the number of animals created
    }
    
    public static int getAnimalsCreated(){
    
        return animalsCreated;
    }
    
    /**
     * setter method for the class instance variable x
     * 
     * @param  a   the value to set the class instance variable animalSound to.
     * @return void
     */
    public void setAnimalSound(String a)
    {
        animalSound = a;
    }
    /**
     * getter method for the class instance variable x
     * 
     * @param  empty
     * @return the value of the class instance variable animalSound
     */
    public String getAnimalSound()
    {
        return animalSound; 
    }
    
    
    /**
     * setter method for the class instance variable x
     * 
     * @param  a   the value to set the class instance variable animalCategory to.
     * @return void
     */
    public void setAnimalCategory(String a)
    {
        animalCategory = a;
    }
    /**
     * getter method for the class instance variable x
     * 
     * @param  empty
     * @return the value of the class instance variable animalCategory
     */
    public String getAnimalCategory()
    {
        return animalCategory; 
    }
}
