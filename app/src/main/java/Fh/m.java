package Fh;

import th.AbstractC5802j;
import th.h0;
import wh.AbstractC6242g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public abstract class m extends Enum implements o, n {

    /* renamed from: Y  reason: collision with root package name */
    public static final l f5394Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ m[] f5395Z;
    /* JADX INFO: Fake field, exist only in values array */
    m EF0;

    static {
        m mVar = new m() { // from class: Fh.k
            @Override // Fh.o
            public final boolean a(AbstractC5802j abstractC5802j, AbstractC6242g abstractC6242g) {
                h0 f6 = abstractC6242g.f();
                if (f6 != null && f6.equals(abstractC5802j.c(abstractC6242g))) {
                    return false;
                }
                return true;
            }
        };
        l lVar = new l();
        f5394Y = lVar;
        f5395Z = new m[]{mVar, lVar};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f5395Z.clone();
    }
}
