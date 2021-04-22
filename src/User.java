public class User {
    private int UserId ;
    private String UserName ;
    private String Email;

    public int getUserId() {
        return UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public String getEmail() {
        return Email;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public User(int userId, String userName, String email) {
        UserId = userId;
        UserName = userName;
        Email = email;
    }
}
