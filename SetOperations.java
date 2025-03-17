import java.util.AbstractList;
import java.util.ArrayList;


public class SetOperations {


    //method to union 2 arrays
    public AbstractList<Integer> getUnion(int[] userInput1, int[] userInput2){

        ArrayList<Integer> unionArray = new ArrayList<>();

        //adds numbers from the first list to the empty list
        for(int num: userInput1){
            unionArray.add(num);
        }

        //adds numbers from the second list to our union list
        for(int num: userInput2){
            boolean sameNumber = false;//used to track if the 2 lists share a number

            for(int num2: unionArray){
                //checks if the number is already added to our union list
                if(num == num2){
                   sameNumber = true;
                   break;
                }
            }
            //adds the number to union list if it is not already added from the first list
            if(!sameNumber){
                unionArray.add(num);
            }
        }

        return unionArray;

    }


    public AbstractList<Integer> getIntersection(int[] userInput1, int[] userInput2){
        ArrayList<Integer> intersection = new ArrayList<>();
        //loops through the first list
        for(int i = 0; i < userInput1.length; i++){
            //compares the first number in the first list with the second ist
            for(int j = 0; j < userInput2.length; j++){
                //if the 2 numbers match we add it to our intersection list
                if(userInput1[i] == userInput2[j]){
                    intersection.add(userInput1[i]);
                }
            }
        }
        return intersection;
    }

    public AbstractList<Integer> getComplement(int[] userInput1, int[] userInput2){
        ArrayList<Integer> complement = new ArrayList<>();

        //loops through subset S
        for(int i = 0; i < userInput1.length; i++){
            boolean found = false;
          //loops through subset A checking for shared elements
          for(int j = 0; j < userInput2.length; j++){

              if(userInput1[i] == userInput2[j]){
                  found = true;

              }
          }
          //adds elements that are not in subset A to our complement list
          if(!found){
              complement.add(userInput1[i]);
          }

        }


        return complement;

    }
}
