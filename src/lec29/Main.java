package lec29;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    String s = "abcd";
        String rev = reverseString(s);
        System.out.println(rev);
        s = "Cartoon Tomcat";
        char[] u = uniqueChars(s);
        System.out.println(Arrays.toString(u));
        String st = " Cartoon Tomcat Jerry Mouse         ";
        String[] sp = st.split(" ");
        System.out.println("len:"+sp.length);
        for (String s1 : sp) {
            System.out.println(s1);
        }
        String join = String.join(" ", sp);
        System.out.println(join);
    }

    private static char[] uniqueChars(String s) {
        char[] res = new char[s.length()];
        int p = 0;
        for (char c='\u0000'; c<'\uffff'; c++) { // от первого символа до последнего в таблице кодов
            if (s.indexOf(c)>=0) { // если такая буква есть в этом слове
                res[p] = c; // записываем ее в массив
                p++;
            }
        }
        if (s.indexOf('\uffff')>=0) {
            res[p] = '\uffff';
            p++;
        }
        return Arrays.copyOf(res, p);
    }

    private static String reverseString(String s) {
        char[] chars = s.toCharArray();
        char[] res = new char[chars.length];
        int p = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            res[p] = chars[i];
            p++;
        }
        return new String(res);
    }
}
