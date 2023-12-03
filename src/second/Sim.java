package second;

import java.util.Arrays;

public class Sim {
    private String phone;
    private int credit;
    private String[] calls;

    public Sim (String number){
        this.phone = number;
        this.credit = 0;
        this.calls = null;

    }

    @Override
    public String toString () {
        return "Sim{" + "phone='" + phone + '\'' + ", credit=" + credit + ", calls=" + Arrays.toString(calls) + '}';
    }

    public Sim ( String number, int credit, String call, String duration, String call1, String duration1, String call2, String duration2, String call3, String duration3, String call4, String duration4){
        this.phone = number;
        this.credit = 0;
        this.calls = new String[]{new Chiamate(call, duration).toString(), new Chiamate(call1, duration1).toString(), new Chiamate(call2, duration2).toString(), new Chiamate(call3, duration3).toString(), new Chiamate(call4, duration4).toString()};

    }
    public void printData(){
        System.out.println("Phone number: "+ phone +". Credit: "+credit +"€. Last 5 calls: " + Arrays.toString(calls));
    }

}
