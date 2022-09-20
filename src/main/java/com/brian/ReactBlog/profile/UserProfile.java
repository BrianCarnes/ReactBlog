package com.brian.ReactBlog.profile;

import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Entity
@Table(name = "user")
public class UserProfile {

    @Id
    @SequenceGenerator(name = "user_profile_sequence", sequenceName = "user_profile_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_profile_sequence")
    @Column(name = "id", updatable = false)
    private long id;
    @Column(name = "firstName", nullable = false, columnDefinition = "varchar(50)")
    private String firstName;
    @Column(name = "middleName", nullable = true, columnDefinition = "TEXT")
    private String middleName;
    @Column(name = "lastName", nullable = false, columnDefinition = "TEXT")
    private String lastName;
    @Column(name = "mobile", nullable = true, columnDefinition = "TEXT")
    private String mobile;
    @Column(name = "mobile", nullable = false, columnDefinition = "TEXT", unique = true)
    private String email;
    @Column(name = "passwordHash", nullable = false, columnDefinition = "TEXT")
    private String passwordHash;
    @Column(name = "registeredAt", nullable = false, columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private DateTime registeredAt;
    @Column(name = "lastLogin", nullable = true, columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private DateTime lastLogin;
    @Column(name = "intro", nullable = true, columnDefinition = "TEXT")
    private String intro;
    @Column(name = "profile", nullable = true, columnDefinition = "TEXT")
    private String profile;
    @Column(name = "userProfileID", nullable = false, columnDefinition = "TEXT", unique = true)
    private UUID userProfileID;
    @Column(name = "username", nullable = false, columnDefinition = "TEXT", unique = true)
    private String username;
    @Column(name = "userProfileImageLink", nullable = true, columnDefinition = "TEXT")
    private String userProfileImageLink; // S3 key

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public DateTime getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(DateTime registeredAt) {
        this.registeredAt = registeredAt;
    }

    public DateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(DateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public UserProfile(UUID userProfileID,
                        String username,
                        String userProfileImageLink) {
        this.userProfileID = userProfileID;
        this.username = username;
        this.userProfileImageLink = userProfileImageLink;
    }

    public UserProfile() {

    }

    public UUID getUserProfileID() {
        return userProfileID;
    }

    public void setUserProfileID(UUID userProfileID) {
        this.userProfileID = userProfileID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Optional<String> getUserProfileImageLink() {
        return Optional.ofNullable(userProfileImageLink);
    }

    public void setUserProfileImageLink(String userProfileImageLink) {
        this.userProfileImageLink = userProfileImageLink;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(userProfileID, that.userProfileID) &&
                Objects.equals(username, that.username) &&
                Objects.equals(userProfileImageLink, that.userProfileImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileID, username, userProfileImageLink);
    }
}