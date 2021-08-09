package com.company.design.singleton;
/**
* [Singleton Pattern]
 * 1.어떠한 클래스(객체)가 유일하게 1개만 존재 할 때 사용
 * 2.주로 자원을 공유할때 사용
 * 3.기본생성자를 "private" 로 막고 하는 사용하는 것이 중요
 * 4.함수 : getInstance(), singleton()
* */
public class SocketClient {
    private static SocketClient socketClient;

    //singleton pattan 에서는 기본 생성자로 생성할 수 없도록 private로 막아준다.
    private SocketClient() {

    }
//    public SocketClient(){
//
//    }
    //static으로 선언하면 외부에서 . 방식으로 사용이 가능하다.(?)
    public static SocketClient getInstance(){
        if(socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }
}
