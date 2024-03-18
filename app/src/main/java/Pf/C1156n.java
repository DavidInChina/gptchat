package Pf;

import Bg.C0221n;
import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Mf.C1008q;
import Mf.EnumC0998g;
import Mf.f0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kg.C4294f;

/* renamed from: Pf.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1156n extends AbstractC1155m {

    /* renamed from: m0  reason: collision with root package name */
    public final Mf.A f14112m0;

    /* renamed from: n0  reason: collision with root package name */
    public final EnumC0998g f14113n0;

    /* renamed from: o0  reason: collision with root package name */
    public final C0221n f14114o0;

    /* renamed from: p0  reason: collision with root package name */
    public ug.n f14115p0;

    /* renamed from: q0  reason: collision with root package name */
    public Set f14116q0;

    /* renamed from: r0  reason: collision with root package name */
    public AbstractC0996e f14117r0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1156n(AbstractC1003l abstractC1003l, C4294f c4294f, Mf.A a5, EnumC0998g enumC0998g, List list, Ag.u uVar) {
        super(uVar, abstractC1003l, c4294f, r0);
        Mf.U u10 = Mf.V.f12075a;
        if (abstractC1003l != null) {
            if (c4294f != null) {
                if (uVar != null) {
                    this.f14112m0 = a5;
                    this.f14113n0 = enumC0998g;
                    this.f14114o0 = new C0221n(this, Collections.emptyList(), list, uVar);
                    return;
                }
                p0(6);
                throw null;
            }
            p0(1);
            throw null;
        }
        p0(0);
        throw null;
    }

    public static /* synthetic */ void p0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
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
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // Mf.AbstractC0997f
    public final boolean F() {
        return false;
    }

    @Override // Mf.AbstractC1016z
    public final boolean H() {
        return false;
    }

    @Override // Mf.AbstractC1001j
    public final boolean I() {
        return false;
    }

    @Override // Mf.AbstractC0997f
    public final AbstractC0996e M() {
        return this.f14117r0;
    }

    @Override // Mf.AbstractC0997f
    public final ug.n N() {
        return ug.m.f46797b;
    }

    @Override // Mf.AbstractC0997f
    public final AbstractC0997f P() {
        return null;
    }

    @Override // Mf.AbstractC0997f
    public final EnumC0998g e() {
        EnumC0998g enumC0998g = this.f14113n0;
        if (enumC0998g != null) {
            return enumC0998g;
        }
        p0(15);
        throw null;
    }

    @Override // Mf.AbstractC1000i
    public final Bg.Y f() {
        C0221n c0221n = this.f14114o0;
        if (c0221n != null) {
            return c0221n;
        }
        p0(10);
        throw null;
    }

    @Override // Nf.a
    public final Nf.i getAnnotations() {
        return Nf.h.f12822a;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1006o, Mf.AbstractC1016z
    public final AbstractC1007p getVisibility() {
        C1008q c1008q = Mf.r.f12105e;
        if (c1008q != null) {
            return c1008q;
        }
        p0(17);
        throw null;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1016z
    public final Mf.A h() {
        Mf.A a5 = this.f14112m0;
        if (a5 != null) {
            return a5;
        }
        p0(16);
        throw null;
    }

    @Override // Mf.AbstractC0997f
    public final Collection i() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        p0(19);
        throw null;
    }

    @Override // Mf.AbstractC0997f
    public final boolean isInline() {
        return false;
    }

    @Override // Mf.AbstractC0997f
    public final f0 j0() {
        return null;
    }

    @Override // Pf.D
    public final ug.n k0(Cg.i iVar) {
        ug.n nVar = this.f14115p0;
        if (nVar != null) {
            return nVar;
        }
        p0(13);
        throw null;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1001j
    public final List o() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        p0(18);
        throw null;
    }

    @Override // Mf.AbstractC1016z
    public final boolean o0() {
        return false;
    }

    @Override // Mf.AbstractC0997f
    public final boolean q() {
        return false;
    }

    @Override // Mf.AbstractC0997f
    public final boolean t0() {
        return false;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // Mf.AbstractC0997f
    public final Collection u() {
        Set set = this.f14116q0;
        if (set != null) {
            return set;
        }
        p0(11);
        throw null;
    }

    public final void x0(ug.n nVar, Set set, C1154l c1154l) {
        this.f14115p0 = nVar;
        this.f14116q0 = set;
        this.f14117r0 = c1154l;
    }

    @Override // Mf.AbstractC0997f
    public final boolean y() {
        return false;
    }
}
