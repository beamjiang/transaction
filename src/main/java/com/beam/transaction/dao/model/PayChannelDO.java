/**
 * 
 */
package com.beam.transaction.dao.model;

/**
 * @author beam
 *支付渠道对象
 */
public class PayChannelDO {

	private Integer payChannelId;
	private String payChannelName;
	private String payChannelShortName;
	private Long gmtCreate;
	private Long gmtModified;
	
	public String toString(){
		return this.payChannelId+this.payChannelName+this.payChannelShortName;
	}
	
	public PayChannelDO(){
		super();
	}
	
	public void setPayChannelId(Integer payChannelId){
		this.payChannelId = payChannelId;
	}
	
	public Integer getPayChannelId(){
		return this.payChannelId;
	}
	
	public void setPayChannelName(String name){
		this.payChannelName = name;
	}
	
	public String getPayChannelName(){
		return this.payChannelName;
	}
	
	public void setPayChannelShortName(String shortName){
		this.payChannelShortName = shortName;
	}
	
	public String getPayChannelShortName(){
		return this.payChannelShortName;
	}
	
	public void setGmtCreate(Long gmtCreate){
		this.gmtCreate = gmtCreate;
	}
	
	public Long getGmtCreate(){
		return this.gmtCreate;
	}
	
	public void setGmtModified(Long gmtModified){
		this.gmtModified = gmtModified;
	}
	
	public Long getGmtModified(){
		return this.gmtModified;
	}
}
