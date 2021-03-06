package br.com.caelum.vraptor.serialization;

import javax.enterprise.context.Dependent;

import br.com.caelum.vraptor.serialization.gson.GsonDeserialization;

/**
 * Used in {@link GsonDeserialization} to define some behaviors of deserializtion.
 * 
 * @author Renan Montenegro
 * @since REPLACE_ME_ON_NEXT_RELEASE
 */
@Dependent
public class Deserializee {

	private boolean withoutRoot;

	public boolean isWithoutRoot() {
		return withoutRoot;
	}

	public void setWithoutRoot(boolean withoutRoot) {
		this.withoutRoot = withoutRoot;
	}
	
}
