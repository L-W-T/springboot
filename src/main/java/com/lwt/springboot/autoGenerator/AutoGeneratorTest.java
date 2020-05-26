package com.lwt.springboot.autoGenerator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class AutoGeneratorTest {
	public static void main(String[] args) {
		//1. 全局配置
		GlobalConfig globalConfig = new GlobalConfig();
		//生成路径
		globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
		//作者
		globalConfig.setAuthor("liangwt");
		//
		globalConfig.setOpen(false);
		//是否文件覆盖，如果多次
		globalConfig.setFileOverride(true);
		
		//2. 数据源配置
		DataSourceConfig dataSourceConfig = new DataSourceConfig();
		dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/gd_base?useUnicode=true&useSSL=false&characterEncoding=utf8");
		dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
		dataSourceConfig.setUsername("gd_base");
		dataSourceConfig.setPassword("11");
		
		//3.策略配置
		StrategyConfig stConfig = new StrategyConfig();
	    stConfig.setCapitalMode(true) // 全局大写命名
	        .setNaming(NamingStrategy.underline_to_camel) // 数据库表映射到实体的命名策略
	        .setInclude("outernet_user"); //生成的表
		
	    //4.包名策略
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.lwt.springboot.autoGenerator");
        pc.setEntity("bean");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setMapper("mapper");
        pc.setXml("mapper");
	    
        //5.整合配置
		AutoGenerator ag = new AutoGenerator().setGlobalConfig(globalConfig)
				.setDataSource(dataSourceConfig)
				.setStrategy(stConfig)
				.setPackageInfo(pc);
		ag.execute();
	}
}
