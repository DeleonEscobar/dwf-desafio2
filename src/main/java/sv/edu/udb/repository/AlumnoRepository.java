package sv.edu.udb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.entity.Alumno;

// Repositorio para la entidad Alumno que permite realizar operaciones CRUD
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
}
