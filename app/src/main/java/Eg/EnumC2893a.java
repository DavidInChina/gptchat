package eg;

import Cf.k;
import id.AbstractC3557B;
import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: eg.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2893a extends Enum {

    /* renamed from: Z  reason: collision with root package name */
    public static final k f29377Z = new k(22, 0);

    /* renamed from: h0  reason: collision with root package name */
    public static final LinkedHashMap f29378h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC2893a f29379i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC2893a f29380j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final EnumC2893a f29381k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final EnumC2893a f29382l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final EnumC2893a f29383m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final EnumC2893a f29384n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final /* synthetic */ EnumC2893a[] f29385o0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f29386Y;

    static {
        EnumC2893a enumC2893a = new EnumC2893a("UNKNOWN", 0, 0);
        f29379i0 = enumC2893a;
        EnumC2893a enumC2893a2 = new EnumC2893a("CLASS", 1, 1);
        f29380j0 = enumC2893a2;
        EnumC2893a enumC2893a3 = new EnumC2893a("FILE_FACADE", 2, 2);
        f29381k0 = enumC2893a3;
        EnumC2893a enumC2893a4 = new EnumC2893a("SYNTHETIC_CLASS", 3, 3);
        f29382l0 = enumC2893a4;
        EnumC2893a enumC2893a5 = new EnumC2893a("MULTIFILE_CLASS", 4, 4);
        f29383m0 = enumC2893a5;
        EnumC2893a enumC2893a6 = new EnumC2893a("MULTIFILE_CLASS_PART", 5, 5);
        f29384n0 = enumC2893a6;
        EnumC2893a[] enumC2893aArr = {enumC2893a, enumC2893a2, enumC2893a3, enumC2893a4, enumC2893a5, enumC2893a6};
        f29385o0 = enumC2893aArr;
        AbstractC3557B.C0(enumC2893aArr);
        EnumC2893a[] values = values();
        int n02 = P4.a.n0(values.length);
        if (n02 < 16) {
            n02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
        for (EnumC2893a enumC2893a7 : values) {
            linkedHashMap.put(Integer.valueOf(enumC2893a7.f29386Y), enumC2893a7);
        }
        f29378h0 = linkedHashMap;
    }

    public EnumC2893a(String str, int i10, int i11) {
        this.f29386Y = i11;
    }

    public static EnumC2893a valueOf(String str) {
        return (EnumC2893a) Enum.valueOf(EnumC2893a.class, str);
    }

    public static EnumC2893a[] values() {
        return (EnumC2893a[]) f29385o0.clone();
    }
}
