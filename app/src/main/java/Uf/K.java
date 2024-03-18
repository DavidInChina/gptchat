package Uf;

import Mf.AbstractC0994c;
import Pf.T;
import id.AbstractC3557B;
import rg.AbstractC5493d;
import zc.C6821H;

/* loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final K f17771Y = new kotlin.jvm.internal.o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10;
        AbstractC0994c abstractC0994c = (AbstractC0994c) obj;
        AbstractC3557B.c0("it", abstractC0994c);
        int i10 = AbstractC1443e.f17817m;
        T t10 = (T) abstractC0994c;
        if (Jf.l.z(t10) && AbstractC5493d.b(t10, new C6821H(27, t10)) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
