package com.kgc.service.impl;

import com.kgc.dao.DeptMapper;
import com.kgc.entity.Dept;
import com.kgc.entity.DeptExample;
import com.kgc.entity.TreeNode;
import com.kgc.entity.TreeResult;
import com.kgc.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;


    public List<Dept> findAll() {
        DeptExample deptExample = new DeptExample();
        List<Dept> depts = deptMapper.selectByExample(deptExample);
        return depts;
    }

    public List<TreeNode> findDepts() {
        return deptMapper.findDepts();
    }

    public List<TreeResult> findTreeResult() {
        return deptMapper.findTreeResult();
    }
}
