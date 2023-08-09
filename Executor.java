import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Executor {

    public static void main(String[] args) {
        int i = 0;
        int j = (i + 1) & 1;
        System.out.println(j);
        List<String> arr = new ArrayList<>();
        arr.add("111");
        arr.add("222");
        arr.add("333");
        for (String str : arr) {
            if (str.equals("222"))
                arr.remove(str);
            // arr.remove("111");
        }
        System.out.println(arr.toString());
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一句话或一个单词");
        String str=scanner.next();
        System.out.println(str);
        System.out.println("请输入一句话");
        scanner.nextLine();
    }
}
