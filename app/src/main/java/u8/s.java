package U8;

import N0.C1046e;
import java.util.Map;
import jf.y;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f17559Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1046e f17560Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ p f17561h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(C1046e c1046e, p pVar, int i10) {
        super(1);
        this.f17559Y = i10;
        this.f17560Z = c1046e;
        this.f17561h0 = pVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f17559Y;
        C1046e c1046e = this.f17560Z;
        p pVar = this.f17561h0;
        switch (i10) {
            case 0:
                int intValue = ((Number) obj).intValue();
                Map map = pVar.f17547b;
                int length = c1046e.f12512Y.length() - 1;
                if (intValue > length) {
                    intValue = length;
                }
                o.f17542b.getClass();
                return Boolean.valueOf(new Kg.e(Kg.m.o1(kf.t.V1(c1046e.a(intValue, intValue, o.f17543c)), new u(map, 0))).hasNext());
            default:
                int intValue2 = ((Number) obj).intValue();
                Map map2 = pVar.f17547b;
                int length2 = c1046e.f12512Y.length() - 1;
                if (intValue2 > length2) {
                    intValue2 = length2;
                }
                o.f17542b.getClass();
                j jVar = (j) Kg.m.j1(Kg.m.o1(kf.t.V1(c1046e.a(intValue2, intValue2, o.f17543c)), new u(map2, 0)));
                if (jVar != null) {
                    jVar.f17533e.mo122invoke();
                }
                return y.f36177a;
        }
    }
}
