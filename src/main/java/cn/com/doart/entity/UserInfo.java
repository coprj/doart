package cn.com.doart.entity;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lab.s2jh.core.annotation.MetaData;
import lab.s2jh.core.entity.PersistableEntity;
import lab.s2jh.core.entity.annotation.EntityAutoCode;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "d_user_info")
@MetaData(title = "用户信息")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class UserInfo extends PersistableEntity<Long> {

    @MetaData(title = "主键")
    @EntityAutoCode
    private Long id;

    @MetaData(title = "登陆用户名")
    @EntityAutoCode
    private String loginName;

    @MetaData(title = "登录密码")
    @EntityAutoCode
    private String loginPassword;

    @MetaData(title = "客户单位名称")
    @EntityAutoCode
    private String companyName;

    @MetaData(title = "公司Logo")
    @EntityAutoCode
    private Blob companyLogo;

    @MetaData(title = "联系人")
    @EntityAutoCode
    private String contacts;

    @MetaData(title = "联系电话")
    @EntityAutoCode
    private int contactsNumber;

    @MetaData(title = "Email")
    @EntityAutoCode
    private String email;

    @MetaData(title = "可查看设备ID")
    @EntityAutoCode
    private String deviceId;

    @MetaData(title = "集成商名称")
    @EntityAutoCode
    private String integratorName;

    @MetaData(title = "显示标签项目")
    @EntityAutoCode
    private String showTag;

    @MetaData(title = "维护人员姓名")
    @EntityAutoCode
    private String maintainerName;

    @MetaData(title = "维护人员联系电话")
    @EntityAutoCode
    private int maintainerNumber;

    @MetaData(title = "维护人员Email")
    @EntityAutoCode
    private String maintainerEmail;

    @MetaData(title = "最近登录时间")
    @EntityAutoCode
    private Date lastLoginTime;

    @MetaData(title = "备用字段1")
    @EntityAutoCode
    private String reserve1;

    @MetaData(title = "备用字段2")
    @EntityAutoCode
    private String reserve2;

    @MetaData(title = "备用字段3")
    @EntityAutoCode
    private String reserve3;

    @MetaData(title = "备用字段4")
    @EntityAutoCode
    private String reserve4;

    @Id
    @Column(length = 40)
    @GeneratedValue(generator = "id")
    @GenericGenerator(name = "id", strategy = "native")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(length = 128, nullable = false)
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Column(length = 128, nullable = false)
    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    @Column(length = 128, nullable = false)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Blob getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(Blob companyLogo) {
        this.companyLogo = companyLogo;
    }

    @Column(length = 128, nullable = false)
    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    @Column(length = 128, nullable = false)
    public int getContactsNumber() {
        return contactsNumber;
    }

    public void setContactsNumber(int contactsNumber) {
        this.contactsNumber = contactsNumber;
    }

    @Column(length = 128, nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(length = 128, nullable = false)
    public String getDeviceId() {
        return deviceId;
    }

    @Column(length = 128, nullable = false)
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Column(length = 128, nullable = false)
    public String getIntegratorName() {
        return integratorName;
    }

    public void setIntegratorName(String integratorName) {
        this.integratorName = integratorName;
    }

    @Column(length = 128, nullable = false)
    public String getShowTag() {
        return showTag;
    }

    public void setShowTag(String showTag) {
        this.showTag = showTag;
    }

    @Column(length = 128, nullable = false)
    public String getMaintainerName() {
        return maintainerName;
    }

    public void setMaintainerName(String maintainerName) {
        this.maintainerName = maintainerName;
    }

    @Column(length = 128, nullable = false)
    public int getMaintainerNumber() {
        return maintainerNumber;
    }

    public void setMaintainerNumber(int maintainerNumber) {
        this.maintainerNumber = maintainerNumber;
    }

    @Column(length = 128, nullable = false)
    public String getMaintainerEmail() {
        return maintainerEmail;
    }

    public void setMaintainerEmail(String maintainerEmail) {
        this.maintainerEmail = maintainerEmail;
    }

    @Column(length = 128, nullable = false)
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Column(length = 128, nullable = true)
    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    @Column(length = 128, nullable = true)
    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    @Column(length = 128, nullable = true)
    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
    }

    @Column(length = 128, nullable = true)
    public String getReserve4() {
        return reserve4;
    }

    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4;
    }

    @Override
    @Transient
    public String getDisplayLabel() {
        return loginName;
    }
}
