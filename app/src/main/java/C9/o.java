package C9;

import android.gov.nist.javax.sip.header.ParameterNames;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import sd.AbstractC5616e;
import sd.C5615d;
import td.C5756a;

/* loaded from: classes.dex */
public final class o implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f2806a;

    public o(AbstractC2400f abstractC2400f) {
        this.f2806a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f2806a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new AbstractC5616e((C5615d) obj, ParameterNames.SESSION, new C5756a(nd.h.Companion.serializer()), null);
    }
}
