package vn.edu.hust.listapp;

public class ContactModel {

    private String username;
    private String email;
    private int avatar;
    private String time;
    private boolean selected;

    public ContactModel(String username, String email, int avatar, String time) {
        this.username = username;
        this.email = email;
        this.avatar = avatar;
        this.time = time;
        this.selected = false;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstChar(){
        return String.valueOf(username.charAt(0));
    }
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
