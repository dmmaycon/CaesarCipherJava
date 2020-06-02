# CaesarCipherJava
Caesar cipher (or Caesar code) is a shift cipher, one of the most easy and most famous encryption systems.

```java
CaesarCipher cc  = new CaesarCipher("Messages will be converted to lowercase for both encryption and decryption");
System.out.println(cc.encrypt(10)); // shifth 10
// wocckqoc gsvv lo myxfobdon dy vygobmkco pyb lydr oxmbizdsyx kxn nombizdsyx
CaesarCipher cc2 = new CaesarCipher(cc.encrypt(10));
System.out.println(cc2.decrypt(10)); // shifth 10
// messages will be converted to lowercase for both encryption and decryption
```

![alt text](https://raw.githubusercontent.com/dmmaycon/CaesarCipherJava/master/main-java.png)
