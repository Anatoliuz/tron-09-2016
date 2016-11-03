package ru.mail.park.dao;

import ru.mail.park.data.UserDataSet;

public interface UserDAO {
    UserDataSet registration(UserDataSet user);

    UserDataSet getUserInfo(long userId);

    UserDataSet changeUserInfo(long userId, UserDataSet changesForUser);

    int deleteUser(long userId);

    Long getIdByLogin(String login, String password);
}
