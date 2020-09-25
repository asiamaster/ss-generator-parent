package com.dili;

import com.dili.ss.mbg.ProjectGenerator;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


//@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        ProjectGenerator. generate("C:\\workspace\\artist-workspace\\ss-generator-parent\\ss-generator\\src\\main\\resources\\generator\\sharpGeneratorConfig.xml");
    }


}
