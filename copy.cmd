cd "C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps"
c:
rmdir /S /Q spring
del /F /Q spring.war
cd "e:\java\workspaces\SpringExample\war\"
e:
xcopy /s spring.war "C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps"
cd "c:\Program Files\Apache Software Foundation\Tomcat 9.0\bin\"
c:
startup.bat