package cn.org.zhixiang.ratelimit;




public interface  RateLimiter {

    public  void counterConsume(String key, long limit);


    public  void tokenConsume(String key, long limit);





}
