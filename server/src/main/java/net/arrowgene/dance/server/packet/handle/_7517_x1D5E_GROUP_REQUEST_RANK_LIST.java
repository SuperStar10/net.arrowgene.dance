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

import net.arrowgene.dance.library.models.group.Group;
import net.arrowgene.dance.library.models.group.GroupSortScore;
import net.arrowgene.dance.server.client.DanceClient;
import net.arrowgene.dance.server.DanceServer;
import net.arrowgene.dance.server.packet.PacketType;
import net.arrowgene.dance.server.packet.ReadPacket;
import net.arrowgene.dance.server.packet.SendPacket;

import java.util.List;


public class _7517_x1D5E_GROUP_REQUEST_RANK_LIST extends HandlerBase {

    public _7517_x1D5E_GROUP_REQUEST_RANK_LIST(DanceServer server) {
        super(server);
    }

    @Override
    public SendPacket[] handle(ReadPacket packet, DanceClient client) {

        List<Group> groups = super.server.getGroupManager().getGroups();
        groups.sort(new GroupSortScore());

        SendPacket answerPacket = new SendPacket(PacketType.GROUP_RESPONSE_RANK_LIST);
        answerPacket.addByte(0);
        answerPacket.addInt32(groups.size());
        for (Group group : groups) {
            answerPacket.addInt16(group.getIcon());
            answerPacket.addStringNulTerminated(group.getName());
            answerPacket.addInt16(group.getMembers().size()); //member count
            answerPacket.addInt32(group.getScore());
            answerPacket.addStringNulTerminated(group.getCreationDateString());
        }
        answerPacket.addByte(0);

        client.sendPacket(answerPacket);

        return null;
    }
}
