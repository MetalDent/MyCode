import smtplib
import sqlite3

from email.mime.text import MIMEText

conn = sqlite3.connect('recipients.db')
cursor = conn.cursor()


msg = MIMEText("""Hello""")
s = smtplib.SMTP('Smtp.gmail.com')
s.starttls()
s.login('username','password')
sender = 'priyapandya274@gmail.com'
recipients = cursor.execute("select * from sheet1;")
msg['Subject'] = "Test"
msg['From'] = sender
msg['To'] = ", ".join(recipients)
s.sendmail(sender, recipients, msg.as_string())
s.quit()