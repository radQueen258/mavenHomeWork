package Repositories;

import Models.User;

import java.sql.SQLException;
import java.util.List;

public interface UserRepository {

    List findAll();
}
