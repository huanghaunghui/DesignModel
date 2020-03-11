public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        AEnum aEnum = AEnum.A_ENUM_MAP.getOrDefault("小明",null);
        System.out.println(aEnum==null?"无法取到对应值":aEnum.getDescription());
    }
}
