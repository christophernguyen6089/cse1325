package store;

import java.io.*;

import java.util.ArrayList;

public class Java extends Product{
    protected Darkness darkness;
    protected ArrayList<Shot> shots;

    public Java(String name, double price, double cost, Darkness darkness){
        super(name,price,cost);
        this.darkness = darkness;
        this.shots = new ArrayList<>();
    }
    public void addShot(Shot shot){
        this.shots.add(shot);
    }
    
    public Java(BufferedReader br) throws IOException{
        super(br);
        this.darkness = Darkness.valueOf(br.readLine());
        this.shots = new ArrayList<>();
        int size = Integer.parseInt(br.readLine());
        for(int i=0; i<size; i++){
            shots.add(Shot.valueOf(br.readLine()));
        }
    }
    
    @Override
    public void save(BufferedWriter bw) throws IOException{
        bw.write("store.Java"+'\n');
        super.save(bw);
        bw.write(""+darkness+'\n');
        bw.write(""+shots.size()+'\n');
        for(Shot s: shots){
            bw.write(""+s+'\n');
        }
    }
    
    @Override
    public String toString(){
    //Code courtesy of George F. Rice, respective licenses apply
        String result = name + " (" + darkness + " with ";
        if(shots.size() == 0){
            result += "no shots";
        }
        else{
            String separator = "";
            for(Shot s: shots){
                result += separator +s;
                separator = ", ";
            }
        }
        result += ") $" +price;
        return result;
    }
}

