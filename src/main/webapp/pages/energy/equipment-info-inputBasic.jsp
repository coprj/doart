<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<div class="container-fluid data-edit">
    <s2:form cssClass="form-horizontal" method="post" 
          action="%{persistentedModel?'/energy/equipment-info!doUpdate':'/energy/equipment-info!doCreate'}">
    	<s:hidden name="id" />
    	<s:hidden name="version" />
        <s:token/>
        <div class="row-fluid">
            <div class="toolbar">
                <div class="toolbar-inner">
                    <button type="button" class="btn btn-submit" callback-tab="equipmentInfoIndexTabs"
                        callback-grid="equipmentInfoListDiv">
                        <i class="icon-ok"></i> 保存
                    </button>
                    <button type="button" class="btn btn-submit submit-post-close" callback-tab="equipmentInfoIndexTabs"
                        callback-grid="equipmentInfoListDiv">
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
                    <s2:textfield name="simCardNum" label="远程通讯单元sim卡号码" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="fanThreeNum" label="风机3序列号" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="uniwaferNum" label="单片PV板数量" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="batteryCapacity" label="电池组总容量" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="equipmentId" label="设备ID" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="fanFourNum" label="风机4序列号" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="gearReductionRatio" label="变速机减速比" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="fanOneLocation" label="风机1安装位置" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="fanFiveNum" label="风机4序列号" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="uniwaferPower" label="单片PV板功率" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="mountingPointName" label="安装点别称" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="fanTwoNum" label="风机2序列号" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="mtkjqWay" label="太阳能控制器实际使用路数" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="cableLength" label="电缆长度" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="reserve" label="备用字段1" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="fanFiveLocation" label="风机5安装位置" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="installCounty" label="安装地所在县" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="reserve5" label="备用字段5" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="reserve4" label="备用字段4" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="reserve6" label="备用字段6" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="fanInstallNum" label="风机安装数量" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="reserve3" label="备用字段3" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="runningTime" label="投入运行时间" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="reserve2" label="备用字段2" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="fanTwoLocation" label="风机2安装位置" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="fanOneNum" label="风机1序列号" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="fanFourLocation" label="风机4安装位置" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="cableDiameter" label="电缆直径" />
                </div>
            </div>
            <div class="row-fluid">
                <div class="span6">
                    <s2:textfield name="fanThreeLocation" label="风机3安装位置" />
                </div>
            </div>
        </div>    
	</s2:form>
</div>