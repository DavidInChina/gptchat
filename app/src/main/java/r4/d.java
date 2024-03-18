package r4;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class d extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final d f44432Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final d f44433Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final d f44434h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ d[] f44435i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, r4.d] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, r4.d] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, r4.d] */
    static {
        ?? r32 = new Enum("EXACT", 0);
        f44432Y = r32;
        ?? r42 = new Enum("INEXACT", 1);
        f44433Z = r42;
        ?? r52 = new Enum("AUTOMATIC", 2);
        f44434h0 = r52;
        d[] dVarArr = {r32, r42, r52};
        f44435i0 = dVarArr;
        AbstractC3557B.C0(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f44435i0.clone();
    }
}
