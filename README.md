# SeleniumTest

Selenium test developed in order to check functioning with Xvfb and Firefox in headless mode. 

Test was run on CentOS 7.2.1511 

Prepare :  
 yum -y install firefox Xvfb libXfont Xorg 
 
 Xvfb :99 -ac -screen 0 1280x1024x24 &


In order to run test headlessly : 

export DISPLAY=:99

mvn -e clean test
