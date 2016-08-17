# WarmRoast Easy Setup

## Linux
[Tutorial Video](https://youtu.be/c0ffjooX7Jw)

**REQUIREMENTS:** You need the Java Developer's Kit (JDK, *NOT JRE*) and you should be able to run the `java` command. If you cannot run java, look up `adding java to my path on <your os>`

**WARNING:** Do not leave WarmRoast on forever! It can seriously degrade your server's performance if left on for no reason!

Do `./run.sh` to start WarmRoast. Enter the # for the corresponding server you are running.

**If you cannot identify the server (because they all look the same), you can either add an argument at the end of your `launch.sh` script like `--log-strip-color` or rename the JAR file to SERVERNAME.jar**

##FAQs

###No such file or directory

When this happens, it should look something like this: ![screenshot](https://i.gyazo.com/721021b85d632acb63d0654cb6088150.png)

You are using JRE, not JDK like specified in the requirements. Either uninstall JRE and install JDK or change your path to use the JDK (on Linux, `sudo update-alternatives --config java`) and restart your server. You'll need to close your command prompt / terminal and reopen it so its settings can refresh.

###Unable to open socket file: target process not responding or HotSpot VM not loaded

If you are receiving this error, please ensure the following:
+ You are running WarmRoast on the **same** username as your Minecraft Server
+ You are running the **same** Java for both your server and WarmRoast

###WarmRoast crashes when my server stops, is this normal?

Yes, this is expected behavior. WarmRoast saves its results but won't shut itself down until you manually turn it off.

###I seem to have lost the WarmRoast process, I think it's still running but I'm not sure...

Linux Users, do the following:

`pgrep -f warm`

Looking at through each of the PIDs with this command:

`ps -fp PID`

When you find one with `warmroast...jar`, do `kill -9 PID`. Abracadabra, it's gone...!

Windows Users, do the following:

Open up Task Manager and search for a java process with warmroast as its argument.
