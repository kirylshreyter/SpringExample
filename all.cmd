rmdir /S /Q target
mkdir target
javac -cp lib/* -d target -sourcepath src src/com/kirylshreyter/springexample/configuration/initializers/AppInitializer.java src/com/kirylshreyter/springexample/controllers/UserController.java src/com/kirylshreyter/springexample/repositories/UserRepository.java src/com/kirylshreyter/springexample/services/impl/UserServiceImpl.java
rmdir /S /Q war
mkdir war
cd war
mkdir WEB-INF
cd WEB-INF
mkdir classes
mkdir lib
cd..
cd..
xcopy /s target war\WEB-INF\classes
xcopy /s lib war\WEB-INF\lib
xcopy /s src\application.properties war\WEB-INF\classes
cd..
cd..
xcopy /s "C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps\snake\index.html" workspaces\SpringExample\war\
xcopy /s "C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps\snake\application.js" workspaces\SpringExample\war\
xcopy /s "C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps\snake\ajax.js" workspaces\SpringExample\war\
xcopy /s "C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps\snake\main.css" workspaces\SpringExample\war\
cd workspaces
cd SpringExample
cd war
jar -cvf spring.war *
pause
