package Week6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lysanne on 12/18/2015.
 */
public class Rosalind
{
    private String Rosalind_0498 = "AAATAAA", Rosalind_2391 = "AAATTTT", Rosalind_2323 = "TTTTCCC", Rosalind_0442 = "AAATCCC", Rosalind_5013 = "GGGTGGG";
    private String[] arr = {Rosalind_0498, Rosalind_2391, Rosalind_2323, Rosalind_0442, Rosalind_5013};
    public static void main(String[] args) {
        Rosalind a = new Rosalind();
    }

    public Rosalind()
    {
        for(int i = 0; i<arr.length;i++) {
            String a = arr[i];

            for(int j = 0; j<arr.length;j++) {
                String b = arr[j];
                if (!a.equals(b)) {
                    vergelijk(a, b);
                }
            }
        }
    }

    public void vergelijk(String a, String b)
    {
        boolean match = false;
        HashMap hm = new HashMap();
        hm.put("AAATAAA", "Rosalind_0498");
        hm.put("AAATTTT", "Rosalind_2391");
        hm.put("TTTTCCC", "Rosalind_2323");
        hm.put("AAATCCC", "Rosalind_0442");
        hm.put("GGGTGGG", "Rosalind_5013");

        String a1 = a.substring(0, 3);
        String a2 = a.substring(4, 7);
        String b1 = b.substring(0, 3);
        String b2 = b.substring(4, 7);

        String[] arr = new String[2];
        String[] arr2 = new String[2];

        arr[0]=a1;
        arr[1]=a2;

        arr2[0]=b1;
        arr2[1]=b2;

            if (arr2[0].equals(arr[1]))
            {
                match = true;
            }


        if (match == true)
        {
            System.out.println(hm.get(a)+" & "+hm.get(b));
        }
    }
}
