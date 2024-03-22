package com.tnp.bean;

/**
 * @author satya
 */
public class EmpBean {

    private int empno;
    private String name;
    private float sal;
    private int deptno;
    private String gender;
    private float comm;

    public EmpBean() {
    }

    public EmpBean(int empno, String name, float sal, int deptno, String gender, float comm) {
        this.empno = empno;
        this.name = name;
        this.sal = sal;
        this.deptno = deptno;
        this.gender = gender;
        this.comm = comm;
    }

    public int getEmpno() {
        return empno;
    }

    public String getName() {
        return name;
    }

    public float getSal() {
        return sal;
    }

    public int getDeptno() {
        return deptno;
    }

    public String getGender() {
        return gender;
    }

    public float getComm() {
        return comm;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setComm(float comm) {
        this.comm = comm;
    }

}
