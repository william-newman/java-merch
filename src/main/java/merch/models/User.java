package merch.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.awt.*;


@Document(collection = "users")
public class User {

    // Fields
    @Id
    private String id;
    private String email;
    private String name;
    private String username;
    private String password;
    private Object settings;
    private Image profileImage;
    private Object shippingInfo;
    private Object billingInfo;
    private String[] friends;
    private String[] pendingFriends;

    // Constructors
    public User() {
    }

    public User(String id, String email, String name, String username, String password, Object settings, Image profileImage, Object shippingInfo, Object billingInfo, String[] friends, String[] pendingFriends) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.username = username;
        this.password = password;
        this.settings = settings;
        this.profileImage = profileImage;
        this.shippingInfo = shippingInfo;
        this.billingInfo = billingInfo;
        this.friends = friends;
        this.pendingFriends = pendingFriends;
    }

    public User(String email, String name, String username, String password, Object settings, Image profileImage, Object shippingInfo, Object billingInfo, String[] friends, String[] pendingFriends) {
        this.email = email;
        this.name = name;
        this.username = username;
        this.password = password;
        this.settings = settings;
        this.profileImage = profileImage;
        this.shippingInfo = shippingInfo;
        this.billingInfo = billingInfo;
        this.friends = friends;
        this.pendingFriends = pendingFriends;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Object getSettings() {
        return settings;
    }

    public void setSettings(Object settings) {
        this.settings = settings;
    }

    public Image getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(Image profileImage) {
        this.profileImage = profileImage;
    }

    public Object getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(Object shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public Object getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(Object billingInfo) {
        this.billingInfo = billingInfo;
    }

    public String[] getFriends() {
        return friends;
    } // womp womp

    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    public String[] getPendingFriends() {
        return pendingFriends;
    }

    public void setPendingFriends(String[] pendingFriends) {
        this.pendingFriends = pendingFriends;
    }
}
