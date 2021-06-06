package com.quantda.taskagile.domain.application;

import com.quantda.taskagile.domain.application.commands.RegisterCommand;
import com.quantda.taskagile.domain.model.user.RegistrationException;

public interface UserService {

  /**
   * Register a new user with username, email address, and password.
   *
   * @param command instance of <code>RegisterCommand</code>
   * @throws RegistrationException when registration failed. Possible reasons are:
   *                               1) Username already exists
   *                               2) Email address already exists.
   */
  void register(RegisterCommand command) throws RegistrationException;
}
