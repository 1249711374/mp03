package com.atguigu.mp.test;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

import java.io.File;

public class TestMP {
	
	
	/**
	 * 代码生成    示例代码
	 */
	@Test
	public void  testGenerator() {
		//1. 全局配置
		GlobalConfig config = new GlobalConfig();
		config.setActiveRecord(true) // 是否支持AR模式
			  .setAuthor("gaohaoyou") // 作者
			  .setOutputDir("D:\\workspaces\\mp03\\src\\main\\java") // 生成路径
				.setEnableCache(false)
			  .setFileOverride(true)  // 文件覆盖
			  .setIdType(IdType.AUTO) // 主键策略
			  .setServiceName("%sService")  // 设置生成的service接口的名字的首字母是否为I
			  					   // IEmployeeService
 			  .setBaseResultMap(true) //生成sql映射文件
 			  .setBaseColumnList(true);//生成sql片段
		
		//2. 数据源配置
		DataSourceConfig  dsConfig  = new DataSourceConfig();
		dsConfig.setDbType(DbType.MYSQL)  // 设置数据库类型
				.setDriverName("com.mysql.jdbc.Driver")
				.setUrl("jdbc:mysql://localhost:3306/test")
				.setUsername("root")
				.setPassword("root");
		 
		//3. 策略配置
		StrategyConfig stConfig = new StrategyConfig();
		stConfig.setCapitalMode(true) //全局大写命名
				.setDbColumnUnderline(true)  // 指定表名 字段名是否使用下划线
				.setNaming(NamingStrategy.underline_to_camel) // 数据库表映射到实体的命名策略，下划线转驼峰命名
				.setTablePrefix("sys_") //表名前缀
				.setInclude("sys_attr_value");  // 生成的表
		
		//4. 包名策略配置 
		PackageConfig pkConfig = new PackageConfig();
		pkConfig.setParent("com.atguigu.mp")
				.setMapper("mapper")
				.setService("service")
				.setController("controller")
				.setEntity("beans")
				.setXml("mapper");
		
		//5. 整合配置
		AutoGenerator  ag = new AutoGenerator();
		
		ag.setGlobalConfig(config)
		  .setDataSource(dsConfig)
		  .setStrategy(stConfig)
		  .setPackageInfo(pkConfig);
		
		//6. 执行
		ag.execute();
	}


	/**
	 * FILE_NAME为Maven仓库的路径
	 */
	public final static String FILE_PATH = "F:/mvn/";
	public final static String suffix = ".lastUpdated";

	public static void main(String[] args) {
		deleteErrorFile(new File(FILE_PATH));
	}

	public static void deleteErrorFile(File file) {
		if(file.isDirectory()) {
			for(String childrenFile : file.list()) {
				deleteErrorFile(new File(file,childrenFile));
			}
		}else {
			if(file.getName().endsWith(suffix)) {
				file.delete();
			}
		}
	}




}
