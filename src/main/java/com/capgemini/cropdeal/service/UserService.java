package com.capgemini.cropdeal.service;

import java.util.Map;
import java.util.Optional;

import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;

import com.capgemini.cropdeal.dto.LocalUser;
import com.capgemini.cropdeal.dto.SignUpRequest;
import com.capgemini.cropdeal.exception.UserAlreadyExistAuthenticationException;
import com.capgemini.cropdeal.model.User;

/**
 * @author anijai
 */
public interface UserService {

	public User registerNewUser(SignUpRequest signUpRequest) throws UserAlreadyExistAuthenticationException;

	User findUserByEmail(String email);

	Optional<User> findUserById(Long id);

	LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo);
}
