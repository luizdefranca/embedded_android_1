# embedded_android_1

Challenge 1
System Event

The Application must be started after the device boots;
- Listen to the action “android.intent.action.BOOT_COMPLETED”;
- In BroadcastReceiver, start an Activity from the application;
- Use the command to test: adb shell am broadcast -a android.intent.action.BOOT_COMPLETED.


## Script
```
. build/envsetup.sh 
lunch 23
cd packages/apps/AdvancedAPP3/
ls -lha
mm
croot
make snod
adb devices
adb reboot-bootloader
fastboot devices
fastboot flash system out/target/product/shamu/system.img
```

