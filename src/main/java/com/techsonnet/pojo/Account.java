package com.techsonnet.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @NotEmpty(message = "用户名不可为空")
    private String username;
    @NotEmpty(message = "密码不可为空")
    private String password;
}
