package android.gov.nist.javax.sip;

import android.gov.nist.core.net.AddressResolver;
import android.gov.nist.javax.sip.stack.HopImpl;
import android.gov.nist.javax.sip.stack.MessageProcessor;
import b.AbstractC2092b;

/* loaded from: classes2.dex */
public class DefaultAddressResolver implements AddressResolver {
    @Override // android.gov.nist.core.net.AddressResolver
    public AbstractC2092b resolveAddress(AbstractC2092b abstractC2092b) {
        if (abstractC2092b.getPort() != -1) {
            return abstractC2092b;
        }
        return new HopImpl(abstractC2092b.getHost(), MessageProcessor.getDefaultPort(abstractC2092b.getTransport()), abstractC2092b.getTransport());
    }
}
