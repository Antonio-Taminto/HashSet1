import java.util.*;

public class Main {
    public static void main(String[] args) {
        printCollection();
    }
    public static void printCollection(){
        Set<String> func = new HashSet<>(Arrays.asList("1","2","3"));



        for (String i: func) {
            System.out.println(i);
        }



    }
}