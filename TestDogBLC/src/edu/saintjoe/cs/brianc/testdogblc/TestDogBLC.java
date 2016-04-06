package edu.saintjoe.cs.brianc.testdogblc;

public class TestDogBLC {

	// This represents the dog's name and is a string object.
	    private String name;
	    
	   // This represents the dog size using weight 
	    private int weight;
	    
	    public static void main(String[] args) {
	    	Dog dog1 = new Dog();
	    	Dog dog2;
	    	dog1.bark();
	    	
	    	dog1.name = "Buck";
	    	dog1.setName = ("Buck");
	    	dog2 = dog1;
	    	dog2.bark();
	    	dog2.setName = ("Chuck");
	    	dog2.bark();
	    	dog1.setWeight(100);
	    	dog2.bark();
	    	dog1.bark();
	    	
	    	Dog[] myDogs = new Dog[3];
	    	myDogs[0] = new Dog();
	    	myDogs[1] = new Dog();
	    	myDogs[2] = dog1;
	    	
	    	myDogs[0].setName = ("Apollo");
	    	myDogs[0].setWeight(55);
	    	myDogs[1].setName = ("Creed");
	    	myDogs[1].setWeight(33);
	    	myDogs[0].bark();
	    }
	    	
	    // Instance methods start here
	    
	    // There's one getter and one setter for each instance variable in a standard class
	    public void setName(String newName) {
	    	name = newName;
	    }
	    // the parameter newWeight is sent in to this method
	    public void setWeight(int newWeight) {
	    	weight = newWeight;
	    }
	    
// Returns info back to the caller
	    public String getName() {
	    	return name;
	    }
	    
	    public int getWeight() {
	    	return weight;
	    }
	    
	    public void bark() {
	    
	    	// Declares a variable with local scope to the bark() method
	    	// Initial value must be set by the programmer
	    	int pointless = 0;
	    	
	    	
	    	if (weight > 60 ) {
	          System.out.println("Woof!! Woof!! says " + name + " that weighs " + weight);
	    	} else if (weight > 14 ) {
	    		System.out.println("Ruff!! Ruff!! says " + name + " that weighs " + weight);
	    	} else
	    		System.out.println("Yip!! Yip!! says " + name + " that weighs " + weight);
	    }
	    
	    // Use of multiple parameters
	    public int setBoth(String newName, int newWeight) {
	    	
	    	// The use of a local variable
	    	int oldWeight = weight;
	    	
	    	name = newName;
	    	weight = newWeight;
	    	return oldWeight;
	    }
	    	

	    public void eat() { }
	    
	    public void chaseCat() { }
	}

