package cn.com.doart.entity;

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

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "d_main_database")
@MetaData(title = "主数据信息")
public class MainDataBase extends PersistableEntity<Long>{
    
    @MetaData(title = "主键")
    @EntityAutoCode
    private Long id;
    
    @MetaData(title = "发送编号")
    @EntityAutoCode
    private int snd_id;
    
    @MetaData(title = "起始字段")
    @EntityAutoCode
    private String snd_start;
    
    @MetaData(title = "数据长度")
    @EntityAutoCode
    private int snd_length;
    
    @MetaData(title = "协议版本号")
    @EntityAutoCode
    private String snd_pro_ver;
    
    @MetaData(title = "年月日时分秒")
    @EntityAutoCode
    private Date snd_data;
    
    @MetaData(title = "单元数量")
    @EntityAutoCode
    private int snd_fac_qty;
    
    @MetaData(title = "设备ID")
    @EntityAutoCode
    private String snd_fac_id;
    
    @MetaData(title = "是否正确获取单元1数据")
    @EntityAutoCode
    private int snd_fac_data;
    
    @MetaData(title = "是否获取到风机数据")
    @EntityAutoCode
    private int snd_fan_data;
    
    @MetaData(title = "风机输入电压")
    @EntityAutoCode
    private int snd_fac_vol;
    
    @MetaData(title = "风机输入电流")
    @EntityAutoCode
    private int snd_fac_ele;
    
    @MetaData(title = "风机电池电压")
    @EntityAutoCode
    private int snd_fac_bat_vol;
    
    @MetaData(title = "风机充电电流")
    @EntityAutoCode
    private int snd_fac_ele_cha;
    
    @MetaData(title = "风机充电电量高")
    @EntityAutoCode
    private int snd_fac_chr_hi;
    
    @MetaData(title = "风机充电电量低")
    @EntityAutoCode
    private int snd_fac_chr_lo;
    
    @MetaData(title = "风机软件版本号")
    @EntityAutoCode
    private int snd_fac_ver;
    
    @MetaData(title = "风机状态")
    @EntityAutoCode
    private int snd_fac_status;
    
    @MetaData(title = "风机转速")
    @EntityAutoCode
    private int snd_fac_spd;
    
    @MetaData(title = "风机温度")
    @EntityAutoCode
    private int snd_fac_tem;
    
    @MetaData(title = "风机是够刹车")
    @EntityAutoCode
    private int snd_fac_brake;
    
    @MetaData(title = "风机多抽档位")
    @EntityAutoCode
    private int snd_fac_gear;
    
    @MetaData(title = "是否获取到汇流箱数据")
    @EntityAutoCode
    private int snd_jun_data;
    
    @MetaData(title = "汇流箱总电流")
    @EntityAutoCode
    private int snd_jun_ele;
    
    @MetaData(title = "汇流箱通道1电流")
    @EntityAutoCode
    private int snd_jun_ele1;
    
    @MetaData(title = "汇流箱通道2电流")
    @EntityAutoCode
    private int snd_jun_ele2;
    
    @MetaData(title = "汇流箱通道3电流")
    @EntityAutoCode
    private int snd_jun_ele3;
    
    @MetaData(title = "汇流箱通道4电流")
    @EntityAutoCode
    private int snd_jun_ele4;
    
    @MetaData(title = "汇流箱通道5电流")
    @EntityAutoCode
    private int snd_jun_ele5;
    
    @MetaData(title = "汇流箱通道6电流")
    @EntityAutoCode
    private int snd_jun_ele6;
    
    @MetaData(title = "汇流箱通道7电流")
    @EntityAutoCode
    private int snd_jun_ele7;
    
    @MetaData(title = "汇流箱通道8电流")
    @EntityAutoCode
    private int snd_jun_ele8;
    
    @MetaData(title = "汇流箱通道8电流")
    @EntityAutoCode
    private int snd_jun_vol;
    
    @MetaData(title = "汇流箱通道8电流")
    @EntityAutoCode
    private int snd_jun_bat_vol;
    
    @MetaData(title = "汇流箱通道8电流")
    @EntityAutoCode
    private int snd_jun_cha_stus;
    
    @MetaData(title = "保留")
    @EntityAutoCode
    private int snd_chr1;
    
    @MetaData(title = "保留")
    @EntityAutoCode
    private int snd_chr2;
    
    @MetaData(title = "汇流箱错误状态")
    @EntityAutoCode
    private int snd_err_stus;
    
    @MetaData(title = "汇流箱系统工作状态")
    @EntityAutoCode
    private int snd_jun_status;
    
    @MetaData(title = "汇流箱1通道电量")
    @EntityAutoCode
    private int snd_jun_elq1;
    
    @MetaData(title = "汇流箱2通道电量")
    @EntityAutoCode
    private int snd_jun_elq2;
    
    @MetaData(title = "汇流箱3通道电量")
    @EntityAutoCode
    private int snd_jun_elq3;
    
    @MetaData(title = "汇流箱4通道电量")
    @EntityAutoCode
    private int snd_jun_elq4;
    
    @MetaData(title = "汇流箱5通道电量")
    @EntityAutoCode
    private int snd_jun_elq5;
    
    @MetaData(title = "汇流箱6通道电量")
    @EntityAutoCode
    private int snd_jun_elq6;
    
    @MetaData(title = "汇流箱7通道电量")
    @EntityAutoCode
    private int snd_jun_elq7;
    
    @MetaData(title = "汇流箱8通道电量")
    @EntityAutoCode
    private int snd_jun_elq8;
    
    @MetaData(title = "汇流箱总电量")
    @EntityAutoCode
    private int snd_jun_ele_tot;
    
    @MetaData(title = "汇流箱温度")
    @EntityAutoCode
    private int snd_jun_tem;
    
    @MetaData(title = "是否正确获取追日数据")
    @EntityAutoCode
    private int snd_ank_data;
    
    @MetaData(title = "追日led1状态")
    @EntityAutoCode
    private int snd_ank_ld1_stus;
    
    @MetaData(title = "追日led2状态")
    @EntityAutoCode
    private int snd_ank_ld2_stus;
    
    @MetaData(title = "追日led3状态")
    @EntityAutoCode
    private int snd_ank_ld3_stus;
    
    @MetaData(title = "追日led4状态")
    @EntityAutoCode
    private int snd_ank_ld4_stus;
    
    @MetaData(title = "追日led5状态")
    @EntityAutoCode
    private int snd_ank_ld5_stus;
    
    @MetaData(title = "追日led6状态")
    @EntityAutoCode
    private int snd_ank_ld6_stus;
    
    @MetaData(title = "追日led7状态")
    @EntityAutoCode
    private int snd_ank_ld7_stus;
    
    @MetaData(title = "追日led8状态")
    @EntityAutoCode
    private int snd_ank_ld8_stus;
    
    @MetaData(title = "追日led9状态")
    @EntityAutoCode
    private int snd_ank_ld9_stus;
    
    @MetaData(title = "追日经度")
    @EntityAutoCode
    private int snd_ank_long;
    
    @MetaData(title = "追日纬度")
    @EntityAutoCode
    private int snd_ank_lat;
    
    @MetaData(title = "追日时区")
    @EntityAutoCode
    private int snd_ank_zone;
    
    @MetaData(title = "追日高度角")
    @EntityAutoCode
    private int snd_ank_elevating;
    
    @MetaData(title = "追日方位角")
    @EntityAutoCode
    private int snd_ank_azimuth;
    
    @MetaData(title = "追日日出时间")
    @EntityAutoCode
    private int snd_ank_sunrise;
    
    @MetaData(title = "追日日落时间")
    @EntityAutoCode
    private int snd_ank_sunset;
    
    @MetaData(title = "追日东限位")
    @EntityAutoCode
    private int snd_ank_lim_east;
    
    @MetaData(title = "追日西限位")
    @EntityAutoCode
    private int snd_ank_lim_west;
    
    @MetaData(title = "追日上限位")
    @EntityAutoCode
    private int snd_ank_lim_up;
    
    @MetaData(title = "追日下限位")
    @EntityAutoCode
    private int snd_ank_lim_down;
    
    @MetaData(title = "追日x电机电流")
    @EntityAutoCode
    private int snd_ank_x_ele;
    
    @MetaData(title = "追日y电机电流")
    @EntityAutoCode
    private int snd_ank_y_ele;
    
    @MetaData(title = "追日x电机是否过流")
    @EntityAutoCode
    private int snd_ank_x_ov;
    
    @MetaData(title = "追日y电机是否过流")
    @EntityAutoCode
    private int snd_ank_y_ov;
    
    @MetaData(title = "追日电池电压")
    @EntityAutoCode
    private int snd_ank_bat_vol;
    
    @MetaData(title = "追日过速状态")
    @EntityAutoCode
    private int snd_ank_spd_ov;
    
    @MetaData(title = "追日错误状态")
    @EntityAutoCode
    private int snd_ank_err_stus;
    
    @MetaData(title = "累计投入运行时间")
    @EntityAutoCode
    private int snd_cum_run_time;
    
    @MetaData(title = "平板运行状态")
    @EntityAutoCode
    private int snd_pla_run_sta;
    
    @MetaData(title = "电池温度")
    @EntityAutoCode
    private int snd_bat_tmp;
    
    @MetaData(title = "开机时间")
    @EntityAutoCode
    private int snd_cum_setup_time;
    
    @MetaData(title = "负载电流")
    @EntityAutoCode
    private int snd_load_elec;
    
    @MetaData(title = "负载放电电量")
    @EntityAutoCode
    private int snd_load_elef;
    
    @MetaData(title = "追日支架倾角")
    @EntityAutoCode
    private int snd_ank_angle;
    
    @MetaData(title = "电池组实际容量")
    @EntityAutoCode
    private int snd_bat_ele_cap;
    
    @MetaData(title = "电池组实际存电量")
    @EntityAutoCode
    private int snd_bat_ele_inv;
    
    @MetaData(title = "保留1")
    @EntityAutoCode
    private int snd_chr3;
    
    @MetaData(title = "保留2")
    @EntityAutoCode
    private int snd_chr4;
    
    @MetaData(title = "保留3")
    @EntityAutoCode
    private int snd_chr5;
    
    @MetaData(title = "保留4")
    @EntityAutoCode
    private int snd_chr6;
    
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

    public int getSnd_id() {
        return snd_id;
    }

    public void setSnd_id(int snd_id) {
        this.snd_id = snd_id;
    }
    @Column(length = 128,nullable=false)
    public String getSnd_start() {
        return snd_start;
    }

    public void setSnd_start(String snd_start) {
        this.snd_start = snd_start;
    }

    public int getSnd_length() {
        return snd_length;
    }

    public void setSnd_length(int snd_length) {
        this.snd_length = snd_length;
    }
    @Column(length = 128,nullable=false)
    public String getSnd_pro_ver() {
        return snd_pro_ver;
    }

    public void setSnd_pro_ver(String snd_pro_ver) {
        this.snd_pro_ver = snd_pro_ver;
    }

    public Date getSnd_data() {
        return snd_data;
    }

    public void setSnd_data(Date snd_data) {
        this.snd_data = snd_data;
    }

    public int getSnd_fac_qty() {
        return snd_fac_qty;
    }

    public void setSnd_fac_qty(int snd_fac_qty) {
        this.snd_fac_qty = snd_fac_qty;
    }
    @Column(length = 128,nullable=false)
    public String getSnd_fac_id() {
        return snd_fac_id;
    }

    public void setSnd_fac_id(String snd_fac_id) {
        this.snd_fac_id = snd_fac_id;
    }

    public int getSnd_fac_data() {
        return snd_fac_data;
    }

    public void setSnd_fac_data(int snd_fac_data) {
        this.snd_fac_data = snd_fac_data;
    }

    public int getSnd_fan_data() {
        return snd_fan_data;
    }

    public void setSnd_fan_data(int snd_fan_data) {
        this.snd_fan_data = snd_fan_data;
    }

    public int getSnd_fac_vol() {
        return snd_fac_vol;
    }

    public void setSnd_fac_vol(int snd_fac_vol) {
        this.snd_fac_vol = snd_fac_vol;
    }

    public int getSnd_fac_ele() {
        return snd_fac_ele;
    }

    public void setSnd_fac_ele(int snd_fac_ele) {
        this.snd_fac_ele = snd_fac_ele;
    }

    public int getSnd_fac_bat_vol() {
        return snd_fac_bat_vol;
    }

    public void setSnd_fac_bat_vol(int snd_fac_bat_vol) {
        this.snd_fac_bat_vol = snd_fac_bat_vol;
    }

    public int getSnd_fac_ele_cha() {
        return snd_fac_ele_cha;
    }

    public void setSnd_fac_ele_cha(int snd_fac_ele_cha) {
        this.snd_fac_ele_cha = snd_fac_ele_cha;
    }

    public int getSnd_fac_chr_hi() {
        return snd_fac_chr_hi;
    }

    public void setSnd_fac_chr_hi(int snd_fac_chr_hi) {
        this.snd_fac_chr_hi = snd_fac_chr_hi;
    }

    public int getSnd_fac_chr_lo() {
        return snd_fac_chr_lo;
    }

    public void setSnd_fac_chr_lo(int snd_fac_chr_lo) {
        this.snd_fac_chr_lo = snd_fac_chr_lo;
    }

    public int getSnd_fac_ver() {
        return snd_fac_ver;
    }

    public void setSnd_fac_ver(int snd_fac_ver) {
        this.snd_fac_ver = snd_fac_ver;
    }

    public int getSnd_fac_status() {
        return snd_fac_status;
    }

    public void setSnd_fac_status(int snd_fac_status) {
        this.snd_fac_status = snd_fac_status;
    }

    public int getSnd_fac_spd() {
        return snd_fac_spd;
    }

    public void setSnd_fac_spd(int snd_fac_spd) {
        this.snd_fac_spd = snd_fac_spd;
    }

    public int getSnd_fac_tem() {
        return snd_fac_tem;
    }

    public void setSnd_fac_tem(int snd_fac_tem) {
        this.snd_fac_tem = snd_fac_tem;
    }

    public int getSnd_fac_brake() {
        return snd_fac_brake;
    }

    public void setSnd_fac_brake(int snd_fac_brake) {
        this.snd_fac_brake = snd_fac_brake;
    }

    public int getSnd_fac_gear() {
        return snd_fac_gear;
    }

    public void setSnd_fac_gear(int snd_fac_gear) {
        this.snd_fac_gear = snd_fac_gear;
    }

    public int getSnd_jun_data() {
        return snd_jun_data;
    }

    public void setSnd_jun_data(int snd_jun_data) {
        this.snd_jun_data = snd_jun_data;
    }

    public int getSnd_jun_ele() {
        return snd_jun_ele;
    }

    public void setSnd_jun_ele(int snd_jun_ele) {
        this.snd_jun_ele = snd_jun_ele;
    }

    public int getSnd_jun_ele1() {
        return snd_jun_ele1;
    }

    public void setSnd_jun_ele1(int snd_jun_ele1) {
        this.snd_jun_ele1 = snd_jun_ele1;
    }

    public int getSnd_jun_ele2() {
        return snd_jun_ele2;
    }

    public void setSnd_jun_ele2(int snd_jun_ele2) {
        this.snd_jun_ele2 = snd_jun_ele2;
    }

    public int getSnd_jun_ele3() {
        return snd_jun_ele3;
    }

    public void setSnd_jun_ele3(int snd_jun_ele3) {
        this.snd_jun_ele3 = snd_jun_ele3;
    }

    public int getSnd_jun_ele4() {
        return snd_jun_ele4;
    }

    public void setSnd_jun_ele4(int snd_jun_ele4) {
        this.snd_jun_ele4 = snd_jun_ele4;
    }

    public int getSnd_jun_ele5() {
        return snd_jun_ele5;
    }

    public void setSnd_jun_ele5(int snd_jun_ele5) {
        this.snd_jun_ele5 = snd_jun_ele5;
    }

    public int getSnd_jun_ele6() {
        return snd_jun_ele6;
    }

    public void setSnd_jun_ele6(int snd_jun_ele6) {
        this.snd_jun_ele6 = snd_jun_ele6;
    }

    public int getSnd_jun_ele7() {
        return snd_jun_ele7;
    }

    public void setSnd_jun_ele7(int snd_jun_ele7) {
        this.snd_jun_ele7 = snd_jun_ele7;
    }

    public int getSnd_jun_ele8() {
        return snd_jun_ele8;
    }

    public void setSnd_jun_ele8(int snd_jun_ele8) {
        this.snd_jun_ele8 = snd_jun_ele8;
    }

    public int getSnd_jun_vol() {
        return snd_jun_vol;
    }

    public void setSnd_jun_vol(int snd_jun_vol) {
        this.snd_jun_vol = snd_jun_vol;
    }

    public int getSnd_jun_bat_vol() {
        return snd_jun_bat_vol;
    }

    public void setSnd_jun_bat_vol(int snd_jun_bat_vol) {
        this.snd_jun_bat_vol = snd_jun_bat_vol;
    }

    public int getSnd_jun_cha_stus() {
        return snd_jun_cha_stus;
    }

    public void setSnd_jun_cha_stus(int snd_jun_cha_stus) {
        this.snd_jun_cha_stus = snd_jun_cha_stus;
    }

    public int getSnd_chr1() {
        return snd_chr1;
    }

    public void setSnd_chr1(int snd_chr1) {
        this.snd_chr1 = snd_chr1;
    }

    public int getSnd_chr2() {
        return snd_chr2;
    }

    public void setSnd_chr2(int snd_chr2) {
        this.snd_chr2 = snd_chr2;
    }

    public int getSnd_err_stus() {
        return snd_err_stus;
    }

    public void setSnd_err_stus(int snd_err_stus) {
        this.snd_err_stus = snd_err_stus;
    }

    public int getSnd_jun_status() {
        return snd_jun_status;
    }

    public void setSnd_jun_status(int snd_jun_status) {
        this.snd_jun_status = snd_jun_status;
    }

    public int getSnd_jun_elq1() {
        return snd_jun_elq1;
    }

    public void setSnd_jun_elq1(int snd_jun_elq1) {
        this.snd_jun_elq1 = snd_jun_elq1;
    }

    public int getSnd_jun_elq2() {
        return snd_jun_elq2;
    }

    public void setSnd_jun_elq2(int snd_jun_elq2) {
        this.snd_jun_elq2 = snd_jun_elq2;
    }

    public int getSnd_jun_elq3() {
        return snd_jun_elq3;
    }

    public void setSnd_jun_elq3(int snd_jun_elq3) {
        this.snd_jun_elq3 = snd_jun_elq3;
    }

    public int getSnd_jun_elq4() {
        return snd_jun_elq4;
    }

    public void setSnd_jun_elq4(int snd_jun_elq4) {
        this.snd_jun_elq4 = snd_jun_elq4;
    }

    public int getSnd_jun_elq5() {
        return snd_jun_elq5;
    }

    public void setSnd_jun_elq5(int snd_jun_elq5) {
        this.snd_jun_elq5 = snd_jun_elq5;
    }

    public int getSnd_jun_elq6() {
        return snd_jun_elq6;
    }

    public void setSnd_jun_elq6(int snd_jun_elq6) {
        this.snd_jun_elq6 = snd_jun_elq6;
    }

    public int getSnd_jun_elq7() {
        return snd_jun_elq7;
    }

    public void setSnd_jun_elq7(int snd_jun_elq7) {
        this.snd_jun_elq7 = snd_jun_elq7;
    }

    public int getSnd_jun_elq8() {
        return snd_jun_elq8;
    }

    public void setSnd_jun_elq8(int snd_jun_elq8) {
        this.snd_jun_elq8 = snd_jun_elq8;
    }

    public int getSnd_jun_ele_tot() {
        return snd_jun_ele_tot;
    }

    public void setSnd_jun_ele_tot(int snd_jun_ele_tot) {
        this.snd_jun_ele_tot = snd_jun_ele_tot;
    }

    public int getSnd_jun_tem() {
        return snd_jun_tem;
    }

    public void setSnd_jun_tem(int snd_jun_tem) {
        this.snd_jun_tem = snd_jun_tem;
    }

    public int getSnd_ank_data() {
        return snd_ank_data;
    }

    public void setSnd_ank_data(int snd_ank_data) {
        this.snd_ank_data = snd_ank_data;
    }

    public int getSnd_ank_ld1_stus() {
        return snd_ank_ld1_stus;
    }

    public void setSnd_ank_ld1_stus(int snd_ank_ld1_stus) {
        this.snd_ank_ld1_stus = snd_ank_ld1_stus;
    }

    public int getSnd_ank_ld2_stus() {
        return snd_ank_ld2_stus;
    }

    public void setSnd_ank_ld2_stus(int snd_ank_ld2_stus) {
        this.snd_ank_ld2_stus = snd_ank_ld2_stus;
    }

    public int getSnd_ank_ld3_stus() {
        return snd_ank_ld3_stus;
    }

    public void setSnd_ank_ld3_stus(int snd_ank_ld3_stus) {
        this.snd_ank_ld3_stus = snd_ank_ld3_stus;
    }

    public int getSnd_ank_ld4_stus() {
        return snd_ank_ld4_stus;
    }

    public void setSnd_ank_ld4_stus(int snd_ank_ld4_stus) {
        this.snd_ank_ld4_stus = snd_ank_ld4_stus;
    }

    public int getSnd_ank_ld5_stus() {
        return snd_ank_ld5_stus;
    }

    public void setSnd_ank_ld5_stus(int snd_ank_ld5_stus) {
        this.snd_ank_ld5_stus = snd_ank_ld5_stus;
    }

    public int getSnd_ank_ld6_stus() {
        return snd_ank_ld6_stus;
    }

    public void setSnd_ank_ld6_stus(int snd_ank_ld6_stus) {
        this.snd_ank_ld6_stus = snd_ank_ld6_stus;
    }

    public int getSnd_ank_ld7_stus() {
        return snd_ank_ld7_stus;
    }

    public void setSnd_ank_ld7_stus(int snd_ank_ld7_stus) {
        this.snd_ank_ld7_stus = snd_ank_ld7_stus;
    }

    public int getSnd_ank_ld8_stus() {
        return snd_ank_ld8_stus;
    }

    public void setSnd_ank_ld8_stus(int snd_ank_ld8_stus) {
        this.snd_ank_ld8_stus = snd_ank_ld8_stus;
    }

    public int getSnd_ank_ld9_stus() {
        return snd_ank_ld9_stus;
    }

    public void setSnd_ank_ld9_stus(int snd_ank_ld9_stus) {
        this.snd_ank_ld9_stus = snd_ank_ld9_stus;
    }

    public int getSnd_ank_long() {
        return snd_ank_long;
    }

    public void setSnd_ank_long(int snd_ank_long) {
        this.snd_ank_long = snd_ank_long;
    }

    public int getSnd_ank_lat() {
        return snd_ank_lat;
    }

    public void setSnd_ank_lat(int snd_ank_lat) {
        this.snd_ank_lat = snd_ank_lat;
    }

    public int getSnd_ank_zone() {
        return snd_ank_zone;
    }

    public void setSnd_ank_zone(int snd_ank_zone) {
        this.snd_ank_zone = snd_ank_zone;
    }

    public int getSnd_ank_elevating() {
        return snd_ank_elevating;
    }

    public void setSnd_ank_elevating(int snd_ank_elevating) {
        this.snd_ank_elevating = snd_ank_elevating;
    }

    public int getSnd_ank_azimuth() {
        return snd_ank_azimuth;
    }

    public void setSnd_ank_azimuth(int snd_ank_azimuth) {
        this.snd_ank_azimuth = snd_ank_azimuth;
    }

    public int getSnd_ank_sunrise() {
        return snd_ank_sunrise;
    }

    public void setSnd_ank_sunrise(int snd_ank_sunrise) {
        this.snd_ank_sunrise = snd_ank_sunrise;
    }

    public int getSnd_ank_sunset() {
        return snd_ank_sunset;
    }

    public void setSnd_ank_sunset(int snd_ank_sunset) {
        this.snd_ank_sunset = snd_ank_sunset;
    }

    public int getSnd_ank_lim_east() {
        return snd_ank_lim_east;
    }

    public void setSnd_ank_lim_east(int snd_ank_lim_east) {
        this.snd_ank_lim_east = snd_ank_lim_east;
    }

    public int getSnd_ank_lim_west() {
        return snd_ank_lim_west;
    }

    public void setSnd_ank_lim_west(int snd_ank_lim_west) {
        this.snd_ank_lim_west = snd_ank_lim_west;
    }

    public int getSnd_ank_lim_up() {
        return snd_ank_lim_up;
    }

    public void setSnd_ank_lim_up(int snd_ank_lim_up) {
        this.snd_ank_lim_up = snd_ank_lim_up;
    }

    public int getSnd_ank_lim_down() {
        return snd_ank_lim_down;
    }

    public void setSnd_ank_lim_down(int snd_ank_lim_down) {
        this.snd_ank_lim_down = snd_ank_lim_down;
    }

    public int getSnd_ank_x_ele() {
        return snd_ank_x_ele;
    }

    public void setSnd_ank_x_ele(int snd_ank_x_ele) {
        this.snd_ank_x_ele = snd_ank_x_ele;
    }

    public int getSnd_ank_y_ele() {
        return snd_ank_y_ele;
    }

    public void setSnd_ank_y_ele(int snd_ank_y_ele) {
        this.snd_ank_y_ele = snd_ank_y_ele;
    }

    public int getSnd_ank_x_ov() {
        return snd_ank_x_ov;
    }

    public void setSnd_ank_x_ov(int snd_ank_x_ov) {
        this.snd_ank_x_ov = snd_ank_x_ov;
    }

    public int getSnd_ank_y_ov() {
        return snd_ank_y_ov;
    }

    public void setSnd_ank_y_ov(int snd_ank_y_ov) {
        this.snd_ank_y_ov = snd_ank_y_ov;
    }

    public int getSnd_ank_bat_vol() {
        return snd_ank_bat_vol;
    }

    public void setSnd_ank_bat_vol(int snd_ank_bat_vol) {
        this.snd_ank_bat_vol = snd_ank_bat_vol;
    }

    public int getSnd_ank_spd_ov() {
        return snd_ank_spd_ov;
    }

    public void setSnd_ank_spd_ov(int snd_ank_spd_ov) {
        this.snd_ank_spd_ov = snd_ank_spd_ov;
    }

    public int getSnd_ank_err_stus() {
        return snd_ank_err_stus;
    }

    public void setSnd_ank_err_stus(int snd_ank_err_stus) {
        this.snd_ank_err_stus = snd_ank_err_stus;
    }

    public int getSnd_cum_run_time() {
        return snd_cum_run_time;
    }

    public void setSnd_cum_run_time(int snd_cum_run_time) {
        this.snd_cum_run_time = snd_cum_run_time;
    }

    public int getSnd_pla_run_sta() {
        return snd_pla_run_sta;
    }

    public void setSnd_pla_run_sta(int snd_pla_run_sta) {
        this.snd_pla_run_sta = snd_pla_run_sta;
    }

    public int getSnd_bat_tmp() {
        return snd_bat_tmp;
    }

    public void setSnd_bat_tmp(int snd_bat_tmp) {
        this.snd_bat_tmp = snd_bat_tmp;
    }

    public int getSnd_cum_setup_time() {
        return snd_cum_setup_time;
    }

    public void setSnd_cum_setup_time(int snd_cum_setup_time) {
        this.snd_cum_setup_time = snd_cum_setup_time;
    }

    public int getSnd_load_elec() {
        return snd_load_elec;
    }

    public void setSnd_load_elec(int snd_load_elec) {
        this.snd_load_elec = snd_load_elec;
    }

    public int getSnd_load_elef() {
        return snd_load_elef;
    }

    public void setSnd_load_elef(int snd_load_elef) {
        this.snd_load_elef = snd_load_elef;
    }

    public int getSnd_ank_angle() {
        return snd_ank_angle;
    }

    public void setSnd_ank_angle(int snd_ank_angle) {
        this.snd_ank_angle = snd_ank_angle;
    }

    public int getSnd_bat_ele_cap() {
        return snd_bat_ele_cap;
    }

    public void setSnd_bat_ele_cap(int snd_bat_ele_cap) {
        this.snd_bat_ele_cap = snd_bat_ele_cap;
    }

    public int getSnd_bat_ele_inv() {
        return snd_bat_ele_inv;
    }

    public void setSnd_bat_ele_inv(int snd_bat_ele_inv) {
        this.snd_bat_ele_inv = snd_bat_ele_inv;
    }

    public int getSnd_chr3() {
        return snd_chr3;
    }

    public void setSnd_chr3(int snd_chr3) {
        this.snd_chr3 = snd_chr3;
    }

    public int getSnd_chr4() {
        return snd_chr4;
    }

    public void setSnd_chr4(int snd_chr4) {
        this.snd_chr4 = snd_chr4;
    }

    public int getSnd_chr5() {
        return snd_chr5;
    }

    public void setSnd_chr5(int snd_chr5) {
        this.snd_chr5 = snd_chr5;
    }

    public int getSnd_chr6() {
        return snd_chr6;
    }

    public void setSnd_chr6(int snd_chr6) {
        this.snd_chr6 = snd_chr6;
    }

    @Override
    @Transient
    public String getDisplayLabel() {
        // TODO Auto-generated method stub
        return null;
    }
    
    
    
}
