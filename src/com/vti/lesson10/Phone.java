package com.vti.lesson10;

public class Phone<K, V> extends MyMap<K, V> {

	public Phone(K key, V value) {
		super(key, value);
	}
	
	public V getPhoneNumber() {
		return value;
	}
}
