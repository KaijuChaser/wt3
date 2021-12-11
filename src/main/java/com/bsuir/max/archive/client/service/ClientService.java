package com.bsuir.max.archive.client.service;

/**
 * ClientService class
 *
 * @author Max
 * @version 1.0
 */
public interface ClientService {

    boolean connect(String request) throws ServiceException;

    void sendRequest(String request) throws ServiceException;

    String getResponse() throws ServiceException;
}
