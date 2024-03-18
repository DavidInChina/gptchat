package io.sentry;

/* loaded from: classes.dex */
public final class D1 {

    /* renamed from: a  reason: collision with root package name */
    public final r1 f33780a;

    /* renamed from: b  reason: collision with root package name */
    public volatile P0 f33781b;

    /* renamed from: c  reason: collision with root package name */
    public volatile N f33782c;

    public D1(r1 r1Var, P0 p02, D0 d02) {
        this.f33781b = p02;
        this.f33782c = d02;
        this.f33780a = r1Var;
    }

    public D1(D1 d12) {
        this.f33780a = d12.f33780a;
        this.f33781b = d12.f33781b;
        D0 d02 = (D0) d12.f33782c;
        d02.getClass();
        this.f33782c = new D0(d02);
    }
}
