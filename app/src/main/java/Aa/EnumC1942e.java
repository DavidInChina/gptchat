package aa;

import id.AbstractC3557B;
import qf.C5323a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: aa.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1942e extends Enum {

    /* renamed from: Z  reason: collision with root package name */
    public static final R4.a f24044Z = new Object();

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC1942e f24045h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC1942e f24046i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ EnumC1942e[] f24047j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ C5323a f24048k0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f24049Y;

    /* JADX WARN: Type inference failed for: r0v2, types: [R4.a, java.lang.Object] */
    static {
        EnumC1942e enumC1942e = new EnumC1942e("None", 0, "");
        f24045h0 = enumC1942e;
        EnumC1942e enumC1942e2 = new EnumC1942e("HangUp", 1, "voice_mode.hangup");
        f24046i0 = enumC1942e2;
        EnumC1942e[] enumC1942eArr = {enumC1942e, enumC1942e2};
        f24047j0 = enumC1942eArr;
        f24048k0 = AbstractC3557B.C0(enumC1942eArr);
    }

    public EnumC1942e(String str, int i10, String str2) {
        this.f24049Y = str2;
    }

    public static EnumC1942e valueOf(String str) {
        return (EnumC1942e) Enum.valueOf(EnumC1942e.class, str);
    }

    public static EnumC1942e[] values() {
        return (EnumC1942e[]) f24047j0.clone();
    }
}
