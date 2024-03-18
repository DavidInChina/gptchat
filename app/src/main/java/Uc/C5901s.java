package uc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import com.openai.experiment.t;
import id.AbstractC3557B;
import ld.C4428a;

/* renamed from: uc.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5901s implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f46671a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f46672b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f46673c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f46674d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f46675e;

    /* renamed from: f  reason: collision with root package name */
    public final p000if.a f46676f;

    public C5901s(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4, AbstractC2400f abstractC2400f5, AbstractC2400f abstractC2400f6) {
        this.f46671a = abstractC2400f;
        this.f46672b = abstractC2400f2;
        this.f46673c = abstractC2400f3;
        this.f46674d = abstractC2400f4;
        this.f46675e = abstractC2400f5;
        this.f46676f = abstractC2400f6;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f46671a.get();
        AbstractC3557B.b0("get(...)", obj);
        xd.b bVar = (xd.b) obj;
        Object obj2 = this.f46672b.get();
        AbstractC3557B.b0("get(...)", obj2);
        xd.g gVar = (xd.g) obj2;
        Object obj3 = this.f46673c.get();
        AbstractC3557B.b0("get(...)", obj3);
        C4428a c4428a = (C4428a) obj3;
        Object obj4 = this.f46674d.get();
        AbstractC3557B.b0("get(...)", obj4);
        t tVar = (t) obj4;
        Object obj5 = this.f46675e.get();
        AbstractC3557B.b0("get(...)", obj5);
        C5887e c5887e = (C5887e) obj5;
        Object obj6 = this.f46676f.get();
        AbstractC3557B.b0("get(...)", obj6);
        return new C5900r(bVar, gVar, c4428a, tVar, c5887e, (C5889g) obj6);
    }
}
