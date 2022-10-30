/* This is a stub for the House class */

import java.util.ArrayList; //imports ArrayList

public class House extends Building { //lets Java know that House is the subclass that extends from the Building SuperClass
  private ArrayList<String> residents; //The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningHall;
  

  /*
   * Constructor for House
   */
  public House(String name, String address, int nFloors) {
    super(name,address,nFloors); //calls the parent class constructor
    this.residents = new ArrayList<String>(); //creates an empty ArrayList
    this.hasDiningHall = true;
    System.out.println("You have built a house: 🏠");

  } 

  /*
   * Accessor that returns if the house has a dining room or not.
   */
  public boolean hasDiningRoom(){
    return hasDiningHall;
  }

  /*
   * Accessor that returns the number of residents based on the size of the ArrayList of residents
   */
  public int getnResidents(){
    return residents.size();
  }


  /*
   * Methods that updates the ArrayList based on whether residents are moving in or moving out.
   * Also checks whether the student names within the ArrayList are actually residents of the house
   */
  public void moveIn(String name){ //adds resident names to the ArrayList of residents every time someone moves in 
    residents.add(name); //adds name of student(s) who move in 

  }

  public String moveOut(String name){ //removes resident names from the ArrayList of residents when someone moves out
    residents.remove(name); //removes name of student(s) who move out
    return name;
  }

  public boolean isResident(String person){ //checks if the resident name is actually a resident of the house
    for (int i =0; i<residents.size(); i++);
      if (residents.contains(person)){
        return true;
      }
      else{
        return false;
      }
    }




  public static void main(String[] args) {
    House Building = new House("Cutter", "1 Prospect St", 3);
  }
}



