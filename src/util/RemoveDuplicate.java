package util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author hhh
 * @date 2020/3/11 15:13
 * @description
 */
public class RemoveDuplicate<T> {

    public static <T> Set<T> removeDuplicateWithSet(List<T> list) {
        if(list==null||list.isEmpty()){
            throw new IllegalArgumentException("去重集合为空");
        }
        return new HashSet<>(list);
    }
}
