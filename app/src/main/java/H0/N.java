package H0;

import Z.AbstractC1725n;
import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes2.dex */
public final class N extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final N f6778Z = new N(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final N f6779h0 = new N(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final N f6780i0 = new N(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final N f6781j0 = new N(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6782Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(int i10) {
        super(2);
        this.f6782Y = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f6782Y) {
            case 0:
                L0.j h10 = ((L0.o) obj).h();
                L0.u uVar = L0.r.f10459o;
                P p10 = P.f6846h0;
                return Integer.valueOf(Float.compare(((Number) h10.s(uVar, p10)).floatValue(), ((Number) ((L0.o) obj2).h().s(uVar, p10)).floatValue()));
            case 1:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                    }
                }
                return yVar;
            case 2:
                ((AbstractC0707u0) obj).I((Matrix) obj2);
                return yVar;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                return yVar;
        }
    }
}
