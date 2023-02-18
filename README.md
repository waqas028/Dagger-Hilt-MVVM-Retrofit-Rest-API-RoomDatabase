# Dragger-Hilt-MVVM-Retrofit-Rest-API-RoomDatabase
>This repository contains simple example covering Dagger2 concepts with MVVM android architecture 
<h3>Prepared and maintained by Muhammad waqas who is having experience of Android developers.</h3>
  
<h1> Hey there! I'm M.waqas 👋 </h1>
<h2> A Passionate Android Developer From Pakistan </h2>
<img align="right" alt="GIF" src="https://camo.githubusercontent.com/61491d59e71fec5c794945fed916a4a682b6c0404fc31f30b08a0d919c558404/68747470733a2f2f696d616765732e73717561726573706163652d63646e2e636f6d2f636f6e74656e742f76312f3537363966633430316236333162616231616464623261622f313534313538303631313632342d5445363451474b524a4738535741495553374e532f6b6531375a77644742546f6464493870446d34386b506f73776c7a6a53564d4d2d53784f703743563539425a772d7a505067646e346a557756634a45315a7657515578776b6d794578676c4e714770304976544a5a616d574c49327a76595748384b332d735f3479737a63703272795449304871544f6161556f68724938504936465879386339505774426c7141566c555335697a7064634958445a71445976707252715a32395077306f2f636f64696e672d667265616b2e676966" width="500"/>
<h3> 👨🏻‍💻 About Me </h3>
I am an Android Developer. I have over a year of experience in
developing android applications using Android Studio. I will prefer to
use new technologies for development. I worked on many projects like
Quiz Apps, Restaurant Management Apps, Smart E-Tailor Design
Recommender apps, Finman App, etc.
Kotlin | OOP | MVVM | Room Database | Firebase | REST API | Kotlin
Flow | XML | Professional UI building
<h3> 🤝🏻 Connect with Me </h3>

* [LinkedIn](https://www.linkedin.com/in/muhammad-waqas-4399361a3)
* [Facebook](https://www.facebook.com/waqasyaqeen)
* Email:  waqaswaseem679@gmail.com
  
## Getting Started:
![ezgif com-video-to-gif](https://user-images.githubusercontent.com/96041723/219875786-6ba73f6c-b808-441a-9c55-5d8e1ff6a5b0.gif)
## Why do we need Dependency Injection?
Well, According to Uncle BOB’s SOLID principles, D stands for Dependency Injection which says that- Any Class should not configure its dependencies itself, but should be configured by some other class from outside.
Means dependencies for a class to use should be passed by any other class, and this process is called Dependency Injection.
Dependency Injection makes our code loosely coupled, which is the main important advantage of using it.
Once code is loosely coupled we will be having these benefits:-

* Easy Code maintenance
* Easy Code Testability
* Easy Refactoring of our code.
### What is Hilt?
Hilt provides a standard way to incorporate Dagger dependency injection into an Android application.
### The goals of Hilt are:
To simplify Dagger-related infrastructure for Android apps.
To create a standard set of components and scopes to ease setup, readability/understanding, and code sharing between apps.
To provide an easy way to provision different bindings to various build types (e.g. testing, debug, or release).
## Adding dependencies
### App-Level Module
```
plugins {
    id 'kotlin-kapt'
    id 'dagger.hilt.android.plugin'
}
dependencies {
def hilt_version="2.44"
    implementation "com.google.dagger:hilt-android:$hilt_version"
    kapt "com.google.dagger:hilt-compiler:$hilt_version"
}
```
### Project Gradel 
```
buildscript {
    dependencies {
        classpath 'com.google.dagger:hilt-android-gradle-plugin:2.38.1'
    }
}
```
## Hilt Annotations:-
These are some of the annotations provided by Hilt

### @HiltAndroidApp:
we need to apply these annotations to our Application class, It will trigger the Hilt code generation and in the process will create our App Component.
### @AndroidEntryPoint:
with this annotation Hilt will generate a DI Container for each Android Component so respective components can add the dependencies.
### @Inject:
with this, we can do Constructor & Field Injection or we can inject any method. Dependencies injected with this annotation will get added into respective.
### @AndroidEntryPoint:
Fields can not be private.
### @ViewModelInject: 
It will create a dependency for ViewModel and Hilt will return that later.
### @Module:
It is used as we used in Dagger Modules, when we want to create an object for any component dependency, mostly used for the third party or where we can not do constructor or field injection(classes which we don’t own).
### @Singleton:
It will create a singleton instance for a dependency, which will be shared across the application.
### @ApplicationContext:
Can be used to access already defined Application Context, the same way we can also use @ActivityContext to access activity context.
