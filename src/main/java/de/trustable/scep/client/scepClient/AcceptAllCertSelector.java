package de.trustable.scep.client.scepClient;

import java.security.cert.CertSelector;
import java.security.cert.Certificate;

public class AcceptAllCertSelector implements CertSelector {

	@Override
	public boolean match(Certificate cert) {
		return true;
	}

	@Override
	public CertSelector clone() {
		return null;
	}

}