package org.xhome.ly.service;

import org.xhome.ly.bean.Case3;
import org.xhome.ly.common.QueryBase;

/**
 * Created by onglchen
 * on 14-12-17.
 */
public interface Case3Service extends BaseService<Case3>{

    public void countCase3s(QueryBase queryBase);

    public void queryAdmin(QueryBase queryBase);

}
