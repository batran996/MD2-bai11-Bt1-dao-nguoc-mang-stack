import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("nhap loai mang mong muon \n 1: String \n 2: kieu so");
        b = scanner.nextInt();
        if (b !=1 && b !=2){
            System.out.println("nhap sai kieu");
            return;
        }else {
            System.out.println("nhap vao so phan tu mang arr");
            a = scanner.nextInt();
            Object[] array = new Object[a];
            System.out.println("nhap vao mang");
            for (int i = 0; i < a; i++) {
                System.out.print("array["+i+"] = ");
                if (b ==1){
                    array[i] = scanner.nextLine();
                }else {
                    array[i] = scanner.nextInt();
                }
            }
            System.out.println(Arrays.toString(array));
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < array.length; i++) {
                stack.push((Integer) array[i]);
            }
            System.out.println("sau khi push vao stack");
            System.out.println(stack);
            for (int i = 0; i < array.length; i++) {
                array[i] = stack.pop();
//            System.out.print(array[i]);
            }
            System.out.println("push lai vao mang array " + Arrays.toString(array));
        }


    }
}