package com.bsuir.max.archive.client.controller.command.impl;

import com.bsuir.max.archive.client.controller.command.ClientCommand;
import com.bsuir.max.archive.client.service.ClientService;
import com.bsuir.max.archive.client.service.ServiceException;
import com.bsuir.max.archive.client.service.ClientServiceFactory;

/**
 * LoginCommand class
 *
 * @author Max
 * @version 1.0
 */
public class LoginCommand implements ClientCommand {
    /**
     * {@inheritDoc}
     */
    @Override
    public String execute(String request) {
        ClientServiceFactory serviceFactory = ClientServiceFactory.getInstance();
        ClientService clientService = serviceFactory.getClientService();

        String response;

        try {
            clientService.sendRequest(request);
            response = clientService.getResponse();
        } catch (ServiceException e) {
            response = e.getMessage();
        }
        return response;
    }
}
