package mg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class x extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final x f39377Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final x f39378Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ x[] f39379h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, mg.x] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, mg.x] */
    static {
        Enum r32 = new Enum("PRETTY", 0);
        ?? r42 = new Enum("DEBUG", 1);
        f39377Y = r42;
        ?? r52 = new Enum("NONE", 2);
        f39378Z = r52;
        x[] xVarArr = {r32, r42, r52};
        f39379h0 = xVarArr;
        AbstractC3557B.C0(xVarArr);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f39379h0.clone();
    }
}
