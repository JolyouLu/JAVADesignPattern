package com.jolyoulu.builder.improve;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/23 22:06
 * @Version 1.0
 * 产品（Product）
 */
public class House {
    private String baise;
    private String wall;
    private String roofed;

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("House{");
        sb.append("baise='").append(baise).append('\'');
        sb.append(", wall='").append(wall).append('\'');
        sb.append(", roofed='").append(roofed).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
