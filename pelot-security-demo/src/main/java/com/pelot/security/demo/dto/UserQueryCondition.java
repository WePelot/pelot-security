/*
 * Copyright (c) 2001-2017 GuaHao.com Corporation Limited. All rights reserved. 
 * This software is the confidential and proprietary information of GuaHao Company. 
 * ("Confidential Information"). 
 * You shall not disclose such Confidential Information and shall use it only 
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.pelot.security.demo.dto;

import lombok.Data;

/**
 * TODO
 *
 * @author hongcj
 * @version V1.0
 * @since 2017-11-01 10:39
 */
@Data
public class UserQueryCondition {
    private String username;

    private int age;

    private int ageTO;

    private String xxx;
}
