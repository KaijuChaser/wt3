package com.bsuir.max.archive.server.dao;

import com.bsuir.max.archive.server.bean.Account;

public interface AccountDao {
    Account login(String login, String passwordHash) throws DaoException;
}
