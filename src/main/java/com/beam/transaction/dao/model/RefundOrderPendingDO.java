package com.beam.transaction.dao.model;

/**
 * 
 * @author beam
 * @description 商户信息实体类(refund_order_pending表)
 * @createTime 
 * @version
 */
public class RefundOrderPendingDO {
	private String orderId;
	private String refundOrderId;
	private String merchantNo;
	private int pctId;
	private long queryDate;
	private int queryCount;
	private long gmtCreate;
	private long gmtModified;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getRefundOrderId() {
		return refundOrderId;
	}
	public void setRefundOrderId(String refundOrderId) {
		this.refundOrderId = refundOrderId;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public int getPctId() {
		return pctId;
	}
	public void setPctId(int pctId) {
		this.pctId = pctId;
	}
	public long getQueryDate() {
		return queryDate;
	}
	public void setQueryDate(long queryDate) {
		this.queryDate = queryDate;
	}
	public int getQueryCount() {
		return queryCount;
	}
	public void setQueryCount(int queryCount) {
		this.queryCount = queryCount;
	}
	public long getGmtCreate() {
		return gmtCreate;
	}
	public void setGmtCreate(long gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public long getGmtModified() {
		return gmtModified;
	}
	public void setGmtModified(long gmtModified) {
		this.gmtModified = gmtModified;
	}
	@Override
	public String toString() {
		return "RefundOrderPendingDO [orderId=" + orderId + ", refundOrderId=" + refundOrderId + ", merchantNo="
				+ merchantNo + ", pctId=" + pctId + ", queryDate=" + queryDate + ", queryCount=" + queryCount
				+ ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified + "]";
	}
	
	
	
	
}
