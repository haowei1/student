package com.hdy.student.service;

import com.hdy.student.model.Student;

import java.util.List;

/**
 * @author m760384371
 * @date 2019/8/13
 */
public interface StudentService {

    /**
     * 查询全部学生
     * @return
     */
    List<Student> selAll();

    /**
     * 添加学生
     * @param stu 学生
     * @return
     */
    int insStu(Student stu);

    /**
     * 更新学生信息
     * @param stu
     * @return
     */
    int updById(Student stu);

    /**
     * 根据id进行删除
     * @param id 学生id
     * @return
     */
    int delStuById(int id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Student selById(int id);
}
