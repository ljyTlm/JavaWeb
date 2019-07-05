package com.ljy.control;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


}
/*
                Servlet详解
    1.Servlet的生命周期
             ------------>       加载servlet          ---->  初始化servlet 调用init()方法
        客户端             服务器端                                     V
            <-------------       处理完成 调用destroy() <----  处理请求 调用service()方法
      首先http请求发出后
        （1）找本机的hosts
        （2）找到dns服务器解析网址
        （3）去和解析出来的ip地址建立tcp连接
        （4）发送get/post请求
        （5）tomcat通过配置文件查看访问的项目 存在 继续 不存在404
        （6）项目通过web.xml 中的配置访问资源
        （7）解析servlet-maping 解析servlet 注意这个过程可以用WebServlet注解代替
        （8）初始化 init方法
        （9）service方法 然后源码中就是判断method是get还是post然后调用这两个方法
    2.get/post详解
        get：
            （1）get请求的url含有明文参数 一般不用做处理敏感数据
            （2）get请求可以被缓存
            （3）get请求被保存在历史记录中
            （4）get请求的长度有限制
            （5）get请求可被收藏为书签
        post：
            （1）post请求不会被缓存
            （2）post请求不会被保存到历史记录
            （3）post的长度没有限制
            （4）post相比之下更安全
        http中其他请求：
            （1）head 与get方法相同 但是只返回http报头
            （2）put 是让服务器根据请求的主体部分创建一个以url命名的新文档 如果有则覆盖
            （3）delete 让服务器删除指定url所对应的资源
            （4）options 获取服务器所支持的方法
            （5）connect 把服务器当成跳板 让服务器访问用户访问不了的页面 然后再发给用户 传说中的http代理服务
 */
