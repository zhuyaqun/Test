package com.application.service;

import com.application.entity.HelpKeyword;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface ITestService extends IService<HelpKeyword> {
    List<HelpKeyword> querySome();
}
