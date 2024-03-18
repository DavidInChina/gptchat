package Pf;

import Bg.p0;
import Gf.C0631e;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Mf.AbstractC1004m;
import java.util.List;
import kg.C4294f;

/* renamed from: Pf.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1153k extends AbstractC1159q implements Mf.b0 {

    /* renamed from: j0  reason: collision with root package name */
    public final p0 f14102j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f14103k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f14104l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Ag.l f14105m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Ag.l f14106n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Ag.q f14107o0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC1153k(Ag.u uVar, AbstractC1003l abstractC1003l, Nf.i iVar, C4294f c4294f, p0 p0Var, boolean z10, int i10, Mf.Z z11) {
        super(abstractC1003l, iVar, c4294f, r0);
        Mf.U u10 = Mf.V.f12075a;
        if (uVar != null) {
            if (abstractC1003l != null) {
                if (iVar != null) {
                    if (c4294f != null) {
                        if (p0Var != null) {
                            if (z11 != null) {
                                this.f14102j0 = p0Var;
                                this.f14103k0 = z10;
                                this.f14104l0 = i10;
                                C1150h c1150h = new C1150h(this, uVar, z11);
                                Ag.q qVar = (Ag.q) uVar;
                                this.f14105m0 = new Ag.l(qVar, c1150h);
                                this.f14106n0 = new Ag.l(qVar, new Jf.j(this, 1, c4294f));
                                this.f14107o0 = qVar;
                                return;
                            }
                            C(6);
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

    public static /* synthetic */ void C(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // Mf.b0
    public final boolean A() {
        return this.f14103k0;
    }

    @Override // Mf.b0
    public final p0 J() {
        p0 p0Var = this.f14102j0;
        if (p0Var != null) {
            return p0Var;
        }
        C(7);
        throw null;
    }

    @Override // Mf.b0
    public final Ag.u X() {
        Ag.q qVar = this.f14107o0;
        if (qVar != null) {
            return qVar;
        }
        C(14);
        throw null;
    }

    @Override // Pf.AbstractC1159q, Pf.AbstractC1158p, Mf.AbstractC1003l
    /* renamed from: a  reason: collision with other method in class */
    public final AbstractC1000i mo24a() {
        return this;
    }

    @Override // Mf.b0
    public final boolean b0() {
        return false;
    }

    @Override // Mf.b0, Mf.AbstractC1000i
    public final Bg.Y f() {
        Bg.Y y10 = (Bg.Y) this.f14105m0.mo122invoke();
        if (y10 != null) {
            return y10;
        }
        C(9);
        throw null;
    }

    @Override // Mf.b0
    public final int getIndex() {
        return this.f14104l0;
    }

    @Override // Mf.b0
    public final List getUpperBounds() {
        List l10 = ((C1152j) f()).l();
        if (l10 != null) {
            return l10;
        }
        C(8);
        throw null;
    }

    @Override // Mf.AbstractC1000i
    public final Bg.D n() {
        Bg.D d10 = (Bg.D) this.f14106n0.mo122invoke();
        if (d10 != null) {
            return d10;
        }
        C(10);
        throw null;
    }

    @Override // Mf.AbstractC1003l
    public final Object u0(C0631e c0631e, Object obj) {
        switch (c0631e.f6407a) {
            case 0:
                return null;
            default:
                mg.m mVar = (mg.m) c0631e.f6408b;
                mg.m mVar2 = mg.m.f39296c;
                mVar.b0(this, (StringBuilder) obj, true);
                return jf.y.f36177a;
        }
    }

    public abstract void x0(Bg.A a5);

    public abstract List y0();

    @Override // Pf.AbstractC1159q, Pf.AbstractC1158p, Mf.AbstractC1003l
    /* renamed from: a */
    public final AbstractC1003l mo24a() {
        return this;
    }

    @Override // Pf.AbstractC1159q, Pf.AbstractC1158p, Mf.AbstractC1003l
    /* renamed from: a */
    public final Mf.b0 mo24a() {
        return this;
    }

    @Override // Pf.AbstractC1159q
    public final AbstractC1004m p0() {
        return this;
    }

    public List w0(List list) {
        return list;
    }
}
