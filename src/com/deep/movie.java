package com.deep;

import java.util.Arrays;
import java.util.Objects;

public class movie implements Comparable<movie>  {
    public static void main(String[] args){

        movie[] mp4={new movie("Deepak",1995),
                new movie("Deepak1",1993)   ,
                new movie("Deepak2",1992),
                new movie("Deepak3",1991)
        };

        Arrays.sort(mp4);

//        Arrays.sort(mp4, (a,b)->a.Year>b.Year?-1:0);


        for(movie e:mp4){
            System.out.println(e.name+" "+e.getYear());
        }

    }

    @Override
    public int compareTo(movie o)
    {
        if (this.Year != o.getYear()) {
            return this.Year - o.getYear();
        }
        return this.name.compareTo(o.getName());
    }


    private String name;

    public int Year;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }


    public movie(String name, int Year)
    {
        this.name=name;
        this.Year=Year;

    }


}
