package algorithms;

public class ReverseElement {
    public static void main(String[] args) {
        int [] myArray = {1, 34 , 89, 2, 10};
        int [] revArray = new int[myArray.length];
        int j = 0;
        for (int i=(myArray.length - 1); i >= 0; i--) {
            revArray[j] = myArray[i];
            j++;
        }
        System.out.println(" ");
        System.out.print("[");
        for (int x = 0; x < revArray.length; x++) {
            System.out.print(revArray[x] + " ");
        }
        System.out.println("]");
    }

}
