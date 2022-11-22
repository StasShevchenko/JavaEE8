package web;

import javax.jws.WebService;

@WebService(endpointInterface = "web.CalculatorWebService")
public class CalculatorWebServiceImpl implements CalculatorWebService{

    @Override
    public double addition(double a, double b) {
        return a+b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a*b;
    }

    @Override
    public double division(double a, double b) {
        return a/b;
    }
}
