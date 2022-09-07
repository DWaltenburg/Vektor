package Vektor.src.minPakke;

public class Matematik {

    private double x=0;
    private double y=0;
    private double laengde=0;

    public Matematik(){}

    public void beregnLaengde(double x, double y){
        this.x = x;
        this.y = y;
        this.laengde = Math.sqrt(this.x*this.x+this.y*this.y);
    }

    public double givSidsteLaengde(){
        return laengde;
    }

    public void skrivLaengde(){
        System.out.println("Længden for vektoren med koordianterne " + x + " og " + y + " er " + givSidsteLaengde());
    }

}