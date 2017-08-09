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
pause