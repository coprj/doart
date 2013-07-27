<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/common/index-header.jsp"%>
</head>
<body>
    <div class="container-fluid">
        <s2:tabbedpanel id="userInfoIndexTabs">
            <ul>
                <li><a href="#userInfoIndexListTab"><span>列表查询</span></a></li>
            </ul>
            <div id="userInfoIndexListTab">
                <div class="row-fluid">
                    <div class="toolbar">
                        <div class="toolbar-inner">
                            <button type="button" class="btn" id="userInfoAddBtn">
                                <i class="icon-plus-sign"></i> 添加
                            </button>
                            <button type="button" class="btn" id="userInfoDeleteBtn">
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
                    <table id="userInfoListDiv"></table>
                    <div id="userInfoListDivPager"></div>
                </div>
            </div>
        </s2:tabbedpanel>
    </div>                    
	<%@ include file="/common/index-footer.jsp"%>
    <script type="text/javascript">
        $(function() {
            $("#userInfoListDiv").grid({
                url: '${base}/energy/user-info!findByPage',
                colNames : [ '操作','备用字段4','集成商名称','联系人','备用字段1','登录密码','备用字段2','备用字段3','客户单位名称','显示标签项目','Email','维护人员姓名','维护人员Email','主键','登陆用户名','可查看设备ID','创建时间','版本号'],
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
                            onclick : "$.popupViewDialog('${base}/energy/user-info!viewTabs?id=" + options.rowId + "')"
                        } ]);
                    }                 
                }, {
                    name : 'reserve4',
                    align : 'left'
                }, {
                    name : 'integratorName',
                    align : 'left'
                }, {
                    name : 'contacts',
                    align : 'left'
                }, {
                    name : 'reserve1',
                    align : 'left'
                }, {
                    name : 'loginPassword',
                    align : 'left'
                }, {
                    name : 'reserve2',
                    align : 'left'
                }, {
                    name : 'reserve3',
                    align : 'left'
                }, {
                    name : 'companyName',
                    align : 'left'
                }, {
                    name : 'showTag',
                    align : 'left'
                }, {
                    name : 'email',
                    align : 'left'
                }, {
                    name : 'maintainerName',
                    align : 'left'
                }, {
                    name : 'maintainerEmail',
                    align : 'left'
                }, {
                    name : 'id',
                    width : 60,
                    fixed : true,
                    align : 'right'
                }, {
                    name : 'loginName',
                    align : 'left'
                }, {
                    name : 'deviceId',
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
                    url : "${base}/energy/user-info!doDelete"
                },
                addRow : {
                    url : "${base}/energy/user-info!inputTabs"
                },
                editRow : {
                    url : "${base}/energy/user-info!inputTabs",
                    labelCol : 'TODO'
                },      
                sortname: 'id',
                sortorder: 'desc',
                caption:"用户信息列表"
            }); 
            
            $("#userInfoAddBtn").click(function() {
                $("#userInfoListDiv").jqGrid('addRow');
            });
            
            $("#userInfoDeleteBtn").click(function() {
                $("#userInfoListDiv").jqGrid('delRow');
            });                         
         });
    </script>	
</body>
</html>