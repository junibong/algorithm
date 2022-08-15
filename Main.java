import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;

        while(count > 0){
            Integer input = sc.nextInt();

            switch(input){
                case 0:
                    int temp = stack.pop();
                    sum-=temp;
                    break;
                default:
                     stack.push(input);
                     sum+=input;
                     break;
            }

            count--;
        }

        System.out.println(sum);
    }
     
}