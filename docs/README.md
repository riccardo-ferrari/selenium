# Liferay Sales Engineering - Selenium

This repository has been a combined effort of several members of Liferay Sales Engineering.

It has primarily been created to exercise Liferay DXP demonstrations to populate Liferay Analytics Cloud.

It has been refactored to promote reuse, avoid duplication and allow new scripts to be created a lot quicker.

## Highlights

### Superclass

There are methods in ClickpathBase which allow scripts to mark elements using various CSS techniques, there is
the ability to take screenshots of the page.

### VPN

The UoW script has examples of how to automate VPN connections using [Tunnelblick](https://tunnelblick.net/), which is
an open source application for macOS which allows you to connect to OpenVPN compatible VPN servers. The script also
makes use of an Open Scripting Architecture command to connect and disconnect to a set of VPN configurations at random.

### Command Line Interface

The UoW script also has an example of how [Apache Commons CLI](https://commons.apache.org/proper/commons-cli/) can be used
to execute the script from the command line.

### Do Not Track Detection

In case your browser sends a Do Not Track header, this would cause AC to not register your traffic. The scripts can detect this with the help of [this plugin](https://github.com/olafk/liferay-request-attribute-contributor-web) deployed to your DXP instance, and the fragment described in the README on your Master Page.

## Drivers

You need an appropriate driver for your chosen web browser. Currently, the scripts are implemented to
use either Chrome or Firefox but other drivers could be added fairly easily.

### Chrome

https://googlechromelabs.github.io/chrome-for-testing/

### Firefox

https://github.com/mozilla/geckodriver/releases