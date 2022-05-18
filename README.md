# FixturesApp
An app for socccer fixtures. Android developer task.

[![Android CI](https://github.com/Victor-El/FixturesApp/actions/workflows/android.yml/badge.svg)](https://github.com/Victor-El/FixturesApp/actions/workflows/android.yml)

## Architecture
This application was built using MVVM design patter with clean architecture

Presentation Layer -> Domain Layer -> Data Layer

Each of these layer ware modularized to gain the advantages of a modularized application such as faster builds and seperation of concern so that each layer is not
tightly coupled to another layer.

The Data layer contained database entities DAOs and the database class alongside the repository and Retrofit web service.
The caching of "My Lessons" is done in this layer in the repository class.

The Domain layer contains business logic such as use-cases and domain models. Use-cases are an abstraction layer over the repository, they are meant to perform a 
meaningful action a user can take and usually can integrate with multiple repository call in order to fufil a "Use case".

The presentation layer is where all the UI logic goes into. Classes and objects such as the ViewModel, Adapters, Activities and Fragment live in this layer.

This project was designed with clean architecture in mind, in order to make it easily possible for service to be easily swapable and overall codebase maintainable.

<img src="https://miro.medium.com/max/1400/1*SjczBI6N688JKSiBiYoTcA.png" width="70%" vspace="10" hspace="10">

## Continuous Integration
GitHub Actions is being used for continuous integration; build, run unit tests and generate artifact

## Set up project
In order to run this project locally, you need to create an `app.properties` file at the root of the project.

Create an account at [Football data](https://www.football-data.org/) and get an API key.

```properties
DEV_API_BASE_URL="https://api.football-data.org/v2/"
PROD_API_BASE_URL="https://api.football-data.org/v2/"
API_KEY=<Your API Key>
```

## Features
* Kotlin
* Coroutines
* Clean Architecture with MVVM
* Jetpack Navigation Component
* Dagger Hilt,
* LiveData,
* Unit testing

## Libraries
*   [Retrofit 2](https://square.github.io/retrofit/) : A type-safe HTTP client for Android and Java
*   [OkHttp Logging Interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor) : An OkHttp interceptor which logs HTTP request and response data.
*   [Gson](https://github.com/google/gson) : An Object-to-JSON serialization/deserialization library
*   [Kotlin Coroutines](https://developer.android.com/kotlin/coroutines) : A coroutine is a concurrency design pattern that you can use on Android to simplify code that executes asynchronously.
*   [Jetpack Navigation component](https://developer.android.com/guide/navigation/navigation-dynamic)
*   [Coil](https://github.com/coil-kt/coil) : An image loading library for Android backed by Kotlin Coroutines.
*   [ShimmerLayout](https://github.com/facebook/shimmer-android) : Shimmer is an Android library that provides an easy way to add a shimmer effect to any view in your Android app.
*   [Dagger Hilt](https://dagger.dev/hilt) : Hilt provides a standard way to incorporate Dagger dependency injection into an Android application.
*   [Material Design Components](https://material.io)
*   [Room](https://developer.android.com/training/data-storage/room) : The Room persistence library provides an abstraction layer over SQLite to allow fluent database access while harnessing the full power of SQLite.

<h2 align="left">Screenshots</h2>
<h4 align="center">
<img src="https://user-images.githubusercontent.com/34776187/168982441-22ad2a8c-7d1a-4382-bd33-f60f1ef35ebb.png" width="30%" vspace="10" hspace="10">
<img src="https://user-images.githubusercontent.com/34776187/168982492-710bb2ed-5d63-4af6-9623-707e9f160444.png" width="30%" vspace="10" hspace="10">
<img src="https://user-images.githubusercontent.com/34776187/168982512-0921d8d2-567c-4942-9e6e-110c742aa891.png" width="30%" vspace="10" hspace="10">

## Author
Elezua Victor

## License
This project is licensed under the Apache MIT License - See: https://github.com/Victor-El/FixturesApp/blob/master/LICENSE


