/* Blink */
// T-Koala:    5
// Wemos lite: 4
// LORA915:    2   and ESP8266 NodeMCU, D1 R32 (Arduino size)
// T8 V1.7:    21
// T-Dislay:   
// ATMega2560: 13  and Arduino Uno, Leonardo


// int ledPin = LED_BUILTIN;
int ledPin = 2;
//bool light = HIGH; // LORA915, T-Koala, T8, Arduino
//bool dark  = LOW;
bool light = LOW; // WEMOS Lite, ESP8266 NODEMCU
bool dark  = HIGH;
int count = 0; 

void setup() {
  pinMode(ledPin, OUTPUT);
  Serial.begin(74880);
  Serial.println("\nLet's start!");
}

void loop() {
  digitalWrite(ledPin, light);
  Serial.print("LED on ");
  delay(50);
  digitalWrite(ledPin, dark);
  delay(100);
  digitalWrite(ledPin, light);
  delay(50);
  digitalWrite(ledPin, dark);
  Serial.print("LED off ");
  count++;
  if(count > 6) {
    count = 0;
    Serial.println(ledPin);
  }
  delay(2000);
}
