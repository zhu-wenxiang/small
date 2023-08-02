import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    }
}
