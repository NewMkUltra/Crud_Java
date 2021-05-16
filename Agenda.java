1 package br.com.agenda.model;
2 import java.util.Date;
3 public class Agenda {
4
5    private int id;
6    private String nome;
7    private int idade;
8    private Date dataCadastro;
9    public int getId() {
10       return id;
11   }
12   public void setId(int id) {
13       this.id. = id;
14   }
15   public String getNome() {
16       return nome;
17   }
18   public void setNome(String nome) {
19   this.nome = nome; 
20   }
21   public int getIdade() {
22       return idade;
23   public Date getDataCadastro () {
24       return dataCadastro;
25   }
26   public void setDataCadastro(Date dataCadastro) {
27       this.dataCadastro = dataCadastro;
28   }
29
30 }
 