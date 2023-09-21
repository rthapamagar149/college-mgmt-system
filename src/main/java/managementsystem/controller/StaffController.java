package managementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import managementsystem.entity.Staff;
import managementsystem.service.StaffService;


@Controller
public class StaffController {
	@Autowired
	private StaffService staffService;
	public StaffController(StaffService staffService) {
		super();
		this.staffService = staffService;
	}
	
	// handler method to handle list teachers and return mode and view
	@GetMapping("/staffs")
	public String listStaffs(Model model) {
		model.addAttribute("staffs", staffService.getAllStaffs());
		return "staffs";
	}
	
	@GetMapping("/staffs/new")
	public String createStaffForm(Model model) {
		
		// create teacher object to hold teacher form data
		Staff staff = new Staff();
		model.addAttribute("staff", staff);
		return "create_staff";
		
	}
	
	@PostMapping("/staffs")
	public String saveTeacher(@ModelAttribute("teacher") Staff staff) {
		staffService.saveStaff(staff);
		return "redirect:/staffs";
	}
	
	@GetMapping("/staffs/edit/{id}")
	public String editStaffForm(@PathVariable Long id, Model model) {
		model.addAttribute("staff", staffService.getStaffById(id));
		return "edit_staff";
	}

	@PostMapping("/staffs/{id}")
	public String updateStaff(@PathVariable Long id,
			@ModelAttribute("staff") Staff staff,
			Model model) {
		
		// get staff from database by id
		Staff existingStaff = staffService.getStaffById(id);
		existingStaff.setId(id);
		existingStaff.setFirstName(staff.getFirstName());
		existingStaff.setLastName(staff.getLastName());
		existingStaff.setAddress(staff.getAddress());
		existingStaff.setDepartment(staff.getDepartment());
		
		// save updated staff object
		staffService.updateStaff(existingStaff);
		return "redirect:/staffs";		
	}
	
	// handler method to handle delete staff request
	
	@GetMapping("/staffs/{id}")
	public String deleteStaff(@PathVariable Long id) {
		staffService.deleteStaffById(id);
		return "redirect:/staffs";
	}
}
