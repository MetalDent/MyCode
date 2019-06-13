import requests

url = "https://shawglobalnews.files.wordpress.com/2017/08/hogwarts.jpg?quality=70&strip=all&w=372"
r = requests.get(url)

with open("image.jpg", 'wb') as f:
	f.write(r.content)