package Giris;

public class Main {
    public static void main(String[] args){
        Fight f1 = new Fight("Mike Tyson",30,120,100,5);
        Fight f2 = new Fight ("Muhammed Ali",35,140,120,10);

        Match match = new Match(f1,f2,85,120);
        match.go();
    }

}
