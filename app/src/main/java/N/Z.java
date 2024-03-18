package N;

import E0.AbstractC0461u;
import q0.C5251c;

/* loaded from: classes.dex */
public final class Z extends kotlin.jvm.internal.o implements wf.r {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ f0 f12273Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(f0 f0Var) {
        super(6);
        this.f12273Y = f0Var;
    }

    @Override // wf.r
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        AbstractC0461u abstractC0461u = (AbstractC0461u) obj2;
        long j6 = ((C5251c) obj3).f43623a;
        long j10 = ((C5251c) obj4).f43623a;
        f0 f0Var = this.f12273Y;
        long a5 = f0.a(f0Var, abstractC0461u, j6);
        long a10 = f0.a(f0Var, abstractC0461u, j10);
        f0Var.j(booleanValue);
        f0Var.getClass();
        return Boolean.valueOf(f0Var.m(a5, a10, ((Boolean) obj5).booleanValue(), (AbstractC1038w) obj6));
    }
}
