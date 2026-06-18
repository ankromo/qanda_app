package in.tech_camp.qanda_app.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import in.tech_camp.qanda_app.entity.QuestionEntity;

@Mapper
public interface QuestionRepository {
  
@Select("SELECT * FROM questions ORDER BY created_at DESC")
  List<QuestionEntity> findAll();

@Insert("INSERT INTO questions (title,content,user_id) VALUES(#{title},#{content},#{user_id})")
@Options(useGeneratedKeys=true,keyProperty="id")
void insert(QuestionEntity question);

}
