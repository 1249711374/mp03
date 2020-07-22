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


public class TestMP2 {
    @Test
    public void  testGenerator() {
        AutoGenerator mpg = new AutoGenerator();


        GlobalConfig gc = new GlobalConfig();
        gc.setActiveRecord(true) // 是否支持AR模式
                .setAuthor("gaohaoyou") // 作者
                //.setOutputDir("D:\\workspaces\\mp03\\src\\main\\java") // 生成路径
                .setOutputDir("E:\\projects\\mp03\\src\\main\\java") // 生成路径
                .setEnableCache(false)
                .setFileOverride(true)  // 文件覆盖
                .setIdType(IdType.AUTO) // 主键策略
                .setServiceName("%sService")  // 设置生成的service接口的名字的首字母是否为I
                // IEmployeeService
                .setBaseResultMap(true) //生成sql映射文件
                .setBaseColumnList(true);//生成sql片段

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImap");
        gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);


        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        /*dsc.setTypeConvert(new MySqlTypeConvert(){
            // 自定义数据库表字段类型转换【可选】
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                System.out.println("转换类型：" + fieldType);
                return super.processTypeConvert(fieldType);
            }
        });*/

        // 四大参数必须配置···········
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://192.168.1.250:3306/bbc_sys?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
        dsc.setUsername("xzdev");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        // strategy.setTablePrefix(new String[] { "tlog_", "tsys_" });// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setInclude(new String[] { "sys_wechat_third_auth_woa" +
                "" }); // 需要生成的表
        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
        mpg.setStrategy(strategy);

//        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.xiangzheng.app.product");
       // pc.setModuleName("store");
        mpg.setPackageInfo(pc);

//        PackageConfig pkConfig = new PackageConfig();
//        pkConfig.setParent("com.atguigu.mp")
//                .setMapper("%smapper")
//                .setService("%sservice")
//                .setController("%scontroller")
//                .setEntity("%sbeans")
//                .setXml("%smapper");

   //     mpg.setPackageInfo(pkConfig);

        // 执行生成
        mpg.execute();
    }

}
