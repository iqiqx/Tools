# Tools
通用工具类
* Toast   ToastUtils
* SharedPreferences   SPUtils
* 获取屏幕宽高    ScreenUtils
* dp与px转换   DensityUtils
* 手机号、邮箱、银行卡号校验   CheckUtils
* 判断网络的状态   NetUtils
* 键盘管理    KeyBoardUtils
* 获取位置经纬度   LocationUtils
* 获取版本名称、版本号	AppUtils

### Gradle
在项目的根目录build.gradle中添加
  ```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  在module的build.gradle中添加
  ```
  dependencies {
	        implementation 'com.github.liuqqi:Tools:generallibrary1.0.0'
	}
  ```
