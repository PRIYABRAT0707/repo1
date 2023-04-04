package org.johnwick.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity(name = "MEMBER_DETAILS")
public class Member implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MEMBER_ID")
    private int mid;
    @Column(name = "MEMBER_USENAME")
    private String userName;
    @Column(name = "MEMBER_PASSWORD")
    private String password;
    @Column(name = "ACCOUNT_NOT_LOCKED")
    private boolean accountNotLocked;
    public Member(int mid, String userName, String password, boolean accountNotLocked) {
        this.mid = mid;
        this.userName = userName;
        this.password = password;
        this.accountNotLocked = accountNotLocked;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAccountNotLocked() {
        return accountNotLocked;
    }

    public void setAccountNotLocked(boolean accountNotLocked) {
        this.accountNotLocked = accountNotLocked;
    }

    public Member() {
    }

    @Override
    public String toString() {
        return "Member{" +
                "mid=" + mid +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", accountNotLocked=" + accountNotLocked +
                '}';
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(()->"read");
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNotLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }






}
