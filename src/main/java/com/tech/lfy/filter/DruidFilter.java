package com.tech.lfy.filter;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;


@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*",
        initParams = {
                // 忽略资源
                @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*,/static/*")
        }
)
public class DruidFilter extends WebStatFilter {}