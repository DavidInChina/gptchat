package ta;

import id.AbstractC3557B;

/* renamed from: ta.E  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5689E extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45816Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5689E(int i10) {
        super(3);
        this.f45816Y = i10;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        E0.P p10 = (E0.P) obj;
        E0.M m10 = (E0.M) obj2;
        long j6 = ((Z0.a) obj3).f22782a;
        AbstractC3557B.c0("$this$layout", p10);
        AbstractC3557B.c0("measurable", m10);
        int i10 = this.f45816Y;
        E0.d0 o10 = m10.o(Z0.a.a(j6, i10, i10, 0, 0, 12));
        return p10.j0(Z0.a.h(j6), o10.f4054Z, kf.w.f37484Y, new y.D(o10, 19));
    }
}
