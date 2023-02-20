/**
 * FCX.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */
public class FCX{//Jangan lupa tambahkan kata kunci untuk melakukan polymorphism antar kelas
    private int luggageCapacity;
    private Boolean isIdleStoping;

    public FCX(int numberOfWheels,int engineCapacity, int luggageCapacity, Boolean isIdleStoping) {
        //Konstruktor
        //luggageCapacity merupakan kapasitas bagasi dalam satuan liter
        //isIdleStoping merupakan keadaan apakah mesin FCX sedang diseting untuk dapat mati secara otomatis setelah beberapa waktu
    }

    public int getLuggageCapacity(){
        //Mengembalikan nilai dari kapasitas bagasi
    }

    public Boolean getStopingStatus(){
        //Mengembalikan status dari setingan mesin FCX untuk berhenti secara otomatis
    }    
    public String sound(){
        //Mengembalikan string berisi "Brmmm"
    }

    public String printDescription(){
        //Mengembalikan string yang berformat dan berkondisi
        //Apabila isIdleStoping true, maka mengembalikan: "Motor ini memiliki a roda dengan kapasitas mesin b cc, memiliki kapasitas bagasi c liter, dan sedang dapat berhenti otomatis apabila didiamkan" dengan a adalah numberOfWheels, b adalah engineCapacity dan c adalah luggageCapacity
        //Apabila isIdleStoping false, maka mengembalikan: "Motor ini memiliki a roda dengan kapasitas mesin b cc, memiliki kapasitas bagasi c liter, dan sedang tidak dapat berhenti otomatis apabila didiamkan" dengan a adalah numberOfWheels, b adalah engineCapacity dan c adalah luggageCapacity
    }
}