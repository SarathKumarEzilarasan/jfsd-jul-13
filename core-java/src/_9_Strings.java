public class _9_Strings {
    public static void main(String[] args) {
        // String intern pool
        String s1 = "hello world"; // 1 gb -> 104+101+..... -> 1000
        //           012345678910    -> locations or indexes
        String s2 = "hello worldd"; // 1 gb                  -> 1000
        String s3 = new String("hello world");


//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);

//        System.out.println(s1.equals(s3));
//        System.out.println(s1.length());
//        string immutable
//        System.out.println(s1.toUpperCase());
//        s1 = s1.toUpperCase();
//        System.out.println(s1);
//        System.out.println(s1.toLowerCase());
//        System.out.println(s1.charAt(4));
//        System.out.println(s1.charAt(s1.length() - 1));
//        System.out.println(s1.charAt(11));
//        System.out.println(s1.indexOf("w"));
//        System.out.println(s1.lastIndexOf("l"));
//        System.out.println(s1.substring(2, 11));
//        System.out.println(s1.startsWith("hel"));
//        System.out.println(s1.endsWith("hel"));
//        System.out.println(s1.contains("o wo"));
//        System.out.println(s1.equalsIgnoreCase("HELLO WORLD"));
//        System.out.println(s1.replace("l","z"));
//        System.out.println(s1.compareTo(s2));

//        for (int i = 0; i < s1.length() ; i++) {
//            System.out.println(s1.charAt(i));
//        }

//        for (int i = s1.length() - 1; i >= 0; i--) {
//            System.out.println(s1.charAt(i));
//        }

        isPalindrome("madam");
//        System.out.println("hello" + "world");
    }

    //    palindrome -> madam
    public static void isPalindrome(String original) {
        // reverse
        // compare
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
            //        ""      + m  => reverse = m
            //        m       + a  => reverse = ma
        }

        if (original.equals(reverse)) {
            System.out.println("Its a palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
