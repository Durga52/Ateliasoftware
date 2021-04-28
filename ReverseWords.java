import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close(); 
        String words[] = str.split("\\s");
        String revStr= "";
        for (int i = 0; i < words.length; i++) { 
            revStr = " " + words[i] + revStr; 
        } 
        System.out.print("Reversed string : " + revStr);
    }
}