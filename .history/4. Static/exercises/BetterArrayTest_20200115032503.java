package exercises;



public class BetterArrayTest {
    
    public static void main(String[] args) {

        BetterArrayList<Object> objList = new BetterArrayList<Object>();

        String item1 = "Vijay";
        int item2 = 2020;
        String item3 = "Bobby";

        objList.add(item1);
        objList.add(item2);
        objList.add(item3);

       // objList.pop();

        System.out.println(objList.size());
        System.out.println(objList.pop());

    
    }
}
 
    
