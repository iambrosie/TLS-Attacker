/**
 * TLS-Attacker - A Modular Penetration Testing Framework for TLS
 *
 * Copyright 2014-2016 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package de.rub.nds.tlsattacker.tls.constants;

/**
 * @author Juraj Somorovsky <juraj.somorovsky@rub.de>
 */
public enum PRFAlgorithm {

    TLS_PRF_LEGACY(MacAlgorithm.NULL),
    TLS_PRF_SHA256(MacAlgorithm.HMAC_SHA256),
    TLS_PRF_SHA384(MacAlgorithm.HMAC_SHA384);

    private PRFAlgorithm(MacAlgorithm macAlgorithm) {
	this.macAlgorithm = macAlgorithm;
    }

    private final MacAlgorithm macAlgorithm;

    public MacAlgorithm getMacAlgorithm() {
	return macAlgorithm;
    }
}
