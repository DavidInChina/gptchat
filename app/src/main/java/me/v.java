package me;

import he.C3418c;
import nf.AbstractC4831k;
import te.AbstractC5759c;
import te.C5760d;
import xe.AbstractC6432u;
import xe.C6396A;
import xe.C6410O;
import xe.C6434w;
import ze.AbstractC6848g;

/* loaded from: classes2.dex */
public final class v implements AbstractC5759c {

    /* renamed from: Y  reason: collision with root package name */
    public final C6396A f39264Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C6410O f39265Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Fe.l f39266h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C6434w f39267i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C5760d f39268j0;

    public v(C5760d c5760d) {
        this.f39268j0 = c5760d;
        this.f39264Y = c5760d.f46126b;
        this.f39265Z = c5760d.f46125a.b();
        this.f39266h0 = c5760d.f46130f;
        this.f39267i0 = c5760d.f46127c.n();
    }

    @Override // te.AbstractC5759c
    public final C6410O O() {
        return this.f39265Z;
    }

    @Override // xe.AbstractC6436y
    public final AbstractC6432u a() {
        return this.f39267i0;
    }

    public final C3418c b() {
        throw new IllegalStateException("Call is not initialized".toString());
    }

    @Override // te.AbstractC5759c
    public final AbstractC6848g getContent() {
        AbstractC6848g abstractC6848g;
        C5760d c5760d = this.f39268j0;
        Object obj = c5760d.f46128d;
        if (obj instanceof AbstractC6848g) {
            abstractC6848g = (AbstractC6848g) obj;
        } else {
            abstractC6848g = null;
        }
        if (abstractC6848g != null) {
            return abstractC6848g;
        }
        throw new IllegalStateException(("Content was not transformed to OutgoingContent yet. Current body is " + c5760d.f46128d).toString());
    }

    @Override // te.AbstractC5759c
    public final C6396A getMethod() {
        return this.f39264Y;
    }

    @Override // te.AbstractC5759c
    public final Fe.b h() {
        return this.f39266h0;
    }

    @Override // te.AbstractC5759c, Ng.F
    public final AbstractC4831k i() {
        b();
        throw null;
    }
}
