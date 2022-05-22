
# Password Generator

## Usage/Examples

```java
PasswordGenerator passwordGenerator = new PasswordGenerator();
		
Password password = passwordGenerator.generateNew().getPassword();
		
String passwordString = password.getString();
		
password.copyToClipboard();
```

