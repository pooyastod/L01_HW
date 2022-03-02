import java.util.Scanner;
    public class q1_s2 {
        public static void main(String[] args) {
            shekl_q1_s2 morabba = new shekl_q1_s2();
            shekl_q1_s2 mostatil = new shekl_q1_s2();
            int x,y;
            System.out.println("agar shekl morabba bashad tool be onvan arz niz farz mishavad");
            Scanner adadgir = new Scanner(System.in);
            System.out.println ("tool ra vared konid : ");
            String str=adadgir.nextLine ();
            x =Integer.parseInt (str);
            System.out.println ("ertefa ra vared konid : ");
            String strr=adadgir.nextLine ();
            y =Integer.parseInt (strr);
            morabba.tool = x;
            morabba.arz = x;
            mostatil.tool = x;
            mostatil.arz = y;
            System.out.print("masahat e morabba be tool e " + x + " va arz e " + y + "barabar ast ba ");
            morabba.masahat();
            System.out.print("masahat e mostatil be tool e " + x + " va arz e " + y + "barabar ast ba ");
            mostatil.masahat();
            System.out.print("mohit e morabba be tool e " + x + " va arz e " + y + "barabar ast ba ");
            morabba.mohit();
            System.out.print("mohit e mostatil be tool e " + x + " va arz e " + y + "barabar ast ba ");
            mostatil.mohit();
        }
    }
