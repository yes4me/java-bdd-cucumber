@echo off
echo ================================
echo == Windows: Run all the tests ==
echo ================================

mvn clean ^
    && echo 1------------------------------------- ^
    && mvn compile ^
    && echo 2------------------------------------- ^
    && mvn test
