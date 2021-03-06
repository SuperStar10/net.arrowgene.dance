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

package net.arrowgene.dance.server.packet;

public enum PacketType {
    // Login
    LOGIN_REQUEST_AUTHENTICATION(1000),
    LOGIN_RESPONSE_AUTHENTICATION(1001),
    LOGIN_REQUEST_CHANNEL_LIST(1002),
    LOGIN_RESPONSE_CHANNEL_LIST(1003),
    LOGIN_REQUEST_ENTER_LOBBY_FROM_CHANNEL_SELECTION(1004),
    LOGIN_RESPONSE_ENTER_LOBBY_FROM_CHANNEL_SELECTION(1005),
    LOGIN_REQUEST_CONTROLLER(1007),   //0x3ef
    LOGIN_RESPONSE_CONTROLLER(1008),   //0x3f0
    LOGIN_REQUEST_ENTER_CHANNEL_SELECTION_FROM_LOBBY(1009),
    LOGIN_RESPONSE_ENTER_CHANNEL_SELECTION_FROM_LOBBY(1010), //0x3f2
    LOGIN_REQUEST_DANCE_LESSON(1011),
    LOGIN_RESPONSE_DANCE_LESSON(1012),
    LOGIN_REQUEST_CREATE_CHARACTER(1015), //0x3f7
    LOGIN_RESPONSE_CREATE_CHARACTER(1016), //0x3f8

    // Lobby
    LOBBY_REQUEST_CHARACTER_INFO(2000),
    LOBBY_RESPONSE_CHARACTER_INFO(2001), //0x7D1
    LOBBY_REQUEST_ROOM_LIST(2002),
    LOBBY_RESPONSE_ROOM_LIST(2003), //0x7d3
    LOBBY_REQUEST_CREATE_ROOM(2004),
    LOBBY_RESPONSE_CREATE_ROOM(2005), //0x7d5
    LOBBY_RESPONSE_ANNOUNCE_ROOM(2006), //0x7d6
    LOBBY_RESPONSE_REMOVE_ROOM(2007),
    LOBBY_REQUEST_ALL_LIST(2010),
    LOBBY_RESPONSE_ALL_LIST(2011), //0x7DB
    LOBBY_REQUEST_MESSAGE_CHANNEL(2012),
    LOBBY_RESPONSE_MESSAGE_CHANNEL(2013), //0x7dd
    LOBBY_REQUEST_MESSAGE_PRIVATE(2017),
    LOBBY_RESPONSE_MESSAGE_PRIVATE(2018), //0x7e2
    LOBBY_RESPONSE_CHANNEL_USER_NEW(2026),
    LOBBY_RESPONSE_CHANNEL_USER_LEAVE(2027),
    LOBBY_RESPONSE_LIST_USER_UPDATE(2028), // User joined Room
    LOBBY_REQUEST_PING(2029), //0x7ED
    LOBBY_RESPONSE_PING(2030), //0x7EE
    LOBBY_REQUEST_BUDDY_LIST(2031),
    LOBBY_RESPONSE_BUDDY_LIST(2032), //0x7f0
    LOBBY_REQUEST_BUDDY_ADD(2033), //0x7f1
    LOBBY_RESPONSE_BUDDY_ADD(2034),
    LOBBY_REQUEST_BUDDY_DELETE(2035),
    LOBBY_RESPONSE_BUDDY_DELETE(2036),
    LOBBY_REQUEST_ABOUT_ME(2037),
    LOBBY_RESPONSE_ABOUT_ME(2038), //0x7f6
    LOBBY_REQUEST_SAVE_SETTINGS(2039),
    LOBBY_RESPONSE_SAVE_SETTINGS(2040),  //0x7F8
    LOBBY_REQUEST_LOAD_SETTINGS(2041),
    LOBBY_RESPONSE_LOAD_SETTINGS(2042), //0x7FA
    LOBBY_REQUEST_SAVE_CHARACTER_SETTINGS(2043), //0x7FB
    LOBBY_REQUEST_ROOM_TIP(2048),
    LOBBY_RESPONSE_ROOM_TIP(2049), //0x801
    LOBBY_RESPONSE_MESSAGE_WORLD(2053),
    LOBBY_REQUEST_TOP_MESSAGE_PLAYER_TO_PLAYER(2054),
    LOBBY_RESPONSE_TOP_MESSAGE_PLAYER_TO_PLAYER(2055),
    LOBBY_RESPONSE_UNKOWN(2056),
    LOBBY_REQUEST_INVITE_USER(2057),
    LOBBY_RESPONSE_INVITE_USER(2058),
    LOBBY_REQUEST_BLACKLIST_LIST(2059),
    LOBBY_RESPONSE_BLACKLIST_LIST(2060), //0x80c
    LOBBY_REQUEST_BLACKLIST_ADD(2061), //0x80D
    LOBBY_REQUEST_ENTER_CHANNEL_SELECTION_FROM_LOGIN(2066),
    LOBBY_RESPONSE_ENTER_CHANNEL_SELECTION_FROM_LOGIN(2067),

    LOBBY_REQUEST_UNKNOW_5(2008),
    LOBBY_REQUEST_UNKNOW_6(2009),
    LOBBY_REQUEST_UNKNOW_7(2014),
    LOBBY_REQUEST_UNKNOW_8(2015),
    LOBBY_REQUEST_UNKNOW_9(2016),
    LOBBY_REQUEST_UNKNOW_10(2019),
    LOBBY_REQUEST_UNKNOW_11(2020), // ROOM UPDATE FOR CHANNEL
    LOBBY_REQUEST_UNKNOW_12(2021),
    LOBBY_REQUEST_UNKNOW_13(2022),
    LOBBY_REQUEST_UNKNOW_14(2023),
    LOBBY_REQUEST_UNKNOW_15(2024),
    LOBBY_REQUEST_UNKNOW_16(2025),
    LOBBY_REQUEST_UNKNOW_20(2036),
    LOBBY_REQUEST_UNKNOW_21(2044),
    LOBBY_REQUEST_UNKNOW_22(2045),
    LOBBY_REQUEST_UNKNOW_23(2046),
    LOBBY_REQUEST_UNKNOW_24(2047),
    LOBBY_REQUEST_UNKNOWN_1(2071),
    LOBBY_RESPONSE_UNKNOWN_1(2072),
    LOBBY_REQUEST_UNKNOWN_2(2077),
    LOBBY_RESPONSE_UNKNOWN_2(2078),

    // Competition
    LOBBY_REQUEST_COMPETITON_UNKNOWN_1(2500),
    LOBBY_RESPONSE_COMPETITON_UNKNOWN_1(2501),
    LOBBY_REQUEST_COMPETITON_JACKPOT(2509),
    LOBBY_RESPONSE_COMPETITON_JACKPOT(2510),

    // Room
    ROOM_REQUEST_CHANGE_ROOMNAME(3000),
    ROOM_RESPONSE_CHANGE_ROOMNAME(3001),
    ROOM_REQUEST_JOIN_ROOM(3002),
    ROOM_RESPONSE_JOIN_ROOM(3003),//0xBBB
    ROOM_RESPONSE_JOIN_ANNOUNCE(3004),
    ROOM_REQUEST_ENTER_LOBBY_FROM_ROOM(3005),
    ROOM_RESPONSE_ENTER_LOBBY_FROM_ROOM(3006), //0xBBE
    ROOM_RESPONSE_LEAVE_ANNOUNCE(3007),
    ROOM_REQUEST_MESSAGE_ROOM(3011),
    ROOM_RESPONSE_MESSAGE_ROOM(3012),
    ROOM_REQUEST_JOIN_ROOM_AFTER_GAME(3013),
    ROOM_RESPONSE_JOIN_ROOM_AFTER_GAME(3014),
    ROOM_REQUEST_ADD_FAVORITE_SONG(3015),
    ROOM_REQUEST_DELETE_FAVORITE_SONG(3017),
    ROOM_REQUEST_FAVORITE_SONG_LIST(3019),
    ROOM_RESPONSE_FAVORITE_SONG_LIST(3020),
    ROOM_REQUEST_SET_VIEWER(3021),
    ROOM_RESPONSE_SET_VIEWER(3022),
    ROOM_REQUEST_FORMATION(3025),
    ROOM_RESPONSE_FORMATION(3026),
    ROOM_REQUEST_NUMBER_OF_VIEWERS(3027),
    ROOM_REQUEST_ENTER_ROOM_1(3028),
    ROOM_RESPONSE_ENTER_ROOM_1(3029), //0xBD5

    // Gamble
    GAMBLE_REQUEST_START(3500),
    GAMBLE_RESPONSE_START(3501),

    // Game
    GAME_REQUEST_CHANGE_SONG(4000), //0xfa0
    GAME_RESPONSE_CHANGE_SONG(4001), //0xFA1
    GAME_REQUEST_BACKGROUND(4002),
    GAME_RESPONSE_BACKGROUND(4003),//0xFA3
    GAME_REQUEST_CHANGE_TEAM(4004),
    GAME_RESPONSE_CHANGE_TEAM(4005),
    GAME_REQUEST_GAMEMODE(4006),
    GAME_RESPONSE_GAMEMODE(4007),
    GAME_REQUEST_READY(4008),
    GAME_RESPONSE_READY(4009),
    GAME_REQUEST_START_GAME(4010),
    GAME_RESPONSE_START_GAME(4011), //0xFAB
    GAME_REQUEST_GAME_STATS(4014),
    GAME_RESPONSE_GAME_STATS(4015), //0xFAF
    GAME_REQUEST_LOAD_STATS(4016),
    GAME_RESPONSE_GAME_ENDED(4017),
    GAME_RESPONSE_SEND_FINALSCREEN(4018),
    GAME_REQUEST_LOADING_READY(4027),
    GAME_RESPONSE_LOADING_READY(4028),
    GAME_REQUEST_WALK(4033),
    GAME_RESPONSE_WALK(4034), //0xFC2
    GAME_REQUEST_ENTER_ROOM_3(4039),
    GAME_RESPONSE_ENTER_ROOM_3(4040), //0xFC8
    GAME_REQUEST_BREAK_COMBO(4044), //0xFCC
    GAME_RESPONSE_BREAK_COMBO(4045), //0xFCD

    // Shop
    SHOP_REQUEST_BUY_ITEM(5002),
    SHOP_RESPONSE_BUY_ITEM(5003),
    SHOP_REQUEST_DELETE_ITEM(5004),
    SHOP_RESPONSE_DELETE_ITEM(5005),
    SHOP_REQUEST_DESTROY_ITEM(5006),
    SHOP_RESPONSE_DESTROY_ITEM(5007),
    SHOP_REQUEST_GIFT_ITEM(5008),
    SHOP_RESPONSE_GIFT_ITEM(5009),
    SHOP_REQUEST_ENTER(5012),
    SHOP_RESPONSE_ENTER(5013),
    SHOP_REQUEST_PAY_BILL_EMAIL(5018),
    SHOP_RESPONSE_PAY_BILL_EMAIL(5019),

    // Mail
    MAIL_REQUEST_MAIL_LIST(6000),
    MAIL_RESPONSE_MAIL_LIST(6001),
    MAIL_REQUEST_READ_MAIL(6002),
    MAIL_RESPONSE_READ_MAIL(6003),
    MAIL_REQUEST_SEND_MAIL(6004),
    MAIL_RESPONSE_SEND_MAIL(6005),
    MAIL_REQUEST_DELETE_ONE(6006),
    MAIL_RESPONSE_DELETE_ONE(6007),
    MAIL_REQUEST_DELETE_ALL(6008),
    MAIL_RESPONSE_DELETE_ALL(6009),
    MAIL_REQUEST_ACCEPT_GIFT(6012),
    MAIL_RESPONSE_ACCEPT_GIFT(6013),

    // Wedding
    WEDDING_REQUEST_PROPOSE(6500),
    WEDDING_RESPONSE_PROPOSE(6501),
    WEDDING_REQUEST_MAIL_DECISION(6502),
    WEDDING_RESPONSE_MAIL_DECISION(6503),
    WEDDING_REQUEST_CANCEL_APPLICATION(6504),
    WEDDING_RESPONSE_CANCEL_APPLICATION(6505),
    WEDDING_REQUEST_CHANGE_RING(6506),
    WEDDING_RESPONSE_CHANGE_RING(6507),
    WEDDING_REQUEST_MAIL_CHANGE_RING(6510),
    WEDDING_RESPONSE_MAIL_CHANGE_RING(6511),
    WEDDING_REQUEST_MY_APPLICATION(6512),
    WEDDING_RESPONSE_MY_APPLICATION(6513),

    // Item
    ITEM_REQUEST_ITEM_LIST(7000),
    ITEM_RESPONSE_ITEM_LIST(7001), //0x1b59
    ITEM_REQUEST_DRESS_ITEM(7002),
    ITEM_RESPONSE_DRESS_ITEM(7003),
    ITEM_REQUEST_EXPAND_STORAGE(7008),
    ITEM_RESPONSE_EXPAND_STORAGE(7009),
    ITEM_REQUEST_ITEM_UNKNOWN_1(7012), //0x1b64
    ITEM_RESPONSE_ITEM_UNKNOWN_1(7013), //0x1b65
    ITEM_REQUEST_ITEM_UNKNOWN_2(7014), //0x1b66
    ITEM_RESPONSE_ITEM_UNKNOWN_2(7015), //0x1b67

    // Group
    GROUP_REQUEST_AGREEMENT(7500),
    GROUP_RESPONSE_AGREEMENT(7501),
    GROUP_REQUEST_CREATE(7502),
    GROUP_RESPONSE_CREATE(7503),
    GROUP_REQUEST_DETAILS(7504),
    GROUP_RESPONSE_DETAILS(7505),
    GROUP_REQUEST_LEAVE(7506),
    GROUP_RESPONSE_LEAVE(7507),
    GROUP_REQUEST_MEMBER_LIST(7508),
    GROUP_RESPONSE_MEMBER_LIST(7509),
    GROUP_REQUEST_JOIN(7510),
    GROUP_RESPONSE_JOIN(7511),
    GROUP_REQUEST_DISMISS(7512),
    GROUP_RESPONSE_DISMISS(7513),
    GROUP_REQUEST_RULE_APPLICANT(7514),
    GROUP_RESPONSE_RULE_APPLICANT(7515),
    GROUP_REQUEST_INFO(7516),
    GROUP_RESPONSE_INFO(7517),
    GROUP_REQUEST_RANK_LIST(7518),
    GROUP_RESPONSE_RANK_LIST(7519),
    GROUP_REQUEST_COUNTS(7523),
    GROUP_RESPONSE_COUNTS(7524),
    GROUP_REQUEST_CHECK_NAME(7525),
    GROUP_RESPONSE_CHECK_NAME(7526),
    GROUP_REQUEST_SEARCH_GROUP(7527),
    GROUP_RESPONSE_SEARCH_GROUP(7528),
    GROUP_REQUEST_CANCEL_APPLICATION(7531),
    GROUP_RESPONSE_CANCEL_APPLICATION(7532),
    GROUP_REQUEST_REWRITE_BOARD(7533),
    GROUP_RESPONSE_REWRITE_BOARD(7534),

    ITEM_REQUEST_UNKNOWN_UNKNOWN_1(9000), //0x2328
    ITEM_RESPONSE_UNKNOWN_UNKNOWN_1(9001), //0x2329

    AWAY_REQUEST(10001);

    private int numValue;

    PacketType(int numValue) {
        this.numValue = numValue;
    }

    public int getNumValue() {
        return numValue;
    }

    public static PacketType getType(int id) {
        for (PacketType pt : PacketType.values()) {
            if (pt.getNumValue() == id) {
                return pt;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(name() + " (" + getNumValue() + ")");

        return sb.toString();
    }
}
