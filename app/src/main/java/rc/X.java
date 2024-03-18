package rc;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class X extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44828Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ zd.k f44829Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(zd.k kVar, int i10) {
        super(1);
        this.f44828Y = i10;
        this.f44829Z = kVar;
    }

    public final zd.n a(zd.n nVar) {
        int i10 = this.f44828Y;
        zd.k kVar = this.f44829Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$update", nVar);
                return (zd.n) kVar.f51978c.invoke(nVar, Boolean.TRUE);
            default:
                AbstractC3557B.c0("$this$update", nVar);
                return (zd.n) kVar.f51978c.invoke(nVar, Boolean.TRUE);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f44828Y) {
            case 0:
                return a((zd.n) obj);
            default:
                return a((zd.n) obj);
        }
    }
}
