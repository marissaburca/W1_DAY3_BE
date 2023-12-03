package second;

public class Chiamate {
     String numero;
     String duration;

    @Override
    public String toString () {
        return "number=" + numero + " & duration=" + duration ;
    }

    public Chiamate( String numero, String duration ) {
        this.numero = numero;
        this.duration = duration;

    }

}
