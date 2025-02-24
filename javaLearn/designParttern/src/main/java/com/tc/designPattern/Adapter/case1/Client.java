package com.tc.designPattern.Adapter.case1;

/**
 * 使用适配器的客户端
 * Author:tangc
 * Date:2016/6/18
 * Time:16:58
 * DESCR:
 */
public class Client {
    public static void main(String args[]){
        //创建需要适配的对象
        Adaptee adaptee = new Adaptee();
        //创建客户端需要调用的接口对象
        Target target = new Adapter(adaptee);
        //请求处理
        target.request();
    }
}
