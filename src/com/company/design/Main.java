package com.company.design;

import com.company.design.singleton.ASocket;
import com.company.design.singleton.BSocket;
import com.company.design.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ASocket aSocket = new ASocket();
        BSocket bSocket = new BSocket();

        SocketClient aClient = aSocket.getSocketClient();
        SocketClient bClient = bSocket.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
    }
}
