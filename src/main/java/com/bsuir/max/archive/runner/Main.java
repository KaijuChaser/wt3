package com.bsuir.max.archive.runner;

import com.bsuir.max.archive.client.Client;
import com.bsuir.max.archive.server.Server;

public class Main {
    public static void main(String[] args) {
        new Server().start();
        new Client().start();
    }
}
