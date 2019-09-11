import sys
from PyQt4.QtGui import *
from PyQt4.QtCore import *

class Example(QWidget):

   def __init__(self):
      super(Example, self).__init__()
      self.initUI()
		
   def initUI(self):
      self.text = "hello world"
      self.setGeometry(100,100, 400,300)
      self.setWindowTitle('Draw Demo')
      self.show()
		
   def paintEvent(self, event):
      qp = QPainter()
      qp.begin(self)
      qp.setPen(QColor(Qt.red))
      qp.setFont(QFont('Arial', 20))
		
      qp.drawText(10,50, "Hello World!")     #Text
      qp.setPen(QColor(Qt.blue))             #Set Pen
      qp.drawLine(10,100,100,100)            #Draw Line
      qp.drawRect(10,150,150,100)            #Draw Rectangle
		
      qp.setPen(QColor(Qt.yellow))        
      qp.drawEllipse(100,50,100,50)          #Draw Ellipse
      qp.drawPixmap(220,10,QPixmap("python.jpg"))
      qp.fillRect(200,175,150,100,QBrush(Qt.SolidPattern))
      qp.end()
		
def main():
   app = QApplication(sys.argv)
   ex = Example()
   sys.exit(app.exec_())
	
if __name__ == '__main__':
   main()