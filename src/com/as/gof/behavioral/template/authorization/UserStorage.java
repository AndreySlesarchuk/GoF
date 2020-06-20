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

  public void initialize() {
    users.add(createPasswordUser ("user1", "login1", "password1"));
    users.add(createPasswordUser ("user2", "login2", "password2"));
    users.add(createPasswordUser ("user3", "login3", "password3"));
    users.add(createPasswordUser ("user4", "login4", "password4"));
    users.add(createPasswordUser ("user5", "login5", "password5"));
    users.add(createTokenUser("user6", "login6", 1));
    users.add(createTokenUser("user7", "login7", 2));
    users.add(createTokenUser("user8", "login8", 3));
    users.add(createTokenUser("user9", "login9", 4));
  }

  public User findUserByLoginName(String loginName){
    for (User user : users){
      if (user.getLoginName().equals(loginName)){
        return user;
      }
    }
    return null;
  }

  private static TokenUser createTokenUser(String userId, String loginName, int tokenId){
    TokenUser tokenUser = new TokenUser(userId);
    tokenUser.setLoginName(loginName);
    tokenUser.setTokenId(tokenId);
    return tokenUser;
  }

  private static PasswordUser createPasswordUser(String userId, String loginName, String password) throws UserStorageException {
    PasswordUser user = new PasswordUser(userId);
    Digest digest = createDigest(password);
    user.setLoginName(loginName);
    user.setPasswordDigest(digest.getDigest());
    user.setSalt(digest.getSalt());
    return user;
  }

  private static Digest createDigest(String password) throws UserStorageException {
    try {
      return Digester.calculateDigest(password);
    } catch (NoSuchAlgorithmException e) {
      throw new UserStorageException(e);
    } catch (UnsupportedEncodingException e) {
      throw new UserStorageException(e);
    }
  }
}
