### create a maven project

create project -> Maven -> Maven project -> select arche type


### project config
groupid : inverse domain name (Ex: com.spak)
Artifact id : some unique project name (Ex: test)
Package: any package name


###  pom.xml
this file is like package.json file in nodejs projects
we can add dependencies by adding like this:

```
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>5.3.19</version>
</dependency>
```