package com.application.service.impl;

import com.application.entity.HelpKeyword;
import com.application.mapper.TestMapper;
import com.application.service.ITestService;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TestServiceImpl extends ServiceImpl<TestMapper,HelpKeyword> implements ITestService {

    @Autowired
    private TestMapper testMapper;


    @Override
    public List<HelpKeyword> querySome() {
        return baseMapper.selectList(null);
    }
}
