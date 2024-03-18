package android.gov.nist.javax.sip.address;

import b.AbstractC2092b;
import b.AbstractC2093c;
import d.AbstractC2561b;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public interface RouterExt extends AbstractC2093c {
    @Override // b.AbstractC2093c
    /* synthetic */ AbstractC2092b getNextHop(AbstractC2561b abstractC2561b);

    /* synthetic */ ListIterator getNextHops(AbstractC2561b abstractC2561b);

    @Override // b.AbstractC2093c
    /* synthetic */ AbstractC2092b getOutboundProxy();

    void transactionTimeout(AbstractC2092b abstractC2092b);
}
