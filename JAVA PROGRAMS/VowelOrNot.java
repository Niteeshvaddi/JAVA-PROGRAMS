public class VowelOrNot {
    public static void main(String[] args) {
        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';
        
        char ch = 't';
        if (ch == a || ch == e || ch == i || ch == o || ch == u) {
            System.out.println("it is a vowel: " + ch);
        } else {
            System.out.println("it is not a vowel: " + ch);
        }
    }
}
