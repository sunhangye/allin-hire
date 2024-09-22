
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.allin.service.impl;

import com.allin.mapper.StuMapper;
import com.allin.pojo.Stu;
import com.allin.service.StuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shy
 * @since 2022-09-04
 */
@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Stu> implements StuService {

//    @Autowired
//    private StuMapper stuMapper;
//
//    @Transactional
//    @Override
//    public void save(Stu stu) {
//        stuMapper.insert(stu);
//    }

}
