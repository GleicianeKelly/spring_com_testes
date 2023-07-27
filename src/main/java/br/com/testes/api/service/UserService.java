package br.com.testes.api.service;

import br.com.testes.api.domain.User;
import br.com.testes.api.domain.dto.UserDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    public User findById(Long id);

    List<User> findAll();

    User create(UserDTO userDTO);

    User update(UserDTO userDTO);

    void delete(Long id);
}
