package Nf;

import Bg.A;
import Mf.V;
import id.AbstractC3557B;
import java.util.Map;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kg.C4291c;
import zc.u;

/* loaded from: classes.dex */
public final class k implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Jf.l f12825a;

    /* renamed from: b  reason: collision with root package name */
    public final C4291c f12826b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f12827c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC3957g f12828d = R4.b.C1(EnumC3958h.f36152Y, new u(29, this));

    public k(Jf.l lVar, C4291c c4291c, Map map) {
        AbstractC3557B.c0("builtIns", lVar);
        AbstractC3557B.c0("fqName", c4291c);
        this.f12825a = lVar;
        this.f12826b = c4291c;
        this.f12827c = map;
    }

    @Override // Nf.c
    public final C4291c a() {
        return this.f12826b;
    }

    @Override // Nf.c
    public final Map b() {
        return this.f12827c;
    }

    @Override // Nf.c
    public final V g() {
        return V.f12075a;
    }

    @Override // Nf.c
    public final A getType() {
        Object value = this.f12828d.getValue();
        AbstractC3557B.b0("getValue(...)", value);
        return (A) value;
    }
}
