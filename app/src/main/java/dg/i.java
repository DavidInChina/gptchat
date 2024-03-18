package Dg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class i extends Enum {

    /* renamed from: Z  reason: collision with root package name */
    public static final i f3660Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final i f3661h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final i f3662i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final i f3663j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final i f3664k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ i[] f3665l0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f3666Y;

    static {
        i iVar = new i("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");
        f3660Z = iVar;
        i iVar2 = new i("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");
        f3661h0 = iVar2;
        i iVar3 = new i("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");
        i iVar4 = new i("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");
        f3662i0 = iVar4;
        i iVar5 = new i("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");
        i iVar6 = new i("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");
        i iVar7 = new i("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");
        f3663j0 = iVar7;
        i iVar8 = new i("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");
        i iVar9 = new i("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");
        f3664k0 = iVar9;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, new i("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s")};
        f3665l0 = iVarArr;
        AbstractC3557B.C0(iVarArr);
    }

    public i(String str, int i10, String str2) {
        this.f3666Y = str2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f3665l0.clone();
    }
}
