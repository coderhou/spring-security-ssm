package com.houjun.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.houjun.dao.EmployeeMapper;
import com.houjun.domain.Employee;
import com.houjun.security.MyUserDetailService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmployeeMapper employeeMapper;

    private Logger logger = Logger.getLogger(EmpController.class);

    @RequestMapping("/pageData")
    public Page pageData(int offset,int limit,String orderby) {
        //方式1
        PageHelper.startPage(offset, limit,orderby);
        List<Employee> list = employeeMapper.listEmp();
        Page page = (Page) list;
        long total = page.getTotal();
        int pageNum = page.getPageNum();

        //方式2 lambda
        PageInfo<Object> pageInfo = PageHelper.startPage(1, 10).doSelectPageInfo(() -> employeeMapper.listEmp());

        //方式3 默认就开启统计条数
        PageHelper.offsetPage(offset,limit,true);
        List<Employee> list2 = employeeMapper.listEmp();
        Page page2 = (Page) list2;
//        排序
        page2.setOrderBy("id");
        return page;
    }
}
