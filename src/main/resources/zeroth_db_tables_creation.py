from mysql.connector import connection
import sys

db= connection.MySQLConnection(host="localhost",user=sys.argv[1],passwd=sys.argv[2])
cursor=db.cursor()
cursor.execute("CREATE DATABASE " +sys.argv[3])
db= connection.MySQLConnection(host="localhost",user=sys.argv[1],passwd=sys.argv[2],database=sys.argv[3])
cursor=db.cursor()
query={}
query[0] = "CREATE TABLE homeAccounts.expense(id BIGINT PRIMARY KEY AUTO_INCREMENT, type VARCHAR(200),tenderMode VARCHAR(100),amount DOUBLE,tenderModeDetailsId BIGINT, vendorDetailsId BIGINT,expenseCategoryId BIGINT,description VARCHAR(2000),createdDate DATETIME,updatedDate DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP);"
query[1] = "CREATE TABLE homeAccounts.TenderModeDetails(id BIGINT PRIMARY KEY AUTO_INCREMENT,name VARCHAR(200),description VARCHAR(500),createdDate DATETIME,updatedDate DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP);"
query[2] = "CREATE TABLE homeAccounts.expenseCategories(id BIGINT PRIMARY KEY AUTO_INCREMENT, type VARCHAR(100),description VARCHAR(200),createdDate DATETIME,updatedDate DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP);"
query[3] = "CREATE TABLE homeAccounts.vendorDetails(id BIGINT PRIMARY KEY AUTO_INCREMENT,type VARCHAR(200),locationId VARCHAR(200),createdDate DATETIME,updatedDate DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP);"
for i in query:
	cursor.execute(query[i])