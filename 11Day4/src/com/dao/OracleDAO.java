package com.dao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class OracleDAO {

	public Set<String> select(){
	//	HashSet<String> set= new HashSet<String>();
		TreeSet<String> set= new TreeSet<String>();
		set.add("홍길동");
		set.add("이순신");
		set.add("유관순");
	return set;
	}
}
