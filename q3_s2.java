import java.util.Scanner;
public class q3_s2 {
    public static void main(String[] args) {
        Scanner adadgir = new Scanner(System.in);
        System.out.println ("a ra vared konid : ");
        String A=adadgir.nextLine ();
        double a =Double.parseDouble(A);
        System.out.println ("b ra vared konid : ");
        String B=adadgir.nextLine ();
        double b =Double.parseDouble(B);
        System.out.println ("c ra vared konid : ");
        String C=adadgir.nextLine ();
        double c =Double.parseDouble(C);
        System.out.println ("d ra vared konid : ");
        String D=adadgir.nextLine ();
        double d =Double.parseDouble(D);
        System.out.println ("e ra vared konid : ");
        String E=adadgir.nextLine ();
        double e =Double.parseDouble(E);
        System.out.println ("f ra vared konid : ");
        String F=adadgir.nextLine ();
        double f =Double.parseDouble(F);
        double ed,bf,ad,bc,af,ec,edbf,afec,adbc;
        ed = e*d;
        bf = b*c;
        ad = a*d;
        bc = b*c;
        af = a*f;
        ec = e*c;
        edbf = ed - bf;
        afec = af - ec;
        adbc = ad - bc;
        if (ad == bc) {
            System.out.println("moadele ghabel e hal nist");
        }
        else{
            double x = edbf/adbc;
            double y = afec/adbc;
            System.out.print("x barabar ast ba : ");
            System.out.println(x);
            System.out.print("y barabar ast ba : ");
            System.out.println(y);
        }
    }
}
