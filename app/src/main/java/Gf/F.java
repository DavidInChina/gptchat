package Gf;

import Mf.AbstractC1007p;

/* loaded from: classes2.dex */
public final class F extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public static final F f6341Y = new kotlin.jvm.internal.o(2);

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        Integer b10 = Mf.r.b((AbstractC1007p) obj, (AbstractC1007p) obj2);
        if (b10 == null) {
            i10 = 0;
        } else {
            i10 = b10.intValue();
        }
        return Integer.valueOf(i10);
    }
}
