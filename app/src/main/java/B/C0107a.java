package B;

import E0.AbstractC0461u;
import G0.AbstractC0587p;

/* renamed from: B.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107a extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f1252Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC0587p f1253Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0107a(AbstractC0587p abstractC0587p, int i10) {
        super(1);
        this.f1252Y = i10;
        this.f1253Z = abstractC0587p;
    }

    public final Boolean a(B0.u uVar) {
        boolean z10;
        int i10 = this.f1252Y;
        AbstractC0587p abstractC0587p = this.f1253Z;
        switch (i10) {
            case 0:
                return (Boolean) ((AbstractC0137k) abstractC0587p).f1381u0.invoke(uVar);
            default:
                if (((J0) ((AbstractC0137k) abstractC0587p)).f1113M0.a(r9.y.Q0(uVar, true)) == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(!z10);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f1252Y) {
            case 0:
                return a((B0.u) obj);
            case 1:
                return a((B0.u) obj);
            default:
                ((C0165t1) this.f1253Z).f1508F0.f1172y0 = (AbstractC0461u) obj;
                return jf.y.f36177a;
        }
    }
}
