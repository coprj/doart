package cn.com.doart.energy.service;

import lab.s2jh.core.dao.BaseDao;
import lab.s2jh.core.service.BaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.doart.energy.dao.MainDataBaseDao;
import cn.com.doart.energy.entity.MainDataBase;

@Service
@Transactional
public class MainDataBaseService extends BaseService<MainDataBase,Long>{
    
    @Autowired
    private MainDataBaseDao mainDataBaseDao;

    @Override
    protected BaseDao<MainDataBase, Long> getEntityDao() {
        return mainDataBaseDao;
    }
}
