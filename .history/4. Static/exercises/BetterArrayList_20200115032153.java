package exercises;


import java.util.ArrayList;
import java.util.List;


public class BetterArrayList <E> extends ArrayList {

    //private <Object> list = new <Object>();
    private Object lastItemAdded;
    
	

//@pop_method returns the last item added to array list 

	public Object pop(){
        
        if (!isEmpty()){
          lastItemAdded =   get(size());

        };

        System.out.println("im not empty");
        
        return lastItemAdded;
        
    }
    
    /**
    	 *
    	 */
 

    // @print_method can be called on instance of list that iterates through the
    // list to print out its details
    public void print(){

    }
}
  

