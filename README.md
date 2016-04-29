# Android GifLoadingView

This project idea is from [Link](http://mp.weixin.qq.com/s?__biz=MjM5MDMxOTE5NA==&mid=402703079&idx=2&sn=2fcc6746a866dcc003c68ead9b68e595&scene=2&srcid=0302A7p723KK8E5gSzLKb2ZL&from=timeline&isappinstalled=0#wechat_redirect) .<br>
Thanks for the idea.<br>

I like all the animation in that webpage , but it's so hard to develop all of them .<br>

Finally , i find this way , it's simple , but it work perfect.

## Look like
 
![](http://ww4.sinaimg.cn/mw690/a695acdegw1f3deysrt4gg204s04x17r.gif) ![](http://ww3.sinaimg.cn/small/a695acdegw1f3deytb648g204s04xwqe.gif) ![](http://ww3.sinaimg.cn/small/a695acdegw1f3deytpvo0g204s04x450.gif) <br>

![](http://ww3.sinaimg.cn/small/a695acdegw1f3deyu5713g204s04x41t.gif) ![](http://ww2.sinaimg.cn/small/a695acdegw1f3deyvbpwag204s04x10j.gif) ![](http://ww2.sinaimg.cn/small/a695acdegw1f3deyvlh57g204s04xq92.gif) <br>

![](http://ww4.sinaimg.cn/small/a695acdegw1f3deyvx9yjg204s04x43s.gif) ![](http://ww3.sinaimg.cn/small/a695acdegw1f3deywqb29g204s04xjsz.gif) ![](http://ww3.sinaimg.cn/small/a695acdegw1f3deyx4nbvg204s04xn44.gif) <br>

![](http://ww4.sinaimg.cn/small/a695acdegw1f3deyxq1s8g204s04xgrr.gif) ![](http://ww4.sinaimg.cn/small/a695acdegw1f3deyyj813g204s04xgsg.gif) ![](http://ww3.sinaimg.cn/small/a695acdegw1f3deyyipfsg204s04xju2.gif) <br>

![](http://ww2.sinaimg.cn/small/a695acdegw1f3deyz8qb3g204s04xmys.gif) ![](http://ww2.sinaimg.cn/small/a695acdegw1f3deyzpcg3g204s04x48v.gif) ![](http://ww3.sinaimg.cn/small/a695acdegw1f3dez0fsw9g204s04x7ac.gif) <br>

![](http://ww1.sinaimg.cn/small/a695acdegw1f3dez0v58lg204s04x42i.gif) ![](http://ww4.sinaimg.cn/small/a695acdegw1f3dez17cw8g204s04x79g.gif) ![](http://ww4.sinaimg.cn/small/a695acdegw1f3dez207qug204s04xnad.gif) <br>

![](http://ww2.sinaimg.cn/small/a695acdegw1f3dez2ua1vg204s04xdo4.gif) ![](http://ww3.sinaimg.cn/small/a695acdegw1f3dez39ag4g204s04x0y8.gif) ![](http://ww1.sinaimg.cn/small/a695acdegw1f3dez3skp2g204s04x41g.gif) <br>

..as you see right now,wish you like it.

### Step

Import this project into android studio..it's build with it.

###  Usage

#### Gradle

I will upload this project to jcenter soon.

```
compile project(':gifloadinglibrary')
```

####  config in java code

    private GifLoadingView mGifLoadingView;


    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mGifLoadingView = new GifLoadingView();
        findViewById(R.id.button).setOnClickListener(
                new View.OnClickListener() {
                    @Override public void onClick(View v) {

                        mGifLoadingView.setImageResource(R.drawable.image);
          				mGifLoadingView.show(getFragmentManager(), "");

                    }
                });
    }

## Dependencies

This project use this libraries ~ Thanks to them.

  [android-gif-drawable](https://github.com/koral--/android-gif-drawable)  <br>
  [BlurDialogFragment](https://github.com/tvbarthel/BlurDialogFragment)

## TODO

This view is adjust in Nexue5 but not test in the other size screen .

## About me

A small guy  in mainland FUJIAN China.

If you have any new idea about this project, feel free to tell me ,Tks. :smiley:


## License

	The MIT License (MIT)

	Copyright © 2015 Roger

	Permission is hereby granted, free of charge, to any person obtaining a copy
	of this software and associated documentation files (the "Software"), to deal
	in the Software without restriction, including without limitation the rights
	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	copies of the Software, and to permit persons to whom the Software is
	furnished to do so, subject to the following conditions:

	The above copyright notice and this permission notice shall be included in
	all copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
	THE SOFTWARE.

