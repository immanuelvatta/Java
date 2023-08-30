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
    - Spring Boot DevTools
    - Spring Web
  - Press Enter
  - Navigate to where you want the project to be created


### Step 2
- open project
  - src
    - main
      - java
        - com
          - groupid
            - name of project
              - here we write controller

- in controller file we need @RestController and @RequestMapping("") imported
  
```java
    //example SomethingController.java
    package com.groupid.name-of-project;

    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class SomethingController {
        @RequestMapping("")
        public String test(){
            return "Test";
        }
        @RequestMapping("/daikichi")
        public String daikichi(){
            return "Daikichi stuff goes here";
        }
        
    }

```

### (JSP)

- create a folder in main called webapp(folder name lower-case)
- inside webapp write the jsp file (example demo.jsp)

-add this to jsp file (in this example we have bootstrap link)
```html
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        <meta charset="UTF-8">
        <title>Demo JSP</title>
    </head>

    <body >
        <h1 class="text-center">Hello World</h1>
    </body>

    </html>
```
- in our project-name folder
- our TestController.java will look like this: 
- we import @Controller @GetMapping("")  

```java
package com.immanuel.daikichiroutes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    
    @GetMapping("/demo")
    public String demo(){
        return "demo.jsp";
    }
}

```


