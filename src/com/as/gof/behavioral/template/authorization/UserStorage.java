package com.as.gof.behavioral.template.authorization;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey Slesarchuk on 06/20/2020.
 */
public class UserStorage {

  private static UserStorage ourInstance = new UserStorage();

  public static UserStorage getInstance() {
    return ourInstance;
  }

  private UserStorage() {
  }

  private List<User> users = new ArrayList<User>();

  public void initialize() throws UserStorageException {
  }

  public User findUserByLoginName(String loginName){
    for (User user : users){
      if (user.getLoginName().equals(loginName)){
        return user;
      }
    }
    return null;
  }

}
