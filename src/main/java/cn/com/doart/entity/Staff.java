package cn.com.doart.entity;

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
@Table(name = "T_INFORMATION_STAFF")
@MetaData(title = "员工信息")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Staff extends PersistableEntity<Long> {

    @MetaData(title = "员工工号")
    @EntityAutoCode
    private String staffNo;

    @MetaData(title = "员工姓名")
    @EntityAutoCode
    private String staffName;

    @MetaData(title = "员工年龄")
    @EntityAutoCode
    private int staffAge;

    @MetaData(title = "员工出生日期")
    @EntityAutoCode
    private String staffBirthday;

    private Long id;

    @Id
    @Column(length = 40)
    @GeneratedValue(generator = "id")
    @GenericGenerator(name = "id", strategy = "native")
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    @Override
    @Transient
    public String getDisplayLabel() {
        return staffNo + "/" + staffName;
    }

    @Column(length = 128, nullable = false, unique = true)
    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    @Column(length = 128, nullable = false)
    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    @Column(length = 128, nullable = false)
    public int getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(int staffAge) {
        this.staffAge = staffAge;
    }

    @Column(length = 128, nullable = false)
    public String getStaffBirthday() {
        return staffBirthday;
    }

    public void setStaffBirthday(String staffBirthday) {
        this.staffBirthday = staffBirthday;
    }

}
