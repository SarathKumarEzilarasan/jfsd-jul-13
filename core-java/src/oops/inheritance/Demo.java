package oops.inheritance;

public class Demo {

    public void breaks(){
        System.out.println("Demo breaking system");
    }

    public static void main(String[] args) {
        Tata tata = new Tata();
        tata.tyres();
        tata.model = "Nexon";

        Fiat fiat = new Fiat();
        fiat.tyres();


        TataSedan tataSedan = new TataSedan();
        tataSedan.tyres();
        tataSedan.breaks();
    }
}
