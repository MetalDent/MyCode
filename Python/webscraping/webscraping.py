from selenium import webdriver
from BeautifulSoup import BeautifulSoup
import pandas as pd

driver = webdriver.Chrome("/usr/lib/chromium-browser/chromedriver")

products=[] #List to store name of the book
prices=[] #List to store price of the book
ratings=[] #List to store rating of the book
driver.get("https://www.flipkart.com/books/fiction-nonfiction-books/literature-fiction-books/pr?sid=bks,fnf,gld&otracker=clp_banner_2_4.bannerX3.BANNER_theliterature-fiction-store_6RCUPDEH53&fm=neo%2Fmerchandising&iid=M_bd5e801a-54db-4fbb-8199-487de2f78537_3.6RCUPDEH53&ppt=clp&ppn=theliterature-fiction-store&ssid=aafuynrif40000001560077874219")

content = driver.page_source
soup = BeautifulSoup(content)
for a in soup.findAll('a',href=True, attrs={'class':'t-0M7P _2doH3V'}):
	name=a.find('div', attrs={'class':'_2cLu-l'})
	price=a.find('div', attrs={'class':'_1Vfi6u'})
	rating=a.find('div', attrs={'class':'hGSR34'})
	products.append(name.txt)
	prices.append(price.txt)
	ratings.append(rating.txt) 

df = pd.DataFrame({'Product Name':products,'Price':prices,'Rating':ratings}) 
df.to_csv('products.csv', index=False, encoding='utf-8')