package P5;

import F5.g;
import H5.h;

/* loaded from: classes2.dex */
public final class a implements b {

    /* renamed from: Y  reason: collision with root package name */
    public final g f13817Y;

    /* renamed from: Z  reason: collision with root package name */
    public q5.g f13818Z = new q5.g();

    public a(h hVar) {
        this.f13817Y = hVar;
    }

    @Override // P5.b
    public final q5.g k() {
        return this.f13818Z;
    }

    @Override // P5.b
    public final void o(q5.g gVar) {
        this.f13818Z = gVar;
        this.f13817Y.a(gVar);
    }
}
