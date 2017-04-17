/**
 *
 */
package com.beam.transaction.dao;

import java.util.List;

import com.beam.transaction.dao.model.PayChannelDO;



/**
 * @author beam
 */
public interface PayChannelDao {
    int delById(Integer id);

    int add(PayChannelDO record);

    // SELECT * FROM ' . $this->get_table_name() . ' WHERE pay_channel_id = ?
    PayChannelDO getById(Integer id);

    // SELECT * FROM ' . $this->get_table_name() . ' WHERE pay_channel_name = ?
    PayChannelDO getByName(String name);

    int updateById(PayChannelDO record);
    
    List<PayChannelDO> listByPayChannelIds(List<Integer>ids);
}
