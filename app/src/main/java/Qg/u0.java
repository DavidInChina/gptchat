package Qg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class u0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final u0 f14928Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final u0 f14929Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final u0 f14930h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ u0[] f14931i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Qg.u0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Qg.u0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Qg.u0] */
    static {
        ?? r32 = new Enum("START", 0);
        f14928Y = r32;
        ?? r42 = new Enum("STOP", 1);
        f14929Z = r42;
        ?? r52 = new Enum("STOP_AND_RESET_REPLAY_CACHE", 2);
        f14930h0 = r52;
        u0[] u0VarArr = {r32, r42, r52};
        f14931i0 = u0VarArr;
        AbstractC3557B.C0(u0VarArr);
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) f14931i0.clone();
    }
}
