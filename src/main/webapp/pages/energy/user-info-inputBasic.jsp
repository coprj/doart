<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<div class="container-fluid data-edit">
    <s2:form cssClass="form-horizontal" method="post" 
          action="%{persistentedModel?'/energy/user-info!doUpdate':'/energy/user-info!doCreate'}">
    	<s:hidden name="id" />
    	<s:hidden name="version" />
        <s:token/>
        <div class="row-fluid">
            <div class="toolbar">
                <div class="toolbar-inner">
                    <button type="button" class="btn btn-submit" callback-tab="userInfoIndexTabs"
                        callback-grid="userInfoListDiv">
                        <i class="icon-ok"></i> 保存
                    </button>
                    <button type="button" class="btn btn-submit submit-post-close" callback-tab="userInfoIndexTabs"
                        callback-grid="userInfoListDiv">
                        <i class="icon-check"></i> 保存并关闭
                    </button>
                    <button type="reset" class="btn">
                        <i class="icon-repeat"></i> 重置
                    </button>
                </div>
            </div>
        </div>
        <div class="well">
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="reserve4" label="备用字段4" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="integratorName" label="集成商名称" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="contacts" label="联系人" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="reserve1" label="备用字段1" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="loginPassword" label="登录密码" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="reserve2" label="备用字段2" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="reserve3" label="备用字段3" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="companyName" label="客户单位名称" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="showTag" label="显示标签项目" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="email" label="Email" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="maintainerName" label="维护人员姓名" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="maintainerEmail" label="维护人员Email" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="id" label="主键" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="loginName" label="登陆用户名" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="deviceId" label="可查看设备ID" />
                </div>
            </div>
        </div>    
	</s2:form>
</div>