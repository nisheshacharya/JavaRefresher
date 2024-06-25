package libraryManagement;

public class Admin extends User{

   public Admin (int id, String name){
       super(id, name);
   }
   public String toString(){
        return "Admin Id: "+getId() + "  Name: "+ getName() + "  Author: ";
    }


}


