package Z;

import Sg.C1394f;
import nf.AbstractC4831k;
import z.C6685Z;

/* loaded from: classes.dex */
public final class Y implements G0 {

    /* renamed from: Y  reason: collision with root package name */
    public final wf.n f22588Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C1394f f22589Z;

    /* renamed from: h0  reason: collision with root package name */
    public Ng.D0 f22590h0;

    public Y(AbstractC4831k abstractC4831k, wf.n nVar) {
        this.f22588Y = nVar;
        this.f22589Z = Ad.l.g(abstractC4831k);
    }

    @Override // Z.G0
    public final void a() {
        Ng.D0 d02 = this.f22590h0;
        if (d02 != null) {
            d02.k(new C6685Z(2));
        }
        this.f22590h0 = null;
    }

    @Override // Z.G0
    public final void c() {
        Ng.D0 d02 = this.f22590h0;
        if (d02 != null) {
            d02.k(new C6685Z(2));
        }
        this.f22590h0 = null;
    }

    @Override // Z.G0
    public final void d() {
        Ng.D0 d02 = this.f22590h0;
        if (d02 != null) {
            d02.k(A7.b.g("Old job was still running!", null));
        }
        this.f22590h0 = Ad.l.O0(this.f22589Z, null, null, this.f22588Y, 3);
    }
}
