package exercises;

public class Second {
    public static void main(String [] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        int i, x;

        for (i = 0; i < integerArray.length; i++) {
            x = integerArray[i];

            if (i % 2 != 0) {
                System.out.print(x + " ");
            }
        }
    }

}
