package ru.ncteam.levelchat.dao;

import org.hibernate.HibernateException;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ncteam.levelchat.entity.UserData;
import ru.ncteam.levelchat.entity.UserInfo;
import ru.ncteam.levelchat.utils.ApplicationUtil;
import ru.ncteam.levelchat.entity.Chat;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import java.util.List;
@Service
public class UserInfoDAO extends AbstractDAO<UserInfo, Long> {
    @Autowired
    private ApplicationUtil util;

    @Override
    public List<UserInfo> getAll() {
        return null;
    }

    @Override
    public UserInfo update(UserInfo entity) {
        return null;
    }

    @Override
    public UserInfo getEntityById(Long id) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean create(UserInfo entity) {
        return false;
    }

    @Transactional
    public UserInfo getUserInfoByLogin(String login) throws HibernateException {
        Query query = sessionFactory.getCurrentSession().createQuery(util.getStringFromFile("hql/UserInfoByLogin.hql"));
        query.setParameter("login", login);
        return (UserInfo) query.getSingleResult();
    }

    @Transactional
    public List<Chat> getUserChats(String login) throws HibernateException
    {
        Query query = sessionFactory.getCurrentSession().createQuery(util.getStringFromFile("hql/UserInfoByLogin.hql"));
        query.setParameter("login", login);
        UserInfo userInfo = (UserInfo) query.getSingleResult();
        Set<Chat> chats = userInfo.getChat();
        List<Chat> result = new CopyOnWriteArrayList<Chat>();
        result.addAll(chats);
        return result;
    }

    @Transactional
    public List<UserData> getUserData(String login) throws HibernateException
    {
        Query query = sessionFactory.getCurrentSession().createQuery(util.getStringFromFile("hql/UserInfoByLogin.hql"));
        query.setParameter("login", login);
        UserInfo userInfo = (UserInfo) query.getSingleResult();
        Set<UserData> data = userInfo.getUserData();
        List<UserData> result = new CopyOnWriteArrayList<UserData>();
        result.addAll(data);
        return result;
    }
}
