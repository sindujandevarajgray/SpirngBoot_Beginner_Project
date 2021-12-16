package com.gray.starter.springbootbeginprjct.Utils;

import org.springframework.beans.BeanUtils;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 12/16/2021
 * Time: 8:51 AM
 * SpringBoot-BeginPrjct
 */
public interface Transform {

    default <T> T toDto (Class<T> type){
        T dto = BeanUtils.instantiateClass(type);
        BeanUtils.copyProperties(this, dto);
        return dto;
    }
    default <T> T toEntity (Class<T> type){
        T entity = BeanUtils.instantiateClass(type);
        BeanUtils.copyProperties(this, entity);
        return entity;
    }
}
