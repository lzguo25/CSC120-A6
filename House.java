/* This is a stub for the House class */

import java.util.ArrayList; //imports ArrayList so that we can store a list of residents living in the house

/**
 * Extended class of Building to create a House where students can reside in and potentially dine in
 * @param attributes from inheritance and whether the house has dining halls (boolean) as well as the number of residents in the House, listing out their names (ArrayList<String>)
 * @return parameters or information of the House building.
 */

public class House extends Building { //lets Java know that House is the subclass that extends from the Building SuperClass
  private ArrayList<String> residents; //The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;
  

  /*Constructor for House*/
  public House(String name, String address, int nFloors, boolean hasDR) {
    super(name,address,nFloors); //calls the parent class constructor
    this.residents = new ArrayList<String>(); //creates an empty ArrayList
    this.hasDiningRoom = hasDR;

    System.out.println("You have built a house: 🏠");

  } 


  /**
   * Accessor that checks if the house has a dining room or not.
   * @return T/F: if the house has a dining room or not
   */
  public boolean hasDiningRoom(){
    if (hasDiningRoom == true){
      System.out.println("There is a dining hall in this house.");
  
    }
    else{
      System.out.println("There is no dining hall in this house.");
    }
    return hasDiningRoom;
  }


  /**
   * Accessor that checks the number of residents based on the size of the ArrayList of residents
   * @return number of residents living in the house, length of the ArrayList
   */
  public int nResidents(){
    if (residents.size()>0){
      System.out.println("There are "+ residents.size() + " residents in this house.");
    }
    return residents.size();
  }


  /**
   * Methods that updates the ArrayList based on whether residents are moving in or moving out.
   * Also checks whether the student names within the ArrayList are actually residents of the house
   * @param name name of the resident that we are checking
   * @return doesn't return anything but prints a statement stating that the param name has moved into the house
   */
  public void moveIn(String name){ //adds resident names to the ArrayList of residents every time someone moves in 
    residents.add(name); //adds name of student(s) who move in 
    System.out.println(name + " just moved in!");

  }


  /**
   * Updates the ArrayList based on if the resident has moved out. If the resident has moved out, their name is removed from the ArrayList 
   * @param String name, name will be removed from the ArrayList
   * @return name, returns name of the person who has just moved out
   */
  public String moveOut(String name){ //removes resident names from the ArrayList of residents when someone moves out
    residents.remove(name); //removes name of student(s) who move out
    System.out.println(name + " just moved out");
      return (name + " just moved out.");
  }


  /**
   * Method that checks if the resident is a resident of the house.
   * @param String person
   * @return T/F, true if person is a resident, false if person is NOT a resident
   */
  public boolean isResident(String person){ //checks if the resident name is actually a resident of the house
    if (residents.contains(person)){
      System.out.println(person + " is a resident of this house.");
      return true;
      }
    else{
      System.out.println(person + " does not live in this house.");
      return false;
      }
    }




  public static void main(String[] args) {
    House newHouse = new House("Cutter", "1 Prospect St", 3, true);
      
      System.out.println(newHouse);
      newHouse.moveIn("Lily");
      newHouse.moveIn("Ally");
      newHouse.hasDiningRoom();
      newHouse.nResidents();
      newHouse.isResident("Lily");
      newHouse.isResident("Ying");
      newHouse.moveOut("Ally");
      newHouse.isResident("Ally");
      newHouse.nResidents();


  }
}



