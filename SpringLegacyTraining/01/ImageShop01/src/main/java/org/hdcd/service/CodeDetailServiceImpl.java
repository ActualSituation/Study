package org.hdcd.service;

import org.hdcd.common.domain.CodeDetail;
import org.hdcd.mapper.CodeDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeDetailServiceImpl implements CodeDetailService {

    @Autowired
    public CodeDetailMapper mapper;

    @Override
    public void register(CodeDetail codeDetail) throws Exception {
        String classCode = codeDetail.getClassCode();
        System.out.println("classCode : " + classCode);
        int maxSortSeq = mapper.getMaxSortSeq(classCode);
        
        codeDetail.setSortSeq(maxSortSeq + 1);

        mapper.create(codeDetail);
    }

    @Override
    public CodeDetail read(CodeDetail codeDetail) throws Exception {
        return mapper.read(codeDetail);
    }

    @Override
    public void modify(CodeDetail codeDetail) throws Exception {
        mapper.update(codeDetail);
    }

    @Override
    public void remove(CodeDetail codeDetail) throws Exception {
        mapper.delete(codeDetail);
    }

    @Override
    public List<CodeDetail> list() throws Exception {
        return mapper.list();
    }
}
