package com.lpy.mybatisfanxiang;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  throws Exception{



        // mybatis 逆向工程  需要知道怎么会用，怎么改配置 ，而不是每行都要敲下来

        // iO  流读取配置文件


        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("src/genertor.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);

        System.out.printf("逆向工程生成成功");



    }
}
