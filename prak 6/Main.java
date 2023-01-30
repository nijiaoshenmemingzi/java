import java.lang.System ;
import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String fuel = scanner.nextLine();
        Car car = new Car(fuel);
        boolean selesai = false;
        while(!selesai){
            String input = scanner.next();
            try{
                if(input.equals("Fill")){
                    car.fillingFuel(scanner.next(), scanner.nextInt());
                }
                else if (input.equals("ChangeGear")){
                    car.changeGear(scanner.nextInt());
                }
                else if (input.equals("ChangeAcPower")){
                    car.changeAcPower(scanner.nextInt());
                }
                else if(input.equals("Start")){
                    car.start();
                }
                else if(input.equals("Service")){
                    car.service(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                }
                else if(input.equals("End")){
                    System.out.printf("Program selesai\n");
				    selesai = true;
				    scanner.close();
				    System.out.println("Tidak ada unhandled exception");
                }
                else {
					throw new java.lang.Exception("Masukan tidak valid");
				}
            }
            catch (FuelException a){
                System.out.println("[FuelException] "+ a.getMessage());
            }
            catch (InvalidInputCarException a) {
                System.out.println("[InvalidInputCarException] "+ a.getMessage());
            }
            catch (TheCarIsOnException a) {
                System.out.println("[TheCarIsOnException] "+ a.getMessage());
            }
            catch (Exception e) {
				System.out.printf("Program selesai\n");
				selesai = true;
				scanner.close();
				System.out.println(e.getMessage());
			}
        }
    }
}
