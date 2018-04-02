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


        /**
            The exam will try to trick you into mutability with StringBuilders
            chaining with strings and stringbuilders works differently p112
         */
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb = start+middle
        StringBuilder same = sb.append("+end"); // start+middle+end

        // StringBuilder changes own state and then returns a reference.


    }
}
