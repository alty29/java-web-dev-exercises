package exercises;

public class Second {
    public static void main(String [] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        int i, x;
        for (i = 0; i < integerArray.length; i++) {
            x = integerArray[i];
            System.out.print(x + " ");
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));
    }
}
