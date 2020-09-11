package com.czw.crudproject.mapper;

import com.czw.crudproject.entity.UserEntity;
import java.util.List;


public interface CRUDMapper {
    List<UserEntity> selectUser();
}
