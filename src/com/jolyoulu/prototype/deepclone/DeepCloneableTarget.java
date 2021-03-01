package com.jolyoulu.prototype.deepclone;

import java.io.Serializable;

/**
 * @Author: JolyouLu
 * @Date: 2021/1/31 16:11
 * @Version 1.0
 */
public class DeepCloneableTarget implements Serializable,Cloneable{

    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
