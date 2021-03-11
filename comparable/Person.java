package com.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Person implements Comparable<Person>{

    protected int m_id;
    protected float m_height;
    protected String m_name;

    public Person(int m_id, float m_height, String m_name) {
        this.m_id = m_id;
        this.m_height = m_height;
        this.m_name = m_name;
    }

    @Override
    public int compareTo(Person o) {
        // compare myself (this) to Person o
        // if this should come later in the line return 1
        // if this should come before in the line return -1
        // if does not matter return 0
        // -1 0 1
        // A     B   +1
        //   AB       0
        // B     A   -1
        // this
        if (this.m_id > o.m_id) {
            return 1; // this will come after
        }
        else if (this.m_id < o.m_id) {
            return -1; // this will come before
        }
        return 0; // equal -- order not matters
    }
}
