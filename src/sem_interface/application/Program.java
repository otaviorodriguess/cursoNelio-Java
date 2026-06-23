/*
Uma locadora brasileira de carros cobra um valor por hora para locações de até12 horas.
Porém, se a duração da locação ultrapassar 12 horas, a locação será cobrada com base em um valor diário.
Além do valor da locação, é acrescido nopreço o valor do imposto conforme regras do país que, no caso do Brasil, é 20%para valores até 100.00, ou 15% para valores acima de 100.00.
Fazer um programa que lê os dados da locação (modelo do carro, instante inicial e final da locação),
bem como o valor por hora e o valor diário de locação.
O programa deve então gerar a nota de pagamento (contendo valor da locação, valor do imposto e valor total do pagamento) e informar os dados na tela.
*/

package sem_interface.application;

import sem_interface.model.entities.CarRental;
import sem_interface.model.entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm):  )");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.println("Retorno (dd/MM/yyyy hh:mm):  )");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental cr = new CarRental(start,finish,new Vehicle(carModel));



        sc.close();
    }
}
