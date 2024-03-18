package p9;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: p9.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5099a extends Enum implements AbstractC5101c {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC5099a f42757Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC5099a f42758Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC5099a f42759h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC5099a[] f42760i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, p9.a] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, p9.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, p9.a] */
    static {
        ?? r32 = new Enum("GPT4Accent", 0);
        f42757Y = r32;
        ?? r42 = new Enum("GPT35Accent", 1);
        f42758Z = r42;
        ?? r52 = new Enum("Done", 2);
        f42759h0 = r52;
        EnumC5099a[] enumC5099aArr = {r32, r42, r52};
        f42760i0 = enumC5099aArr;
        AbstractC3557B.C0(enumC5099aArr);
    }

    public static EnumC5099a valueOf(String str) {
        return (EnumC5099a) Enum.valueOf(EnumC5099a.class, str);
    }

    public static EnumC5099a[] values() {
        return (EnumC5099a[]) f42760i0.clone();
    }
}
