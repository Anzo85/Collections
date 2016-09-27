package anzo.test;


import anzo.custom.CustomArrayList;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Tests {

    CustomArrayList list;

    @Before

    public void setUP() {

        list = new CustomArrayList();
    }

    @Test
    public void BasicTest() {

        list.add("hi");
        list.add("hello");

        assertThat(list.get(0), is("hi"));
        assertThat(list.get(1), is("hello"));

    }

    @Test

    public void ArrayGrowTest() {

        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");


        assertThat(list.get(0), is("hi"));
        assertThat(list.get(12), is("hi"));

    }

    @Test

    public void ArrayDeleteTest() {

        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");

        list.remove(0);


        assertThat(list.get(0), is("hello"));
        assertThat(list.get(12), is("hello"));
    }

    @Test

    public void ArrayIndexAddTest() {

        list.add("hi");

        list.add(20, "YES");
            
        assertThat(list.get(20), is("YES"));

    }
}

