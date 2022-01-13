package JAVAPODSTAWY;

public class TypLogiczny {
    public static void main(String[] args) {

        /*
! - operator oznaczający negację, zamieniający wyrażenie logiczne na przeciwne: true na false oraz odwrotnie.
&& - operator oraz (ang. and) zwracający true tylko jeżeli obydwa operandy również mają wartość true.
|| - operator lub (ang. or) zwracający true jeżeli chociaż jeden z operandów ma wartość true.
         */

        boolean t1 = true;
        boolean t2 = true;
        boolean f = false;

        boolean r1 = !t1;
        boolean r2 = t1 && t2;
        boolean r3 = t1 && f;
        boolean r4 = t1 || f;
        boolean r5 = !(t1 && f) && t2 || f;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
    }
}
