package com.google.android.gms.internal.play_billing;

import androidx.glance.appwidget.protobuf.AbstractC2041a;

/* loaded from: classes.dex */
public abstract class P extends AbstractC2041a {

    /* renamed from: Y  reason: collision with root package name */
    public final Q f26876Y;

    /* renamed from: Z  reason: collision with root package name */
    public Q f26877Z;

    public P(Q q10) {
        this.f26876Y = q10;
        if (!q10.l()) {
            this.f26877Z = (Q) q10.m(4);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final Q c() {
        Q d10 = d();
        if (d10.k()) {
            return d10;
        }
        throw new B0();
    }

    public final Object clone() {
        P p10 = (P) this.f26876Y.m(5);
        p10.f26877Z = d();
        return p10;
    }

    public final Q d() {
        if (!this.f26877Z.l()) {
            return this.f26877Z;
        }
        Q q10 = this.f26877Z;
        q10.getClass();
        C2480w0.f26985c.a(q10.getClass()).a(q10);
        q10.h();
        return this.f26877Z;
    }

    public final void e() {
        if (!this.f26877Z.l()) {
            Q q10 = (Q) this.f26876Y.m(4);
            C2480w0.f26985c.a(q10.getClass()).e(q10, this.f26877Z);
            this.f26877Z = q10;
        }
    }
}
