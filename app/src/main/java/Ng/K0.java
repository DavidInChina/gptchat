package Ng;

import nf.AbstractC4825e;

/* loaded from: classes.dex */
public final class K0 extends Sg.y implements Runnable {

    /* renamed from: j0  reason: collision with root package name */
    public final long f12893j0;

    public K0(long j6, AbstractC4825e abstractC4825e) {
        super(abstractC4825e, abstractC4825e.getContext());
        this.f12893j0 = j6;
    }

    @Override // Ng.AbstractC1050a, Ng.v0
    public final String e0() {
        return super.e0() + "(timeMillis=" + this.f12893j0 + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        R4.b.h1(this.f12919h0);
        C(new J0("Timed out waiting for " + this.f12893j0 + " ms", this));
    }
}
