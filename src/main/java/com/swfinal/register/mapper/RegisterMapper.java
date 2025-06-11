package com.swfinal.register.mapper;

import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisterMapper {
	// 중복 회원 여부 조회
	int selectUserDuplicateCount(Map<String, Object> params);
	// 회원 정보 등록
	int insertUser(Map<String, Object> params);
	// 회원 정보 조회
	Map<String, Object> selectMemberInfo(Map<String, Object> params);
	// 회원 정보 삭제
	int deleteUser(Map<String, Object> params);
}