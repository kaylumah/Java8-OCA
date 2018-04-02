public class WorkingWithStringBuilders {
    public static void main(String[] args) {
        System.out.println("WorkingWithStringBuilders");

        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++) {
            alpha += current;
        }
        System.out.println(alpha); // would create 27 objects


        StringBuilder alphaBuilder = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++) {
            alphaBuilder.append(current);
        }
        System.out.println(alphaBuilder); // 1 object

    }
}
