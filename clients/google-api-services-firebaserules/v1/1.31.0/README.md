# Firebase Rules API Client Library for Java

Creates and manages rules that determine when a Firebase Rules-enabled service should permit a request. 

This page contains information about getting started with the Firebase Rules API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Firebase Rules API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Firebase Rules API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-firebaserules</artifactId>
      <version>v1-rev20220323-1.32.1</version>
    </dependency>
  </dependencies>
</project>
```

### Gradle

```gradle
repositories {
  mavenCentral()
}
dependencies {
  implementation 'com.google.apis:google-api-services-firebaserules:v1-rev20220323-1.32.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-firebaserules/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/firebaserules/v1/
