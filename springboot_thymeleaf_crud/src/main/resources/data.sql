-- parola pt amandoi este "parola"
INSERT INTO utilizatori (nume, utilizator, parola, rol)
VALUES ("Popescu Ion", "editor", "$2a$12$Bfd3eibZxKk8u5N0BPHvfejyzhdtL0xFlqjgnnfpS6.snj9dZQeNy", "ROLE_EDITOR");

INSERT INTO utilizatori (nume, utilizator, parola, rol)
VALUES ("Popescu Dan", "user", "$2a$12$Bfd3eibZxKk8u5N0BPHvfejyzhdtL0xFlqjgnnfpS6.snj9dZQeNy", "ROLE_USER");

insert into masini(nr_inmatriculare,
id_utilizator,
marca,
modelul,
culoarea,
anul_fabricatiei,
capacitatea_cilindrica,
tipul_de_combustibil,
puterea,
cuplul,
volumul_portbagajului,
pretul)
values ("TM12AAA",1,"ford","mondeo","albastru",2014,2000,"electric",140,180,600,9000);

insert into masini(nr_inmatriculare,
id_utilizator,
marca,
modelul,
culoarea,
anul_fabricatiei,
capacitatea_cilindrica,
tipul_de_combustibil,
puterea,
cuplul,
volumul_portbagajului,
pretul)
values ("TM14CSS",1,"seat","leon","galben",2015,1800,"benzina",150,120,350,10500);
