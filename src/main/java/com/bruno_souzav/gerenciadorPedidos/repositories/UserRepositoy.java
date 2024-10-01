package com.bruno_souzav.gerenciadorPedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno_souzav.gerenciadorPedidos.entites.User;

public interface UserRepositoy extends JpaRepository<User, Long>{

}
