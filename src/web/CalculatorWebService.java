package web;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CalculatorWebService {

    @WebMethod
    public double addition(double a, double b);

    @WebMethod
    public double subtraction(double a, double b);

    @WebMethod
    public double multiplication(double a, double b);

    @WebMethod
    public double division(double a, double b);
}
