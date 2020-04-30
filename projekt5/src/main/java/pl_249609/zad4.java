package pl_249609;

public class zad4 {
    int tab[];

    public zad4(int tab[])
    {
        this.tab = tab;
    }

    public static int[] nowatablica(int[] tab)
    {
        int dlugosc = tab.length;
        int f = dlugosc - 1;
        int odwrocona[] = new int[dlugosc];
        for (int i = 0; i < dlugosc; i++)
        {
            odwrocona[i] = tab[f];
            f--;
        }
        return odwrocona;
    }
}
