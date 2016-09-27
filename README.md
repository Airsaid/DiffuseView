# DiffuseView
This is a circle on the proliferation of Android custom view.（这是Android平台上一个自定义的圆形扩散View。）

#实现效果
![](https://github.com/Airsaid/DiffuseView/blob/master/DiffuseView.gif)  

#使用
```
DiffuseView mDiffuseView = (DiffuseView) findViewById(R.id.diffuseView);
mDiffuseView.start(); // 开始扩散
mDiffuseView.stop();// 停止扩散
```

#属性&方法
| 属性名|java方法| 作用 |
|------------|-----------|--------|
| diffuse_color| setColor(int colorId)|设置扩散圆颜色 |
| diffuse_coreColor| setCoreColor(int colorId)|设置中心圆颜色 |
| diffuse_coreImage| setCoreImage(int imageId)|设置中心圆图片 |
| diffuse_coreRadius| setCoreRadius(int radius)|设置中心圆半径 |
| diffuse_maxWidth| setMaxWidth(int maxWidth)|设置最大扩散宽度 |
| diffuse_width| setDiffuseWidth(int width)|设置扩散圆宽度,值越小越宽 |

#联系我
[我的博客](http://blog.csdn.net/airsaid "http://blog.csdn.net/airsaid")  

#感谢
> http://www.kancloud.cn/digest/liuguilin/120373
