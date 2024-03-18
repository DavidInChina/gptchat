package G;

import A.C0036p;
import B.AbstractC0130h1;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6696f;
import z.C6716p;

/* renamed from: G.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0554i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public kotlin.jvm.internal.x f5516Y;

    /* renamed from: Z  reason: collision with root package name */
    public kotlin.jvm.internal.B f5517Z;

    /* renamed from: h0  reason: collision with root package name */
    public kotlin.jvm.internal.z f5518h0;

    /* renamed from: i0  reason: collision with root package name */
    public float f5519i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f5520j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f5521k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f5522l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f5523m0;

    /* renamed from: n0  reason: collision with root package name */
    public /* synthetic */ Object f5524n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ int f5525o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ Z0.b f5526p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0556k f5527q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ int f5528r0;

    /* renamed from: s0  reason: collision with root package name */
    public final /* synthetic */ int f5529s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0554i(int i10, int i11, int i12, AbstractC0556k abstractC0556k, Z0.b bVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f5525o0 = i10;
        this.f5526p0 = bVar;
        this.f5527q0 = abstractC0556k;
        this.f5528r0 = i11;
        this.f5529s0 = i12;
    }

    public static final boolean p(boolean z10, AbstractC0556k abstractC0556k, int i10, int i11) {
        if (z10) {
            if (abstractC0556k.g() <= i10 && (abstractC0556k.g() != i10 || abstractC0556k.f() <= i11)) {
                return false;
            }
        } else if (abstractC0556k.g() >= i10 && (abstractC0556k.g() != i10 || abstractC0556k.f() >= i11)) {
            return false;
        }
        return true;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0554i c0554i = new C0554i(this.f5525o0, this.f5528r0, this.f5529s0, this.f5527q0, this.f5526p0, abstractC4825e);
        c0554i.f5524n0 = obj;
        return c0554i;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0554i) create((AbstractC0130h1) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0246 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8 A[Catch: g -> 0x01d2, TryCatch #5 {g -> 0x01d2, blocks: (B:25:0x00b4, B:27:0x00b8, B:29:0x00be, B:40:0x00e6), top: B:124:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017b  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, kotlin.jvm.internal.z] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x017b -> B:122:0x0182). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC0556k abstractC0556k;
        int i10;
        int i11;
        int i12;
        boolean z10;
        EnumC5000a enumC5000a;
        C0552g e10;
        C6716p l10;
        Float f6;
        boolean z11;
        C0036p c0036p;
        float f10;
        float f11;
        float f12;
        kotlin.jvm.internal.z zVar;
        kotlin.jvm.internal.B b10;
        AbstractC0130h1 abstractC0130h1;
        kotlin.jvm.internal.x xVar;
        int i13;
        AbstractC0130h1 abstractC0130h12;
        AbstractC0556k abstractC0556k2;
        float max;
        int i14;
        C6716p l11;
        boolean z12;
        C0553h c0553h;
        EnumC5000a enumC5000a2;
        boolean z13;
        boolean z14;
        kotlin.jvm.internal.x xVar2;
        kotlin.jvm.internal.B b11;
        kotlin.jvm.internal.z zVar2;
        float f13;
        int i15;
        Z0.b bVar = this.f5526p0;
        EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
        int i16 = this.f5523m0;
        float f14 = 0.0f;
        int i17 = this.f5528r0;
        AbstractC0130h1 abstractC0130h13 = 2;
        AbstractC0556k abstractC0556k3 = this.f5527q0;
        int i18 = this.f5525o0;
        try {
        } catch (C0552g e11) {
            e10 = e11;
            z10 = true;
            enumC5000a = enumC5000a3;
            i12 = i17;
            abstractC0556k = abstractC0556k3;
        }
        if (i16 != 0) {
            if (i16 != 1) {
                if (i16 == 2) {
                    AbstractC0130h1 abstractC0130h14 = (AbstractC0130h1) this.f5524n0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    i10 = i18;
                    i11 = i17;
                    abstractC0556k = abstractC0556k3;
                    abstractC0556k.e(i10, i11);
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = this.f5522l0;
            float f15 = this.f5521k0;
            float f16 = this.f5520j0;
            float f17 = this.f5519i0;
            zVar = this.f5518h0;
            kotlin.jvm.internal.B b12 = this.f5517Z;
            kotlin.jvm.internal.x xVar3 = this.f5516Y;
            AbstractC0130h1 abstractC0130h15 = (AbstractC0130h1) this.f5524n0;
            com.google.android.gms.internal.play_billing.N.B0(obj);
            z10 = true;
            enumC5000a = enumC5000a3;
            i12 = i17;
            abstractC0556k2 = abstractC0556k3;
            i10 = i18;
            f11 = f15;
            xVar = xVar3;
            f10 = f16;
            AbstractC0130h1 abstractC0130h16 = abstractC0130h15;
            f12 = f17;
            b10 = b12;
            try {
                try {
                    zVar.f37647Y++;
                    if (xVar.f37645Y && abstractC0556k3.a() > 0) {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        float d10 = abstractC0556k3.d(i18, i17);
                                                        if (Math.abs(d10) < f12) {
                                                            try {
                                                                max = Math.max(Math.abs(d10), f11);
                                                                if (i13 == 0) {
                                                                    max = -max;
                                                                }
                                                            } catch (C0552g e12) {
                                                                e10 = e12;
                                                                abstractC0130h13 = abstractC0130h1;
                                                                enumC5000a = enumC5000a3;
                                                                i12 = i17;
                                                                abstractC0556k = abstractC0556k3;
                                                                z10 = true;
                                                                i10 = i18;
                                                                l10 = AbstractC6696f.l(e10.f5503Z, 0.0f, 0.0f, 30);
                                                                float f18 = e10.f5502Y + i12;
                                                                Object obj2 = new Object();
                                                                f6 = new Float(f18);
                                                                if (((Number) l10.b()).floatValue() != 0.0f) {
                                                                }
                                                                c0036p = new C0036p(f18, obj2, (Object) abstractC0130h13, 2);
                                                                this.f5524n0 = abstractC0130h13;
                                                                this.f5516Y = null;
                                                                this.f5517Z = null;
                                                                this.f5518h0 = null;
                                                                this.f5523m0 = 2;
                                                                if (AbstractC6696f.h(l10, f6, null, !z11, c0036p, this, 2) != enumC5000a) {
                                                                }
                                                            }
                                                        } else if (i13 != 0) {
                                                            max = f12;
                                                        } else {
                                                            max = -f12;
                                                        }
                                                        ?? obj3 = new Object();
                                                        Float f19 = new Float(max);
                                                        if (((Number) ((C6716p) b10.f37622Y).b()).floatValue() != 0.0f) {
                                                            z12 = false;
                                                        } else {
                                                            z12 = true;
                                                        }
                                                        AbstractC0556k abstractC0556k4 = this.f5527q0;
                                                        int i19 = this.f5525o0;
                                                        enumC5000a2 = enumC5000a3;
                                                        if (i13 == 0) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        this.f5516Y = xVar;
                                                        this.f5517Z = b10;
                                                        this.f5518h0 = zVar;
                                                        this.f5519i0 = f12;
                                                        this.f5520j0 = f10;
                                                        this.f5521k0 = f11;
                                                        this.f5522l0 = i13;
                                                        this.f5523m0 = 1;
                                                        enumC5000a = enumC5000a2;
                                                        if (AbstractC6696f.h(l11, f19, null, z14, c0553h, this, 2) != enumC5000a) {
                                                            return enumC5000a;
                                                        }
                                                        zVar = zVar2;
                                                        abstractC0130h16 = abstractC0130h12;
                                                        xVar = xVar2;
                                                        b10 = b11;
                                                        f12 = f13;
                                                        zVar.f37647Y++;
                                                        i18 = i10;
                                                        enumC5000a3 = enumC5000a;
                                                        i17 = i12;
                                                        abstractC0556k3 = abstractC0556k2;
                                                        f14 = 0.0f;
                                                        abstractC0130h1 = abstractC0130h16;
                                                        if (xVar.f37645Y) {
                                                            float d102 = abstractC0556k3.d(i18, i17);
                                                            if (Math.abs(d102) < f12) {
                                                            }
                                                            i14 = i18;
                                                            l11 = AbstractC6696f.l((C6716p) b10.f37622Y, f14, f14, 30);
                                                            b10.f37622Y = l11;
                                                            ?? obj32 = new Object();
                                                            Float f192 = new Float(max);
                                                            if (((Number) ((C6716p) b10.f37622Y).b()).floatValue() != 0.0f) {
                                                            }
                                                            i12 = i17;
                                                            AbstractC0556k abstractC0556k42 = this.f5527q0;
                                                            abstractC0556k2 = abstractC0556k3;
                                                            int i192 = this.f5525o0;
                                                            enumC5000a2 = enumC5000a3;
                                                            if (i13 == 0) {
                                                            }
                                                            z14 = z12;
                                                            c0553h = new C0553h(abstractC0556k42, i192, max, obj32, abstractC0130h1, xVar, z13, f10, zVar, this.f5529s0, this.f5528r0, b10);
                                                            this.f5524n0 = abstractC0130h1;
                                                            this.f5516Y = xVar;
                                                            this.f5517Z = b10;
                                                            this.f5518h0 = zVar;
                                                            this.f5519i0 = f12;
                                                            this.f5520j0 = f10;
                                                            this.f5521k0 = f11;
                                                            this.f5522l0 = i13;
                                                            this.f5523m0 = 1;
                                                            xVar2 = xVar;
                                                            abstractC0130h12 = abstractC0130h1;
                                                            b11 = b10;
                                                            zVar2 = zVar;
                                                            f13 = f12;
                                                            z10 = true;
                                                            i10 = i14;
                                                            enumC5000a = enumC5000a2;
                                                            if (AbstractC6696f.h(l11, f192, null, z14, c0553h, this, 2) != enumC5000a) {
                                                            }
                                                        }
                                                    } catch (C0552g e13) {
                                                        e10 = e13;
                                                        abstractC0130h12 = abstractC0130h1;
                                                        enumC5000a = enumC5000a3;
                                                        i12 = i17;
                                                    }
                                                    i14 = i18;
                                                } catch (C0552g e14) {
                                                    e10 = e14;
                                                    abstractC0130h12 = abstractC0130h1;
                                                    i10 = i14;
                                                    enumC5000a = enumC5000a2;
                                                }
                                            } catch (C0552g e15) {
                                                e10 = e15;
                                                abstractC0130h12 = abstractC0130h1;
                                                enumC5000a = enumC5000a3;
                                                i12 = i17;
                                                abstractC0556k2 = abstractC0556k3;
                                                i10 = i14;
                                            }
                                            l11 = AbstractC6696f.l((C6716p) b10.f37622Y, f14, f14, 30);
                                            b10.f37622Y = l11;
                                        } catch (C0552g e16) {
                                            e10 = e16;
                                            abstractC0130h12 = abstractC0130h1;
                                            i10 = i14;
                                            enumC5000a = enumC5000a2;
                                            z10 = true;
                                            abstractC0130h13 = abstractC0130h12;
                                            abstractC0556k = abstractC0556k2;
                                            l10 = AbstractC6696f.l(e10.f5503Z, 0.0f, 0.0f, 30);
                                            float f182 = e10.f5502Y + i12;
                                            Object obj22 = new Object();
                                            f6 = new Float(f182);
                                            if (((Number) l10.b()).floatValue() != 0.0f) {
                                                z11 = z10;
                                            } else {
                                                z11 = false;
                                            }
                                            c0036p = new C0036p(f182, obj22, (Object) abstractC0130h13, 2);
                                            this.f5524n0 = abstractC0130h13;
                                            this.f5516Y = null;
                                            this.f5517Z = null;
                                            this.f5518h0 = null;
                                            this.f5523m0 = 2;
                                            if (AbstractC6696f.h(l10, f6, null, !z11, c0036p, this, 2) != enumC5000a) {
                                                return enumC5000a;
                                            }
                                            i11 = i12;
                                            abstractC0556k.e(i10, i11);
                                            return jf.y.f36177a;
                                        }
                                        z14 = z12;
                                        c0553h = new C0553h(abstractC0556k42, i192, max, obj32, abstractC0130h1, xVar, z13, f10, zVar, this.f5529s0, this.f5528r0, b10);
                                        this.f5524n0 = abstractC0130h1;
                                    } catch (C0552g e17) {
                                        e10 = e17;
                                        abstractC0130h12 = abstractC0130h1;
                                        enumC5000a = enumC5000a3;
                                        i10 = i14;
                                        z10 = true;
                                        abstractC0130h13 = abstractC0130h12;
                                        abstractC0556k = abstractC0556k2;
                                        l10 = AbstractC6696f.l(e10.f5503Z, 0.0f, 0.0f, 30);
                                        float f1822 = e10.f5502Y + i12;
                                        Object obj222 = new Object();
                                        f6 = new Float(f1822);
                                        if (((Number) l10.b()).floatValue() != 0.0f) {
                                        }
                                        c0036p = new C0036p(f1822, obj222, (Object) abstractC0130h13, 2);
                                        this.f5524n0 = abstractC0130h13;
                                        this.f5516Y = null;
                                        this.f5517Z = null;
                                        this.f5518h0 = null;
                                        this.f5523m0 = 2;
                                        if (AbstractC6696f.h(l10, f6, null, !z11, c0036p, this, 2) != enumC5000a) {
                                        }
                                    }
                                    abstractC0556k2 = abstractC0556k3;
                                } catch (C0552g e18) {
                                    e10 = e18;
                                    enumC5000a = enumC5000a2;
                                    abstractC0130h13 = abstractC0130h12;
                                    abstractC0556k = abstractC0556k2;
                                    l10 = AbstractC6696f.l(e10.f5503Z, 0.0f, 0.0f, 30);
                                    float f18222 = e10.f5502Y + i12;
                                    Object obj2222 = new Object();
                                    f6 = new Float(f18222);
                                    if (((Number) l10.b()).floatValue() != 0.0f) {
                                    }
                                    c0036p = new C0036p(f18222, obj2222, (Object) abstractC0130h13, 2);
                                    this.f5524n0 = abstractC0130h13;
                                    this.f5516Y = null;
                                    this.f5517Z = null;
                                    this.f5518h0 = null;
                                    this.f5523m0 = 2;
                                    if (AbstractC6696f.h(l10, f6, null, !z11, c0036p, this, 2) != enumC5000a) {
                                    }
                                }
                                xVar2 = xVar;
                                abstractC0130h12 = abstractC0130h1;
                                b11 = b10;
                                zVar2 = zVar;
                                f13 = f12;
                                z10 = true;
                                i10 = i14;
                            } catch (C0552g e19) {
                                e10 = e19;
                                abstractC0130h12 = abstractC0130h1;
                                z10 = true;
                                i10 = i14;
                            }
                        } catch (C0552g e20) {
                            e10 = e20;
                            abstractC0130h12 = abstractC0130h1;
                            enumC5000a = enumC5000a3;
                            abstractC0556k2 = abstractC0556k3;
                            i10 = i14;
                            z10 = true;
                            abstractC0130h13 = abstractC0130h12;
                            abstractC0556k = abstractC0556k2;
                            l10 = AbstractC6696f.l(e10.f5503Z, 0.0f, 0.0f, 30);
                            float f182222 = e10.f5502Y + i12;
                            Object obj22222 = new Object();
                            f6 = new Float(f182222);
                            if (((Number) l10.b()).floatValue() != 0.0f) {
                            }
                            c0036p = new C0036p(f182222, obj22222, (Object) abstractC0130h13, 2);
                            this.f5524n0 = abstractC0130h13;
                            this.f5516Y = null;
                            this.f5517Z = null;
                            this.f5518h0 = null;
                            this.f5523m0 = 2;
                            if (AbstractC6696f.h(l10, f6, null, !z11, c0036p, this, 2) != enumC5000a) {
                            }
                        }
                        i12 = i17;
                    }
                } catch (C0552g e21) {
                    e10 = e21;
                    abstractC0130h13 = abstractC0130h16;
                    abstractC0556k = abstractC0556k2;
                    l10 = AbstractC6696f.l(e10.f5503Z, 0.0f, 0.0f, 30);
                    float f1822222 = e10.f5502Y + i12;
                    Object obj222222 = new Object();
                    f6 = new Float(f1822222);
                    if (((Number) l10.b()).floatValue() != 0.0f) {
                    }
                    c0036p = new C0036p(f1822222, obj222222, (Object) abstractC0130h13, 2);
                    this.f5524n0 = abstractC0130h13;
                    this.f5516Y = null;
                    this.f5517Z = null;
                    this.f5518h0 = null;
                    this.f5523m0 = 2;
                    if (AbstractC6696f.h(l10, f6, null, !z11, c0036p, this, 2) != enumC5000a) {
                    }
                }
            } catch (C0552g e22) {
                e10 = e22;
                abstractC0130h12 = abstractC0130h1;
                enumC5000a = enumC5000a3;
                i12 = i17;
                abstractC0556k2 = abstractC0556k3;
                z10 = true;
                i10 = i18;
            }
            i18 = i10;
            enumC5000a3 = enumC5000a;
            i17 = i12;
            abstractC0556k3 = abstractC0556k2;
            f14 = 0.0f;
            abstractC0130h1 = abstractC0130h16;
            return jf.y.f36177a;
        }
        com.google.android.gms.internal.play_billing.N.B0(obj);
        abstractC0130h13 = (AbstractC0130h1) this.f5524n0;
        if (i18 >= 0.0f) {
            float R10 = bVar.R(AbstractC0555j.f5530a);
            float R11 = bVar.R(AbstractC0555j.f5531b);
            float R12 = bVar.R(AbstractC0555j.f5532c);
            ?? obj4 = new Object();
            obj4.f37645Y = true;
            ?? obj5 = new Object();
            obj5.f37622Y = AbstractC6696f.b(0.0f, 0.0f, 30);
            if (!AbstractC0555j.a(abstractC0556k3, i18)) {
                try {
                    if (i18 > abstractC0556k3.g()) {
                        i15 = 1;
                    } else {
                        i15 = 0;
                    }
                    ?? obj6 = new Object();
                    obj6.f37647Y = 1;
                    f11 = R12;
                    i13 = i15;
                    f12 = R10;
                    xVar = obj4;
                    b10 = obj5;
                    zVar = obj6;
                    f10 = R11;
                    abstractC0130h1 = abstractC0130h13;
                    if (xVar.f37645Y) {
                    }
                } catch (C0552g e23) {
                    e10 = e23;
                    z10 = true;
                    enumC5000a = enumC5000a3;
                    i12 = i17;
                    abstractC0556k2 = abstractC0556k3;
                    i10 = i18;
                    abstractC0556k = abstractC0556k2;
                    l10 = AbstractC6696f.l(e10.f5503Z, 0.0f, 0.0f, 30);
                    float f18222222 = e10.f5502Y + i12;
                    Object obj2222222 = new Object();
                    f6 = new Float(f18222222);
                    if (((Number) l10.b()).floatValue() != 0.0f) {
                    }
                    c0036p = new C0036p(f18222222, obj2222222, (Object) abstractC0130h13, 2);
                    this.f5524n0 = abstractC0130h13;
                    this.f5516Y = null;
                    this.f5517Z = null;
                    this.f5518h0 = null;
                    this.f5523m0 = 2;
                    if (AbstractC6696f.h(l10, f6, null, !z11, c0036p, this, 2) != enumC5000a) {
                    }
                }
                return jf.y.f36177a;
            }
            z10 = true;
            enumC5000a = enumC5000a3;
            i12 = i17;
            abstractC0556k = abstractC0556k3;
            i10 = i18;
            try {
                throw new C0552g(abstractC0556k.c(i10), (C6716p) obj5.f37622Y);
            } catch (C0552g e24) {
                e10 = e24;
                l10 = AbstractC6696f.l(e10.f5503Z, 0.0f, 0.0f, 30);
                float f182222222 = e10.f5502Y + i12;
                Object obj22222222 = new Object();
                f6 = new Float(f182222222);
                if (((Number) l10.b()).floatValue() != 0.0f) {
                }
                c0036p = new C0036p(f182222222, obj22222222, (Object) abstractC0130h13, 2);
                this.f5524n0 = abstractC0130h13;
                this.f5516Y = null;
                this.f5517Z = null;
                this.f5518h0 = null;
                this.f5523m0 = 2;
                if (AbstractC6696f.h(l10, f6, null, !z11, c0036p, this, 2) != enumC5000a) {
                }
            }
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i18 + ')').toString());
        }
    }
}
