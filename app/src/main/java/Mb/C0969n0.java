package Mb;

import Cb.C0294d;
import b9.AbstractC2133b;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import f9.C2959k;
import id.AbstractC3557B;
import nf.AbstractC4828h;
import wd.EnumC6206t;

/* renamed from: Mb.n0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0969n0 implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f11964a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f11965b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f11966c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f11967d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f11968e;

    public C0969n0(k9.b bVar, AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, C2959k c2959k, AbstractC2400f abstractC2400f3) {
        this.f11964a = bVar;
        this.f11965b = abstractC2400f;
        this.f11966c = abstractC2400f2;
        this.f11967d = c2959k;
        this.f11968e = abstractC2400f3;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [Ad.g, Mb.m0, java.lang.Object, androidx.lifecycle.Y] */
    @Override // p000if.a
    public final Object get() {
        Object obj = this.f11964a.get();
        AbstractC3557B.b0("get(...)", obj);
        p9.s sVar = (p9.s) obj;
        Object obj2 = this.f11965b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Cb.G g10 = (Cb.G) obj2;
        Object obj3 = this.f11966c.get();
        AbstractC3557B.b0("get(...)", obj3);
        C0294d c0294d = (C0294d) obj3;
        Object obj4 = this.f11967d.get();
        AbstractC3557B.b0("get(...)", obj4);
        EnumC6206t enumC6206t = (EnumC6206t) obj4;
        Object obj5 = this.f11968e.get();
        AbstractC3557B.b0("get(...)", obj5);
        AbstractC2133b abstractC2133b = (AbstractC2133b) obj5;
        ?? gVar = new Ad.g(new C0963k0(null));
        Ad.l.O0(AbstractC4828h.Q(gVar), null, null, new C0965l0(g10, c0294d, gVar, sVar, enumC6206t, null), 3);
        return gVar;
    }
}
