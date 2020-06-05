package unac.edu.co;

public class Auto extends Thread {
    private int n;
    private int AutoNumber;

    public Auto(int n, int AutoNumber) {
        super();
        this.n = n;
        this.AutoNumber = AutoNumber;
    }

    public void run()
    {
        for(int i =1;i<=n;i++)
        {
            System.out.println("El auto "+ AutoNumber +"  "+i+" km");
        }
        System.out.println("El auto "+ AutoNumber +" termino el recorrido");
    }
}