package wd;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: wd.h0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6192h0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC6192h0 f48422Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC6192h0 f48423Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ EnumC6192h0[] f48424h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [wd.h0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [wd.h0, java.lang.Enum] */
    static {
        ?? r22 = new Enum("GPT3_5", 0);
        f48422Y = r22;
        ?? r32 = new Enum("GPT4", 1);
        f48423Z = r32;
        EnumC6192h0[] enumC6192h0Arr = {r22, r32};
        f48424h0 = enumC6192h0Arr;
        AbstractC3557B.C0(enumC6192h0Arr);
    }

    public static EnumC6192h0 valueOf(String str) {
        return (EnumC6192h0) Enum.valueOf(EnumC6192h0.class, str);
    }

    public static EnumC6192h0[] values() {
        return (EnumC6192h0[]) f48424h0.clone();
    }
}
