import java.*;
public class IsValindrome{
    public boolean isPalindrome(String s) {
        s=s.toUpperCase();
        int start=0;
        if(s.length()==0){
            return true;
        }
        int end=s.length()-1;
        while(start<end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
                continue;
            }
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;

        }

        return true;
    }

}