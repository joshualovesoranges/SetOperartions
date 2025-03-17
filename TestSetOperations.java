public class TestSetOperations {
    public static void main(String[] args){
        SetOperations test = new SetOperations();
        int[] setS = {1,2,3,4,5,6};//set S
        int[] setA = {1,2,3};//subset A
        int[] setB = {4,5,6};//subset B

        System.out.println("the union of the list is:" + test.getUnion(setA, setB));
        System.out.println("the intersection of the list is:" + test.getIntersection(setA, setB));
        System.out.println("the complement of the list is:" + test.getComplement(setS, setA));
    }

}
