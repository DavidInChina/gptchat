package m8;

import x3.r;

/* loaded from: classes.dex */
public final class m extends j {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f38981Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f38982h0;

    public /* synthetic */ m(int i10, Object obj) {
        this.f38981Z = i10;
        this.f38982h0 = obj;
    }

    @Override // m8.j
    public final void a() {
        switch (this.f38981Z) {
            case 0:
                synchronized (((o) this.f38982h0).f38991f) {
                    try {
                        if (((o) this.f38982h0).f38996k.get() > 0 && ((o) this.f38982h0).f38996k.decrementAndGet() > 0) {
                            ((o) this.f38982h0).f38987b.e("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        o oVar = (o) this.f38982h0;
                        if (oVar.f38998m != null) {
                            oVar.f38987b.e("Unbind from service.", new Object[0]);
                            o oVar2 = (o) this.f38982h0;
                            oVar2.f38986a.unbindService(oVar2.f38997l);
                            Object obj = this.f38982h0;
                            ((o) obj).f38992g = false;
                            ((o) obj).f38998m = null;
                            ((o) obj).f38997l = null;
                        }
                        ((o) this.f38982h0).d();
                        return;
                    } finally {
                    }
                }
            default:
                r rVar = (r) this.f38982h0;
                o oVar3 = (o) rVar.f48717b;
                oVar3.f38987b.e("unlinkToDeath", new Object[0]);
                oVar3.f38998m.asBinder().unlinkToDeath(oVar3.f38995j, 0);
                o oVar4 = (o) rVar.f48717b;
                oVar4.f38998m = null;
                oVar4.f38992g = false;
                return;
        }
    }
}
