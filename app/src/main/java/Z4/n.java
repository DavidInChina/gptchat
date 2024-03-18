package z4;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class n extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final n f51700Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ n[] f51701Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [z4.n, java.lang.Enum] */
    static {
        ?? r22 = new Enum("Immediately", 0);
        f51700Y = r22;
        n[] nVarArr = {r22, new Enum("OnIterationFinish", 1)};
        f51701Z = nVarArr;
        AbstractC3557B.C0(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f51701Z.clone();
    }
}
