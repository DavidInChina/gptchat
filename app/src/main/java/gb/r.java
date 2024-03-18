package gb;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ List f31507Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f31508Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f31509h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f31510i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ArrayList arrayList, int i10, int i11, int i12) {
        super(1);
        this.f31507Y = arrayList;
        this.f31508Z = i10;
        this.f31509h0 = i11;
        this.f31510i0 = i12;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        E0.c0 c0Var = (E0.c0) obj;
        AbstractC3557B.c0("$this$layout", c0Var);
        int i10 = this.f31508Z;
        Iterator it = kf.t.Q2(this.f31507Y, i10, i10).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 >= 0) {
                int i13 = 0;
                for (Object obj2 : (List) next) {
                    int i14 = i13 + 1;
                    if (i13 >= 0) {
                        int i15 = this.f31509h0 + this.f31510i0;
                        E0.c0.g(c0Var, (E0.d0) obj2, i13 * i15, i15 * i11);
                        i13 = i14;
                    } else {
                        AbstractC4344b.d1();
                        throw null;
                    }
                }
                i11 = i12;
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
        return jf.y.f36177a;
    }
}
