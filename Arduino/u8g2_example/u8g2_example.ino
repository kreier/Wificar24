// Drive displays with the U8g2 library

#include <U8g2lib.h>

U8G2_SSD1306_128X64_NONAME_F_SW_I2C u8g2(U8G2_R0, 12, 14);

void setup(void) {
  u8g2.begin();
}

void loop(void) {
  u8g2.clearBuffer();
  u8g2.setFont(u8g2_font_ncenB10_tr);
  u8g2.drawStr(0,16,"Hello World!");
  u8g2.setFont(u8g2_font_helvR10_tf);
  u8g2.drawStr(0,32,"Hello World!");
  u8g2.drawStr(0,48,"Lorem ipsum dolor");
  u8g2.drawStr(0,64,"sit amet, consectetur");
  u8g2.sendBuffer();
}
