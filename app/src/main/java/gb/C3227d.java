package gb;

import id.AbstractC3557B;

/* renamed from: gb.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3227d extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31394Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f31395Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ w9.j f31396h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3227d(wf.k kVar, w9.j jVar, int i10) {
        super(1);
        this.f31394Y = i10;
        this.f31395Z = kVar;
        this.f31396h0 = jVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        wf.k kVar = this.f31395Z;
        w9.j jVar = this.f31396h0;
        int i10 = this.f31394Y;
        switch (i10) {
            case 0:
                k0 k0Var = (k0) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("action", k0Var);
                        kVar.invoke(k0Var);
                        jVar.a();
                        break;
                    default:
                        AbstractC3557B.c0("action", k0Var);
                        kVar.invoke(k0Var);
                        jVar.a();
                        break;
                }
                return yVar;
            default:
                k0 k0Var2 = (k0) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("action", k0Var2);
                        kVar.invoke(k0Var2);
                        jVar.a();
                        break;
                    default:
                        AbstractC3557B.c0("action", k0Var2);
                        kVar.invoke(k0Var2);
                        jVar.a();
                        break;
                }
                return yVar;
        }
    }
}
