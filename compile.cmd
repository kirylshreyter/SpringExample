rmdir /S /Q target
mkdir target
javac -cp lib/* -d target -sourcepath src src/com/kirylshreyter/springexample/configuration/initializers/AppInitializer.java src/com/kirylshreyter/springexample/controllers/UserController.java src/com/kirylshreyter/springexample/repositories/UserRepository.java src/com/kirylshreyter/springexample/services/impl/UserServiceImpl.java
pause