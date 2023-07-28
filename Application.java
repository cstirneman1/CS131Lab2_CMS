
public class Application {
   
	public static void main(String[] args) {
        //initialize wizard and set variables
		Wizard wizard = new Wizard("Chris");
        wizard.setHealth(100);
        wizard.setKey(123);

        System.out.println(wizard.toString());

        // Take damage
        wizard.takeDamage(20);
        System.out.println("After taking damage: " + wizard.toString());

        // Lock and unlock
        wizard.lock(123);
        System.out.println("locking: " + wizard.toString());

        wizard.unlock(123);
        System.out.println("unlocking: " + wizard.toString());

        //lock with wrong key
        wizard.lock(456);
        System.out.println("After wrong key (lock): " + wizard.toString());

        //unlock with wrong key
        wizard.unlock(456);
        System.out.println("After wrong key (unlock): " + wizard.toString());
        
        //set & get health
        wizard.setHealth(50);
        System.out.println("New health after using setKey: " +wizard.getHealth());
        
        //set & get name
        wizard.setName("Harry");
        System.out.println("New wizard name: "+wizard.getName());
        
        //get key
        System.out.println("Key number: "+wizard.getKey());
        
    }
}

