package com.bcp.authservice.service;

import com.bcp.authservice.dto.AuthUserDto;
import com.bcp.authservice.dto.TokenDto;
import com.bcp.authservice.entity.AuthUser;
import com.bcp.authservice.repository.AuthUserRepository;
import com.bcp.authservice.security.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthUserService {

	@Autowired
	AuthUserRepository authUserRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	JwtProvider jwtProvider;

	public AuthUser save(AuthUserDto dto) {
		Optional<AuthUser> user = authUserRepository.findByUserName(dto.getUserName());
		if (user.isPresent())
			return null;
		String password = passwordEncoder.encode(dto.getPassword());
		AuthUser authUser = new AuthUser();
		authUser.setUserName(dto.getUserName());
		authUser.setPassword(password);
		return authUserRepository.save(authUser);
	}

	public TokenDto login(AuthUserDto dto) {
		Optional<AuthUser> user = authUserRepository.findByUserName(dto.getUserName());
		if (!user.isPresent())
			return null;
		if (passwordEncoder.matches(dto.getPassword(), user.get().getPassword()))
			return new TokenDto(jwtProvider.createToken(user.get()));
		return null;
	}

	public TokenDto validate(String token) {
		if (!jwtProvider.validate(token))
			return null;
		String username = jwtProvider.getUserNameFromToken(token);
		if (!authUserRepository.findByUserName(username).isPresent())
			return null;
		return new TokenDto(token);
	}
}
