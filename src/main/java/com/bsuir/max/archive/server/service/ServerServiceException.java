package com.bsuir.max.archive.server.service;

/**
 * ServiceException class.
 * This class needed to throw exceptions on the service layer.
 *
 * @author Max
 * @version 1.0
 */
public class ServerServiceException extends Exception {

    public ServerServiceException() {
        super();
    }

    public ServerServiceException(String message) {
        super(message);
    }

    public ServerServiceException(String message, Exception e) {
        super(message, e);
    }

    public ServerServiceException(Exception e) {
        super(e);
    }
}
