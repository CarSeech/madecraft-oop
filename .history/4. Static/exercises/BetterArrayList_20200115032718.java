package exercises;


import java.util.ArrayList;



public class BetterArrayList <E> extends ArrayList {

    //private <Object> list = new <Object>();
    private Object lastItemAdded;
    
	

//@pop_method returns the last item added to array list 

	public Object pop(){
        
        if (!isEmpty()){
          lastItemAdded =   get(size() -1 );

        };
        
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
  

