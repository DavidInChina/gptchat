package H9;

import wf.AbstractC6216a;

/* renamed from: H9.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0719a extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f7507Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ w9.j f7508Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f7509h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0719a(w9.j jVar, AbstractC6216a abstractC6216a) {
        super(0);
        this.f7508Z = jVar;
        this.f7509h0 = abstractC6216a;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        jf.y yVar = jf.y.f36177a;
        w9.j jVar = this.f7508Z;
        AbstractC6216a abstractC6216a = this.f7509h0;
        int i10 = this.f7507Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        abstractC6216a.mo122invoke();
                        jVar.a();
                        break;
                    default:
                        jVar.a();
                        abstractC6216a.mo122invoke();
                        break;
                }
                return yVar;
            default:
                switch (i10) {
                    case 0:
                        abstractC6216a.mo122invoke();
                        jVar.a();
                        break;
                    default:
                        jVar.a();
                        abstractC6216a.mo122invoke();
                        break;
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0719a(AbstractC6216a abstractC6216a, w9.j jVar) {
        super(0);
        this.f7509h0 = abstractC6216a;
        this.f7508Z = jVar;
    }
}
