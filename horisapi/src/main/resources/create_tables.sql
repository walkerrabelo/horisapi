USE horis;

CREATE TABLE aula (
  id bigint(20) NOT NULL,
  fim datetime DEFAULT NULL,
  inicio datetime DEFAULT NULL,
  professor_id bigint(20) DEFAULT NULL,
  turma_id bigint(20) DEFAULT NULL,
  unidade_curricular_id bigint(20) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FK9dvd4nr6beh0lp2vp3v82xfn4 (professor_id),
  KEY FKjvf4kup1uubq8y4hldrijp2ro (turma_id),
  KEY FKkjcmtwb35umione89lmbpyae6 (unidade_curricular_id)
);
CREATE TABLE curso (
  id bigint(20) NOT NULL,
  area varchar(255) DEFAULT NULL,
  carga_horaria int(11) NOT NULL,
  nome varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE curso_unidades_curriculares (
  curso_id bigint(20) NOT NULL,
  unidades_curriculares_id bigint(20) NOT NULL,
  KEY FK7dxt3r3rjqxm9jqutyhmyltfk (unidades_curriculares_id),
  KEY FKp3nb0i7umv26ds39lrjfh56kg (curso_id)
);
CREATE TABLE hibernate_sequence (
  next_val bigint(20) DEFAULT NULL
);

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO hibernate_sequence VALUES (1);
INSERT INTO hibernate_sequence VALUES (1);
INSERT INTO hibernate_sequence VALUES (1);
INSERT INTO hibernate_sequence VALUES (1);
INSERT INTO hibernate_sequence VALUES (1);

--
-- Table structure for table `professor`
--

CREATE TABLE professor (
  id bigint(20) NOT NULL,
  area varchar(255) DEFAULT NULL,
  ativo bit(1) NOT NULL,
  nome varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE turma (
  id bigint(20) NOT NULL,
  curso_id bigint(20) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FKemy6du4jr6a56m5e5sp7nufe7 (curso_id)
);
CREATE TABLE unidade_curricular (
  id bigint(20) NOT NULL,
  area varchar(255) DEFAULT NULL,
  carga_horaria int(11) NOT NULL,
  nome varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE unidade_curricular_cursos (
  unidade_curricular_id bigint(20) NOT NULL,
  cursos_id bigint(20) NOT NULL,
  KEY FKe7wy3egllunuhdq184y5ib0mh (cursos_id),
  KEY FKhlchk1mt7cc45myccf5c3l75k (unidade_curricular_id)
);

-- Dump completed
