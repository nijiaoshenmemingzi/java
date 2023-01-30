/**
 * ComputerManager.java
 * implementasi metode metode
 * @author 18220014 Pavita Andrea
 */

import java.util.ArrayList;
import java.util.List;

public class ComputerManager {
    private List<Computer> list = new ArrayList<Computer>();

    /**
     * Menambahkan komputer ke array
     * 
     * @param computer objek Computer
     */
    public void addComputer(Computer computer) {
        // Tambahkan komputer ke list
        list.add(computer);
    }

    /**
     * Menyalakan monitor semua komputer yang mempunyai monitor 
     * dengan metode turnOnMonitor
     */
    public void turnOnAllMonitors() {
        for(Computer computer : this.list){
            if (computer instanceof PC){
                PC a = (PC) computer;
                a.turnOnMonitor();
            }
            else if (computer instanceof GameConsole){
                GameConsole g = (GameConsole) computer;
                g.turnOnMonitor();
            }

        }

    }

    /**
     * Mematikan monitor semua komputer yang mempunyai monitor 
     * dengan metode turnOffMonitor
     */
    public void turnOffAllMonitors() {
        for(Computer computer : this.list){
            if (computer instanceof PC){
                PC a = (PC) computer;
                a.turnOffMonitor();
            }
            else if (computer instanceof GameConsole){
                GameConsole g = (GameConsole) computer;
                g.turnOffMonitor();
            }

        }

    }

    /**
     * Mencetak spesifikasi semua komputer
     * dengan metode printSpecification
     */
    public void printAllSpecifications() {
        for(Computer computer : this.list){
            if (computer instanceof PC){
                PC p = (PC) computer;
                p.printSpecification();
            }
            else if (computer instanceof GameConsole){
                GameConsole g = (GameConsole) computer;
                g.printSpecification();
            }
            else if (computer instanceof Laptop){
                Laptop l = (Laptop) computer;
                l.printSpecification();
            }
            else if (computer instanceof Smartphone){
                Smartphone s = (Smartphone) computer;
                s.printSpecification();
            }

        }
    }

    /**
     * Memindahkan semua komputer yang portable
     * dengan metode move
     */
    public void moveAllPortableComputers() {
        for(Computer computer : this.list){
            if (computer instanceof Laptop){
                Laptop l = (Laptop) computer;
                l.move();
            }
            else if (computer instanceof Smartphone){
                Smartphone s = (Smartphone) computer;
                s.move();
            }

        }
    }

    /**
     * Menggunakan keyboard semua komputer yang memiliki keyboard
     * dengan metode useKeyboard
     */
    public void useAllKeyboards() {
        for(Computer computer : this.list){
            if (computer instanceof PC){
                PC p = (PC) computer;
                p.useKeyboard();
            }
            else if (computer instanceof Laptop){
                Laptop l = (Laptop) computer;
                l.useKeyboard();
            }
        }
    }

}
