package com.ciaociao.austin.service.api.service;

import com.ciaociao.austin.service.api.domain.SendRequest;
import com.ciaociao.austin.service.api.domain.SendResponse;

/**
 * 撤回接口
 */
public interface RecallService {


    /**
     * 根据模板ID撤回消息
     * @param sendRequest
     * @return
     */
    SendResponse recall(SendRequest sendRequest);
}