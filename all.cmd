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
xcopy /s tomcat9\webapps\snake\index.html workspace\SpringExample\war\
xcopy /s tomcat9\webapps\snake\application.js workspace\SpringExample\war\
xcopy /s tomcat9\webapps\snake\ajax.js workspace\SpringExample\war\
xcopy /s tomcat9\webapps\snake\main.css workspace\SpringExample\war\
cd workspace
cd SpringExample
cd war
jar -cvf spring.war *
pause
