package ru.mail.park.dao;

import ru.mail.park.data.UserDataSet;

public interface UserDAO {
    UserDataSet registration(UserDataSet user);

    UserDataSet getUserInfo(long userId, String sessionId);

    UserDataSet changeUserInfo(long userId, UserDataSet changesForUser, String sessionId);

    int deleteUser(long userId, String sessionId);

    Long getIdByLogin(UserDataSet user);
}
