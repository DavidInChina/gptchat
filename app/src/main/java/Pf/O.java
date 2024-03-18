package Pf;

import Bg.h0;
import Bg.j0;
import Gf.C0631e;
import Gf.f0;
import Gf.i0;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Mf.AbstractC1013w;
import Mf.C1008q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kg.C4294f;
import pg.AbstractC5170g;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public class O extends c0 implements Mf.P {

    /* renamed from: A0  reason: collision with root package name */
    public AbstractC1146d f14035A0;

    /* renamed from: B0  reason: collision with root package name */
    public ArrayList f14036B0;

    /* renamed from: C0  reason: collision with root package name */
    public P f14037C0;

    /* renamed from: D0  reason: collision with root package name */
    public Mf.S f14038D0;

    /* renamed from: E0  reason: collision with root package name */
    public C1163v f14039E0;

    /* renamed from: F0  reason: collision with root package name */
    public C1163v f14040F0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f14041k0;

    /* renamed from: l0  reason: collision with root package name */
    public Ag.j f14042l0;

    /* renamed from: m0  reason: collision with root package name */
    public AbstractC6216a f14043m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Mf.A f14044n0;

    /* renamed from: o0  reason: collision with root package name */
    public AbstractC1007p f14045o0;

    /* renamed from: p0  reason: collision with root package name */
    public Collection f14046p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Mf.P f14047q0;

    /* renamed from: r0  reason: collision with root package name */
    public final int f14048r0;

    /* renamed from: s0  reason: collision with root package name */
    public final boolean f14049s0;

    /* renamed from: t0  reason: collision with root package name */
    public final boolean f14050t0;

    /* renamed from: u0  reason: collision with root package name */
    public final boolean f14051u0;

    /* renamed from: v0  reason: collision with root package name */
    public final boolean f14052v0;

    /* renamed from: w0  reason: collision with root package name */
    public final boolean f14053w0;

    /* renamed from: x0  reason: collision with root package name */
    public final boolean f14054x0;

    /* renamed from: y0  reason: collision with root package name */
    public List f14055y0;

    /* renamed from: z0  reason: collision with root package name */
    public AbstractC1146d f14056z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(AbstractC1003l abstractC1003l, Mf.P p10, Nf.i iVar, Mf.A a5, AbstractC1007p abstractC1007p, boolean z10, C4294f c4294f, int i10, Mf.V v10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        super(abstractC1003l, iVar, c4294f, null, v10);
        Mf.P p11;
        if (abstractC1003l != null) {
            if (iVar != null) {
                if (a5 != null) {
                    if (abstractC1007p != null) {
                        if (c4294f != null) {
                            if (i10 != 0) {
                                if (v10 != null) {
                                    this.f14041k0 = z10;
                                    this.f14046p0 = null;
                                    this.f14055y0 = Collections.emptyList();
                                    this.f14044n0 = a5;
                                    this.f14045o0 = abstractC1007p;
                                    if (p10 == null) {
                                        p11 = this;
                                    } else {
                                        p11 = p10;
                                    }
                                    this.f14047q0 = p11;
                                    this.f14048r0 = i10;
                                    this.f14049s0 = z11;
                                    this.f14050t0 = z12;
                                    this.f14051u0 = z13;
                                    this.f14052v0 = z14;
                                    this.f14053w0 = z15;
                                    this.f14054x0 = z16;
                                    return;
                                }
                                C(6);
                                throw null;
                            }
                            C(5);
                            throw null;
                        }
                        C(4);
                        throw null;
                    }
                    C(3);
                    throw null;
                }
                C(2);
                throw null;
            }
            C(1);
            throw null;
        }
        C(0);
        throw null;
    }

    public static AbstractC1013w A0(j0 j0Var, Mf.O o10) {
        if (o10 != null) {
            AbstractC1013w abstractC1013w = ((M) o10).f14023q0;
            if (abstractC1013w == null) {
                return null;
            }
            return abstractC1013w.c(j0Var);
        }
        C(31);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void C(int i10) {
        String str;
        int i11;
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
                switch (i10) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        break;
                    default:
                        i11 = 3;
                        break;
                }
                Object[] objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case 8:
                        objArr[0] = "annotations";
                        break;
                    case 2:
                    case 9:
                        objArr[0] = "modality";
                        break;
                    case 3:
                    case 10:
                    case 20:
                        objArr[0] = "visibility";
                        break;
                    case 4:
                    case 11:
                        objArr[0] = "name";
                        break;
                    case 5:
                    case 12:
                    case 35:
                        objArr[0] = "kind";
                        break;
                    case 6:
                    case 13:
                    case 37:
                        objArr[0] = "source";
                        break;
                    case 7:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 14:
                        objArr[0] = "inType";
                        break;
                    case 15:
                    case 17:
                        objArr[0] = "outType";
                        break;
                    case 16:
                    case 18:
                        objArr[0] = "typeParameters";
                        break;
                    case 19:
                        objArr[0] = "contextReceiverParameters";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case 38:
                    case 39:
                    case 41:
                    case 42:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                        break;
                    case 27:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 29:
                        objArr[0] = "copyConfiguration";
                        break;
                    case 30:
                        objArr[0] = "substitutor";
                        break;
                    case 31:
                        objArr[0] = "accessorDescriptor";
                        break;
                    case 32:
                        objArr[0] = "newOwner";
                        break;
                    case 33:
                        objArr[0] = "newModality";
                        break;
                    case 34:
                        objArr[0] = "newVisibility";
                        break;
                    case 36:
                        objArr[0] = "newName";
                        break;
                    case 40:
                        objArr[0] = "overriddenDescriptors";
                        break;
                }
                if (i10 == 28) {
                    if (i10 != 38) {
                        if (i10 != 39) {
                            if (i10 != 41) {
                                if (i10 != 42) {
                                    switch (i10) {
                                        case 21:
                                            objArr[1] = "getTypeParameters";
                                            break;
                                        case 22:
                                            objArr[1] = "getContextReceiverParameters";
                                            break;
                                        case 23:
                                            objArr[1] = "getReturnType";
                                            break;
                                        case 24:
                                            objArr[1] = "getModality";
                                            break;
                                        case 25:
                                            objArr[1] = "getVisibility";
                                            break;
                                        case 26:
                                            objArr[1] = "getAccessors";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                                            break;
                                    }
                                } else {
                                    objArr[1] = "copy";
                                }
                            } else {
                                objArr[1] = "getOverriddenDescriptors";
                            }
                        } else {
                            objArr[1] = "getKind";
                        }
                    } else {
                        objArr[1] = "getOriginal";
                    }
                } else {
                    objArr[1] = "getSourceToUseForCopy";
                }
                switch (i10) {
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        objArr[2] = "create";
                        break;
                    case 14:
                        objArr[2] = "setInType";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        objArr[2] = "setType";
                        break;
                    case 20:
                        objArr[2] = "setVisibility";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case 38:
                    case 39:
                    case 41:
                    case 42:
                        break;
                    case 27:
                        objArr[2] = "substitute";
                        break;
                    case 29:
                        objArr[2] = "doSubstitute";
                        break;
                    case 30:
                    case 31:
                        objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                        break;
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    case 40:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
                    switch (i10) {
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i11 = 2;
            Object[] objArr2 = new Object[i11];
            switch (i10) {
            }
            if (i10 == 28) {
            }
            switch (i10) {
            }
            String format2 = String.format(str, objArr2);
            if (i10 != 28) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 28) {
            switch (i10) {
            }
            Object[] objArr22 = new Object[i11];
            switch (i10) {
            }
            if (i10 == 28) {
            }
            switch (i10) {
            }
            String format22 = String.format(str, objArr22);
            if (i10 != 28) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        Object[] objArr222 = new Object[i11];
        switch (i10) {
        }
        if (i10 == 28) {
        }
        switch (i10) {
        }
        String format222 = String.format(str, objArr222);
        if (i10 != 28) {
        }
        throw new IllegalStateException(format222);
    }

    public static /* synthetic */ void w0(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        objArr[0] = "containingDeclaration";
                    } else {
                        objArr[0] = "compileTimeInitializerFactory";
                    }
                } else {
                    objArr[0] = "source";
                }
            } else {
                objArr[0] = "name";
            }
        } else {
            objArr[0] = "annotations";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 != 4) {
            if (i10 != 5) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "setCompileTimeInitializer";
            }
        } else {
            objArr[2] = "setCompileTimeInitializerFactory";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static O y0(AbstractC1003l abstractC1003l, Mf.A a5, C1008q c1008q, boolean z10, C4294f c4294f, int i10, Mf.V v10) {
        Nf.g gVar = Nf.h.f12822a;
        if (abstractC1003l != null) {
            if (c1008q != null) {
                if (c4294f != null) {
                    if (i10 != 0) {
                        if (v10 != null) {
                            return new O(abstractC1003l, null, gVar, a5, c1008q, z10, c4294f, i10, v10, false, false, false, false, false, false);
                        }
                        C(13);
                        throw null;
                    }
                    C(12);
                    throw null;
                }
                C(11);
                throw null;
            }
            C(10);
            throw null;
        }
        C(7);
        throw null;
    }

    public final void B0(P p10, Q q10, C1163v c1163v, C1163v c1163v2) {
        this.f14037C0 = p10;
        this.f14038D0 = q10;
        this.f14039E0 = c1163v;
        this.f14040F0 = c1163v2;
    }

    public final void C0(Ag.j jVar, AbstractC6216a abstractC6216a) {
        if (abstractC6216a != null) {
            this.f14043m0 = abstractC6216a;
            if (jVar == null) {
                jVar = (Ag.j) abstractC6216a.mo122invoke();
            }
            this.f14042l0 = jVar;
            return;
        }
        w0(5);
        throw null;
    }

    public final void E0(Bg.A a5, List list, AbstractC1146d abstractC1146d, S s10, List list2) {
        if (a5 != null) {
            if (list != null) {
                if (list2 != null) {
                    this.f14087j0 = a5;
                    this.f14036B0 = new ArrayList(list);
                    this.f14035A0 = s10;
                    this.f14056z0 = abstractC1146d;
                    this.f14055y0 = list2;
                    return;
                }
                C(19);
                throw null;
            }
            C(18);
            throw null;
        }
        C(17);
        throw null;
    }

    @Override // Mf.AbstractC1016z
    public final boolean H() {
        return this.f14051u0;
    }

    @Override // Mf.P
    public final boolean K() {
        return this.f14054x0;
    }

    @Override // Mf.i0
    public final AbstractC5170g Q() {
        Ag.j jVar = this.f14042l0;
        if (jVar != null) {
            return (AbstractC5170g) jVar.mo122invoke();
        }
        return null;
    }

    @Override // Pf.c0, Mf.AbstractC0993b
    public final AbstractC1146d W() {
        return this.f14056z0;
    }

    @Override // Mf.i0
    public final boolean Y() {
        return this.f14041k0;
    }

    @Override // Pf.c0, Mf.AbstractC0993b
    public final AbstractC1146d Z() {
        return this.f14035A0;
    }

    @Override // Mf.P
    public final C1163v a0() {
        return this.f14040F0;
    }

    @Override // Mf.P
    public final Mf.S b() {
        return this.f14038D0;
    }

    @Override // Mf.X
    public final Mf.P c(j0 j0Var) {
        if (j0Var != null) {
            if (j0Var.f2128a.e()) {
                return this;
            }
            N n10 = new N(this);
            h0 g10 = j0Var.g();
            if (g10 != null) {
                n10.f14029f = g10;
                n10.f14027d = p0();
                return n10.b();
            }
            N.a(15);
            throw null;
        }
        C(27);
        throw null;
    }

    @Override // Mf.P
    public final C1163v c0() {
        return this.f14039E0;
    }

    @Override // Mf.P
    public final P d() {
        return this.f14037C0;
    }

    @Override // Mf.AbstractC0993b
    public final List d0() {
        List list = this.f14055y0;
        if (list != null) {
            return list;
        }
        C(22);
        throw null;
    }

    @Override // Mf.AbstractC0994c
    public final int e() {
        int i10 = this.f14048r0;
        if (i10 != 0) {
            return i10;
        }
        C(39);
        throw null;
    }

    @Override // Mf.i0
    public final boolean e0() {
        return this.f14049s0;
    }

    @Override // Pf.c0, Mf.AbstractC0993b
    public final Bg.A getReturnType() {
        Bg.A type = getType();
        if (type != null) {
            return type;
        }
        C(23);
        throw null;
    }

    @Override // Pf.c0, Mf.AbstractC0993b
    public final List getTypeParameters() {
        ArrayList arrayList = this.f14036B0;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // Mf.AbstractC1006o, Mf.AbstractC1016z
    public final AbstractC1007p getVisibility() {
        AbstractC1007p abstractC1007p = this.f14045o0;
        if (abstractC1007p != null) {
            return abstractC1007p;
        }
        C(25);
        throw null;
    }

    @Override // Mf.AbstractC1016z
    public final Mf.A h() {
        Mf.A a5 = this.f14044n0;
        if (a5 != null) {
            return a5;
        }
        C(24);
        throw null;
    }

    @Override // Mf.AbstractC0994c
    public final void h0(Collection collection) {
        if (collection != null) {
            this.f14046p0 = collection;
        } else {
            C(40);
            throw null;
        }
    }

    @Override // Mf.AbstractC1016z
    public boolean isExternal() {
        return this.f14053w0;
    }

    @Override // Mf.AbstractC0993b
    public final Collection m() {
        Collection collection = this.f14046p0;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        C(41);
        throw null;
    }

    @Override // Mf.AbstractC1016z
    public final boolean o0() {
        return this.f14052v0;
    }

    @Override // Mf.P
    public final ArrayList p() {
        ArrayList arrayList = new ArrayList(2);
        P p10 = this.f14037C0;
        if (p10 != null) {
            arrayList.add(p10);
        }
        Mf.S s10 = this.f14038D0;
        if (s10 != null) {
            arrayList.add(s10);
        }
        return arrayList;
    }

    @Override // Mf.AbstractC0993b
    public Object q0(Wf.e eVar) {
        return null;
    }

    @Override // Mf.i0
    public boolean t() {
        return this.f14050t0;
    }

    @Override // Mf.AbstractC1003l
    public final Object u0(C0631e c0631e, Object obj) {
        int i10;
        Object c0Var;
        int i11 = c0631e.f6407a;
        Object obj2 = c0631e.f6408b;
        switch (i11) {
            case 0:
                jf.y yVar = (jf.y) obj;
                int i12 = 0;
                if (this.f14056z0 != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (this.f14035A0 != null) {
                    i12 = 1;
                }
                int i13 = i10 + i12;
                if (this.f14041k0) {
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                c0Var = new Gf.P((Gf.H) obj2, this);
                            }
                            throw new Lc.l("Unsupported property: " + this, 3);
                        }
                        c0Var = new Gf.N((Gf.H) obj2, this);
                    } else {
                        c0Var = new Gf.L((Gf.H) obj2, this);
                    }
                    return c0Var;
                }
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            c0Var = new i0((Gf.H) obj2, this);
                        }
                        throw new Lc.l("Unsupported property: " + this, 3);
                    }
                    c0Var = new f0((Gf.H) obj2, this);
                } else {
                    c0Var = new Gf.c0((Gf.H) obj2, this);
                }
                return c0Var;
            default:
                mg.m.n((mg.m) obj2, this, (StringBuilder) obj);
                return jf.y.f36177a;
        }
    }

    /* renamed from: x0 */
    public final O D(AbstractC1003l abstractC1003l, Mf.A a5, C1008q c1008q) {
        N n10 = new N(this);
        if (abstractC1003l != null) {
            n10.f14024a = abstractC1003l;
            n10.f14027d = null;
            n10.f14025b = a5;
            if (c1008q != null) {
                n10.f14026c = c1008q;
                n10.f14028e = 2;
                n10.f14030g = false;
                O b10 = n10.b();
                if (b10 != null) {
                    return b10;
                }
                C(42);
                throw null;
            }
            N.a(8);
            throw null;
        }
        N.a(0);
        throw null;
    }

    public O z0(AbstractC1003l abstractC1003l, Mf.A a5, AbstractC1007p abstractC1007p, Mf.P p10, int i10, C4294f c4294f) {
        Mf.U u10 = Mf.V.f12075a;
        if (abstractC1003l != null) {
            if (a5 != null) {
                if (abstractC1007p != null) {
                    if (i10 != 0) {
                        if (c4294f != null) {
                            Nf.i annotations = getAnnotations();
                            boolean t10 = t();
                            boolean isExternal = isExternal();
                            return new O(abstractC1003l, p10, annotations, a5, abstractC1007p, this.f14041k0, c4294f, i10, u10, this.f14049s0, t10, this.f14051u0, this.f14052v0, isExternal, this.f14054x0);
                        }
                        C(36);
                        throw null;
                    }
                    C(35);
                    throw null;
                }
                C(34);
                throw null;
            }
            C(33);
            throw null;
        }
        C(32);
        throw null;
    }

    @Override // Pf.AbstractC1159q, Pf.AbstractC1158p, Mf.AbstractC1003l
    /* renamed from: a */
    public final Mf.P p0() {
        Mf.P p10 = this.f14047q0;
        Mf.P mo24a = p10 == this ? this : p10.mo24a();
        if (mo24a != null) {
            return mo24a;
        }
        C(38);
        throw null;
    }

    public void D0(Bg.A a5) {
    }
}
