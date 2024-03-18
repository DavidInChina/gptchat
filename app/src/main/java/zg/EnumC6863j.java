package zg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: zg.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6863j extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC6863j f52055Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC6863j f52056Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC6863j f52057h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC6863j[] f52058i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [zg.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [zg.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [zg.j, java.lang.Enum] */
    static {
        ?? r32 = new Enum("STABLE", 0);
        f52055Y = r32;
        ?? r42 = new Enum("FIR_UNSTABLE", 1);
        f52056Z = r42;
        ?? r52 = new Enum("IR_UNSTABLE", 2);
        f52057h0 = r52;
        EnumC6863j[] enumC6863jArr = {r32, r42, r52};
        f52058i0 = enumC6863jArr;
        AbstractC3557B.C0(enumC6863jArr);
    }

    public static EnumC6863j valueOf(String str) {
        return (EnumC6863j) Enum.valueOf(EnumC6863j.class, str);
    }

    public static EnumC6863j[] values() {
        return (EnumC6863j[]) f52058i0.clone();
    }
}
