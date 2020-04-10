package com.atguigu.mp.test;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

/**
 *
 * @author d
 * @ClassName: CodeGeneration
 * @Description: 代码生成器
 */
public class MpGenerator {

    /**
     * 代码生成    示例代码
     */
    @Test
    public void  testGenerator() {
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
         gc.setOutputDir("D://mp"); // 保存位置必须配置·············
        //gc.setOutputDir("\"D:\\\\workspaces\\\\mp03\\\\src\\\\main\\\\java\""); // 保存位置必须配置·············
        gc.setFileOverride(true);
        gc.setActiveRecord(true);
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
//      gc.setAuthor("象征");

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
        dsc.setUrl("jdbc:mysql://192.168.1.250:3306/xzdev?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
        dsc.setUsername("xzdev");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
         strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        // strategy.setTablePrefix(new String[] { "tlog_", "tsys_" });// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
         strategy.setInclude(new String[] { "sys_attr_value" }); // 需要生成的表
        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
        mpg.setStrategy(strategy);

//        // 包配置
//        PackageConfig pc = new PackageConfig();
//        pc.setParent("com.xiangzheng.app");
//        pc.setModuleName("store");
//        mpg.setPackageInfo(pc);

        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent("com.atguigu.mp")
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setEntity("beans")
                .setXml("mapper");

        // 执行生成
        mpg.execute();
    }

}
