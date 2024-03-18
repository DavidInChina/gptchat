package Nf;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.q;
import kf.t;
import l8.AbstractC4344b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class o extends Enum {

    /* renamed from: A0  reason: collision with root package name */
    public static final o f12836A0;

    /* renamed from: B0  reason: collision with root package name */
    public static final o f12837B0;

    /* renamed from: C0  reason: collision with root package name */
    public static final o f12838C0;

    /* renamed from: D0  reason: collision with root package name */
    public static final /* synthetic */ o[] f12839D0;

    /* renamed from: Z  reason: collision with root package name */
    public static final HashMap f12840Z = new HashMap();

    /* renamed from: h0  reason: collision with root package name */
    public static final Map f12841h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final o f12842i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final o f12843j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final o f12844k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final o f12845l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final o f12846m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final o f12847n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final o f12848o0;

    /* renamed from: p0  reason: collision with root package name */
    public static final o f12849p0;

    /* renamed from: q0  reason: collision with root package name */
    public static final o f12850q0;

    /* renamed from: r0  reason: collision with root package name */
    public static final o f12851r0;

    /* renamed from: s0  reason: collision with root package name */
    public static final o f12852s0;

    /* renamed from: t0  reason: collision with root package name */
    public static final o f12853t0;

    /* renamed from: u0  reason: collision with root package name */
    public static final o f12854u0;

    /* renamed from: v0  reason: collision with root package name */
    public static final o f12855v0;

    /* renamed from: w0  reason: collision with root package name */
    public static final o f12856w0;

    /* renamed from: x0  reason: collision with root package name */
    public static final o f12857x0;

    /* renamed from: y0  reason: collision with root package name */
    public static final o f12858y0;

    /* renamed from: z0  reason: collision with root package name */
    public static final o f12859z0;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f12860Y;

    static {
        o[] values;
        o oVar = new o(0, "CLASS", true);
        f12842i0 = oVar;
        o oVar2 = new o(1, "ANNOTATION_CLASS", true);
        f12843j0 = oVar2;
        o oVar3 = new o(2, "TYPE_PARAMETER", false);
        f12844k0 = oVar3;
        o oVar4 = new o(3, "PROPERTY", true);
        f12845l0 = oVar4;
        o oVar5 = new o(4, "FIELD", true);
        f12846m0 = oVar5;
        o oVar6 = new o(5, "LOCAL_VARIABLE", true);
        f12847n0 = oVar6;
        o oVar7 = new o(6, "VALUE_PARAMETER", true);
        f12848o0 = oVar7;
        o oVar8 = new o(7, "CONSTRUCTOR", true);
        f12849p0 = oVar8;
        o oVar9 = new o(8, "FUNCTION", true);
        f12850q0 = oVar9;
        o oVar10 = new o(9, "PROPERTY_GETTER", true);
        f12851r0 = oVar10;
        o oVar11 = new o(10, "PROPERTY_SETTER", true);
        f12852s0 = oVar11;
        o oVar12 = new o(11, "TYPE", false);
        f12853t0 = oVar12;
        o oVar13 = new o(12, "EXPRESSION", false);
        o oVar14 = new o(13, "FILE", false);
        f12854u0 = oVar14;
        o oVar15 = new o(14, "TYPEALIAS", false);
        o oVar16 = new o(15, "TYPE_PROJECTION", false);
        o oVar17 = new o(16, "STAR_PROJECTION", false);
        o oVar18 = new o(17, "PROPERTY_PARAMETER", false);
        o oVar19 = new o(18, "CLASS_ONLY", false);
        f12855v0 = oVar19;
        o oVar20 = new o(19, "OBJECT", false);
        f12856w0 = oVar20;
        o oVar21 = new o(20, "STANDALONE_OBJECT", false);
        f12857x0 = oVar21;
        o oVar22 = new o(21, "COMPANION_OBJECT", false);
        f12858y0 = oVar22;
        o oVar23 = new o(22, "INTERFACE", false);
        f12859z0 = oVar23;
        o oVar24 = new o(23, "ENUM_CLASS", false);
        f12836A0 = oVar24;
        o oVar25 = new o(24, "ENUM_ENTRY", false);
        f12837B0 = oVar25;
        o oVar26 = new o(25, "LOCAL_CLASS", false);
        f12838C0 = oVar26;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9, oVar10, oVar11, oVar12, oVar13, oVar14, oVar15, oVar16, oVar17, oVar18, oVar19, oVar20, oVar21, oVar22, oVar23, oVar24, oVar25, oVar26, new o(26, "LOCAL_FUNCTION", false), new o(27, "MEMBER_FUNCTION", false), new o(28, "TOP_LEVEL_FUNCTION", false), new o(29, "MEMBER_PROPERTY", false), new o(30, "MEMBER_PROPERTY_WITH_BACKING_FIELD", false), new o(31, "MEMBER_PROPERTY_WITH_DELEGATE", false), new o(32, "MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", false), new o(33, "TOP_LEVEL_PROPERTY", false), new o(34, "TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", false), new o(35, "TOP_LEVEL_PROPERTY_WITH_DELEGATE", false), new o(36, "TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", false), new o(37, "BACKING_FIELD", true), new o(38, "INITIALIZER", false), new o(39, "DESTRUCTURING_DECLARATION", false), new o(40, "LAMBDA_EXPRESSION", false), new o(41, "ANONYMOUS_FUNCTION", false), new o(42, "OBJECT_LITERAL", false)};
        f12839D0 = oVarArr;
        AbstractC3557B.C0(oVarArr);
        for (o oVar27 : values()) {
            f12840Z.put(oVar27.name(), oVar27);
        }
        o[] values2 = values();
        ArrayList arrayList = new ArrayList();
        for (o oVar28 : values2) {
            if (oVar28.f12860Y) {
                arrayList.add(oVar28);
            }
        }
        t.P2(arrayList);
        q.B3(values());
        o oVar29 = f12842i0;
        AbstractC4344b.G0(f12843j0, oVar29);
        AbstractC4344b.G0(f12838C0, oVar29);
        AbstractC4344b.G0(f12855v0, oVar29);
        o oVar30 = f12856w0;
        AbstractC4344b.G0(f12858y0, oVar30, oVar29);
        AbstractC4344b.G0(f12857x0, oVar30, oVar29);
        AbstractC4344b.G0(f12859z0, oVar29);
        AbstractC4344b.G0(f12836A0, oVar29);
        o oVar31 = f12845l0;
        o oVar32 = f12846m0;
        AbstractC4344b.G0(f12837B0, oVar31, oVar32);
        o oVar33 = f12852s0;
        AbstractC4344b.F0(oVar33);
        o oVar34 = f12851r0;
        AbstractC4344b.F0(oVar34);
        AbstractC4344b.F0(f12850q0);
        o oVar35 = f12854u0;
        AbstractC4344b.F0(oVar35);
        e eVar = e.f12812m0;
        o oVar36 = f12848o0;
        f12841h0 = AbstractC4268D.a1(new C3959i(eVar, oVar36), new C3959i(e.f12806Z, oVar32), new C3959i(e.f12808i0, oVar31), new C3959i(e.f12807h0, oVar35), new C3959i(e.f12809j0, oVar34), new C3959i(e.f12810k0, oVar33), new C3959i(e.f12811l0, oVar36), new C3959i(e.f12813n0, oVar36), new C3959i(e.f12814o0, oVar32));
    }

    public o(int i10, String str, boolean z10) {
        this.f12860Y = z10;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f12839D0.clone();
    }
}
