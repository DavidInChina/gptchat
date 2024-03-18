package mg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: mg.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4651a extends Enum {

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC4651a f39282h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC4651a[] f39283i0;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f39284Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f39285Z;

    static {
        EnumC4651a enumC4651a = new EnumC4651a("NO_ARGUMENTS", 0, false, 3);
        f39282h0 = enumC4651a;
        EnumC4651a[] enumC4651aArr = {enumC4651a, new EnumC4651a("UNLESS_EMPTY", 1, true, 2), new EnumC4651a("ALWAYS_PARENTHESIZED", 2, true, true)};
        f39283i0 = enumC4651aArr;
        AbstractC3557B.C0(enumC4651aArr);
    }

    public /* synthetic */ EnumC4651a(String str, int i10, boolean z10, int i11) {
        this(str, i10, (i11 & 1) != 0 ? false : z10, false);
    }

    public static EnumC4651a valueOf(String str) {
        return (EnumC4651a) Enum.valueOf(EnumC4651a.class, str);
    }

    public static EnumC4651a[] values() {
        return (EnumC4651a[]) f39283i0.clone();
    }

    public EnumC4651a(String str, int i10, boolean z10, boolean z11) {
        this.f39284Y = z10;
        this.f39285Z = z11;
    }
}
