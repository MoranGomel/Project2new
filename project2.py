from selenium import webdriver
driver = webdriver.Chrome(executable_path="C:\\Users\\moran\\Downloads\\chromedriver_win32/chromedriver.exe")
def Project2():
    driver.get("http://192.168.99.100:5000")
    x=driver.find_element_by_xpath("//*[contains(text(),'Hello')]")
    print (x.text)

Project2()







