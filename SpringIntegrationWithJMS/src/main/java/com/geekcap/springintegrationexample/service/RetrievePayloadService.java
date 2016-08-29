package com.geekcap.springintegrationexample.service;

/***
 * This interface might be used in the case of a lightweight message posted by a
 * producer with just a resource id. The implementations will need to go back to
 * the SOR (System Of Record) and retrieve the payload (represented by a String
 * for this case)
 */
public interface RetrievePayloadService {

	public String getPayload(String id);
}
