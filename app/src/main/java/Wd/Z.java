package wd;

import id.AbstractC3557B;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class Z extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final Z f48377Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final Z f48378Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ Z[] f48379h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, wd.Z] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, wd.Z] */
    static {
        ?? r22 = new Enum("Inpainting", 0);
        f48377Y = r22;
        ?? r32 = new Enum("Transformation", 1);
        f48378Z = r32;
        Z[] zArr = {r22, r32};
        f48379h0 = zArr;
        AbstractC3557B.C0(zArr);
    }

    public static Z valueOf(String str) {
        return (Z) Enum.valueOf(Z.class, str);
    }

    public static Z[] values() {
        return (Z[]) f48379h0.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        AbstractC3557B.b0("toLowerCase(...)", lowerCase);
        return lowerCase;
    }
}
