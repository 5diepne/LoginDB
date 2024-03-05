/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DiepTCNN
 */
public class Admin implements java.io.Serializable{
    private String user, pass;
    private int role;

    public Admin(String user, String pass, int role) {
        this.user = user;
        this.pass = pass;
        this.role = role;
    }

    public Admin() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Admin{" + "user=" + user + ", pass=" + pass + ", role=" + role + '}';
    }
    
    
}
