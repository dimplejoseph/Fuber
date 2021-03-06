package com.fuber2.fuber2;

import com.mongodb.Mongo;
import com.yammer.dropwizard.lifecycle.Managed;

/**
 * @author Dimple Joseph
 *
 */
public class MongoManaged implements Managed {

	private Mongo mongo;

	public MongoManaged(Mongo mongo) {
		this.mongo = mongo;
	}

	public void start() throws Exception {
	}

	public void stop() throws Exception {
		mongo.close();
	}

}