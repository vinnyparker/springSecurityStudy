package br.com.vinnyparker.security.repository;

import br.com.vinnyparker.security.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("select u from usuario u where u.email like :email")
    Usuario findByEmail(@Param("email") String email);
}
