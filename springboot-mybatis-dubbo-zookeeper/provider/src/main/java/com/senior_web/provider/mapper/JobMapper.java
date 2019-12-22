package com.senior_web.provider.mapper;

import com.senior_web.common.domin.Job;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface JobMapper {
//    Job getOne(int id);

    Job getJobById(int id);
//    List<Job> findList(Job job);
    int updateJob(Job job);
    int deleteJob(int id);
}