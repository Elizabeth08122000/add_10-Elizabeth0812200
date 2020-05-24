import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int counter = 0;
        int summ = 0;
        while(summ != 10){
            summ+=in.nextInt();
            counter+=1;
        }
        System.out.println(counter);
        in.close();
        }
    }
