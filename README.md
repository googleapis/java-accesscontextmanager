# Google Identity Access Context Manager Client for Java

Java idiomatic client for [Identity Access Context Manager][product-docs].

[![Maven][maven-version-image]][maven-version-link]
![Stability][stability-image]

- [Product Documentation][product-docs]
- [Client Library Documentation][javadocs]

:bus: In October 2022, this library has moved to
[google-cloud-java/java-accesscontextmanager](
https://github.com/googleapis/google-cloud-java/tree/main/java-accesscontextmanager).
This repository will be archived in the future.
Future releases will appear in the new repository (https://github.com/googleapis/google-cloud-java/releases).
The Maven artifact coordinates (`com.google.cloud:google-identity-accesscontextmanager`) remain the same.


## Quickstart


If you are using Maven, add this to your pom.xml file:

```xml
<dependency>
  <groupId>com.google.api.grpc</groupId>
  <artifactId>proto-google-identity-accesscontextmanager-v1</artifactId>
  <version>1.0.4</version>
</dependency>
```

If you are using Gradle, add this to your dependencies
```Groovy
compile 'com.google.api.grpc:proto-google-identity-accesscontextmanager-v1:1.0.4'
```
If you are using SBT, add this to your dependencies
```Scala
libraryDependencies += "com.google.api.grpc" % "proto-google-identity-accesscontextmanager-v1" % "1.0.4"
```

## Authentication

See the [Authentication][authentication] section in the base directory's README.

## Getting Started

### Prerequisites

You will need a [Google Cloud Platform Console][developer-console] project with the Identity Access Context Manager [API enabled][enable-api].
You will need to [enable billing][enable-billing] to use Google Identity Access Context Manager.
[Follow these instructions][create-project] to get your project set up. You will also need to set up the local development environment by
[installing the Google Cloud SDK][cloud-sdk] and running the following commands in command line:
`gcloud auth login` and `gcloud config set project [YOUR PROJECT ID]`.

### Installation and setup

You'll need to obtain the `proto-google-identity-accesscontextmanager-v1` library.  See the [Quickstart](#quickstart) section
to add `proto-google-identity-accesscontextmanager-v1` as a dependency in your code.

## About Identity Access Context Manager


[Identity Access Context Manager][product-docs] n/a

See the [Identity Access Context Manager client library docs][javadocs] to learn how to
use this Identity Access Context Manager Client Library.






## Troubleshooting

To get help, follow the instructions in the [shared Troubleshooting document][troubleshooting].

## Transport

Identity Access Context Manager uses gRPC for the transport layer.

## Java Versions

Java 7 or above is required for using this client.

## Versioning


This library follows [Semantic Versioning](http://semver.org/).


## Contributing


Contributions to this library are always welcome and highly encouraged.

See [CONTRIBUTING][contributing] for more information how to get started.

Please note that this project is released with a Contributor Code of Conduct. By participating in
this project you agree to abide by its terms. See [Code of Conduct][code-of-conduct] for more
information.

## License

Apache 2.0 - See [LICENSE][license] for more information.

## CI Status

Java Version | Status
------------ | ------
Java 7 | [![Kokoro CI][kokoro-badge-image-1]][kokoro-badge-link-1]
Java 8 | [![Kokoro CI][kokoro-badge-image-2]][kokoro-badge-link-2]
Java 8 OSX | [![Kokoro CI][kokoro-badge-image-3]][kokoro-badge-link-3]
Java 8 Windows | [![Kokoro CI][kokoro-badge-image-4]][kokoro-badge-link-4]
Java 11 | [![Kokoro CI][kokoro-badge-image-5]][kokoro-badge-link-5]

[product-docs]: n/a
[javadocs]: https://googleapis.dev/java/proto-google-identity-accesscontextmanager-v1/latest/index.html
[kokoro-badge-image-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-accesscontextmanager/java7.svg
[kokoro-badge-link-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-accesscontextmanager/java7.html
[kokoro-badge-image-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-accesscontextmanager/java8.svg
[kokoro-badge-link-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-accesscontextmanager/java8.html
[kokoro-badge-image-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-accesscontextmanager/java8-osx.svg
[kokoro-badge-link-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-accesscontextmanager/java8-osx.html
[kokoro-badge-image-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-accesscontextmanager/java8-win.svg
[kokoro-badge-link-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-accesscontextmanager/java8-win.html
[kokoro-badge-image-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-accesscontextmanager/java11.svg
[kokoro-badge-link-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-accesscontextmanager/java11.html
[stability-image]: https://img.shields.io/badge/stability-ga-green
[maven-version-image]: https://img.shields.io/maven-central/v/com.google.api.grpc/proto-google-identity-accesscontextmanager-v1.svg
[maven-version-link]: https://search.maven.org/search?q=g:com.google.api.grpc%20AND%20a:proto-google-identity-accesscontextmanager-v1&core=gav
[authentication]: https://github.com/googleapis/google-cloud-java#authentication
[developer-console]: https://console.developers.google.com/
[create-project]: https://cloud.google.com/resource-manager/docs/creating-managing-projects
[cloud-sdk]: https://cloud.google.com/sdk/
[troubleshooting]: https://github.com/googleapis/google-cloud-common/blob/main/troubleshooting/readme.md#troubleshooting
[contributing]: https://github.com/googleapis/java-accesscontextmanager/blob/main/CONTRIBUTING.md
[code-of-conduct]: https://github.com/googleapis/java-accesscontextmanager/blob/main/CODE_OF_CONDUCT.md#contributor-code-of-conduct
[license]: https://github.com/googleapis/java-accesscontextmanager/blob/main/LICENSE
[enable-billing]: https://cloud.google.com/apis/docs/getting-started#enabling_billing

[libraries-bom]: https://github.com/GoogleCloudPlatform/cloud-opensource-java/wiki/The-Google-Cloud-Platform-Libraries-BOM
[shell_img]: https://gstatic.com/cloudssh/images/open-btn.png
