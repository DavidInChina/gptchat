package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.play_billing.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2481x {
    protected int zza;

    public abstract int a(AbstractC2486z0 abstractC2486z0);

    public final byte[] b() {
        try {
            int c10 = c();
            byte[] bArr = new byte[c10];
            H h10 = new H(bArr, c10);
            Q q10 = (Q) this;
            AbstractC2486z0 a5 = C2480w0.f26985c.a(q10.getClass());
            I i10 = h10.f26845l;
            if (i10 == null) {
                i10 = new I(h10);
            }
            a5.f(q10, i10);
            if (c10 - h10.f26848o == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(android.gov.nist.core.a.A("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    public abstract int c();
}
