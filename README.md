Android图片加载框架Glide最全解析（将会包括Glide的基本用法、源码解析、高级用法、功能扩展等内容）

# **配置**

使用3.7.0稳定版，其他版本根据需要使用

## **引入依赖**

```
dependencies {
    compile 'com.github.bumptech.glide:glide:3.7.0'
}
```
## **网络权限**
AndroidManifest.xml加

```
<uses-permission android:name="android.permission.INTERNET" />
```
 ## **一句代码**

```
Glide.with(this)
                .load(imgUrl)
                .into(mImg);
```

解析上面加载

- **with**:  创建加载图片的实例可接Activity，Fragment，Context，前两种可直接传this,
但是如果没在Activity或Fragment中，我们可以传ApplicationContext，传入的决定图片加载的生命周期
前两个是和Activity和Fragment被销毁图片加载停止，ApplicationContext应用程序被杀掉的时候图片加载才停止

- **load()**:
图片资源（网络图片图片地址，本地图片，应用资源,二进制流,Uri对象等）
1.加载本地图片

```
File file = new File(getExternalCacheDir() + "/image.jpg");
Glide.with(this).load(file).into(imageView);
```
2.加载应用资源

```
int resource = R.drawable.image;
Glide.with(this).load(resource).into(imageView);
```


3.加载二进制流

```
byte[] image = getImageBytes();
Glide.with(this).load(image).into(imageView);
```

4.加载Uri对象

```
Uri imageUri = getImageUri();
Glide.with(this).load(imageUri).into(imageView);
```

- **into()** 加载到哪个imgview上

## 可加载GIF图片地址

自动判断，load（GIF地址）即可加载



## 学习地址

[郭林glide讲解](http://blog.csdn.net/guolin_blog/article/details/53759439)


