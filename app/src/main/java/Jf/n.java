package Jf;

import id.AbstractC3557B;
import java.util.Set;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kg.C4294f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class n extends Enum {

    /* renamed from: j0  reason: collision with root package name */
    public static final Set f9124j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final n f9125k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final n f9126l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final n f9127m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final n f9128n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final n f9129o0;

    /* renamed from: p0  reason: collision with root package name */
    public static final n f9130p0;

    /* renamed from: q0  reason: collision with root package name */
    public static final n f9131q0;

    /* renamed from: r0  reason: collision with root package name */
    public static final n f9132r0;

    /* renamed from: s0  reason: collision with root package name */
    public static final /* synthetic */ n[] f9133s0;

    /* renamed from: Y  reason: collision with root package name */
    public final C4294f f9134Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C4294f f9135Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC3957g f9136h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC3957g f9137i0;

    static {
        n nVar = new n("BOOLEAN", 0, "Boolean");
        f9125k0 = nVar;
        n nVar2 = new n("CHAR", 1, "Char");
        f9126l0 = nVar2;
        n nVar3 = new n("BYTE", 2, "Byte");
        f9127m0 = nVar3;
        n nVar4 = new n("SHORT", 3, "Short");
        f9128n0 = nVar4;
        n nVar5 = new n("INT", 4, "Int");
        f9129o0 = nVar5;
        n nVar6 = new n("FLOAT", 5, "Float");
        f9130p0 = nVar6;
        n nVar7 = new n("LONG", 6, "Long");
        f9131q0 = nVar7;
        n nVar8 = new n("DOUBLE", 7, "Double");
        f9132r0 = nVar8;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8};
        f9133s0 = nVarArr;
        AbstractC3557B.C0(nVarArr);
        f9124j0 = R4.b.X1(nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8);
    }

    public n(String str, int i10, String str2) {
        this.f9134Y = C4294f.e(str2);
        this.f9135Z = C4294f.e(str2.concat("Array"));
        EnumC3958h enumC3958h = EnumC3958h.f36152Y;
        this.f9136h0 = R4.b.C1(enumC3958h, new m(this, 1));
        this.f9137i0 = R4.b.C1(enumC3958h, new m(this, 0));
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f9133s0.clone();
    }
}
