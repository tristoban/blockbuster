CREATE TABLE IF NOT EXISTS client (id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(255),email VARCHAR(255),state INT);
CREATE TABLE IF NOT EXISTS employee (id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(255),last_name VARCHAR(255),salary DOUBLE,manager_id INT,FOREIGN KEY (manager_id) REFERENCES manager(id));
CREATE TABLE IF NOT EXISTS manager (id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(255),last_name VARCHAR(255),salary DOUBLE);
CREATE TABLE IF NOT EXISTS manager_employee (manager_id INT,employee_id INT,PRIMARY KEY (manager_id, employee_id),FOREIGN KEY (manager_id) REFERENCES manager(id),FOREIGN KEY (employee_id) REFERENCES employee(id));
CREATE TABLE IF NOT EXISTS movie (id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(255),release_date INT,stock INT,rent_price DOUBLE);
