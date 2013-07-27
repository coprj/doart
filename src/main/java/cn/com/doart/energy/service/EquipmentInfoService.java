package cn.com.doart.energy.service;

import lab.s2jh.core.dao.BaseDao;
import lab.s2jh.core.service.BaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.doart.energy.dao.EquipmentInfoDao;
import cn.com.doart.energy.entity.EquipmentInfo;

@Service
@Transactional
public class EquipmentInfoService extends BaseService<EquipmentInfo,Long>{
    
    @Autowired
    private EquipmentInfoDao equipmentInfoDao;

    @Override
    protected BaseDao<EquipmentInfo, Long> getEntityDao() {
        return equipmentInfoDao;
    }
}
