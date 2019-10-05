package edu201909.spring.model.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import edu201909.spring.domain.PlayerInfo;

public interface PlayerMapper {
	static String COLUMN = "rowid, pid, pname, photo, cid, nid, overall";

	@Select("SELECT " + COLUMN + " FROM players WHERE pid = #{id}")
	@ResultMap("playerResultMap")
	PlayerInfo getPlayer(@Param("id") Integer id);
}