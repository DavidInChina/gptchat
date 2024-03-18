package j0;

import id.AbstractC3557B;

/* renamed from: j0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3885a extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f35870Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f35871Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f35872h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3885a(wf.k kVar, wf.k kVar2, int i10) {
        super(1);
        this.f35870Y = i10;
        this.f35871Z = kVar;
        this.f35872h0 = kVar2;
    }

    public final void a(Object obj) {
        int i10 = this.f35870Y;
        wf.k kVar = this.f35872h0;
        wf.k kVar2 = this.f35871Z;
        switch (i10) {
            case 1:
                kVar2.invoke(obj);
                kVar.invoke(obj);
                return;
            case 2:
                kVar2.invoke(obj);
                kVar.invoke(obj);
                return;
            case 3:
                kVar2.invoke(obj);
                kVar.invoke(obj);
                return;
            default:
                AbstractC3557B.c0("$this$null", obj);
                if (kVar2 != null) {
                    kVar2.invoke(obj);
                }
                kVar.invoke(obj);
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10;
        switch (this.f35870Y) {
            case 0:
                n nVar = (n) obj;
                synchronized (p.f35918b) {
                    i10 = p.f35920d;
                    p.f35920d = i10 + 1;
                }
                return new C3887c(i10, nVar, this.f35871Z, this.f35872h0);
            case 1:
                a(obj);
                return jf.y.f36177a;
            case 2:
                a(obj);
                return jf.y.f36177a;
            case 3:
                a(obj);
                return jf.y.f36177a;
            case 4:
                je.g gVar = (je.g) obj;
                AbstractC3557B.c0("$this$null", gVar);
                this.f35871Z.invoke(gVar);
                this.f35872h0.invoke(gVar);
                return jf.y.f36177a;
            case 5:
                a(obj);
                return jf.y.f36177a;
            default:
                Wh.v vVar = (Wh.v) obj;
                AbstractC3557B.c0("$this$null", vVar);
                this.f35871Z.invoke(vVar);
                this.f35872h0.invoke(vVar);
                return jf.y.f36177a;
        }
    }
}
