package Wa;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f20837Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ a[] f20838Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Wa.a] */
    static {
        ?? r32 = new Enum("Valid", 0);
        f20837Y = r32;
        a[] aVarArr = {r32, new Enum("Expired", 1), new Enum("Missing", 2)};
        f20838Z = aVarArr;
        AbstractC3557B.C0(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f20838Z.clone();
    }
}
