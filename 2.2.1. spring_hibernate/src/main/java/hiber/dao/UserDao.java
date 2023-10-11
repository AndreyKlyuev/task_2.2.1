package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    User searchByCar(String carModel, int carSeries);

    List<User> listUsers();
}
