package zh;

import wh.AbstractC6236a;
import wh.AbstractC6250o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public abstract class P extends Enum implements Q {

    /* renamed from: Y  reason: collision with root package name */
    public static final M f52115Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ P[] f52116Z;

    static {
        M m10 = new M();
        f52115Y = m10;
        f52116Z = new P[]{m10, new P() { // from class: zh.N
            @Override // zh.Q
            public final boolean a(AbstractC6250o abstractC6250o) {
                return !((AbstractC6236a) abstractC6250o).V0();
            }
        }, new P() { // from class: zh.O
            @Override // zh.Q
            public final boolean a(AbstractC6250o abstractC6250o) {
                return false;
            }
        }};
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) f52116Z.clone();
    }
}
