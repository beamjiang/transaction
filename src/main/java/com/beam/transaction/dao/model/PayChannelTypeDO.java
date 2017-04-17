/**
 * 
 */
package com.beam.transaction.dao.model;

/**
 * @author beam
 *支付方式对象
 */
public class PayChannelTypeDO {

	private Integer pctId;
	private String pctName;
	private String pctShortName;
	private Integer payChannelId;
	private String terminalType;
	private Integer jsPay;
	private Integer combinedSupport;
	private String pctDesc;
	private Long gmtCreate;
	private Long gmtModified;
	
	public void setPctId(Integer pctId){
		this.pctId = pctId;
	}
	
	public Integer getPctId(){
		return this.pctId;
	}
	
	public void setPctName(String pctName){
		this.pctName = pctName;
	}
	
	public String getPctName(){
		return this.pctName;
	}
	
	public void setPctShortName(String pctShortName){
		this.pctShortName = pctShortName;
	}
	
	public String getPctShortName(){
		return this.pctShortName;
	}
	
	
	public void setPayChannelId(Integer payChannelId){
		this.payChannelId = payChannelId;
	}
	
	public Integer getPayChannelId(){
		return this.payChannelId;
	}
	
	public void setTerminalType(String terminalType){
		this.terminalType = terminalType;
	}
	
	public String getTerminalType(){
		return this.terminalType;
	}
	
	
	public void setJsPay(Integer jsPay){
		this.jsPay = jsPay;
	}
	
	public Integer getJsPay(){
		return this.jsPay;
	}
	
	public void setCombinedSupport(Integer combinedSupport){
		this.combinedSupport = combinedSupport;
	}
	
	public Integer getCombinedSupport(){
		return this.combinedSupport;
	}
	
	public void setPctDesc(String pctDesc){
		this.pctDesc = pctDesc;
	}
	
	public String getPctDesc(){
		return this.pctDesc;
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

	@Override
	public String toString() {
		return "PayChannelTypeDO [pctId=" + pctId + ", pctName=" + pctName + ", pctShortName=" + pctShortName
				+ ", payChannelId=" + payChannelId + ", terminalType=" + terminalType + ", jsPay=" + jsPay
				+ ", combinedSupport=" + combinedSupport + ", pctDesc=" + pctDesc + ", gmtCreate=" + gmtCreate
				+ ", gmtModified=" + gmtModified + "]";
	}
	
	
}
