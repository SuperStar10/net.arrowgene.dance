/*
 * This file is part of net.arrowgene.dance.
 *
 * net.arrowgene.dance is a server implementation for the game "Dance! Online".
 * Copyright (C) 2013-2018  Sebastian Heinz (github: sebastian-heinz)
 * Copyright (C) 2013-2018  Daniel Neuendorf
 *
 * Github: https://github.com/Arrowgene/net.arrowgene.dance
 * Web: https://arrowgene.net
 *
 * net.arrowgene.dance is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * net.arrowgene.dance is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <https://www.gnu.org/licenses/>.
 */

package net.arrowgene.dance.server.task.tasks;

import net.arrowgene.dance.server.DanceServer;
import net.arrowgene.dance.server.task.Task;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class UpdateStatus extends Task {

    private static final int PERIOD_MIN = 10;
    private DanceServer server;

    public UpdateStatus(DanceServer server) {
        super(0, PERIOD_MIN, TimeUnit.MINUTES);
        this.server = server;
    }

    @Override
    public String getName() {
        return "Update Status";
    }

    @Override
    public void execute() {
        String now = DanceServer.MySqlDateFormat.format(new Date());
        server.getDatabase().setSetting("dance_status", now);
    }
}