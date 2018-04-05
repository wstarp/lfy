package com.tech.lfy.common;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.dao.DataAccessException;

import java.util.ArrayList;
import java.util.List;


public class BaseDao<T extends Object> extends SqlSessionDaoSupport {

    /**
     * 新增对象
     *
     * @param classMethod ： MyBatis xml 配置文件中的SQL - Key
     * @param entity      ： 需要进行新增的Bean对象
     * @return true ： 成功   false ： 失败
     * @throws org.springframework.dao.DataAccessException
     */
    public boolean insert(String classMethod, T entity) throws DataAccessException {
        boolean flag = false;
        try {
            flag = this.getSqlSession().insert(classMethod, entity) > 0 ? true : false;
        } catch (DataAccessException e) {
            flag = false;
            throw e;
        }
        return flag;
    }

    /**
     * 返回新增的对象
     *
     * @param classMethod ： MyBatis xml 配置文件中的SQL - Key
     * @param entity      ： 需要进行新增的Bean对象
     * @return true ： 成功   false ： 失败
     * @throws org.springframework.dao.DataAccessException
     */
    public T insertGetKey(String classMethod, T entity) throws DataAccessException {
        boolean flag = false;
        try {
            flag = this.getSqlSession().insert(classMethod, entity) > 0 ? true : false;
        } catch (DataAccessException e) {
            flag = false;
            throw e;
        }
        return entity;
    }

    /**
     * 更新数据
     *
     * @param classMethod ： MyBatis xml 配置文件中的SQL - Key
     * @param entity      ： 需要进行更新的Bean对象
     * @return true ： 成功   false ： 失败
     * @throws org.springframework.dao.DataAccessException
     */
    public boolean update(String classMethod, T entity) throws DataAccessException {
        boolean flag = false;
        try {
            flag = this.getSqlSession().update(classMethod, entity) > 0 ? true : false;
        } catch (DataAccessException e) {
            flag = false;
            throw e;
        }
        return flag;
    }

    /**
     * 查询一条记录
     *
     * @param classMethod ： MyBatis xml 配置文件中的SQL - Key
     * @param entity      ： 查询参数对象，可以是自定义的查询对象
     * @return 返回一个对象
     * @throws org.springframework.dao.DataAccessException
     */
    public Object queryCountForObject(String classMethod, Object entity) throws DataAccessException {
        Object result = null;
        try {
            result = (Object) this.getSqlSession().selectOne(classMethod, entity);
        } catch (DataAccessException e) {
            throw e;
        }
        return result;
    }

    /**
     * 查询一条记录，一版用在返回Count的时候
     *
     * @param classMethod ： MyBatis xml 配置文件中的SQL - Key
     * @param entity      ： 查询参数对象，可以是自定义的查询对象
     * @return 返回一个对象（建议用Integer）
     * @throws org.springframework.dao.DataAccessException
     */
    public T queryForObject(String classMethod, T entity) throws DataAccessException {
        T result = null;
        try {
            result = (T) this.getSqlSession().selectOne(classMethod, entity);
        } catch (DataAccessException e) {
            throw e;
        }
        return result;
    }

    /**
     * 查询一组记录
     *
     * @param classMethod ： MyBatis xml 配置文件中的SQL - Key
     * @param entity      查询参数对象，可以是自定义的查询对象
     * @return 返回一组对象
     * @throws org.springframework.dao.DataAccessException
     */
    public List<T> queryForList(String classMethod, T entity) throws DataAccessException {
        List<T> result = new ArrayList<T>();
        try {
            result = this.getSqlSession().selectList(classMethod, entity);
        } catch (DataAccessException e) {
            throw e;
        }
        return result;
    }

    /**
     * 查询一组记录
     *
     * @param classMethod ： MyBatis xml 配置文件中的SQL - Key
     * @return 返回一组对象
     * @throws org.springframework.dao.DataAccessException
     */
    public List<T> queryForList(String classMethod) throws DataAccessException {
        List<T> result = new ArrayList<T>();
        try {
            result = this.getSqlSession().selectList(classMethod);
        } catch (DataAccessException e) {
            throw e;
        }
        return result;
    }

    /**
     * 删除
     *
     * @param classMethod : MyBatis xml 配置文件中的SQL - Key
     * @param entity      可以传入需要删除的记录对象,也可以只传入一个ID字段，可以根据SQL语句自行组合
     * @return ： 成功   false ： 失败
     * @throws Exception
     */
    public boolean delete(String classMethod, T entity) throws DataAccessException {
        boolean flag = false;
        try {
            flag = this.getSqlSession().delete(classMethod, entity) > 0 ? true : false;
        } catch (DataAccessException e) {
            flag = false;
            throw e;
        }
        return flag;
    }

    public List<T> queryListByPage(String classMethod, Object entity, int page, int pageSize) throws DataAccessException {

        return this.getSqlSession().selectList(classMethod, entity,
                new RowBounds((page - 1) * pageSize, pageSize));

    }

}
