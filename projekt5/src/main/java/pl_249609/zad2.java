package pl_249609;

public class zad2 {
    int tab[];
    int i;
    public zad2(int tab[], int i)
    {
        this.tab = tab;
        this.i = i;
    }
    public   boolean sekwencja(int[] tab, int i)
    {
        return tab[i]==1&&tab[i+1]==2&&tab[i+2]==3;
    }
}
