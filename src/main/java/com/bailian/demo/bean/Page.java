/**
 * Create by TPig
 * Since： 2017年3月29日下午8:41:05
 * Filename：Page.java
 * Description：
 */
package com.bailian.demo.bean;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

/**
 * @author TPig
 * @date 2017年3月29日 下午8:41:05
 * @version 1.0
 */
public class Page implements Pageable {

    private int      pageNumber;

    private Pageable first;

    private int      pageSize;

    private boolean  hasPrevious;

    private Pageable previousOrFirst;

    private Sort     sort;

    private int      offset;

    private Pageable next;

    /**
     * 返回 pageNumber
     * 
     * @return pageNumber
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * 设置 pageNumber
     * 
     * @param pageNumber
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * 返回 first
     * 
     * @return first
     */
    public Pageable getFirst() {
        return first;
    }

    /**
     * 设置 first
     * 
     * @param first
     */
    public void setFirst(Pageable first) {
        this.first = first;
    }

    /**
     * 返回 pageSize
     * 
     * @return pageSize
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置 pageSize
     * 
     * @param pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 返回 hasPrevious
     * 
     * @return hasPrevious
     */
    public boolean isHasPrevious() {
        return hasPrevious;
    }

    /**
     * 设置 hasPrevious
     * 
     * @param hasPrevious
     */
    public void setHasPrevious(boolean hasPrevious) {
        this.hasPrevious = hasPrevious;
    }

    /**
     * 返回 previousOrFirst
     * 
     * @return previousOrFirst
     */
    public Pageable getPreviousOrFirst() {
        return previousOrFirst;
    }

    /**
     * 设置 previousOrFirst
     * 
     * @param previousOrFirst
     */
    public void setPreviousOrFirst(Pageable previousOrFirst) {
        this.previousOrFirst = previousOrFirst;
    }

    /**
     * 返回 sort
     * 
     * @return sort
     */
    public Sort getSort() {
        return sort;
    }

    /**
     * 设置 sort
     * 
     * @param sort
     */
    public void setSort(Sort sort) {
        this.sort = sort;
    }

    /**
     * 返回 offset
     * 
     * @return offset
     */
    public int getOffset() {
        return offset;
    }

    /**
     * 设置 offset
     * 
     * @param offset
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }

    /**
     * 设置 next
     * 
     * @param next
     */
    public void setNext(Pageable next) {
        this.next = next;
    }

    /**
     * 
     * @author TPig
     * @date 2017年3月29日 下午8:45:19
     * @see org.springframework.data.domain.Pageable#next()
     * @return
     */
    @Override
    public Pageable next() {
        return next;
    }

    /**
     * 
     * @author TPig
     * @date 2017年3月29日 下午8:45:19
     * @see org.springframework.data.domain.Pageable#previousOrFirst()
     * @return
     */
    @Override
    public Pageable previousOrFirst() {
        return previousOrFirst;
    }

    /**
     * 
     * @author TPig
     * @date 2017年3月29日 下午8:45:19
     * @see org.springframework.data.domain.Pageable#first()
     * @return
     */
    @Override
    public Pageable first() {
        return first;
    }

    /**
     * 
     * @author TPig
     * @date 2017年3月29日 下午8:45:19
     * @see org.springframework.data.domain.Pageable#hasPrevious()
     * @return
     */
    @Override
    public boolean hasPrevious() {
        return hasPrevious;
    }

}
