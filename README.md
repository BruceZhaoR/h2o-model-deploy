# h2o模型部署-Java

`codes`文件夹下是代码示例，最好在IDEA中打开，将libs下面的h2o-genmodel.jar加入到library。

h2o提供两种部署方式：MOJO和POJO

MOJO: 适用于复杂模型，例如gbm,xgboost, ensamble model 等，需要依赖模型生成的文件。    
POJO: 适用于分类和回归模型，以Java class的形式调用，不能超过1G，较简单的模型比mojo速度快。

参考链接：<https://docs.h2o.ai/h2o/latest-stable/h2o-docs/productionizing.html>
