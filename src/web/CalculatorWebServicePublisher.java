package web;

import javax.xml.ws.Endpoint;

public class CalculatorWebServicePublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/calculator", new CalculatorWebServiceImpl());
    }
}
