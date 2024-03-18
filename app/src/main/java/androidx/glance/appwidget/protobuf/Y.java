package androidx.glance.appwidget.protobuf;

import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class Y {

    /* renamed from: c  reason: collision with root package name */
    public static final Y f25192c = new Y();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f25194b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final L f25193a = new L();

    public final b0 a(Class cls) {
        b0 b0Var;
        U u10;
        Class cls2;
        A.a("messageType", cls);
        ConcurrentHashMap concurrentHashMap = this.f25194b;
        b0 b0Var2 = (b0) concurrentHashMap.get(cls);
        if (b0Var2 == null) {
            L l10 = this.f25193a;
            l10.getClass();
            Class cls3 = c0.f25203a;
            if (!AbstractC2063x.class.isAssignableFrom(cls) && (cls2 = c0.f25203a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            }
            P a5 = l10.f25165a.a(cls);
            a0 a0Var = (a0) a5;
            if ((a0Var.f25201d & 2) == 2) {
                boolean isAssignableFrom = AbstractC2063x.class.isAssignableFrom(cls);
                AbstractC2042b abstractC2042b = a0Var.f25198a;
                if (isAssignableFrom) {
                    u10 = new U(c0.f25206d, AbstractC2058s.f25268a, abstractC2042b);
                } else {
                    g0 g0Var = c0.f25204b;
                    r rVar = AbstractC2058s.f25269b;
                    if (rVar != null) {
                        u10 = new U(g0Var, rVar, abstractC2042b);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                b0Var = u10;
            } else if (AbstractC2063x.class.isAssignableFrom(cls)) {
                if (a0Var.d() == 1) {
                    b0Var = T.A(a5, W.f25191b, I.f25162b, c0.f25206d, AbstractC2058s.f25268a, O.f25169b);
                } else {
                    b0Var = T.A(a5, W.f25191b, I.f25162b, c0.f25206d, null, O.f25169b);
                }
            } else if (a0Var.d() == 1) {
                V v10 = W.f25190a;
                G g10 = I.f25161a;
                g0 g0Var2 = c0.f25204b;
                r rVar2 = AbstractC2058s.f25269b;
                if (rVar2 != null) {
                    b0Var = T.A(a5, v10, g10, g0Var2, rVar2, O.f25168a);
                } else {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                b0Var = T.A(a5, W.f25190a, I.f25161a, c0.f25205c, null, O.f25168a);
            }
            b0 b0Var3 = (b0) concurrentHashMap.putIfAbsent(cls, b0Var);
            if (b0Var3 != null) {
                return b0Var3;
            }
            return b0Var;
        }
        return b0Var2;
    }
}
