package te;

import he.C3418c;
import nf.AbstractC4831k;
import xe.AbstractC6432u;
import xe.C6396A;
import xe.C6410O;
import ze.AbstractC6848g;

/* renamed from: te.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5758b implements AbstractC5759c {

    /* renamed from: Y  reason: collision with root package name */
    public final C3418c f46119Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C6396A f46120Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C6410O f46121h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC6848g f46122i0;

    /* renamed from: j0  reason: collision with root package name */
    public final AbstractC6432u f46123j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Fe.b f46124k0;

    public C5758b(C3418c c3418c, C5761e c5761e) {
        this.f46119Y = c3418c;
        this.f46120Z = c5761e.f46132b;
        this.f46121h0 = c5761e.f46131a;
        this.f46122i0 = c5761e.f46134d;
        this.f46123j0 = c5761e.f46133c;
        this.f46124k0 = c5761e.f46136f;
    }

    @Override // te.AbstractC5759c
    public final C6410O O() {
        return this.f46121h0;
    }

    @Override // xe.AbstractC6436y
    public final AbstractC6432u a() {
        return this.f46123j0;
    }

    @Override // te.AbstractC5759c
    public final AbstractC6848g getContent() {
        return this.f46122i0;
    }

    @Override // te.AbstractC5759c
    public final C6396A getMethod() {
        return this.f46120Z;
    }

    @Override // te.AbstractC5759c
    public final Fe.b h() {
        return this.f46124k0;
    }

    @Override // te.AbstractC5759c, Ng.F
    public final AbstractC4831k i() {
        return this.f46119Y.i();
    }
}
