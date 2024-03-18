package S9;

import ca.C2317i;
import ca.C2331w;
import ca.EnumC2323o;
import fa.AbstractC2965B;
import fa.C2969F;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC4344b;
import x8.W;

/* loaded from: classes.dex */
public final class j extends N9.f {

    /* renamed from: a  reason: collision with root package name */
    public final C2969F f16428a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC2965B f16429b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f16430c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C2969F c2969f) {
        super(c2969f);
        AbstractC3557B.c0("message", c2969f);
        this.f16428a = c2969f;
        this.f16430c = AbstractC4344b.N0(c2969f);
        a(c2969f);
    }

    @Override // N9.f
    public final boolean a(C2969F c2969f) {
        AbstractC3557B.c0("message", c2969f);
        this.f16430c.add(c2969f);
        if (!W.O(c2969f) && !W.N(c2969f)) {
            return false;
        }
        this.f16429b = c2969f.f30015h;
        return true;
    }

    @Override // N9.f
    public final List b(EnumC2323o enumC2323o) {
        AbstractC3557B.c0("replaceInProgress", enumC2323o);
        AbstractC2965B abstractC2965B = this.f16429b;
        ArrayList arrayList = this.f16430c;
        return AbstractC4344b.F0(new C2317i(W.H(arrayList).b(enumC2323o), arrayList, abstractC2965B, new C2331w(this.f16428a.f30013f)));
    }
}
