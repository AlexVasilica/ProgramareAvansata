package Compulsory;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);
        int nr = n * 3;
        byte binary = 0b10101;
        nr += binary;
        int Hex = 0xFF;
        nr += Hex;
        nr *= 6;
        System.out.println(nr);
        int s = 0;
        while (nr != 0)
        {
            s += nr % 10;
            nr /= 10;
        }
        int s1 = 0;
        if (s > 9)
            while (s != 0) {
                s1 += s % 10;
                s /= 10;
            }
        if(s1 > 0)
            System.out.println("Willy-nilly, this semester I will learn " + languages[s1] + ".");
        else
            System.out.println("Willy-nilly, this semester I will learn " + languages[s] + ".");
    }
}
