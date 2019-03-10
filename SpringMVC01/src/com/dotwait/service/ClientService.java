package com.dotwait.service;

public class ClientService {
    private static ClientService clientService = new ClientService();

    private ClientService() {
    }

    public static ClientService createInstance() {
        return clientService;
    }

    public void show() {
        System.out.println("hello~ I am clientService!");
    }
}
