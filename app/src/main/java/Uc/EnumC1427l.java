package Uc;

import id.AbstractC3557B;
import qf.C5323a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Uc.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1427l extends Enum {

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC1427l f17684Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ EnumC1427l[] f17685h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ C5323a f17686i0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f17687Y;

    static {
        EnumC1427l enumC1427l = new EnumC1427l("User", 0, "user");
        f17684Z = enumC1427l;
        EnumC1427l[] enumC1427lArr = {enumC1427l, new EnumC1427l("Model", 1, "model")};
        f17685h0 = enumC1427lArr;
        f17686i0 = AbstractC3557B.C0(enumC1427lArr);
    }

    public EnumC1427l(String str, int i10, String str2) {
        this.f17687Y = str2;
    }

    public static EnumC1427l valueOf(String str) {
        return (EnumC1427l) Enum.valueOf(EnumC1427l.class, str);
    }

    public static EnumC1427l[] values() {
        return (EnumC1427l[]) f17685h0.clone();
    }
}
