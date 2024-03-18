package Dd;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Dd.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0390k extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ EnumC0390k[] f3563Y;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC0390k[] enumC0390kArr = {new Enum("MP3", 0), new Enum("OPUS", 1), new Enum("AAC", 2)};
        f3563Y = enumC0390kArr;
        AbstractC3557B.C0(enumC0390kArr);
    }

    public static EnumC0390k valueOf(String str) {
        return (EnumC0390k) Enum.valueOf(EnumC0390k.class, str);
    }

    public static EnumC0390k[] values() {
        return (EnumC0390k[]) f3563Y.clone();
    }
}
