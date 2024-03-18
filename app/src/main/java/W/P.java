package W;

import z.C6712n;

/* loaded from: classes2.dex */
public final class P extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19491Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f19492Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(int i10, Object obj) {
        super(1);
        this.f19491Y = i10;
        this.f19492Z = obj;
    }

    public final void a(float f6) {
        int i10 = this.f19491Y;
        Object obj = this.f19492Z;
        switch (i10) {
            case 0:
                C1568j1 c1568j1 = (C1568j1) ((n4) obj);
                int i11 = c1568j1.f20168a;
                o4 o4Var = c1568j1.f20169b;
                o4Var.d(o4Var.f20268c.h() + f6);
                return;
            default:
                C1568j1 c1568j12 = (C1568j1) ((n4) obj);
                int i12 = c1568j12.f20168a;
                o4 o4Var2 = c1568j12.f20169b;
                o4Var2.d(o4Var2.f20268c.h() + f6);
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f19491Y) {
            case 0:
                a(((Number) obj).floatValue());
                return yVar;
            case 1:
                a(((Number) obj).floatValue());
                return yVar;
            default:
                ((o4) this.f19492Z).d(((Number) ((C6712n) obj).f51333e.getValue()).floatValue());
                return yVar;
        }
    }
}
