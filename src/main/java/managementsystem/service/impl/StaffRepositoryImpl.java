package managementsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import managementsystem.entity.Staff;
import managementsystem.repository.StaffRepository;
import managementsystem.service.StaffService;

@Service
public class StaffRepositoryImpl implements StaffService {
	
	@Autowired
    private StaffRepository staffRepository;
	
	public StaffRepositoryImpl(@Lazy StaffRepository staffRepository) {
		super();
		this.staffRepository = staffRepository;
	}

	@Override
	public List<Staff> getAllStaffs() {
		return  staffRepository.findAll();
	}

	@Override
	public Staff saveStaff(Staff staff) {
		// TODO Auto-generated method stub
		return  staffRepository.save(staff);
	}

	@Override
	public Staff getStaffById(Long id) {
		// TODO Auto-generated method stub
		return staffRepository.findById(id).get();
	}

	@Override
	public Staff updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		return staffRepository.save(staff);
	}

	@Override
	public void deleteStaffById(Long id) {
		staffRepository.deleteById(id);	

	}

}
