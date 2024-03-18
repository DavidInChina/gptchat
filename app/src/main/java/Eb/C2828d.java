package eb;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import com.openai.experiment.t;
import id.AbstractC3557B;
import ld.C4428a;
import xd.h;

/* renamed from: eb.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2828d implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f29112a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f29113b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f29114c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f29115d;

    public C2828d(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4) {
        this.f29112a = abstractC2400f;
        this.f29113b = abstractC2400f2;
        this.f29114c = abstractC2400f3;
        this.f29115d = abstractC2400f4;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f29112a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f29113b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f29114c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f29115d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new C2827c((u9.b) obj, (t) obj2, (h) obj3, (C4428a) obj4);
    }
}
