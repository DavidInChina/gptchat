package wd;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* renamed from: wd.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6187f extends Enum<EnumC6187f> {
    public static final C6185e Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f48398Y = R4.b.C1(EnumC3958h.f36152Y, C6183d.f48394Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC6187f f48399Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC6187f f48400h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC6187f f48401i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ EnumC6187f[] f48402j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [wd.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [wd.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [wd.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [wd.f, java.lang.Enum] */
    static {
        ?? r32 = new Enum("Personal", 0);
        f48399Z = r32;
        ?? r42 = new Enum("Workspace", 1);
        f48400h0 = r42;
        ?? r52 = new Enum("Unknown", 2);
        f48401i0 = r52;
        EnumC6187f[] enumC6187fArr = {r32, r42, r52};
        f48402j0 = enumC6187fArr;
        AbstractC3557B.C0(enumC6187fArr);
    }

    public static EnumC6187f valueOf(String str) {
        return (EnumC6187f) Enum.valueOf(EnumC6187f.class, str);
    }

    public static EnumC6187f[] values() {
        return (EnumC6187f[]) f48402j0.clone();
    }
}
