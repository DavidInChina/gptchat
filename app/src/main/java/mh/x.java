package mh;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class x implements Z.M {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f39509a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C4663H f39510b;

    public /* synthetic */ x(C4663H c4663h, int i10) {
        this.f39509a = i10;
        this.f39510b = c4663h;
    }

    @Override // Z.M
    public final void dispose() {
        int i10 = this.f39509a;
        C4663H c4663h = this.f39510b;
        switch (i10) {
            case 0:
                P p10 = c4663h.f39404a;
                AbstractC3557B.a0("null cannot be cast to non-null type me.saket.telephoto.zoomable.RealZoomableState", p10);
                ((C4686p) p10).f39494n.setValue(null);
                return;
            default:
                c4663h.f39407d.setValue(null);
                return;
        }
    }
}
