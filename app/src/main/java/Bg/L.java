package Bg;

import id.AbstractC3557B;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class L {

    /* renamed from: a  reason: collision with root package name */
    public final L f2078a;

    /* renamed from: b  reason: collision with root package name */
    public final Mf.a0 f2079b;

    /* renamed from: c  reason: collision with root package name */
    public final List f2080c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f2081d;

    public L(L l10, Mf.a0 a0Var, List list, Map map) {
        this.f2078a = l10;
        this.f2079b = a0Var;
        this.f2080c = list;
        this.f2081d = map;
    }

    public final boolean a(Mf.a0 a0Var) {
        L l10;
        AbstractC3557B.c0("descriptor", a0Var);
        if (!AbstractC3557B.K(this.f2079b, a0Var) && ((l10 = this.f2078a) == null || !l10.a(a0Var))) {
            return false;
        }
        return true;
    }
}
