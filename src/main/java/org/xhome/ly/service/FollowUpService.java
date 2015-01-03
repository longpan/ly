package org.xhome.ly.service;

import org.xhome.ly.bean.FollowUp;

import java.util.List;

/**
 * Created by fenjuly
 * Date: 14/11/29
 * Time: 下午3:28
 */
public interface FollowUpService extends BaseService<FollowUp>{

    public List<FollowUp> getByInterrogationRecordId(long interrogationRecordId);
}
