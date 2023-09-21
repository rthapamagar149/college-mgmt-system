package managementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import managementsystem.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
