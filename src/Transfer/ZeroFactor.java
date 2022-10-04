package Transfer;

public class ZeroFactor{
    private int g;

    public ZeroFactor(int g){
        this.g = g;
    }

    public int getG() {
        return g;
    }

    @Override
    public String toString(){

        return "(1/s^"+g+")";
    }
}


