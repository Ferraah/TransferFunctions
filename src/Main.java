import Transfer.Factor;
import Transfer.TransferFunction;
import Transfer.ZeroFactor;
import collection.IntSet;
import complex.ComplexNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Factor> poles = new ArrayList<Factor>();
        List<Factor> zeros = new ArrayList<Factor>();


        ZeroFactor zf = new ZeroFactor(1);

        poles.add(new Factor(0.1));
        poles.add(new Factor(10));
        zeros.add(new Factor(1));

        TransferFunction tf = new TransferFunction(zeros, poles, zf);
        System.out.println(tf);


    }

}