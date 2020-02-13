package decision;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MusicalInstr violin = new Violin("artistic");
        MusicalInstr ukulele = new Ukulele("creative");
        MusicalInstr trombone  = new Trombone("sullen");
        MusicalInstr cello = new Cello("sad");
        System.out.print("1.Ukulele \n2.Violin\n3.Cello\n4.Trombone\n");
        System.out.print("Input a musical instruments: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while (num<0 && num>4)
        {
            num = in.nextInt();
        }
        switch (num) {
            case  (1):
                ukulele.Sound();
                ukulele.Desc();
                ukulele.Show();
                ukulele.History();
                break;
            case (2):
                violin.Sound();
                violin.Desc();
                violin.Show();
                violin.History();
                break;

            case (3):
                cello.Sound();
                cello.Desc();
                cello.Show();
                cello.History();
                break;
            case (4):
                trombone.Sound();
                trombone.Desc();
                trombone.Show();
                trombone.History();
                break;
            default:

                break;
        }
    }
}
