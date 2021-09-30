package exercises;

import java.util.Scanner;

class Arraypractice {
    public static void main(String []args){
        String strMain = " I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentences = strMain.split("\\.");
        for (int i=0; i < sentences.length; i++)
        {
            System.out.println(sentences[i]);
        }
    }

}