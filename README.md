
# Password Generator

Just a simple Password Generator written in Java


## Usage/Examples

```java
PasswordGenerator passwordGenerator = new PasswordGenerator();
		
Password password = passwordGenerator.generateNew().getPassword();
		
String passwordString = password.getString();
		
password.copyToClipboard();
```

