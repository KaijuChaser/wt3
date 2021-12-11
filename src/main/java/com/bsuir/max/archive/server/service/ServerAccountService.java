package com.bsuir.max.archive.server.service;

import com.bsuir.max.archive.server.bean.Account;

public interface ServerAccountService {
    Account login(String login, String password) throws ServerServiceException;
}
