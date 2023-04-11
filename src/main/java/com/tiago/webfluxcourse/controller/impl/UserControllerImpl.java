package com.tiago.webfluxcourse.controller.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiago.webfluxcourse.controller.UserController;
import com.tiago.webfluxcourse.model.request.UserRequest;
import com.tiago.webfluxcourse.model.response.UserResponse;
import com.tiago.webfluxcourse.service.UserService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/users")
public class UserControllerImpl implements UserController {
	
	private final UserService service;

	@Override
	public ResponseEntity<Mono<Void>> save(UserRequest request) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(request).then());
	}

	@Override
	public ResponseEntity<Mono<UserResponse>> find(String id) {
		return null;
	}

	@Override
	public ResponseEntity<Flux<UserResponse>> findAll() {
		return null;
	}

	@Override
	public ResponseEntity<Mono<UserResponse>> update(String id, UserRequest request) {
		return null;
	}

	@Override
	public ResponseEntity<Mono<Void>> delete(String id) {
		return null;
	}

}
