package managementsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import managementsystem.entity.Teacher;
import managementsystem.repository.StudentRepository;
import managementsystem.repository.TeacherRepository;
import managementsystem.service.TeacherService;
@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
    private TeacherRepository teacherRepository;
	
	public TeacherServiceImpl(TeacherRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

	@Override
	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return  teacherRepository.findAll();
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return  teacherRepository.save(teacher);
	}

	@Override
	public Teacher getTeacherById(Long id) {
		// TODO Auto-generated method stub
		return teacherRepository.findById(id).get();
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

	@Override
	public void deleteTeacherById(Long id) {
		// TODO Auto-generated method stub
		teacherRepository.deleteById(id);	
	}

}
