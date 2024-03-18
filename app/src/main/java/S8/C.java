package S8;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class C extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final C f16211Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final C f16212Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ C[] f16213h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, S8.C] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, S8.C] */
    static {
        ?? r22 = new Enum("Ordered", 0);
        f16211Y = r22;
        ?? r32 = new Enum("Unordered", 1);
        f16212Z = r32;
        C[] cArr = {r22, r32};
        f16213h0 = cArr;
        AbstractC3557B.C0(cArr);
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f16213h0.clone();
    }
}
