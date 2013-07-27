package cn.com.doart.energy.entity;

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
@Table(name = "d_equipment_info")
@MetaData(title = "设备信息")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class EquipmentInfo extends PersistableEntity<Long> {

    @MetaData(title = "设备ID")
    @EntityAutoCode
    private String equipmentId;
    
    @MetaData(title = "安装点别称")
    @EntityAutoCode
    private String mountingPointName;
    
    @MetaData(title = "单片PV板数量")
    @EntityAutoCode
    private String uniwaferNum;
    
    @MetaData(title = "单片PV板功率")
    @EntityAutoCode
    private String uniwaferPower;
    
    @MetaData(title = "太阳能控制器实际使用路数")
    @EntityAutoCode
    private String mtkjqWay;
    
    @MetaData(title = "风机安装数量")
    @EntityAutoCode
    private String fanInstallNum;
    
    @MetaData(title = "风机1序列号")
    @EntityAutoCode
    private String fanOneNum;
    
    @MetaData(title = "风机1安装位置")
    @EntityAutoCode
    private String fanOneLocation;
    
    @MetaData(title = "风机2序列号")
    @EntityAutoCode
    private String fanTwoNum;
    
    @MetaData(title = "风机2安装位置")
    @EntityAutoCode
    private String fanTwoLocation;
    
    @MetaData(title = "风机3序列号")
    @EntityAutoCode
    private String fanThreeNum;
    
    @MetaData(title = "风机3安装位置")
    @EntityAutoCode
    private String fanThreeLocation;
    
    @MetaData(title = "风机4序列号")
    @EntityAutoCode
    private String fanFourNum;
    
    @MetaData(title = "风机4安装位置")
    @EntityAutoCode
    private String fanFourLocation;
    
    @MetaData(title = "风机4序列号")
    @EntityAutoCode
    private String fanFiveNum;
    
    @MetaData(title = "风机5安装位置")
    @EntityAutoCode
    private String fanFiveLocation;
    
    @MetaData(title = "电池组总容量")
    @EntityAutoCode
    private String batteryCapacity;
    
    @MetaData(title = "投入运行时间")
    @EntityAutoCode
    private String runningTime;
    
    @MetaData(title = "远程通讯单元sim卡号码")
    @EntityAutoCode
    private String simCardNum;
    
    @MetaData(title = "电缆直径")
    @EntityAutoCode
    private String cableDiameter;
    
    @MetaData(title = "电缆长度")
    @EntityAutoCode
    private String cableLength;
    
    @MetaData(title = "变速机减速比")
    @EntityAutoCode
    private String gearReductionRatio;
    
    @MetaData(title = "安装地所在县")
    @EntityAutoCode
    private String installCounty;
    
    @MetaData(title = "备用字段1")
    @EntityAutoCode
    private String reserve;
    
    @MetaData(title = "备用字段2")
    @EntityAutoCode
    private String reserve2;
    
    @MetaData(title = "备用字段3")
    @EntityAutoCode
    private String reserve3;
    
    @MetaData(title = "备用字段4")
    @EntityAutoCode
    private String reserve4;
    
    @MetaData(title = "备用字段5")
    @EntityAutoCode
    private String reserve5;
    
    @MetaData(title = "备用字段6")
    @EntityAutoCode
    private String reserve6;

    
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
        return equipmentId;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getMountingPointName() {
        return mountingPointName;
    }

    public void setMountingPointName(String mountingPointName) {
        this.mountingPointName = mountingPointName;
    }

    public String getUniwaferNum() {
        return uniwaferNum;
    }

    public void setUniwaferNum(String uniwaferNum) {
        this.uniwaferNum = uniwaferNum;
    }

    public String getUniwaferPower() {
        return uniwaferPower;
    }

    public void setUniwaferPower(String uniwaferPower) {
        this.uniwaferPower = uniwaferPower;
    }

    public String getMtkjqWay() {
        return mtkjqWay;
    }

    public void setMtkjqWay(String mtkjqWay) {
        this.mtkjqWay = mtkjqWay;
    }

    public String getFanInstallNum() {
        return fanInstallNum;
    }

    public void setFanInstallNum(String fanInstallNum) {
        this.fanInstallNum = fanInstallNum;
    }

    public String getFanOneNum() {
        return fanOneNum;
    }

    public void setFanOneNum(String fanOneNum) {
        this.fanOneNum = fanOneNum;
    }

    public String getFanOneLocation() {
        return fanOneLocation;
    }

    public void setFanOneLocation(String fanOneLocation) {
        this.fanOneLocation = fanOneLocation;
    }

    public String getFanTwoNum() {
        return fanTwoNum;
    }

    public void setFanTwoNum(String fanTwoNum) {
        this.fanTwoNum = fanTwoNum;
    }

    public String getFanTwoLocation() {
        return fanTwoLocation;
    }

    public void setFanTwoLocation(String fanTwoLocation) {
        this.fanTwoLocation = fanTwoLocation;
    }

    public String getFanThreeNum() {
        return fanThreeNum;
    }

    public void setFanThreeNum(String fanThreeNum) {
        this.fanThreeNum = fanThreeNum;
    }

    public String getFanThreeLocation() {
        return fanThreeLocation;
    }

    public void setFanThreeLocation(String fanThreeLocation) {
        this.fanThreeLocation = fanThreeLocation;
    }

    public String getFanFourNum() {
        return fanFourNum;
    }

    public void setFanFourNum(String fanFourNum) {
        this.fanFourNum = fanFourNum;
    }

    public String getFanFourLocation() {
        return fanFourLocation;
    }

    public void setFanFourLocation(String fanFourLocation) {
        this.fanFourLocation = fanFourLocation;
    }

    public String getFanFiveNum() {
        return fanFiveNum;
    }

    public void setFanFiveNum(String fanFiveNum) {
        this.fanFiveNum = fanFiveNum;
    }

    public String getFanFiveLocation() {
        return fanFiveLocation;
    }

    public void setFanFiveLocation(String fanFiveLocation) {
        this.fanFiveLocation = fanFiveLocation;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public String getSimCardNum() {
        return simCardNum;
    }

    public void setSimCardNum(String simCardNum) {
        this.simCardNum = simCardNum;
    }

    public String getCableDiameter() {
        return cableDiameter;
    }

    public void setCableDiameter(String cableDiameter) {
        this.cableDiameter = cableDiameter;
    }

    public String getCableLength() {
        return cableLength;
    }

    public void setCableLength(String cableLength) {
        this.cableLength = cableLength;
    }

    public String getGearReductionRatio() {
        return gearReductionRatio;
    }

    public void setGearReductionRatio(String gearReductionRatio) {
        this.gearReductionRatio = gearReductionRatio;
    }

    public String getInstallCounty() {
        return installCounty;
    }

    public void setInstallCounty(String installCounty) {
        this.installCounty = installCounty;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
    }

    public String getReserve4() {
        return reserve4;
    }

    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4;
    }

    public String getReserve5() {
        return reserve5;
    }

    public void setReserve5(String reserve5) {
        this.reserve5 = reserve5;
    }

    public String getReserve6() {
        return reserve6;
    }

    public void setReserve6(String reserve6) {
        this.reserve6 = reserve6;
    }

}
