public class Menu {

    int x;
    int y;
    int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void sprawdzPrzedzial() {

        /*int przedzial = z / y;*/
     /* int[] tab = new int[y];*/

        for (int i = 0; i < x; i++) {
            double[] a = new double[x];
            a[i] = (int) (z * Math.random() + 1);
            System.out.println(a[i]);
        }
    }
}

