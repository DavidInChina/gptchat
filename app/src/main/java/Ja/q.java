package Ja;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import o9.AbstractC4954b;
import o9.C4953a;

/* loaded from: classes2.dex */
public final class q implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f8952a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f8953b;

    public q(AbstractC2400f abstractC2400f) {
        j9.g gVar = AbstractC4954b.f40985a;
        this.f8952a = abstractC2400f;
        this.f8953b = gVar;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f8952a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f8953b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new p((r) obj, (C4953a) obj2);
    }
}
