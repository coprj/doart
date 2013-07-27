package cn.com.doart.energy.web.action;

import lab.s2jh.core.annotation.MetaData;
import lab.s2jh.core.service.BaseService;
import lab.s2jh.core.web.PersistableController;
import lab.s2jh.core.web.view.OperationResult;

import org.apache.struts2.rest.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;

import cn.com.doart.energy.entity.UserInfo;
import cn.com.doart.energy.service.UserInfoService;

@MetaData(title = "[TODO控制器名称]")
public class UserInfoController extends PersistableController<UserInfo,Long> {

    @Autowired
    private UserInfoService userInfoService;

    @Override
    protected BaseService<UserInfo, Long> getEntityService() {
        return userInfoService;
    }
    
    @Override
    protected void checkEntityAclPermission(UserInfo entity) {
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