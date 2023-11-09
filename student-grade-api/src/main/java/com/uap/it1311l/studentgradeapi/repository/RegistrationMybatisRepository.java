package com.uap.popquiz.studentgradesapi.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.uap.popquiz.studentgradesapi.model.StudentInfo;
import com.uap.popquiz.studentgradesapi.model.StudentRatings;

@Mapper
public interface RegistrationMybatisRepository {
    @Insert({
        "INSERT INTO student_info(studentName, comment, averageGrade) VALUES (#{studentInfo.studentName}, #{studentInfo.comment}, #{studentInfo.averageGrade})",
        "INSERT INTO student_ratings(name, grade) VALUES (#{studentRatings.name}, #{studentRatings.grade})"
    })
    public int insert(@Param("studentInfo") StudentInfo studentInfo, @Param("studentRatings") StudentRatings studentRatings);
}