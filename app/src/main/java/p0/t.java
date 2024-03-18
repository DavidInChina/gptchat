package p0;

import E0.AbstractC0446e;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f41718Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ q f41719Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ q f41720h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f41721i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f41722j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(q qVar, q qVar2, int i10, wf.k kVar, int i11) {
        super(1);
        this.f41718Y = i11;
        this.f41719Z = qVar;
        this.f41720h0 = qVar2;
        this.f41721i0 = i10;
        this.f41722j0 = kVar;
    }

    public final Boolean a(AbstractC0446e abstractC0446e) {
        int i10 = this.f41718Y;
        wf.k kVar = this.f41722j0;
        int i11 = this.f41721i0;
        q qVar = this.f41720h0;
        q qVar2 = this.f41719Z;
        switch (i10) {
            case 0:
                boolean H6 = androidx.compose.ui.focus.a.H(qVar2, qVar, i11, kVar);
                Boolean valueOf = Boolean.valueOf(H6);
                if (!H6 && abstractC0446e.a()) {
                    return null;
                }
                return valueOf;
            default:
                boolean I10 = androidx.compose.ui.focus.a.I(qVar2, qVar, i11, kVar);
                Boolean valueOf2 = Boolean.valueOf(I10);
                if (!I10 && abstractC0446e.a()) {
                    return null;
                }
                return valueOf2;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f41718Y) {
            case 0:
                return a((AbstractC0446e) obj);
            default:
                return a((AbstractC0446e) obj);
        }
    }
}
