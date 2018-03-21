package com.footprint.hadoop;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.BlockLocation;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestHDFS {
	
	Configuration  conf;
	FileSystem fs;
	
	@Before
	public void conn() throws IOException{
		conf = new Configuration(true);
		
		fs = FileSystem.get(conf);  //fs.defaultFS  hdfs://
	}
	@After
	public void close() throws IOException{
		fs.close();
	}
	
	@Test
	public void mkdir() throws Exception{
		Path dirs = new Path("/user/root1");
		
		if(fs.exists(dirs)){
			fs.delete(dirs,true);
		}
		
		fs.mkdirs(dirs );
		
	}
	
	@Test
	public void upload() throws Exception{
		
		
		InputStream  in = new BufferedInputStream(new FileInputStream(new File("c:\\nginx")));
		
		Path ifile =new Path("/sxt/hello.txt");
		FSDataOutputStream out = fs.create(ifile );
		
		IOUtils.copyBytes(in, out, conf, true);
		
		
	}
	
	@Test
	public void blks() throws Exception{
		
		Path infile = new Path("/user/root/test.txt");
		FileStatus file = fs.getFileStatus(infile );
		BlockLocation[] blks = fs.getFileBlockLocations(file , 0, file.getLen());
		
		for (BlockLocation b : blks) {
			System.out.println(b);
		}
		
		FSDataInputStream in = fs.open(infile);
		
		System.out.println((char)in.readByte());
		System.out.println((char)in.readByte());
		System.out.println((char)in.readByte());
		System.out.println((char)in.readByte());
		System.out.println((char)in.readByte());
		System.out.println((char)in.readByte());
		in.seek(1048576);
		System.out.println((char)in.readByte());
		System.out.println((char)in.readByte());
		System.out.println((char)in.readByte());
		System.out.println((char)in.readByte());
		
		
	}
	
	
	
	
	
	
	

}
