package com.dotwait.service;

public class DefaultServiceLocator {
    private static MessageService messageService = new MessageService();

    public MessageService createMessageServiceInstance(){
        return messageService;
    }
}
