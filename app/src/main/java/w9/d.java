package W9;

import d4.AbstractC2592a;
import d4.AbstractC2596e;
import d4.AbstractC2597f;
import d4.AbstractC2599h;
import d4.C2593b;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class d implements AbstractC2599h {

    /* renamed from: a  reason: collision with root package name */
    public static final d f20834a = new Object();

    @Override // d4.AbstractC2599h
    public final AbstractC2596e a(AbstractC2597f abstractC2597f, long j6, long j10, AbstractC2592a[] abstractC2592aArr) {
        AbstractC3557B.c0("driver", abstractC2597f);
        AbstractC3557B.c0("callbacks", abstractC2592aArr);
        return new C2593b(new b(j6, abstractC2592aArr, j10, abstractC2597f, null));
    }

    @Override // d4.AbstractC2599h
    public final AbstractC2596e b(AbstractC2597f abstractC2597f) {
        AbstractC3557B.c0("driver", abstractC2597f);
        return new C2593b(new a(abstractC2597f, null));
    }
}
