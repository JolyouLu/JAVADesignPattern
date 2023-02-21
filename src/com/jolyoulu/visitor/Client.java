package com.jolyoulu.visitor;

/**
 * @Author: JolyouLu
 * @Date: 2021/4/3 16:39
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建成功投票箱
        ObjectStructure objectStructureSuccess = new ObjectStructure();
        objectStructureSuccess.attache(new Man("tom"));
        objectStructureSuccess.attache(new Woman("lili"));
        //以上2个人觉得歌手很成功
        Success success = new Success();
        objectStructureSuccess.display(success);

        //创建失败投票箱
        ObjectStructure objectStructureFail = new ObjectStructure();
        objectStructureFail.attache(new Man("jim"));
        //以上1个人觉得歌手很成功
        Fail fail = new Fail();
        objectStructureFail.display(fail);
    }
}
