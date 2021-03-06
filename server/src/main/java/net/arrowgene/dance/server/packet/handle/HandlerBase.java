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

package net.arrowgene.dance.server.packet.handle;

import net.arrowgene.dance.server.ServerLogger;
import net.arrowgene.dance.server.client.DanceClient;
import net.arrowgene.dance.server.DanceServer;
import net.arrowgene.dance.database.Database;
import net.arrowgene.dance.log.Logger;
import net.arrowgene.dance.server.packet.ReadPacket;
import net.arrowgene.dance.server.packet.SendPacket;

public abstract class HandlerBase {

    protected DanceServer server;

    public HandlerBase(DanceServer server) {
        this.server = server;
    }

    /**
     * Handles an incoming packet.
     * <p>
     * Returning SendPacket[]
     * An array of SendPacket, where each SendPacket has a list of receivers.
     * The delivery will be handled by the system.
     * <p>
     * Returning null
     * A null implies no further actions from the system are taken.
     *
     * @param packet incoming packet
     * @param client client who send the packet
     * @return Null or SendPacket[]
     */
    public abstract SendPacket[] handle(ReadPacket packet, DanceClient client);

    /**
     * Always returns the current database instance of the server.
     */
    protected Database getDatabase() {
        return this.server.getDatabase();
    }

    /**
     * Always returns the current logger instance of the server.
     */
    protected ServerLogger getLogger() {
        return this.server.getLogger();
    }
}
