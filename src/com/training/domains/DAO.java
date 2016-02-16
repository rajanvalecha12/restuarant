package com.training.domains;

import java.util.List;

public interface DAO<T> {

	public int add(T t,OrderInfo h);
	public int add();
	public T find(int key);

	public int delete(int key);

	public int update(int orderNo, int menuCode, int quantity);
	public List<Menu> findAll();
}
