
        
CREATE TABLE CLIENT
        (
        id_client NUMBER(10) auto_increment,
        nom VARCHAR2(32) NOT NULL,
		prenom VARCHAR2(32) NOT NULL,
		adresse VARCHAR2(64) NOT NULL,
        PRIMARY KEY(id_client)
        );
        
        
        CREATE TABLE COMPTE
        (
        id_compte NUMBER(10) NOT NULL,
        id_client NUMBER(10) NOT NULL,
        solde_compte VARCHAR2(10),
        PRIMARY KEY(id_compte),
        foreign key (id_client) references CLIENT(id_client)
        );