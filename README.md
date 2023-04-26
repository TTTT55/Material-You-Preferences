# Android-Preferences-M3
Replica of official Settings page for M3, for use with Preferences library

### Usage

1) Gradle:

```gradle

repositories {

    maven { url 'https://jitpack.io' }

}

dependencies {

    implementation 'com.github.TTTT55:Material-You-Preferences:$latest_version'

}

```

2) XML preferences:

Add the desired preferences ( `MaterialPreference` , `MaterialSwitchPreference` , `MaterialHeaderSwitchPreference` , `MaterialListPreference` , `MaterialEditTextPreference` )
 to your preference XML:

```xml
<PreferenceScreen xmlns:android="http://schemas.android.com/apk/res/android"
                  xmlns:app="http://schemas.android.com/apk/res-auto">

  <PreferenceCategory>

    <com.github.tstewart.materialpreferencesfragment.preferences.MaterialPreference

        android:key="preference_one"
        app:icon="@drawable/ic_pref_icon"
        android:summary="@string/preference_summary"
        android:title="@string/preference_title"/>

    ...

  </PreferenceCategory>

</PreferenceScreen>
```


#### Note:
To remove dividers between preferences in XML, use the following attributes:

```app:allowDividerAbove="false"``` or ```app:allowDividerBelow="false"```

