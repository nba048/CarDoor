# CarDoor
基于Bmob后端云的汽车资讯类app
> **进程**
> - day1.添加了apk升级功能,添加了基于回调实现的NewsCar数据层,修复了NewsCar模块的无网络异常和缓存处理
> - day2.在汽车详情中添加了Retrofit+RxJava+OkHttp的异步模式
> - day3.在个人模块中添加了芒果广告平台的广告墙实现应用推荐功能
> - day4.APP优化之-启动页优化  成功将800MS的延迟转化为53MS
 -1.使用TraceView检查了application的第三方SDK初始化的耗时并将耗时操作放入intentService
 -2.使用placeholder UI将APP主题背景图片换成相适配的logo背景-解决了白屏问题
 -3.重新创建APP启动页面 不进行UI渲染等待而是调转到APP引导页 优化启动时间

