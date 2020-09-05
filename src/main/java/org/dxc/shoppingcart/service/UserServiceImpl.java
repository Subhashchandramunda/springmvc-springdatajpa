package org.dxc.shoppingcart.service;

import org.dxc.shoppingcart.entity.User;
import org.dxc.shoppingcart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository; 

	@Override
	public void addLogin(User user) {
		
		
		userRepository.save(user);
	}

	@Override
	public void addRegister(User user) {

		userRepository.save(user);
	}

}
