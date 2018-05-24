package dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import entity.User;

public interface IUserDao {

//	@Select("select * from t_user where id = #{id}")
	public User selectById(Integer id);
	
//	
//	@Select("select * from t_user2 where user_id = #{id}")
//	@Results(value={
//			@Result(id=true,property="id",column="user_id"),
//			@Result(property="username",column="user_username"),
//			@Result(property="password",column="user_password"),
//			@Result(property="phone",column="user_phone")
//	})
	public User selectById2(Integer id);
	
	public User selectById3(Integer id);
	
	public List<User> selectAll();
	
	public List<User> selectByPhone(String phone);
	
	public User selectUserByUsernameAndPassword(User user);
	
	public User selectUserByUsernameAndPassword2(String username,String password);
	
	public void insertUser(User user);
	
//	@Insert("insert into t_user(username,password,phone) values(#{username},#{password},#{phone})")
//	@Options(useGeneratedKeys=true,keyProperty="id",keyColumn="id")
	public void insertUser2(User user);
	
	public void updateById(User user);
	
	public void deleteById(Integer id);
	
	/**
	 * ¶¯Ì¬sql²¿·Ö
	 * @param user
	 * @return
	 */
	public List<User> selectByParams(User user);
	public List<User> selectByParams2(User user);
	public List<User> selectByParams3(User user);
	public List<User> selectByParams4(User user);
	
	public void updateById2(User user);
	public void updateById3(User user);
	
	public List<User> selectByEach(List<Integer> ids);
	
	
	
	
	
	
	
	
}
