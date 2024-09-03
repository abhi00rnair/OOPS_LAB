import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int inpt = scan.nextInt();
        int row = inpt / 10; 
        int col = inpt % 10;   
        int nomoves = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < nomoves; i++) {
            String mov = scan.next();
            int no = scan.nextInt();
            scan.nextLine(); 
            switch (mov.toLowerCase()) {
                case "up":
                    row -= no;
                    break;
                case "right":
                    col += no;
                    break;
                case "down":
                    row += no;
                    break;
                case "left":
                    col -= no;
                    break;
            }
            if (row < 1 || row > 8 || col < 1 || col > 8) {
                System.out.println("overflow");
                return;
            }
        }
        System.out.println("[" + row + "," + col + "]");
    }
}
