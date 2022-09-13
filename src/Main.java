import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] boxes = scanner.nextLine().split(",");
        String item = scanner.nextLine();
        int i=0;
        for (String box:boxes) {
            if (box.equals(item)) break;
            i++;
        };
        System.out.println(5*i+5);
    }
}