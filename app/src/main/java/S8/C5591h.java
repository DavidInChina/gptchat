package s8;

import x3.r;

/* renamed from: s8.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5591h extends AbstractRunnableC5589f {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f45448Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f45449h0;

    public /* synthetic */ C5591h(int i10, Object obj) {
        this.f45448Z = i10;
        this.f45449h0 = obj;
    }

    @Override // s8.AbstractRunnableC5589f
    public final void a() {
        int i10 = this.f45448Z;
        Object obj = this.f45449h0;
        switch (i10) {
            case 0:
                C5592i c5592i = (C5592i) obj;
                if (c5592i.f45463m != null) {
                    c5592i.f45452b.d("Unbind from service.", new Object[0]);
                    c5592i.f45451a.unbindService(c5592i.f45462l);
                    c5592i.f45457g = false;
                    c5592i.f45463m = null;
                    c5592i.f45462l = null;
                }
                c5592i.b();
                return;
            default:
                r rVar = (r) obj;
                C5592i c5592i2 = (C5592i) rVar.f48717b;
                c5592i2.f45452b.d("unlinkToDeath", new Object[0]);
                c5592i2.f45463m.asBinder().unlinkToDeath(c5592i2.f45460j, 0);
                C5592i c5592i3 = (C5592i) rVar.f48717b;
                c5592i3.f45463m = null;
                c5592i3.f45457g = false;
                return;
        }
    }
}
