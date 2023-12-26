package com.bookclub.service;

import java.util.List;

public interface GenericDao<E,K> {
    List<E> list(); // return a list of objects of type E.
    E find(K key); // return an object of type E and by type K value
}
