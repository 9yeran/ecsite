package jp.co.internous.ecsite.model.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.internous.ecsite.model.entity.User;



public interface UserRepository extends JpaRepository <User, Long>{ //UserテーブルのEntityにアクセスと、キー項目の型(IDの型Long)指定
	
	List<User> findByUserNameAndPassword(String userName,String password);//多分Userクラスのユーザーネームとパスワード一致するか確認してる

}
