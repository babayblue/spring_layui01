package com.kgc.service;

import com.kgc.entity.Dept;
import com.kgc.entity.TreeNode;
import com.kgc.entity.TreeResult;

import java.util.List;

public interface DeptService {
    List<Dept> findAll();

    List<TreeNode> findDepts();

    List<TreeResult> findTreeResult();
}
