//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import edu.duke.FileResource;
import edu.duke.StorageResource;

import java.util.Scanner;

public class Find_gene {

   /*public void Find_gene() {
        System.out.println("constructor");
    }*/

    public void gene(String d) {
        int dna_len = d.length();
        boolean stop = true;
        int st_cod = -3;
        StorageResource s =new StorageResource();
        String n = new String();




        while(stop)
            {
                int atgpos = d.indexOf("ATG", st_cod + 3);
                int taapos = d.indexOf("TAA", atgpos + 3);
                int tagpos = d.indexOf("TAG", atgpos + 3);
                int tgapos = d.indexOf("TGA", atgpos + 3);
                if (taapos == -1) {
                    taapos = 999999999;
                }

                if (tgapos == -1) {
                    tgapos = 999999999;
                }

                if (tagpos == -1) {
                    tagpos = 999999999;
                }

                if (taapos < tagpos) {
                    if (taapos < tgapos) {
                        st_cod = taapos;
                    } else {
                        st_cod = tgapos;
                    }
                } else if (tagpos < tgapos) {
                    st_cod = tagpos;
                } else {
                    st_cod = tgapos;
                }

                if ((atgpos == -1))
                {
                    stop = false;
                    return;
                }
                else if (taapos == 999999999 && tagpos == 999999999 && tgapos == 999999999 && atgpos != -1)
                {

                    n=d.substring(atgpos, dna_len);
                    System.out.println(n);
                    s.add(n);
                    System.out.println(s.size());
                    return;
                }

                else
                    {
                    n=d.substring(atgpos, st_cod + 3);
                    System.out.println(n);
                    s.add(n);
                    System.out.println(s.size());

                    }
            }



    }

    public static void main(String[] args) {
       // new String("AAGTATGASHDBADBBSJHDBAACADKATAAHBAD");
        FileResource f =new FileResource();

        /*Scanner a = new Scanner(System.in);
        String dna = a.nextLine();
        Find_gene f = new Find_gene();
        f.gene(dna);

         */
       Find_gene g = new Find_gene();
        for(String line : f.lines())
        {
                     //System.out.println(line);
            g.gene(line);


        }

    }
}


