# IntelliJ HTTP Client Demo

This is a demo project to show using of [IntelliJ HTTP Client][ijhttp] CLI.
Further reading about [HTTP Client][http-client].

There are two options: run it with `exec-maven-plugin` and `ijhttp-maven-plugin`.
Both require to install or download **IntelliJ HTTP Client CLI**.
I use download-maven-plugin to download it.

## … with `exec-maven-plugin`

```bash
./mvnw -Pdownload-ijhttp,spring-boot,exec
```

## … with `ijhttp-maven-plugin`

```bash
./mvnw -Pdownload-ijhttp,spring-boot,maven-plugin
```

[ijhttp]: https://www.jetbrains.com/help/idea/http-client-cli.html "HTTP Client CLI"

[http-client]: https://www.jetbrains.com/help/idea/http-client-in-product-code-editor.html "HTTP Client"

