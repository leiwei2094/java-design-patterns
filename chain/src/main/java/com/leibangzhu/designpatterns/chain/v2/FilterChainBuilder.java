package com.leibangzhu.designpatterns.chain.v2;

/**
 * @author leiwei
 */
public interface FilterChainBuilder {
    /**
     * 构建FilterChain
     *
     * @return FilterChain
     */
    FilterChain build();
}
