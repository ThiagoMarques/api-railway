package dio.apirestsantander.service.impl;

import org.springframework.stereotype.Service;

import dio.apirestsantander.domain.model.User;
import dio.apirestsantander.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    //Evita expor interface User

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public User create(User userToCreate) {
        return null;
    }
}
