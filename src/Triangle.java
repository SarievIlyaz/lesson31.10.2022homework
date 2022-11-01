public class Triangle {
    int a;
    int b;
    int c;

    public void area() {
        double p = a+b+c;
        double r = p/2;
        double s = Math.sqrt(r*(r-a)*(r-b)*(r-c));
        System.out.println("ploshad treugolnika: "+s);
    }

}
