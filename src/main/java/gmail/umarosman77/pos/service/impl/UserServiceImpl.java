package gmail.umarosman77.pos.service.impl;

import gmail.umarosman77.pos.entities.UserEntity;
import gmail.umarosman77.pos.pojo.User;
import gmail.umarosman77.pos.repo.UserRepository;
import gmail.umarosman77.pos.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User addUser(User user) {
		ModelMapper modelMapper = new ModelMapper();
		UserEntity userEntity = modelMapper.map(user, UserEntity.class);
		UserEntity savedEntity = userRepository.save(userEntity);
		return modelMapper.map(savedEntity, User.class);
	}

	@Override
	public User getUser(Long id) {
		ModelMapper modelMapper = new ModelMapper();
		UserEntity userEntity = userRepository.getReferenceById(id);
		return modelMapper.map(userEntity, User.class);
	}

	@Override
	public User disableUser(Long id) {
		//TODO Umar - Implement method
		return null;
	}
}
