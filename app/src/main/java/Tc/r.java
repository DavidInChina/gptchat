package Tc;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class r extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final r f17119Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final r f17120Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ r[] f17121h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, Tc.r] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Tc.r] */
    static {
        ?? r22 = new Enum("ScrollContent", 0);
        f17119Y = r22;
        ?? r32 = new Enum("ScrollAll", 1);
        f17120Z = r32;
        r[] rVarArr = {r22, r32};
        f17121h0 = rVarArr;
        AbstractC3557B.C0(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f17121h0.clone();
    }
}
