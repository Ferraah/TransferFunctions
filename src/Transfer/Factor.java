package Transfer;


public class Factor {

    private double omega;
    private double tau;

    public Factor(double omega){
        this.omega = omega;
        this.tau = 1/omega;
    }

    public double getOmega() {
        return omega;
    }

    public double getTau() {
        return tau;
    }

    @Override
    public String toString(){

        return "(1 +"+ "s/"+Double.toString(this.tau)+")";
    }
}





