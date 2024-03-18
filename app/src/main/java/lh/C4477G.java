package lh;

import nf.AbstractC4825e;

/* renamed from: lh.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4477G implements AbstractC4471A {

    /* renamed from: a  reason: collision with root package name */
    public final long f38441a;

    /* renamed from: b  reason: collision with root package name */
    public final w f38442b;

    /* renamed from: c  reason: collision with root package name */
    public final C4479I f38443c;

    public C4477G(long j6, w wVar, C4479I c4479i) {
        this.f38441a = j6;
        this.f38442b = wVar;
        this.f38443c = c4479i;
    }

    @Override // lh.AbstractC4471A
    public final w a() {
        return this.f38442b;
    }

    @Override // lh.AbstractC4471A
    public final void b() {
        for (AbstractC4471A abstractC4471A : this.f38443c.f38449a) {
            abstractC4471A.b();
        }
    }

    @Override // lh.AbstractC4471A
    public final Object c(r rVar, AbstractC4825e abstractC4825e) {
        return this.f38443c.a(new C4476F(rVar, null), abstractC4825e);
    }

    @Override // lh.AbstractC4471A
    public final long d() {
        return this.f38441a;
    }
}
