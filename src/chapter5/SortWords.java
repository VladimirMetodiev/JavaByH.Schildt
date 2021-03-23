package chapter5;

import java.util.Scanner;

public class SortWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().split(",\\s+");
        String current;

        for (int a = 0; a < words.length - 1; a++) {
            for (int b = a + 1; b < words.length; b++) {
                if(words[a].compareTo(words[b]) > 0){
                    current = words[a];
                    words[a] = words[b];
                    words[b] = current;
                }
            }
        }

        System.out.println(String.join(", ", words));
    }
}



//Test

//ak, ap, ad, af, as, az, au, av, ah, am, ao, ay, aa, ar, aj, at, ag, al, ax, aw, ab, an, ae, ai, aq, ac

//translator, technician, architect, engineer, programmer, artist, sewer, physicist, dentist, electrician, receptionist
