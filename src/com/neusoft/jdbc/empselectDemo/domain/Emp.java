package com.neusoft.jdbc.empselectDemo.domain;

import java.util.Date;

/**
 * @author Eric Lee
 * @date 2020/8/5 09:54
 */
// domain 层与数据库中表字段一一对应的数据，就是一个javabean
public class Emp {
    // Emp类是与数据库中表字段一一对应的数据，
    // 成员变量私有
    private Integer id;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private  Integer salary;
    private Integer bonus;
    private Integer deptno;
    // 空参构造

    public Emp() {
    }

    // get/set


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", hiredate=" + hiredate +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", deptno=" + deptno +
                '}';
    }
}
