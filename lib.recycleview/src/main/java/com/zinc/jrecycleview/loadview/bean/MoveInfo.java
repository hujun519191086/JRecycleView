package com.zinc.jrecycleview.loadview.bean;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/4/17
 * @description
 */

public class MoveInfo {

    //视图的高度
    private int viewHeight;
    //下拉高度
    private int dragHeight;
    //百分比(最大100，最小0)
    private int percent;

    public MoveInfo() {
    }

    public MoveInfo(int viewHeight, int dragHeight, int percent) {
        this.viewHeight = viewHeight;
        this.dragHeight = dragHeight;
        this.percent = percent;
    }

    public int getViewHeight() {
        return viewHeight;
    }

    public void setViewHeight(int viewHeight) {
        this.viewHeight = viewHeight;
    }

    public int getDragHeight() {
        return dragHeight;
    }

    public void setDragHeight(int dragHeight) {
        this.dragHeight = dragHeight;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "MoveInfo{" +
                "viewHeight=" + viewHeight +
                ", dragHeight=" + dragHeight +
                ", percent=" + percent +
                '}';
    }
}
