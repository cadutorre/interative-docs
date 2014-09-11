CREATE TABLE tab_menu (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  descricao VARCHAR(255) NOT NULL,
  icone VARCHAR(50),
  url VARCHAR(255) NOT NULL,
  id_menu_pai INTEGER UNSIGNED,
  PRIMARY KEY (id)
);

ALTER TABLE tab_menu ADD CONSTRAINT fk_menu_id_menu_id_menu_pai FOREIGN KEY fk_menu_id_menu_id_menu_pai (id_menu_pai)
    REFERENCES tab_menu (id)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT;
    
    
insert into tab_menu(descricao,icone, url,id_menu_pai) values('Cadastros','fa fa-fw fa-edit','',null);
insert into tab_menu(descricao,icone, url,id_menu_pai) values('Metas','','metas.html',null);

insert into tab_menu(descricao,icone, url,id_menu_pai) values('Rastreabilidade','fa fa-fw fa-table','rastreabilidade.html',null);
insert into tab_menu(descricao,icone, url,id_menu_pai) values('Configuração','fa fa-fw fa-wrench','config.html',null);
insert into tab_menu(descricao,icone, url,id_menu_pai) values('Dashboard','fa fa-fw fa-dashboard','dashboard.html',null);

update tab_menu M set M.id_menu_pai = (select * from (select id from tab_menu where descricao = 'Cadastros') as menu) where M.descricao = 'Metas';