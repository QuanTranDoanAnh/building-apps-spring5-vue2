package com.quantda.taskagile.domain.application.impl;

import com.quantda.taskagile.domain.application.UserService;
import com.quantda.taskagile.domain.application.commands.RegisterCommand;
import com.quantda.taskagile.domain.model.user.RegistrationException;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Override
  public void register(RegisterCommand command) throws RegistrationException {
    // TODO Auto-generated method stub

  }

}
