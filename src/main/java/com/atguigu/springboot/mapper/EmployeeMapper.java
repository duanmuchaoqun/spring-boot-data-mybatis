package com.atguigu.springboot.mapper;

import com.atguigu.springboot.bean.Employee;

public interface EmployeeMapper {

    Employee getEmpById(Integer id);

    void insertEmp(Employee employee);

}
