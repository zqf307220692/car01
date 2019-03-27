package com.zb.dto;

import java.io.Serializable;
import java.util.List;

public class PageUtil<T> implements Serializable {
    private int index=1;//当前的页码、第几页
    private int size=20;//当前页码的条数(每页有多少条)
    private int count;//总条数(一共有多少条)
    private int total;//总页数(一共有多少页)
    private List<T> list;//当前页数据集合

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Integer getTotal() {
        //计算总页数
        this.total = this.count % this.size == 0 ? this.count / this.size : this.count / this.size + 1;
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
