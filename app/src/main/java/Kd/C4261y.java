package kd;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import k5.F;

/* renamed from: kd.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4261y implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final F f37369a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f37370b;

    public C4261y(F f6, AbstractC2400f abstractC2400f) {
        this.f37369a = f6;
        this.f37370b = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f37370b.get();
        AbstractC3557B.b0("get(...)", obj);
        AbstractC3557B.c0("module", this.f37369a);
        C4260x c4260x = C4260x.f37367h0;
        Ad.l.M(1, c4260x);
        return ((ge.d) obj).a(c4260x);
    }
}
