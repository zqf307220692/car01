package com.zb.mapper;
import com.zb.entity.Question;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuestionMapper {

	public Question getQuestionById(@Param(value = "id") Long id)throws Exception;

	public List<Question>	getQuestionListByMap(Map<String,Object> param)throws Exception;

	public Integer getQuestionCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertQuestion(Question question)throws Exception;

	public Integer updateQuestion(Question question)throws Exception;

	public Integer deleteQuestionById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteQuestion(Map<String,List<String>> params);

}
