package com.example.demo.repositories;

import com.example.demo.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Métodos personalizados si es necesario
    @Query("SELECT u FROM Usuario u WHERE u.email = :email")
    Usuario findByEmail(String email);
}
