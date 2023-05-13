package com.techsonnet.validator;

import com.techsonnet.pojo.Student;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {
    public boolean supports(Class<?> aClass) {
        // 判断是否为 Student 类型的校验器，如果此方法不通过，不会进行到第二步
        return Student.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"studentNumber",null,"学号不能为空");
        ValidationUtils.rejectIfEmpty(errors,"studentName",null,"姓名不能为空");
    }
}
