package com.sankuai.inf.leaf.common;

/**
 * 获取id结果
 */
public class Result {
    /**
     * 表示id值或错误状态值
     * 状态：-1 时间回拨 -2 等待时钟正常被中断 -3 时间回拨过多
     */
    private long id;
    private Status status;

    public Result() {

    }
    public Result(long id, Status status) {
        this.id = id;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Result{");
        sb.append("id=").append(id);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
