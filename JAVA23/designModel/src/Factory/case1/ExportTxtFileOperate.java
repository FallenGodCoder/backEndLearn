package Factory.case1;

/**
 * 具体的创建器实现对象，实现创建导出文本文件格式对象
 * Author:tangc
 * Date:2016/8/9
 * Time:20:37
 * DESCR:
 */
public class ExportTxtFileOperate extends ExportOperate {

    @Override
    public ExportFileApi factoryMethod() {
        //创建导出成文本格式的对象
        return new ExportTxtFile();
    }
}
