package com.xujinshan.sorm.core;

/**
 *  负责java数据类型和数据库数据类型的相互转化
 * @author xujinshan361@163.com
 *
 */
public interface TypeConvertor {

	/**
	 * 将数据库数据类型转换成java的数据类型
	 * @param columnType 数据库字段的数据类型
	 * @return java的数据类型
	 */
	public String databaseType2JavaType(String columnType);
	
	/**
	 * 将java数据类型转换成数据库数据类型
	 * @param javaDataType java数据类型
	 * @return 数据库数据类型
	 */
	public String javaType2databaseType(String javaDataType);
}
