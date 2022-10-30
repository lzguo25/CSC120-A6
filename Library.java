import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building {
  private Hashtable<String, Boolean> collection;


    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String,Boolean>();
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title){ //adds a book to the collection
      collection.put(title, null);

      
      
    }
  
    public String removeTitle(String title){// return the title that we removed
      collection.remove(title);
      return title;
    } 

    public void checkOut(String title){//modifies the value associated with the title
      collection.replace(title, null, null);
    }

    public void returnBook(String title){
      collection.replace(title, null, null);
      

    }
    public static void main(String[] args) {
      Library Building = new Library();
    }
  
  }