package org.xhome.ly.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.xhome.ly.common.QueryBase;

/**
 * Created by fenjuly
 * Date: 14/11/29
 * Time: 下午2:10
 */
public interface BaseService<T> {

    @Transactional(isolation= Isolation.READ_COMMITTED,rollbackFor=Throwable.class)
    public int add(T obj);

    @Transactional(isolation=Isolation.READ_COMMITTED,rollbackFor=Throwable.class)
    public int update(T obj);

    @Transactional(isolation=Isolation.READ_COMMITTED,rollbackFor=Throwable.class)
    public int delete(T obj);

    public T get(int id);

    public void query(QueryBase queryBase);

}
