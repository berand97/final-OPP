package unac.edu.co;

public class Auto extends Thread {
    private int km;
    private int car;

    public Auto(int km, int car) {
        super();
        this.km = km;
        this.car = car;
    }

    public void run()
    {
        for(int i = 1; i<= km; i++)
        {
            System.out.println("El auto "+ car +"  "+i+" km");
        }
        System.out.println("El auto "+ car +" termino el recorrido");
    }
}