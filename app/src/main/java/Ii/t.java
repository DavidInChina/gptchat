package Ii;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final t f8682Z = new t(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final t f8683h0 = new t(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8684Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i10) {
        super(1);
        this.f8684Y = i10;
    }

    public final void a(wf.k kVar) {
        switch (this.f8684Y) {
            case 0:
                AbstractC3557B.c0("updateAppStartData", kVar);
                boolean z10 = v.f8689a;
                Hi.c cVar = v.f8691c;
                if (cVar != null) {
                    v.f8691c = (Hi.c) kVar.invoke(cVar);
                    return;
                } else {
                    AbstractC3557B.C2("appStartData");
                    throw null;
                }
            default:
                AbstractC3557B.c0("updateAppStartData", kVar);
                boolean z11 = v.f8689a;
                Hi.c cVar2 = v.f8691c;
                if (cVar2 != null) {
                    v.f8691c = (Hi.c) kVar.invoke(cVar2);
                    return;
                } else {
                    AbstractC3557B.C2("appStartData");
                    throw null;
                }
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f8684Y) {
            case 0:
                a((wf.k) obj);
                return yVar;
            default:
                a((wf.k) obj);
                return yVar;
        }
    }
}
