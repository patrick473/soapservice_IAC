package service;

import Controller.OrderThread;
import Domain.easyObject;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
@WebService
@SOAPBinding()
public class finishOrder {
    private static final Logger LOG =
            Logger.getLogger(finishOrder.class.getName());
    @WebMethod
    public String say (@WebParam(name="name") String name,@WebParam(name="price")double price,@WebParam(name="address")String address,@WebParam(name="orderid")int orderid) {

        easyObject eo = new easyObject(name,price,address,orderid);

        OrderThread ot = new OrderThread(eo);

        Thread t1 = new Thread(ot);

        t1.start();

        LOG.info("Web service is called!");
        return String.format("Hello, %s!", name);
    }
}
