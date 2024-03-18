package xg;

import hg.AbstractC3428g;
import hg.C3430i;
import id.AbstractC3557B;
import kg.C4291c;
import zg.AbstractC6864k;

/* loaded from: classes2.dex */
public final class C extends D {

    /* renamed from: d  reason: collision with root package name */
    public final C4291c f49966d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(C4291c c4291c, AbstractC3428g abstractC3428g, C3430i c3430i, AbstractC6864k abstractC6864k) {
        super(abstractC3428g, c3430i, abstractC6864k);
        AbstractC3557B.c0("fqName", c4291c);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("typeTable", c3430i);
        this.f49966d = c4291c;
    }

    @Override // xg.D
    public final C4291c a() {
        return this.f49966d;
    }
}
