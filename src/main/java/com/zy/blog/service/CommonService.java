package com.zy.blog.service;

public interface CommonService<T> {
	void saveOrUpdate(T dto);

	void list(T dto);

	void delete(T dto);
}
