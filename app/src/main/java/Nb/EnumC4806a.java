package nb;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: nb.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4806a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ EnumC4806a[] f40164Y;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC4806a[] enumC4806aArr = {new Enum("JPG", 0), new Enum("WEBP", 1)};
        f40164Y = enumC4806aArr;
        AbstractC3557B.C0(enumC4806aArr);
    }

    public static EnumC4806a valueOf(String str) {
        return (EnumC4806a) Enum.valueOf(EnumC4806a.class, str);
    }

    public static EnumC4806a[] values() {
        return (EnumC4806a[]) f40164Y.clone();
    }
}
