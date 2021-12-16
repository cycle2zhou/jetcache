/**
 * Created on 2019/6/10.
 */
package com.alicp.jetcache.support;

/**
 * @author <a href="mailto:areyouok@gmail.com">huangli</a>
 */
public interface CacheMessagePublisher {
    void publish(String area, String cacheName, CacheMessage cacheMessage);

}
