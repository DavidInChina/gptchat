package cb;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* renamed from: cb.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2370k extends Enum<EnumC2370k> {
    public static final C2369j Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f26520Y = R4.b.C1(EnumC3958h.f36152Y, C2368i.f26519Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC2370k f26521Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC2370k f26522h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC2370k f26523i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC2370k f26524j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ EnumC2370k[] f26525k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [cb.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [cb.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [cb.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [cb.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [cb.k, java.lang.Enum] */
    static {
        ?? r42 = new Enum("Private", 0);
        f26521Z = r42;
        ?? r52 = new Enum("Workspace", 1);
        f26522h0 = r52;
        ?? r62 = new Enum("Public", 2);
        f26523i0 = r62;
        ?? r72 = new Enum("Link", 3);
        f26524j0 = r72;
        EnumC2370k[] enumC2370kArr = {r42, r52, r62, r72};
        f26525k0 = enumC2370kArr;
        AbstractC3557B.C0(enumC2370kArr);
    }

    public static EnumC2370k valueOf(String str) {
        return (EnumC2370k) Enum.valueOf(EnumC2370k.class, str);
    }

    public static EnumC2370k[] values() {
        return (EnumC2370k[]) f26525k0.clone();
    }
}
