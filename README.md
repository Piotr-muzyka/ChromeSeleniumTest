# SeleniumTest

Selenium test developed in order to check functioning with Xvfb and Firefox in headless mode. 

Test was run on CentOS 7.2.1511 

Prepare :  
 yum -y install firefox Xvfb libXfont Xorg 

for chrome : 
yum -y install google-chrome-stable chromedriver

In order to run test headlessly : 
Xvfb :99 -ac -screen 0 1280x1024x24 &
export DISPLAY=:99
mvn -e clean test

Or 
xvfb-run -a mvn -e clean test

//TEST
export DISPLAY=:0
Xvfb :0 -screen 0 1024x768x24 &
google-chrome --disable-gpu --no-sandbox http://mytestpage.com
