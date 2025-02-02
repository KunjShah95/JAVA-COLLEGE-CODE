
public class Main {
    static String modifyString(String s, String s1, String s2) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        
        while (i < s.length()) {
            if (i + s1.length() <= s.length() && s.substring(i, i + s1.length()).equals(s1)) {
                ans.append(s2); // Replace with s2
                i += s1.length(); // Move past the matched substring
            } else {
                ans.append(s.charAt(i)); // Append current character
                i++;
            }
        }
        
        return ans.toString();
    }

    public static void main(String[] args) {
        String S = "hello world, welcome to Java!";
        String S1 = "world";
        String S2 = "universe";
        
        String result = modifyString(S, S1, S2);
        System.out.println(result); // Expected Output: "hello universe, welcome to Java!"
    }
}
