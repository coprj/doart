package cn.com.doart.energy.web.action;

import lab.s2jh.core.annotation.MetaData;
import lab.s2jh.core.service.BaseService;
import lab.s2jh.core.web.PersistableController;
import lab.s2jh.core.web.view.OperationResult;

import org.apache.struts2.rest.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;

import cn.com.doart.energy.entity.MainDataBase;
import cn.com.doart.energy.service.MainDataBaseService;

@MetaData(title = "[TODO控制器名称]")
public class MainDataBaseController extends PersistableController<MainDataBase,Long> {

    @Autowired
    private MainDataBaseService mainDataBaseService;

    @Override
    protected BaseService<MainDataBase, Long> getEntityService() {
        return mainDataBaseService;
    }
    
    @Override
    protected void checkEntityAclPermission(MainDataBase entity) {
        // TODO Add acl check code logic
    }

    @MetaData(title = "[TODO方法作用]")
    public HttpHeaders todo() {
        //TODO
        setModel(OperationResult.buildSuccessResult("TODO操作完成"));
        return buildDefaultHttpHeaders();
    }
    
    @Override
    @MetaData(title = "创建")
    public HttpHeaders doCreate() {
        return super.doCreate();
    }

    @Override
    @MetaData(title = "更新")
    public HttpHeaders doUpdate() {
        return super.doUpdate();
    }

    @Override
    @MetaData(title = "删除")
    public HttpHeaders doDelete() {
        return super.doDelete();
    }

    @Override
    @MetaData(title = "查询")
    public HttpHeaders findByPage() {
        return super.findByPage();
    }
}