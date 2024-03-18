package io.ktor.websocket;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class m extends q {
    public m(byte[] bArr) {
        super(s.f33674i0, bArr, false, false, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(b bVar) {
        this(N.l0(r3));
        AbstractC3557B.c0("reason", bVar);
        Me.c cVar = new Me.c();
        try {
            R4.b.q2(cVar, bVar.f33613a);
            N.E0(cVar, r3, 0, bVar.f33614b.length(), Lg.a.f11131a);
            Me.d p10 = cVar.p();
            AbstractC3557B.c0("packet", p10);
        } catch (Throwable th2) {
            cVar.close();
            throw th2;
        }
    }
}
