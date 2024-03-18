package Lf;

import Mf.B;
import Pf.A;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final f f11083Y = new kotlin.jvm.internal.o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        B b10 = (B) obj;
        AbstractC3557B.c0("module", b10);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) A7.b.X0(((A) b10.r(g.f11086f)).f13977j0, A.f13974m0[0])) {
            if (obj2 instanceof Jf.d) {
                arrayList.add(obj2);
            }
        }
        return (Jf.d) kf.t.f2(arrayList);
    }
}
