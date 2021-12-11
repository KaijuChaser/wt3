package com.bsuir.max.archive.client.controller.command;

/**
 * Command interface
 *
 * @author Max
 * @version 1.0
 */
public interface ClientCommand {
    /**
     *
     *
     * @param request request
     * @return response
     */
    String execute(String request);
}
