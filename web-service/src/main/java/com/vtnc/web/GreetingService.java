package com.vtnc.web;

/**
 * Hello world!
 *
 */

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class GreetingService {
    @WebMethod(operationName = "sayHello")
    public String sayHello(@WebParam(name="guestname") String guestname) {
        if (guestname == null) { return "Hello"; }
        return "Hello " + guestname;
    }

    //    private final String message = "Hello, ";
//
//    public GreetingService() {}
//
//    @WebMethod
//    public String sayHello(String name) {
//        return message + name + ".";
//    }
}