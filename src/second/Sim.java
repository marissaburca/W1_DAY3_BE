package second;

public class Sim {
    private int phone;
    private int credit;
    private int[] calls;

    public Sim (int number){
        this.phone = number;
        this.credit = 0;
        this.calls = null;

    }
    public void printData(){
        System.out.println("Phone number: "+ phone +". Credit: "+credit +"€. Last 5 calls: "+ calls)
    }
    //da terminare. Fatica con suddivisione delle classi e dei relativi contenuti.
}
