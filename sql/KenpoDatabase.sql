
CREATE TABLE Technique (
                TechniqueId INT AUTO_INCREMENT NOT NULL,
                TechniqueName VARCHAR(50) NOT NULL,
                BeltLevel VARCHAR(20) NOT NULL,
                PRIMARY KEY (TechniqueId)
);


CREATE TABLE Instructor (
                InstructorId INT AUTO_INCREMENT NOT NULL,
                InstructorName VARCHAR(50) NOT NULL,
                PRIMARY KEY (InstructorId)
);


CREATE TABLE State (
                StateId CHAR(1) NOT NULL,
                StateName VARCHAR(30) NOT NULL,
                PRIMARY KEY (StateId)
);


CREATE TABLE PaymentFrequency (
                PaymentFrequencyId CHAR(1) NOT NULL,
                PaymentFrequencyName VARCHAR(10) NOT NULL,
                PRIMARY KEY (PaymentFrequencyId)
);

ALTER TABLE PaymentFrequency MODIFY COLUMN PaymentFrequencyName VARCHAR(10) COMMENT 'monthly, quarterly, annually, cash, etc.';


CREATE TABLE Student (
                StudentId INT AUTO_INCREMENT NOT NULL,
                LastName VARCHAR(50) NOT NULL,
                FirstName VARCHAR(50) NOT NULL,
                StudentAddress VARCHAR(100) NOT NULL,
                CityName VARCHAR(50) NOT NULL,
                StateId CHAR(1) NOT NULL,
                ZipCode VARCHAR(5) NOT NULL,
                TechniqueId INT NOT NULL,
                ContractStatus BOOLEAN NOT NULL,
                InstructorId INT NOT NULL,
                PaymentFrequencyId CHAR(1) NOT NULL,
                StartDate DATE NOT NULL,
                PRIMARY KEY (StudentId)
);

ALTER TABLE Student MODIFY COLUMN ContractStatus BOOLEAN COMMENT 'Active or Inactive';


ALTER TABLE Student ADD CONSTRAINT technique_student_fk
FOREIGN KEY (TechniqueId)
REFERENCES Technique (TechniqueId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Student ADD CONSTRAINT instructor_student_fk
FOREIGN KEY (InstructorId)
REFERENCES Instructor (InstructorId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Student ADD CONSTRAINT states_student_fk
FOREIGN KEY (StateId)
REFERENCES State (StateId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Student ADD CONSTRAINT paymentfrequency_student_fk
FOREIGN KEY (PaymentFrequencyId)
REFERENCES PaymentFrequency (PaymentFrequencyId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;
