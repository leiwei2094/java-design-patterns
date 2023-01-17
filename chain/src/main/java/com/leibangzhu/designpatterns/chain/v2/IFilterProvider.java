package com.leibangzhu.designpatterns.chain.v2;

/**
 * 用于在为每个request生产FilterChain时，提供Filter生成策略。
 * 泛型Q: request的数据类型
 * 泛型S: response的数据类型
 *
 * @author leiwei
 */
@FunctionalInterface
public interface IFilterProvider<Q, S> {
    /**
     * 返回一个Filter。有以下几种常用的用法：
     * 1. new一个新的Filter。每个request使用一个新的Filter。
     * 2. 直接返回一个已存在的filter。多个request公用一个Filter。
     * <p>
     * 具体该选哪一种，要看具体场景。比如Filter是否有状态，是否可以多个request共用。
     * 因为是FunctionalInterface，可以使用Lambda表达式，而不用显式创建该接口的实现类。
     *
     * @return
     */
    Filter<Q, S> get();
}
