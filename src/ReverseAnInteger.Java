public class ReverseAnInteger {


    public int reverse(int x) {
        boolean flag = false;
        if (x == 0) {
            return 0;
        }
        if (x < 0) {
            flag = true;
            x = -(x);
        }
        int reverse = 0;
        while (x > 0) {
            int remainder = x % 10;
            int newresult = remainder + reverse * 10;
            if (reverse != (newresult - remainder) / 10) {
                reverse = 0;
                break;
            }
            reverse = newresult;

            x = x / 10;
        }

        if (flag) {
            return -reverse;
        } else {
            return reverse;
        }

    }
}