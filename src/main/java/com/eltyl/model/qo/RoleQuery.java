package com.eltyl.model.qo;

import lombok.Data;

@Data
public class RoleQuery {
    private Integer pageNo;
    private Integer pageSize;
    private String roleName;
}
