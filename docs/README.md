# Wificar24

[![Deploy Jekyll with GitHub Pages dependencies preinstalled](https://github.com/kreier/Wificar24/actions/workflows/jekyll-gh-pages.yml/badge.svg)](https://github.com/kreier/Wificar24/actions/workflows/jekyll-gh-pages.yml)
[![GitHub release](https://img.shields.io/github/release/kreier/Wificar24.svg)](https://GitHub.com/kreier/Wificar24/releases/)
[![MIT license](https://img.shields.io/github/license/kreier/Wificar24)](https://kreier.mit-license.org/)

Remote control of an ESP8266 car with Android and iOS

## App in Google Play Store

It is almost finished to be published. Just some "keys" are holding us back. Working on it.

## Software on the ESP8266

In the Android folder you find the [Wificar24.ino](https://github.com/kreier/Wificar24/blob/main/Arduino/Wificar24/Wificar24.ino) Arduino file to upload to your ESP8266 so that it works as a local AP that your smartphone can connect to.

A test version [oled.ino](https://github.com/kreier/Wificar24/blob/main/Arduino/oled/oled.ino) works with a 128x64 i2c OLED display to show the IP to connect to, password, and the commands received from the App. It helps for debugging when still not having a motor connected or the robot car finished.

## Playground

The website https://kreier.github.io/Wificar24/ is generated from the README.md in the main folder, not this `/docs` version. So I can try out sime writings here before copying them to the main folder

## API - legacy

I started to use the [wifi-car-esp8266](https://github.com/lacour-vincent/wifi-car-esp8266) project from [lacour-vincent](https://github.com/lacour-vincent) in 2021. The parameters for the Wifi connection are baked into the `.ino`-file of the Arduino that is uploaded to the ESP. In general you just need 3 parameters: `SSID`, `Wifi Password` and `IP`. If you have more than one robot car, for example in a school with many students, it's best to differentiate the cars with unique SSIDs that reflect the robot name. But Wifi Password and IP can stay the same across all devices, since the ESP creates it's own AP (access point) and your smartphone is only connecting to this one AP and the one IP it offers its services. You can specify the port, too - let's keep it at 8080. So the generic settings are:

- SSID: Wificar24
- Wifi password: 12345678
- IP: 192.168.4.1
- Port: 8080

And here are the control commands:

```
GET - http://192.168.4.1:8080/move?dir=F (forward)
GET - http://192.168.4.1:8080/move?dir=B (backward)
GET - http://192.168.4.1:8080/move?dir=R (right)
GET - http://192.168.4.1:8080/move?dir=L (left)
GET - http://192.168.4.1:8080/move?dir=S (stop)

GET - http://192.168.4.1:8080/action?type=1 (action 1)
...
GET - http://192.168.4.1:8080/action?type=8 (action 8)
```

## API - JSON

I would like to use JSON as API to send control signals every 200ms. If the robot does not receive something, it automatically stops. The refresh rate can be adjusted. And I would like to get JSON objects as return to see signal strength, CPU load or sensor input on the robot. For example the distance from the ultrasonic distance sensor. Or the orientation from the gyroscope. Magnetometer?

