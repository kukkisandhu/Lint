import java.util.*;

public class NeedleInHaystack {
    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (needle == null) {
            return -1;
        }
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            int j = 0;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

public static void main(String [] args){
    int result=strStr("Hello","ll");
    System.out.println(result);
    }
}