package com.bsuir.max.archive.server.controller;

import com.bsuir.max.archive.server.bean.Account;

public interface ServerController {
    String executeRequest(String request, Account account);
}
