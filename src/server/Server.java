package server;


import Persistence.OrderDAO;

import service.finishOrder;

import java.util.logging.Logger;
        import javax.xml.ws.Endpoint;



public final class Server {
    private static final Logger LOG = Logger.getLogger(Server.class.getName());
    private static final String HOST_NAME = "localhost";
    private static final String PORT_NO = "9999";
    private static final String HELLO_SVC_NAME = "java-ws/finishOrder";
    private static final String PROTOCOL = "http";
    private static final String URL = String.format("%s://%s:%s/%s", PROTOCOL,
            HOST_NAME, PORT_NO, HELLO_SVC_NAME);
    public static void main(String[] args) {
        finishOrder hello = new finishOrder();
        Endpoint.publish(URL, hello);
        LOG.info("HelloWorld service started successfully ...");

    }
}
