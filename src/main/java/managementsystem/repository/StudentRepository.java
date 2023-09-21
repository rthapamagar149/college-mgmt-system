package managementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import managementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
