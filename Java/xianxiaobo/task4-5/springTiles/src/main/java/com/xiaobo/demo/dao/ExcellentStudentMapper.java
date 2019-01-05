package com.xiaobo.demo.dao;

import com.xiaobo.demo.pojo.ExcellentStudent;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ExcellentStudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excellent_student
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excellent_student
     *
     * @mbg.generated
     */
    int insert(ExcellentStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excellent_student
     *
     * @mbg.generated
     */
    int insertSelective(ExcellentStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excellent_student
     *
     * @mbg.generated
     */
    ExcellentStudent selectByPrimaryKey(Integer id);
    List<ExcellentStudent> selectBySalary(@Param("excellentStudent")ExcellentStudent excellentStudent,@Param("pageData")Map<String,Object> pageData);
    Integer countData(ExcellentStudent record);



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excellent_student
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ExcellentStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excellent_student
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ExcellentStudent record);
}