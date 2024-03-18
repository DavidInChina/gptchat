package h4;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class f extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final f f31879Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final f f31880Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final f f31881h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final f f31882i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ f[] f31883j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, h4.f] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, h4.f] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, h4.f] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, h4.f] */
    static {
        ?? r42 = new Enum("MEMORY_CACHE", 0);
        f31879Y = r42;
        ?? r52 = new Enum("MEMORY", 1);
        f31880Z = r52;
        ?? r62 = new Enum("DISK", 2);
        f31881h0 = r62;
        ?? r72 = new Enum("NETWORK", 3);
        f31882i0 = r72;
        f[] fVarArr = {r42, r52, r62, r72};
        f31883j0 = fVarArr;
        AbstractC3557B.C0(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f31883j0.clone();
    }
}
