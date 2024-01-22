# Creating A Spring App 

### Step 1
- Ctrl + Shift + P (in vscode)
- Spring Initializr: Maven
  - 3.0.10
  - Java
  - com.groupid (example: com.example)
  - artifact id (name of project lowecase-spearate-with-dash)
  - Jar
  - 17
  - Select
    - Last Used (@will provide dependencies)
  - Press Enter
  - Navigate to where you want the project to be created


### Step 2
- open project
  - src
    - main
      - java
        - com
          - groupid
            - name of project (open integrated terminal at this location)
                - only if you have set up the bash script otherwise use the other commands to setup folder configuration.
```bash
springJF "nameOfModel"
```
```bash
mkdir controllers models repositories services
```
```bash
touch controllers/NameOfModelController.java models/NameOfModel.java repositories/NameOfModelRepository.java services/NameOfModelService.java
```
### Step 3: Dynamic Rendering and Creating the Views

- Three minor configuration streps before we can pass data from controller to the .jsp file.

  1. Create the `src/main/webapp`</mark> folder if it does not exist
  2. Create the [`src/main/webapp/WEB-INF`](./src/main/webapp/WEB-INF/index.jsp) folder
  3. Edit the `src/main/resources/applications.properties` file to contain the following code:
```
spring.mvc.view.prefix=/WEB-INF/
# Data Persistence
spring.datasource.url=jdbc:mysql://localhost:3306/dbSchemaName #CHANGE THIS
spring.datasource.username=root
# Change this if your braxton!!
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
# For Update and Delete method hidden inputs
spring.mvc.hiddenmethod.filter.enabled=true

```
- in our pom.xml file, add the following dependencies:

```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
        <dependency>
            <groupId>jakarta.servlet.jsp.jstl</groupId>
            <artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
        </dependency>
        <dependency>
            <groupId>org.glassfish.web</groupId>
            <artifactId>jakarta.servlet.jsp.jstl</artifactId>
        </dependency>
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <dependency>
            <groupId>org.mindrot</groupId>
            <artifactId>jbcrypt</artifactId>
            <version>0.4</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>webjars-locator</artifactId>
            <version>0.47</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>bootstrap</artifactId>
            <version>5.3.1</version>
        </dependency>
```
### Step 4: Creating css file
    - src
      - main (📁)
        - resources (📁)
          - static (📁)
            - css (📁)
    - add Bootswatch css file and name it main.css
              - main.css (📃)

### Boilerplate
#### JSP
```html

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script defer src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    
</body>
</html>


```

### Final Step: to run the application
```bash
mvn clean spring-boot:run
```
or 
```bash
mvn spring-boot:run
```



