
/**
 * This is a test class used to create instances of the Animal class hierarchy.
 * 
 * @author (Joe Duffin) 
 */
public class AnimalTester
{

    public static void main(String [] args)
    {
        
        Tiger tiger1 = new Tiger("Loud Roar","Feline");
        
        System.out.println("This animal will make the following sound " + tiger1.getAnimalSound());
        
        Tiger tiger2 = new Tiger(); //use the default constructor
        
        System.out.println("This animal will make the following sound " + tiger2.getAnimalSound());
        
        
        Tiger [] myTigers = new Tiger[10];
        
        for (int i=0;i<myTigers.length;i++){
        
            myTigers[i]= new Tiger( );
        
        }
        
        System.out.println("The number of animals created is " + tiger1.getAnimalsCreated()+ " " + Tiger.getAnimalsCreated() + "  " + Animal.getAnimalsCreated());
        
        //Animal creature = new  Animal();
        
        //System.out.println("This creatures sound is " + creature.getAnimalSound());
    }

     
}