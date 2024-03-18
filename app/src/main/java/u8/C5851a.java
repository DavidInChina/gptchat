package u8;

/* renamed from: u8.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5851a extends AbstractRunnableC5866p {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f46470Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f46471h0;

    public /* synthetic */ C5851a(int i10, Object obj) {
        this.f46470Z = i10;
        this.f46471h0 = obj;
    }

    @Override // u8.AbstractRunnableC5866p
    public final void b() {
        switch (this.f46470Z) {
            case 0:
                x3.r rVar = (x3.r) this.f46471h0;
                C5852b c5852b = (C5852b) rVar.f48717b;
                c5852b.f46474b.b("unlinkToDeath", new Object[0]);
                c5852b.f46486n.asBinder().unlinkToDeath(c5852b.f46483k, 0);
                C5852b c5852b2 = (C5852b) rVar.f48717b;
                c5852b2.f46486n = null;
                c5852b2.f46479g = false;
                return;
            default:
                synchronized (((C5852b) this.f46471h0).f46478f) {
                    try {
                        if (((C5852b) this.f46471h0).f46484l.get() > 0 && ((C5852b) this.f46471h0).f46484l.decrementAndGet() > 0) {
                            ((C5852b) this.f46471h0).f46474b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        C5852b c5852b3 = (C5852b) this.f46471h0;
                        if (c5852b3.f46486n != null) {
                            c5852b3.f46474b.b("Unbind from service.", new Object[0]);
                            C5852b c5852b4 = (C5852b) this.f46471h0;
                            c5852b4.f46473a.unbindService(c5852b4.f46485m);
                            Object obj = this.f46471h0;
                            ((C5852b) obj).f46479g = false;
                            ((C5852b) obj).f46486n = null;
                            ((C5852b) obj).f46485m = null;
                        }
                        ((C5852b) this.f46471h0).d();
                        return;
                    } finally {
                    }
                }
        }
    }
}
