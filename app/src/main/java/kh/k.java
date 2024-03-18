package kh;

import E0.M;
import E0.P;
import E0.d0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import kf.w;
import y.D;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Object f37561Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Z0.k kVar) {
        super(3);
        this.f37561Y = kVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Z0.k kVar;
        long j6;
        float f6;
        P p10 = (P) obj;
        M m10 = (M) obj2;
        long j10 = ((Z0.a) obj3).f22782a;
        AbstractC3557B.c0("$this$layout", p10);
        AbstractC3557B.c0("measurable", m10);
        if (!Z0.a.f(j10) || !Z0.a.e(j10)) {
            float l10 = N.l(Math.min(Z0.a.h(j10) / ((int) (kVar.f22804a >> 32)), Z0.a.g(j10) / ((int) (4294967295L & ((Z0.k) this.f37561Y).f22804a))), 1.0f);
            j10 = A7.b.r0(j10, A7.b.n((int) Math.ceil(((int) (j6 >> 32)) * l10), 0, (int) Math.ceil(l10 * f6), 0, 10));
        }
        d0 o10 = m10.o(j10);
        return p10.j0(o10.f4053Y, o10.f4054Z, w.f37484Y, new D(o10, 20));
    }
}
