package managementsystem.service;

import java.util.List;

import managementsystem.entity.Teacher;

public interface TeacherService {
    List<Teacher> getAllTeachers();
	
    Teacher saveTeacher(Teacher teacher);
	
    Teacher getTeacherById(Long id);
	
    Teacher updateTeacher(Teacher teacher);
	
	void deleteTeacherById(Long id);
}
