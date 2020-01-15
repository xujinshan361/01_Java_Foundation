package com.xujinshan.io.test04.commons;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;

/**
 * 列出子孙级
 * @author xujinshan361@163.com
 *
 */
public class CIOTest02 {

	public static void main(String[] args) {
		Collection<File> files =FileUtils.listFiles(new File("E:/java"),
				EmptyFileFilter.NOT_EMPTY, null);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		System.out.println("---------------------");
		 files =FileUtils.listFiles(new File("E:/java"),
					EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		System.out.println("---------------------");
		 files =FileUtils.listFiles(new File("E:/java"),
					new SuffixFileFilter("java"), DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		System.out.println("---------------------");
		 files =FileUtils.listFiles(new File("E:/java"),
					FileFilterUtils.or(new SuffixFileFilter("java"),
							new SuffixFileFilter("class"),EmptyFileFilter.EMPTY), DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		
		System.out.println("---------------------");
		 files =FileUtils.listFiles(new File("E:/java"),
					FileFilterUtils.and(new SuffixFileFilter("java"),
							EmptyFileFilter.NOT_EMPTY), DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
	}
}
