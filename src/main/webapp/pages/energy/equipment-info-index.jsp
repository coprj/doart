<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/common/index-header.jsp"%>
</head>
<body>
    <div class="container-fluid">
        <s2:tabbedpanel id="equipmentInfoIndexTabs">
            <ul>
                <li><a href="#equipmentInfoIndexListTab"><span>列表查询</span></a></li>
            </ul>
            <div id="equipmentInfoIndexListTab">
                <div class="row-fluid">
                    <div class="toolbar">
                        <div class="toolbar-inner">
                            <button type="button" class="btn" id="equipmentInfoAddBtn">
                                <i class="icon-plus-sign"></i> 添加
                            </button>
                            <button type="button" class="btn" id="equipmentInfoDeleteBtn">
                                <i class="icon-trash"></i> 删除
                            </button>
                            <div class="btn-group pull-right">
                                <button type="button" class="btn" title="高级查询"
                                    onclick="$('#userListDiv').jqGrid('advSearch');">
                                    <i class="icon-search"></i>
                                </button>
                            </div>                            
                        </div>
                    </div>
                </div>
                <div class="row-fluid">
                    <table id="equipmentInfoListDiv"></table>
                    <div id="equipmentInfoListDivPager"></div>
                </div>
            </div>
        </s2:tabbedpanel>
    </div>                    
	<%@ include file="/common/index-footer.jsp"%>
    <script type="text/javascript">
        $(function() {
            $("#equipmentInfoListDiv").grid({
                url: '${base}/energy/equipment-info!findByPage',
                colNames : [ '操作','远程通讯单元sim卡号码','风机3序列号','单片PV板数量','电池组总容量','设备ID','风机4序列号','变速机减速比','风机1安装位置','风机4序列号','单片PV板功率','安装点别称','风机2序列号','太阳能控制器实际使用路数','电缆长度','备用字段1','风机5安装位置','安装地所在县','备用字段5','备用字段4','备用字段6','风机安装数量','备用字段3','投入运行时间','备用字段2','风机2安装位置','风机1序列号','风机4安装位置','电缆直径','风机3安装位置','创建时间','版本号'],
                colModel : [ {
                    name : 'operation',
                    align : 'center',
                    fixed : true,
                    sortable : false,
                    hidedlg : true,
                    search : false,
                    width : 40,
                    formatter : function(cellValue, options, rowdata, action) {
                        return $.jgrid.buildButtons([ {
                            title : "编辑",
                            icon : "ui-icon-pencil",
                            onclick : "$('#" + $(this).attr("id") + "').jqGrid('editRow','" + rowdata.id + "')"
                        }, {
                            title : "查看",
                            icon : "ui-icon-folder-open",
                            onclick : "$.popupViewDialog('${base}/energy/equipment-info!viewTabs?id=" + options.rowId + "')"
                        } ]);
                    }                 
                }, {
                    name : 'simCardNum',
                    align : 'left'
                }, {
                    name : 'fanThreeNum',
                    align : 'left'
                }, {
                    name : 'uniwaferNum',
                    align : 'left'
                }, {
                    name : 'batteryCapacity',
                    align : 'left'
                }, {
                    name : 'equipmentId',
                    align : 'left'
                }, {
                    name : 'fanFourNum',
                    align : 'left'
                }, {
                    name : 'gearReductionRatio',
                    align : 'left'
                }, {
                    name : 'fanOneLocation',
                    align : 'left'
                }, {
                    name : 'fanFiveNum',
                    align : 'left'
                }, {
                    name : 'uniwaferPower',
                    align : 'left'
                }, {
                    name : 'mountingPointName',
                    align : 'left'
                }, {
                    name : 'fanTwoNum',
                    align : 'left'
                }, {
                    name : 'mtkjqWay',
                    align : 'left'
                }, {
                    name : 'cableLength',
                    align : 'left'
                }, {
                    name : 'reserve',
                    align : 'left'
                }, {
                    name : 'fanFiveLocation',
                    align : 'left'
                }, {
                    name : 'installCounty',
                    align : 'left'
                }, {
                    name : 'reserve5',
                    align : 'left'
                }, {
                    name : 'reserve4',
                    align : 'left'
                }, {
                    name : 'reserve6',
                    align : 'left'
                }, {
                    name : 'fanInstallNum',
                    align : 'left'
                }, {
                    name : 'reserve3',
                    align : 'left'
                }, {
                    name : 'runningTime',
                    align : 'left'
                }, {
                    name : 'reserve2',
                    align : 'left'
                }, {
                    name : 'fanTwoLocation',
                    align : 'left'
                }, {
                    name : 'fanOneNum',
                    align : 'left'
                }, {
                    name : 'fanFourLocation',
                    align : 'left'
                }, {
                    name : 'cableDiameter',
                    align : 'left'
                }, {
                    name : 'fanThreeLocation',
                    align : 'left'
                }, {
                   name : 'createdDate',
                   width : 120,
                   fixed : true,
                   hidden : true,
                   align : 'center'
                }, {
                   name : 'version',
                   hidden : true,
                   hidedlg : true
                } ],
                delRow : {
                    url : "${base}/energy/equipment-info!doDelete"
                },
                addRow : {
                    url : "${base}/energy/equipment-info!inputTabs"
                },
                editRow : {
                    url : "${base}/energy/equipment-info!inputTabs",
                    labelCol : 'TODO'
                },  
                sortname: 'id',
                sortorder: 'desc',
                caption:"员工信息列表"
            }); 
            
            $("#equipmentInfoAddBtn").click(function() {
                $("#equipmentInfoListDiv").jqGrid('addRow');
            });
            
            $("#equipmentInfoDeleteBtn").click(function() {
                $("#equipmentInfoListDiv").jqGrid('delRow');
            });                         
         });
    </script>	
</body>
</html>