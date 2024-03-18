package Nf;

import Df.H;
import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class e extends Enum {

    /* renamed from: Z  reason: collision with root package name */
    public static final e f12806Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final e f12807h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final e f12808i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final e f12809j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final e f12810k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final e f12811l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final e f12812m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final e f12813n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final e f12814o0;

    /* renamed from: p0  reason: collision with root package name */
    public static final /* synthetic */ e[] f12815p0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f12816Y;

    static {
        e eVar = new e("FIELD", 0, null);
        f12806Z = eVar;
        e eVar2 = new e("FILE", 1, null);
        f12807h0 = eVar2;
        e eVar3 = new e("PROPERTY", 2, null);
        f12808i0 = eVar3;
        e eVar4 = new e("PROPERTY_GETTER", 3, "get");
        f12809j0 = eVar4;
        e eVar5 = new e("PROPERTY_SETTER", 4, "set");
        f12810k0 = eVar5;
        e eVar6 = new e("RECEIVER", 5, null);
        f12811l0 = eVar6;
        e eVar7 = new e("CONSTRUCTOR_PARAMETER", 6, "param");
        f12812m0 = eVar7;
        e eVar8 = new e("SETTER_PARAMETER", 7, "setparam");
        f12813n0 = eVar8;
        e eVar9 = new e("PROPERTY_DELEGATE_FIELD", 8, "delegate");
        f12814o0 = eVar9;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9};
        f12815p0 = eVarArr;
        AbstractC3557B.C0(eVarArr);
    }

    public e(String str, int i10, String str2) {
        this.f12816Y = str2 == null ? H.z0(name()) : str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f12815p0.clone();
    }
}
