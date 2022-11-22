package web;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class CalculatorWebServiceClient {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/calculator?wsdl");

        QName qName = new QName("http://web/", "CalculatorWebServiceImplService");

        Service service = Service.create(url, qName);

        CalculatorWebService calculator = service.getPort(CalculatorWebService.class);
        Scanner in = new Scanner(System.in);
        double a, b;
        while (true) {
            System.out.println("Введите 2 числа: ");
            a = in.nextDouble();
            b = in.nextDouble();
            System.out.println("Выберите операцию:\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Деление");
            int choice;
            choice = in.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println(calculator.addition(a, b));
                }
                case 2 -> {
                    System.out.println(calculator.subtraction(a, b));
                }
                case 3 -> {
                    System.out.println(calculator.multiplication(a, b));
                }
                case 4 -> {
                    System.out.println(calculator.division(a, b));
                }
            }
        }
    }
}
