package com.skillstorm.week2.day5.interfaces;

// This inherits those stubs from Storage
public interface Vault extends Storage {
	public void lock(); // Maybe while the vault is locked, no items can be added or removed, or retrieved
	public void unlock(); // While unlocked, it behaves like a regular storage
}
