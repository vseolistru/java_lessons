import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean passIsValid = true;
        boolean inCarantine = true;
        String message = passIsValid && !inCarantine ? "Access is accept" : "Access is denied";;
//        if ( passIsValid && !inCarantine ){
//            message = "Access is accept";
//            System.out.println(message);
//
//        } else {
//            message = "Access is denied";
//            System.out.println();
//        }
        System.out.println(message);
//===========================================================
        String input = new Scanner(System.in).nextLine();
//        while (true) {
//            System.out.println("Input new message");
//            if(input.equals("Hi")){
//                System.out.println("Hello");
//            } else if (input.equals("Hello my friends")) {
//                System.out.println("Nice");
//            }
//        }
//=============================================================

        switch (input) {
            case "Hi":
                System.out.println("Hello");
                break;
            case "Hello my Frirnds":
                System.out.println("Nice to meet you");
                break;
            case "How are you?":
                System.out.println("So much Pleasure");
                break;
        }
//for java > 14 version
//        switch (input) {
//            case "Hi" -> System.out.println("Hello");
//            case "Hello my Frirnds" -> {
//            System.out.println("Nice to meet you");
//            System.out.println("How about you?");
//            }
//            case "How are you?" -> System.out.println("So much Pleasure");
//        }
    }
}