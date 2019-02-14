package com.donkingliang.groupedadapterdemo.groupedadapter.structure;

/**
 * 这个类是用来记录分组列表中组的结构的。
 * 通过GroupStructure记录每个组是否有头部，是否有尾部和子项的数量。从而能方便的计算
 * 列表的长度和每个组的组头、组尾和子项在列表中的位置。
 */
public class GroupStructure {

    private boolean hasHeader;

    private int childrenCount;

    public GroupStructure(boolean hasHeader, int childrenCount) {
        this.hasHeader = hasHeader;

        this.childrenCount = childrenCount;
    }

    public boolean hasHeader() {
        return hasHeader;
    }

    public void setHasHeader(boolean hasHeader) {
        this.hasHeader = hasHeader;
    }


    public int getChildrenCount() {
        return childrenCount;
    }

    public void setChildrenCount(int childrenCount) {
        this.childrenCount = childrenCount;
    }
}
