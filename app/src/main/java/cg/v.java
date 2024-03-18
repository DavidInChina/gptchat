package Cg;

import Bg.AbstractC0210c;
import Bg.C0224q;
import Bg.U;
import Bg.o0;
import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public abstract class v extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final t f3149Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final r f3150Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final u f3151h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final s f3152i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ v[] f3153j0;

    static {
        t tVar = new t();
        f3149Y = tVar;
        r rVar = new r();
        f3150Z = rVar;
        u uVar = new u();
        f3151h0 = uVar;
        s sVar = new s();
        f3152i0 = sVar;
        v[] vVarArr = {tVar, rVar, uVar, sVar};
        f3153j0 = vVarArr;
        AbstractC3557B.C0(vVarArr);
    }

    public static v b(o0 o0Var) {
        AbstractC3557B.c0("<this>", o0Var);
        if (o0Var.z0()) {
            return f3150Z;
        }
        if (o0Var instanceof C0224q) {
            C0224q c0224q = (C0224q) o0Var;
        }
        if (AbstractC0210c.a(AbstractC3557B.q0(false, true, p.f3146a, null, null, 24), Ad.l.Q0(o0Var), U.f2088a)) {
            return f3152i0;
        }
        return f3151h0;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f3153j0.clone();
    }

    public abstract v a(o0 o0Var);
}
