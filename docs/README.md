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
