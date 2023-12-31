package com.ciaociao.austin.service.api.service;

import com.ciaociao.austin.service.api.domain.BatchSendRequest;
import com.ciaociao.austin.service.api.domain.SendRequest;
import com.ciaociao.austin.service.api.domain.SendResponse;

/**
 * 发送接口
 */
public interface SendService {

    /**
     * 单文案发送接口
     * @param sendRequest
     * @return
     */
    SendResponse send(SendRequest sendRequest);


    /**
     * 多文案发送接口
     * @param batchSendRequest
     * @return
     */
    SendResponse batchSend(BatchSendRequest batchSendRequest);

}