package in.tech_camp.qanda_app.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import in.tech_camp.qanda_app.entity.QuestionEntity;

@Mapper
public interface QuestionRepository {
  
@Select("SELECT * FROM questions")
  List<QuestionEntity> findAll();

@Insert("INSERT INTO question (title,content) VALUES(#{title},#{content})")
@Options(useGeneratedKeys=true,keyProperty="id")
void insert(QuestionEntity question);

}
