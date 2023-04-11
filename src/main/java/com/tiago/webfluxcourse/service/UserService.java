package com.tiago.webfluxcourse.service;

import org.springframework.stereotype.Service;

import com.tiago.webfluxcourse.entity.User;
import com.tiago.webfluxcourse.mapper.UserMapper;
import com.tiago.webfluxcourse.model.request.UserRequest;
import com.tiago.webfluxcourse.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {
	
	
	private final UserRepository repository;
	private final UserMapper mapper;
	
	public Mono<User> save(final UserRequest request) {
		return repository.save(mapper.toEntity(request));
	}

}
