CREATE TABLE examination(
examid			INT(5),
examdesc		VARCHAR(50) NOT NULL,
certifiedby		VARCHAR(40),
duration		int,
CONSTRAINT exam_examid_pk PRIMARY KEY(examid)
);


CREATE TABLE customer(
icno			VARCHAR(15),
cust_name		VARCHAR(50) NOT NULL,
address			VARCHAR(75),
city			VARCHAR(30),
postcode		INT(5),
state			VARCHAR(30),
CONSTRAINT customer_icno_pk PRIMARY KEY(icno)
);

CREATE TABLE attendExam(
icno			VARCHAR(15) NOT NULL,
examid			INT(5) NOT NULL,
examdate		DATE NOT NULL,
examtime		TIME NOT NULL,
result			INT,
certified		CHAR(1),
CONSTRAINT attendExam_fk FOREIGN KEY(icno) REFERENCES customer(icno),
CONSTRAINT 	attendExam2_fk FOREIGN KEY(examid) REFERENCES examination(examid)
);

CREATE TABLE invoice(
invoiceno		INT(7),
invoicedate		DATE NOT NULL,
icno			VARCHAR(15) NOT NULL,
pymttype		INT(7) NOT NULL,
paidamount		DECIMAL(9,2),
CONSTRAINT invoice_invoiceno_pk PRIMARY KEY(invoiceno),
CONSTRAINT 	invoice_fk FOREIGN KEY(icno) REFERENCES customer(icno)
);

CREATE TABLE training(
trainingid		INT(5),
trainingtype	INT(1) NOT NULL,
trainingdesc	VARCHAR(65) NOT NULL,
duration		INT(4),
trainingfees	DECIMAL(9,2),
provider		VARCHAR(50),
examid			INT(5),
CONSTRAINT training_trainingid_pk PRIMARY KEY(trainingid),
CONSTRAINT training_fk FOREIGN KEY(examid) REFERENCES examination(examid)
);

CREATE TABLE invoiceLine(
invoiceno		INT(7) NOT NULL,
trainingid		INT(5) NOT NULL,
quantity		INT(5),
totalamount		DECIMAL(9,2),
CONSTRAINT invoiceLine_fk FOREIGN KEY(invoiceno) REFERENCES invoice(invoiceno),
CONSTRAINT 	invoiceLine1_fk FOREIGN KEY(trainingid) REFERENCES training(trainingid)
);