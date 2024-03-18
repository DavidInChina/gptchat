package x8;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public abstract class a0 extends Enum implements w8.f {

    /* renamed from: Y  reason: collision with root package name */
    public static final Z f49541Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ a0[] f49542Z;
    /* JADX INFO: Fake field, exist only in values array */
    a0 EF0;

    static {
        a0 a0Var = new a0() { // from class: x8.Y
            @Override // w8.f
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getKey();
            }
        };
        Z z10 = new Z();
        f49541Y = z10;
        f49542Z = new a0[]{a0Var, z10};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f49542Z.clone();
    }
}
