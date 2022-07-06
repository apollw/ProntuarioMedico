package com.mycompany.blockchain;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Date;
import java.security.NoSuchAlgorithmException;

public class Block {
    
    private String versao;
    private Date Timestamp;
    private String hash;
    private String hashAnterior;
    private Prontuario dados;
    
    public Block(String versao, Date timestamp, Prontuario dados ){ //Os dados aqui sao os prontuarios
           this.versao = versao;
           this.Timestamp = timestamp;
           this.dados = dados;
           this.hash = calcularHash(); //função que calcula o hash    
    }
    
    public String calcularHash(){
        
        String dadosParaHash = ""+this.versao+this.Timestamp+this.hashAnterior+this.dados;

        MessageDigest digest; //Digest significa compilado, digerido
        String encoded = null;

        try {
            digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(dadosParaHash.getBytes(StandardCharsets.UTF_8));
            encoded = Base64.getEncoder().encodeToString(hash);
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace();
        }

        this.hash = encoded;
        return encoded;
    
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public Date getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(Date Timestamp) {
        this.Timestamp = Timestamp;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getHashAnterior() {
        return hashAnterior;
    }

    public void setHashAnterior(String hashAnterior) {
        this.hashAnterior = hashAnterior;
    }

    public Prontuario getDados() {//ALTERADO
        return dados;
    }

    public void setDados(Prontuario dados) {//ALTERADO
        this.dados = dados;
    }
    
}

/*

What is Blockchain?

Blockchain is a Data Structure where it uses blocks and link these blocks together.
Whehn a Block or Blockchain is created, it must have a Genesis Block, and the Genesis
Block is created in the constructor. The Genesis Block is the first block to ever
be created in a Blockchain, and it points to nothing.

The blocks are linked together by hashes.

*/





