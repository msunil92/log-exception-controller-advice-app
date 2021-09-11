package com.learn.logexp.advice.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author sunil
 * @project log-exception-controller-advice-app
 * @created 2021/09/10 5:23 PM
 */
@Data
@ToString
@Builder
public class Product {

    String id;
    String name;
    String desc;
}
