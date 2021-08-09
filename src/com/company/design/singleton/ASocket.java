package com.company.design.singleton;

public class ASocket {

    private SocketClient socketClient;

    public ASocket(){
        this.socketClient = SocketClient.getInstance();    //동일할때(singleton)
        //this.socketClient = new SocketClient();          //동일하지않을때
    }
    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
