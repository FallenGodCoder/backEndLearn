package Facade.case1.config;

/**
 * Author:tangc
 * Date:2016/6/18
 * Time:14:59
 * DESCR:
 */
public class ConfigManager {
    private static ConfigManager manager = null;
    private static ConfigModel cm = null;

    private ConfigManager(){}

    public static ConfigManager getInstance(){
        if(null == manager){
            manager = new ConfigManager();
            cm = new ConfigModel();
            //读取配置文件，把值设置到ConfigModel中去去，这里省略了
        }
        return manager;
    }


    /**
     * 获取配置的数据
     * @return 配置的数据
     */
    public ConfigModel getConfigData(){
        return cm;
    }
}
