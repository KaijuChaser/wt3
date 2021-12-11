package com.bsuir.max.archive.server.controller.command;

import com.bsuir.max.archive.server.bean.Account;

public interface ServerCommand {
    String execute(String request, Account account);
}
