package cn.com.doart.energy.dao;

import lab.s2jh.core.dao.BaseDao;

import org.springframework.stereotype.Repository;

import cn.com.doart.energy.entity.UserInfo;

@Repository
public interface UserInfoDao extends BaseDao<UserInfo, Long> {

}