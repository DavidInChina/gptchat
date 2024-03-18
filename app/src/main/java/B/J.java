package B;

import q0.C5251c;

/* loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f1106Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f1107Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f1108h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(Object obj, int i10, Object obj2) {
        super(1);
        this.f1106Y = i10;
        this.f1107Z = obj;
        this.f1108h0 = obj2;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f1106Y;
        Object obj2 = this.f1108h0;
        Object obj3 = this.f1107Z;
        switch (i10) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((K) obj3).f1120a.m((O) obj2);
                return yVar;
            case 1:
                long j6 = ((C5251c) obj).f43623a;
                A1 a12 = (A1) obj3;
                AbstractC0130h1 abstractC0130h1 = (AbstractC0130h1) obj2;
                if (a12.f1025d) {
                    j6 = C5251c.i(-1.0f, j6);
                }
                long a5 = a12.a(abstractC0130h1, j6, 2);
                if (a12.f1025d) {
                    a5 = C5251c.i(-1.0f, a5);
                }
                return new C5251c(a5);
            default:
                ((Number) obj).longValue();
                b2 b2Var = (b2) obj3;
                float f6 = b2Var.f1281e;
                b2Var.f1281e = 0.0f;
                ((wf.k) obj2).invoke(Float.valueOf(f6));
                return yVar;
        }
    }
}
