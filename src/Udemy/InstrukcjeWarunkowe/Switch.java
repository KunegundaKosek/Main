package Udemy.InstrukcjeWarunkowe;

public class Switch {

    public static void main(String[] args) {

        int a = 50;

        switch (a) {
            case 50:
                System.out.println("a jest równe 50");
                break;
            case 100:
                System.out.println("a jest równe 100");
                break;
            default:
                System.out.println("a nie jest równe ani 100 ani 50" + a);
        }
    }
}
