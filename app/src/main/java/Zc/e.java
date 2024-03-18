package Zc;

import Ii.q;
import Vc.y;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import h.C3278d;
import id.AbstractC3557B;
import java.util.Set;
import pe.AbstractC5152d;

/* loaded from: classes2.dex */
public final class e implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final q f23678a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f23679b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f23680c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f23681d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f23682e;

    /* renamed from: f  reason: collision with root package name */
    public final p000if.a f23683f;

    public e(q qVar, AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4, AbstractC2400f abstractC2400f5) {
        this.f23678a = qVar;
        this.f23679b = abstractC2400f;
        this.f23680c = abstractC2400f2;
        this.f23681d = abstractC2400f3;
        this.f23682e = abstractC2400f4;
        this.f23683f = abstractC2400f5;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f23679b.get();
        AbstractC3557B.b0("get(...)", obj);
        Set set = (Set) obj;
        Object obj2 = this.f23680c.get();
        AbstractC3557B.b0("get(...)", obj2);
        Set set2 = (Set) obj2;
        Object obj3 = this.f23681d.get();
        AbstractC3557B.b0("get(...)", obj3);
        Set set3 = (Set) obj3;
        Object obj4 = this.f23682e.get();
        AbstractC3557B.b0("get(...)", obj4);
        y yVar = (y) obj4;
        Object obj5 = this.f23683f.get();
        AbstractC3557B.b0("get(...)", obj5);
        AbstractC3557B.c0("module", this.f23678a);
        return P4.a.d(new C3278d(set, set2, set3, (AbstractC5152d) obj5, yVar, 6));
    }
}
