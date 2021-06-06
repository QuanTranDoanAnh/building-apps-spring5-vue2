package com.quantda.taskagile.domain.application.commands;

import java.util.Objects;

import org.springframework.util.Assert;

public class RegisterCommand {

  private String username;
  private String emailAddress;
  private String password;

  public RegisterCommand(String username, String emailAddress, String password) {
    Assert.hasText(username, "Parameter `username` must not be empty");
    Assert.hasText(emailAddress, "Parameter `emailAddress` must not be empty");
    Assert.hasText(password, "Parameter `password` must not be empty");

    this.username = username;
    this.emailAddress = emailAddress;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public String getPassword() {
    return password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof RegisterCommand)) return false;
    RegisterCommand that = (RegisterCommand) o;
    return Objects.equals(username, that.username) &&
      Objects.equals(emailAddress, that.emailAddress) &&
      Objects.equals(password, that.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, emailAddress, password);
  }

  @Override
  public String toString() {
    return "RegisterCommand{" +
      "username='" + username + '\'' +
      ", emailAddress='" + emailAddress + '\'' +
      ", password='" + password + '\'' +
      '}';
  }

}
