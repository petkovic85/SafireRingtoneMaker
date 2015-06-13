package com.example.ringtonegenerator;

public class WavFile
{

    private int channels;
    private int sampleRate;
    private float[] data;
    private String name;

    public WavFile(int channels, int sampleRate, float[] data)
    {

        this.channels = channels;
        this.sampleRate = sampleRate;
        this.data = data;
    }

    public WavFile(int channels, int sampleRate)
    {

        this.channels = channels;
        this.sampleRate = sampleRate;
    }


    public int getChannels(){return channels;}
    public int getSampleRate(){return sampleRate;}
    public int getDataSize(){return data.length;}
    public float[] getData(){return data;}
    public void setData(float[]data){this.data=data;}
    public String toString(){
        return  " chnls="+channels+
                " smpRate="+sampleRate+
                " dataSize="+data.length;
    }
}

	
