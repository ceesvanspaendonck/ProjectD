package ProjectD;

public class Doolhof
{
    int heigth;
    int width;
    int[][] grid;
    Tegel[][] tegels;

    public Doolhof(int heigth, int width)
    {
        this.heigth = heigth;
        this.width = width;
        this.grid = new int[heigth][width];
        this.tegels = new Tegel[heigth][width];
    }
}
