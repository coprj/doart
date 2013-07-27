package cn.com.doart.energy.service;

import lab.s2jh.core.dao.BaseDao;
import lab.s2jh.core.service.BaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.doart.energy.dao.UserInfoDao;
import cn.com.doart.energy.entity.UserInfo;

@Service
@Transactional
public class UserInfoService extends BaseService<UserInfo,Long>{
    
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    protected BaseDao<UserInfo, Long> getEntityDao() {
        return userInfoDao;
    }
}
