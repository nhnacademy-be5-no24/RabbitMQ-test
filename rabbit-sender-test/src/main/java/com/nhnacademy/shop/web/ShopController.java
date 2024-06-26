/*
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * + Copyright 2024. NHN Academy Corp. All rights reserved.
 * + * While every precaution has been taken in the preparation of this resource,  assumes no
 * + responsibility for errors or omissions, or for damages resulting from the use of the information
 * + contained herein
 * + No part of this resource may be reproduced, stored in a retrieval system, or transmitted, in any
 * + form or by any means, electronic, mechanical, photocopying, recording, or otherwise, without the
 * + prior written permission.
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

package com.nhnacademy.shop.web;

import com.nhnacademy.shop.adapter.MemberAdapter;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : marco@nhnacademy.com
 * @Date : 25/05/2023
 */

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private  MemberAdapter memberAdapter;

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${server.port}")
    private String port;



    @GetMapping
    public String getShop(){
        rabbitTemplate.convertAndSend("RABBIT_TEST", port);
        return port + ":shop";
    }


}
