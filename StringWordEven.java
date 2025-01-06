
// Java program to print
// even length words in a string

class StringWordEven {
    public static void printWords(String s) {
        for (String w : s.split(" ")) {
            // if length is even
            if (w.length() % 2 == 0)
                System.out.println(w);
        }
    }

    public static void main(String[] args) {
        String s = "i am Geeks for Geeks and a Geek";
        printWords(s);
    }
}