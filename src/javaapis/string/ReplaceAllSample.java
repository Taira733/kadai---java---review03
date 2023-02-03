package javaapis.string;

public class ReplaceAllSample {

    public static void main(String[] args) {
        String str = "100ドル";
        String sub = str.replace("ドル", "円");
        System.out.println(sub);
    }

}
