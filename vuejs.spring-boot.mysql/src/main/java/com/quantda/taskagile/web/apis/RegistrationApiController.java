package com.quantda.taskagile.web.apis;

import javax.validation.Valid;

import com.quantda.taskagile.domain.application.UserService;
import com.quantda.taskagile.domain.model.user.EmailAddressExistsException;
import com.quantda.taskagile.domain.model.user.RegistrationException;
import com.quantda.taskagile.domain.model.user.UsernameExistsException;
import com.quantda.taskagile.web.payload.RegistrationPayload;
import com.quantda.taskagile.web.results.ApiResult;
import com.quantda.taskagile.web.results.Result;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class RegistrationApiController {

  private UserService service;

  public RegistrationApiController(UserService service) {
    this.service = service;
  }

  @PostMapping("/api/registrations")
  public ResponseEntity<ApiResult> register(@Valid @RequestBody RegistrationPayload payload) {
    try {
      service.register(payload.toCommand());
      return Result.created();
    } catch (RegistrationException e) {
      String errorMessage = "Registration failed";
      if (e instanceof UsernameExistsException) {
        errorMessage = "Username already exists";
      } else if (e instanceof EmailAddressExistsException) {
        errorMessage = "Email address already exists";
      }
      return Result.failure(errorMessage);
    }
  }

}
