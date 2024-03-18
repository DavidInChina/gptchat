package Sc;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class v extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final v f16555Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final v f16556Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final v f16557h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ v[] f16558i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Sc.v] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Sc.v] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Sc.v] */
    static {
        ?? r32 = new Enum("Free", 0);
        f16555Y = r32;
        ?? r42 = new Enum("Plus", 1);
        f16556Z = r42;
        ?? r52 = new Enum("Unknown", 2);
        f16557h0 = r52;
        v[] vVarArr = {r32, r42, r52};
        f16558i0 = vVarArr;
        AbstractC3557B.C0(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f16558i0.clone();
    }
}
