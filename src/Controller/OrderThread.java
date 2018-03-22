package Controller;

import Domain.easyObject;
import Persistence.OrderDAO;

public class OrderThread implements Runnable {
        OrderDAO odao = new OrderDAO();
        easyObject objectrep;

    public OrderThread(easyObject object){
        this.objectrep = object;
    };
    public void run(){

        try {
            Thread.sleep(25000);
            odao.finishOrder(objectrep.getOrderID());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Hello from a thread!");
    }

}
