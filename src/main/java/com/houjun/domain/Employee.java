package com.houjun.domain;

import java.util.Date;

/**
 * Created by zhaochunmeng on 2020/2/13 10:07.
 * 员工
 */
public class Employee {

    private Long id;
    private String loginname; 	//登录名
    private String remark; 		//备注
    private String code;		 	//员工编号
    private String name; 		//姓名
    private Long company_id; 	//公司
    private String location; 	//工作地点
    private Long jobcall_id;		//职称
    private Long dept_subdivision_id;  //部分细分
    private Long function_type_id;		 //职能类型
    private Long job_grade_id;				 //职级
    private Date date_created; 	//创建日期
    private String costcenter;
    private String workcenter;
    private String status;//启用  停用

    //以下字段只为展示用
    private String date_created_str;
    private String companyStr;
    private String jobcallStr;
    private String jobgradeStr;
    private String functionTypeStr;
    private String deptSubdivisionStr;
    private String deptName;//部门名称
    private Long dept_id;//部门id
    private String postName;//岗位名称
    private String companyName;//公司名称
    private String email;//邮箱
    private String mobile;//手机号
    private String tel;//固定电话号

    public void setJobgradeStr(String jobgradeStr) {
        this.jobgradeStr = jobgradeStr;
    }

    public Long getDept_id() {
        return dept_id;
    }

    public void setDept_id(Long dept_id) {
        this.dept_id = dept_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCompanyStr() {
        return companyStr;
    }

    public void setCompanyStr(String companyStr) {
        this.companyStr = companyStr;
    }

    public String getJobcallStr() {
        return jobcallStr;
    }

    public void setJobcallStr(String jobcallStr) {
        this.jobcallStr = jobcallStr;
    }

    public String getJobgradeStr() {
        return jobgradeStr;
    }

    public void setJobGradeStr(String jobgradeStr) {
        this.jobgradeStr = jobgradeStr;
    }

    public String getFunctionTypeStr() {
        return functionTypeStr;
    }

    public void setFunctionTypeStr(String functionTypeStr) {
        this.functionTypeStr = functionTypeStr;
    }

    public String getDeptSubdivisionStr() {
        return deptSubdivisionStr;
    }

    public void setDeptSubdivisionStr(String deptSubdivisionStr) {
        this.deptSubdivisionStr = deptSubdivisionStr;
    }

    public String getDate_created_str() {
        return date_created_str;
    }

    public void setDate_created_str(String date_created_str) {
        this.date_created_str = date_created_str;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Long company_id) {
        this.company_id = company_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getJobcall_id() {
        return jobcall_id;
    }

    public void setJobcall_id(Long jobcall_id) {
        this.jobcall_id = jobcall_id;
    }

    public Long getDept_subdivision_id() {
        return dept_subdivision_id;
    }

    public void setDept_subdivision_id(Long dept_subdivision_id) {
        this.dept_subdivision_id = dept_subdivision_id;
    }

    public Long getFunction_type_id() {
        return function_type_id;
    }

    public void setFunction_type_id(Long function_type_id) {
        this.function_type_id = function_type_id;
    }

    public Long getJob_grade_id() {
        return job_grade_id;
    }

    public void setJob_grade_id(Long job_grade_id) {
        this.job_grade_id = job_grade_id;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public String getCostcenter() {
        return costcenter;
    }

    public void setCostcenter(String costcenter) {
        this.costcenter = costcenter;
    }

    public String getWorkcenter() {
        return workcenter;
    }

    public void setWorkcenter(String workcenter) {
        this.workcenter = workcenter;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
