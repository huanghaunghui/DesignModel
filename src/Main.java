import util.RemoveDuplicate;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        AEnum aEnum = AEnum.A_ENUM_MAP.getOrDefault("小明",null);
        System.out.println(aEnum==null?"无法取到对应值":aEnum.getDescription());

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        RemoveDuplicate.removeDuplicateWithSet(list).forEach(e->{
            System.out.println(e);
        });
    }
}
