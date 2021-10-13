package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        List<Integer> res = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
