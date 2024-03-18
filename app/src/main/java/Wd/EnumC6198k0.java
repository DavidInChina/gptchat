package wd;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import qf.C5323a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* renamed from: wd.k0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6198k0 extends Enum<EnumC6198k0> {
    public static final C6196j0 Companion = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final AbstractC3957g f48429Z = R4.b.C1(EnumC3958h.f36152Y, C6194i0.f48425Y);

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC6198k0 f48430h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC6198k0 f48431i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC6198k0 f48432j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final EnumC6198k0 f48433k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final EnumC6198k0 f48434l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ EnumC6198k0[] f48435m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final /* synthetic */ C5323a f48436n0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f48437Y;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wd.j0] */
    static {
        EnumC6198k0 enumC6198k0 = new EnumC6198k0("FREE", 0, "free");
        f48430h0 = enumC6198k0;
        EnumC6198k0 enumC6198k02 = new EnumC6198k0("PLUS", 1, "plus");
        f48431i0 = enumC6198k02;
        EnumC6198k0 enumC6198k03 = new EnumC6198k0("TEAM", 2, "team");
        f48432j0 = enumC6198k03;
        EnumC6198k0 enumC6198k04 = new EnumC6198k0("ENTERPRISE", 3, "enterprise");
        f48433k0 = enumC6198k04;
        EnumC6198k0 enumC6198k05 = new EnumC6198k0("UNKNOWN", 4, null);
        f48434l0 = enumC6198k05;
        EnumC6198k0[] enumC6198k0Arr = {enumC6198k0, enumC6198k02, enumC6198k03, enumC6198k04, enumC6198k05};
        f48435m0 = enumC6198k0Arr;
        f48436n0 = AbstractC3557B.C0(enumC6198k0Arr);
    }

    public EnumC6198k0(String str, int i10, String str2) {
        this.f48437Y = str2;
    }

    public static EnumC6198k0 valueOf(String str) {
        return (EnumC6198k0) Enum.valueOf(EnumC6198k0.class, str);
    }

    public static EnumC6198k0[] values() {
        return (EnumC6198k0[]) f48435m0.clone();
    }
}
