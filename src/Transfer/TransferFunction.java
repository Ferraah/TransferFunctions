package Transfer;

import java.util.List;

public class TransferFunction{

    private List<Factor> numerator;
    private List<Factor> denominator;
    private ZeroFactor zeroFactor;
    private Factor currentDominantPole;

    public TransferFunction(List<Factor> numerator, List<Factor> denominator, ZeroFactor zf){
        this.numerator = numerator;
        this.denominator = denominator;
        this.zeroFactor = zf;
    }

    public void addToNumerator(Factor f){

        numerator.add(f);

    }

    public void addToDenominator(Factor f){
        denominator.add(f);
    }

    public void removeFromNumerator(Factor f){
        numerator.remove(f);
    }

    public void removeFromDenominator(Factor f){
        denominator.remove(f);
    }

    public Factor getCurrentDominantPole() {

        // If it has been calculated
        if(currentDominantPole != null){
            return currentDominantPole;
        }

        // If not calculate and set it
        this.currentDominantPole = calculateDominantPole();
        return this.currentDominantPole;
    }

    private Factor calculateDominantPole(){

        Factor minF= denominator.get(0);
        double minOmega = denominator.get(0).getOmega();
        for(int i = 0; i<denominator.size(); i++){
            Factor curr = denominator.get(i);
            if(curr.getOmega() < minOmega){
                minOmega = curr.getOmega();
                minF = curr;
            }

        }

        return minF;

    }

    @Override
    public String toString(){
        String str = "";
        str+=zeroFactor.toString();

        if(this.numerator.size() > 1)
            str+="(";

        for (int i = 0; i < this.numerator.size(); i++) {
            str += this.numerator.get(i).toString();
        }

        if(this.numerator.size() > 1)
            str+=")";


        str += "/(";
        for (int i = 0; i < this.denominator.size(); i++) {
            str += this.denominator.get(i).toString();
        }
        str += ")";
        return str;
    }

}


