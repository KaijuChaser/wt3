package com.bsuir.max.archive.server.controller.command;


import com.bsuir.max.archive.server.controller.command.impl.*;
import com.bsuir.max.archive.server.controller.constant.ServerControllerConstant;
import com.bsuir.max.archive.server.controller.command.impl.AddCommand;
import com.bsuir.max.archive.server.controller.command.impl.EditCommand;
import com.bsuir.max.archive.server.controller.command.impl.GetUserByIdCommand;
import com.bsuir.max.archive.server.controller.command.impl.LoginCommand;

import java.util.HashMap;
import java.util.Map;

public class ServerCommandProvider {

    private static final Map<String, ServerCommand> serverCommands = new HashMap<>() {{
        put(ServerControllerConstant.ADD_COMMAND, new AddCommand());
        put(ServerControllerConstant.EDIT_COMMAND, new EditCommand());
        put(ServerControllerConstant.GET_COMMAND, new GetUserByIdCommand());
        put(ServerControllerConstant.LOGIN_COMMAND, new LoginCommand());
    }};


    private ServerCommandProvider() {
    }

    public static ServerCommand getServerCommandByName(String name) {
        return serverCommands.get(name);
    }
}
