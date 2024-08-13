# Learning Java Spring with Dependency Injection

Welcome to this Java Spring learning project, designed to guide you through the transition from regular Java to using Dependency Injection (DI) with Spring and Spring Boot. The project is organized into several stages, each focusing on different aspects of Spring, including XML configuration, annotations, bean scopes, and more. Below is an overview of the project structure and the lessons associated with each package.

## Project Structure

```
src
├── main
│   ├── resources
│   │   └── XMLConfiguration.xml
│   └── java
│       └── com
│           └── zodic
│               ├── learn_spring_framework
│               │   ├── spring_fundamentals
│               │   │   ├── learn_by_doing
│               │   │   │   ├── O6_XML_configuration
│               │   │   │   ├── O5_jakarata_annotiations
│               │   │   │   ├── O4_pre_post_destroy
│               │   │   │   ├── O3_bean_scopes
│               │   │   │   ├── O2_initialization
│               │   │   │   └── O1_basic_intro
│               │   │   └── iterations_example
│               │   │       ├── O4_iteration_four
│               │   │       ├── O3_iteration_three
│               │   │       ├── O2_iteration_two
│               │   │       └── O1_iteration_one
│               │   └── excersice
│               │       ├── dbmanager_rewritten
│               │       └── dbmanager
│               └── learn_spring_boot
│                   ├── O3_handling_data
│                   │   ├── jpa_hibernate
│                   │   └── jdbc
│                   ├── O2_configuration_properties
│                   └── O1_simple_api
└── test
    └── java
        └── com
            └── zodic
                └── learn_spring_framework
                    └── LearnSpringFrameworkApplicationTests.java
```

## Lessons Overview

### 1. Basic Introduction (O1_basic_intro)
- **Files:** `HelloSpring.java`, `HelloSpringConfiguration.java`, `Person.java`, `Address.java`
- **Lesson:** Introduction to Spring. Understanding how to set up a basic Spring application using configuration classes, defining beans, and injecting dependencies. This stage focuses on the fundamental concepts of DI and how Spring manages beans.

### 2. Initialization (O2_initialization)
- **Files:** `A.java`, `B.java`, `HelloLazySpring.java`, `HelloLazySpringConfiguration.java`
- **Lesson:** Delving into lazy initialization and eager initialization of beans. This stage explains the differences and when to use each approach, along with configuration techniques.

### 3. Bean Scopes (O3_bean_scopes)
- **Files:** `Launcher.java`, `Normal.java`, `Prototype.java`, `Tester.java`
- **Lesson:** Exploring different bean scopes such as singleton and prototype. Learn how Spring manages the lifecycle of beans based on their scopes and how to configure and test these scopes.

### 4. Pre and Post Destroy (O4_pre_post_destroy)
- **Files:** `ManagedComponentClass.java`, `ManagedComponentInterface.java`, `PrePostLauncher.java`, `SomeClass.java`, `SomeDependency.java`, `SomeIndependentService.java`, `SomeOtherIndependentService.java`
- **Lesson:** Managing bean lifecycle events using `@PostConstruct` and `@PreDestroy` annotations. This stage focuses on controlling the initialization and destruction phases of beans.

### 5. Jakarta Annotations (O5_jakarata_annotiations)
- **Files:** `BusinessService.java`, `CDILauncher.java`, `DataService.java`
- **Lesson:** Introduction to Jakarta EE annotations and how they integrate with Spring. Understanding `@Inject`, `@Named`, and other CDI annotations, comparing them with Spring's native annotations.

### 6. XML Configuration (O6_XML_configuration)
- **Files:** `XMLLauncher.java`, `XMLConfiguration.xml`
- **Lesson:** Using XML for configuring Spring beans. Although Java-based configuration is more common, XML configuration is still relevant in certain contexts. This lesson teaches how to define beans, inject dependencies, and manage configurations using XML.

### 7. Iterations Example (O1 - O4)
- **Files:** `GameRunner.java`, `Controllable.java`, `MarioGame.java`, `SuperContraGame.java`, `PacmanGame.java`, `GameConfig.java`
- **Lesson:** A series of iterations showcasing the evolution of a simple game application from plain Java to using Spring's DI. Each iteration introduces new concepts and refactors the code to be more aligned with Spring's practices.

### 8. Exercises (dbmanager & dbmanager_rewritten)
- **Files:** `DbLauncher.java`, `DatabaseService.java`, `DataHandlingService.java`, `MongoDbDataService.java`, `MySQLDataService.java`
- **Lesson:** Practical exercises to reinforce learning. These packages simulate a database management system, refactoring the codebase to incorporate Spring's DI and understanding how different configurations and services can be managed.

### 9. Spring Boot (learn_spring_boot)
- **Files:** `LearnSpringBoot.java`, `Course.java`, `CourseController.java`, `CourseService.java`, `CourseJdbcRepo.java`, `CourseJpaRepo.java`, `CourseSpringDataRepo.java`
- **Lesson:** Transitioning to Spring Boot, exploring auto-configuration, and simplifying application setup. This section includes examples of building a simple REST API, handling data with JDBC, JPA, and Spring Data JPA.

## Getting Started

To run the project, you will need Java 17 and Maven installed on your machine. Clone the repository, navigate to the project directory, and use the following command to build and run the project:

```bash
mvn clean install
mvn spring-boot:run
```

## Conclusion

This project is a comprehensive guide for anyone looking to transition from plain Java to using Spring and Spring Boot. It covers the core concepts of Dependency Injection, bean lifecycle management, annotations, and Spring Boot's auto-configuration. Each package in this project builds upon the previous one, gradually introducing more advanced concepts and best practices.

Feel free to explore, modify, and extend the project as you learn!

