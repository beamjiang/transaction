/**
 *
 */
package com.beam.transaction.service;


import java.util.List;

import javax.annotation.Resource;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import org.springframework.stereotype.Service;

import com.beam.transaction.dao.PayChannelDao;
import com.beam.transaction.dao.model.PayChannelDO;
import com.beam.transaction.util.DateUtil;

/**
 * @author beam
 *         商户支付配置相关的业务类
 */
@Service("bizPayChannelService")
public class BizPayChannelService {
   
    @Resource(name = "payChannelDao")
    private PayChannelDao     payChannelDao;

	private final Logger logger = LoggerFactory.getLogger(BizPayChannelService.class);
	
	/*
	 * 添加支付渠道
	 * 返回：插入记录数
	 * */
	public Integer addPayChannel(Integer payChannelId,String payChannelName,String payChannelShortName){
		 if(0 >= payChannelId||"".equals(payChannelName)||(null == payChannelName)||"".equals(payChannelShortName)||null==payChannelShortName){
			 logger.error("add payChannel failed,invalid params.payChannelId:"+
		                     payChannelId+"payChannelName:"+payChannelName+"payChannelShortName:"+payChannelShortName);
			 return 0;
		 }
		 PayChannelDO record = new PayChannelDO();
		 record.setGmtCreate(DateUtil.unixTimestamp());
		 record.setGmtModified(DateUtil.unixTimestamp());
		 record.setPayChannelId(payChannelId);
		 record.setPayChannelName(payChannelName);
		 record.setPayChannelShortName(payChannelShortName);
		 return this.payChannelDao.add(record);
		}


    public List<PayChannelDO> listPayChannelByIds(List<Integer> payChannelIds) {
        return this.payChannelDao.listByPayChannelIds(payChannelIds);
    }

	
}
