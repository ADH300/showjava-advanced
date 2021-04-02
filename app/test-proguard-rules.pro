
-ignorewarnings

-keepattributes *Annotation*

-dontnote junit.framework.**
-dontnote junit.runner.**

-keep class androidx.test.*
-keep class androidx.test.* { *; }
-keep class com.argonaut.sjrm.* { *; }
-keep class com.android.dex.* { *; }

-dontwarn androidx.test.**
-dontwarn androidx.**
-dontwarn android.support.test.**
-dontwarn org.junit.**
