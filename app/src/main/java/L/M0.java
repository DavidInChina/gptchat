package L;

import B.W0;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class M0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public static final M0 f9999Y = new kotlin.jvm.internal.o(2);

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        i0.d dVar = (i0.d) obj;
        N0 n02 = (N0) obj2;
        Object[] objArr = new Object[2];
        boolean z10 = false;
        objArr[0] = Float.valueOf(n02.f10005a.h());
        if (((W0) n02.f10009e.getValue()) == W0.f1213Y) {
            z10 = true;
        }
        objArr[1] = Boolean.valueOf(z10);
        return AbstractC4344b.G0(objArr);
    }
}
