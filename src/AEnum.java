import java.util.HashMap;

/**
 * @author hhh
 * @date 2020/3/11 14:40
 * @description
 */
public enum  AEnum {
    MAN("小明",20,"小明是男的大帅哥"),
    WOMAN("小花",20,"小花是女的女小女神"),
    MIDDLE("中中",20,"中中是中性别");
    private String name;
    private Integer age;
    private String description;

    AEnum(String name, Integer age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;
    }

    public static final HashMap<String,AEnum> A_ENUM_MAP = new HashMap<>();
    static {
        A_ENUM_MAP.put("小明",MAN);
        A_ENUM_MAP.put("小花",WOMAN);
        A_ENUM_MAP.put("中兴",MIDDLE);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getDescription() {
        return description;
    }
}
