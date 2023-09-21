package managementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import managementsystem.entity.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long> {

}
