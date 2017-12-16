# Hello World! Quick start Spring boot

### Step by step guide for configuring this repository into your service
```
mkdir [service-name]
cd [service-name]
git init .
git remote add upstream 
git remote add starter 
git fetch starter
git co starter/master
git co master
git push upstream master
git remote add origin [Your fork service repo]
git remote remove starter
./gradlew -Dhttp.proxyHost=X.X.X.X -Dhttp.proxyPort=8080 -Dhttps.proxyHost=X.X.X.X -Dhttps.proxyPort=8080 clean build
Open IntelliJ
Import project with auto import

### Software needs to have
IntelliJ IDE
Git
Gradle
JDK 1.8
Widfly JBOSS Server 10

```
