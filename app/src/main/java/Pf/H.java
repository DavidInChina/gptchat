package Pf;

import Bg.C0221n;
import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import Mf.AbstractC1007p;
import Mf.EnumC0998g;
import Mf.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kg.C4294f;

/* loaded from: classes.dex */
public final class H extends AbstractC1155m {

    /* renamed from: m0  reason: collision with root package name */
    public final EnumC0998g f14002m0;

    /* renamed from: n0  reason: collision with root package name */
    public final boolean f14003n0;

    /* renamed from: o0  reason: collision with root package name */
    public Mf.A f14004o0;

    /* renamed from: p0  reason: collision with root package name */
    public AbstractC1007p f14005p0;

    /* renamed from: q0  reason: collision with root package name */
    public C0221n f14006q0;

    /* renamed from: r0  reason: collision with root package name */
    public ArrayList f14007r0;

    /* renamed from: s0  reason: collision with root package name */
    public final ArrayList f14008s0;

    /* renamed from: t0  reason: collision with root package name */
    public final Ag.u f14009t0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public H(Lf.l lVar, C4294f c4294f, Ag.c cVar) {
        super(cVar, lVar, c4294f, r1);
        EnumC0998g enumC0998g = EnumC0998g.f12085Z;
        Mf.U u10 = Mf.V.f12075a;
        if (c4294f != null) {
            if (cVar != null) {
                this.f14008s0 = new ArrayList();
                this.f14009t0 = cVar;
                this.f14002m0 = enumC0998g;
                this.f14003n0 = false;
                return;
            }
            p0(4);
            throw null;
        }
        p0(2);
        throw null;
    }

    public static /* synthetic */ void p0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
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
        return this.f14003n0;
    }

    @Override // Mf.AbstractC0997f
    public final AbstractC0996e M() {
        return null;
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
        EnumC0998g enumC0998g = this.f14002m0;
        if (enumC0998g != null) {
            return enumC0998g;
        }
        p0(8);
        throw null;
    }

    @Override // Mf.AbstractC1000i
    public final Bg.Y f() {
        C0221n c0221n = this.f14006q0;
        if (c0221n != null) {
            return c0221n;
        }
        p0(11);
        throw null;
    }

    @Override // Nf.a
    public final Nf.i getAnnotations() {
        return Nf.h.f12822a;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1006o, Mf.AbstractC1016z
    public final AbstractC1007p getVisibility() {
        AbstractC1007p abstractC1007p = this.f14005p0;
        if (abstractC1007p != null) {
            return abstractC1007p;
        }
        p0(10);
        throw null;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1016z
    public final Mf.A h() {
        Mf.A a5 = this.f14004o0;
        if (a5 != null) {
            return a5;
        }
        p0(7);
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
        return ug.m.f46797b;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1001j
    public final List o() {
        ArrayList arrayList = this.f14007r0;
        if (arrayList != null) {
            return arrayList;
        }
        p0(15);
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

    public final String toString() {
        return AbstractC1158p.k0(this);
    }

    @Override // Mf.AbstractC0997f
    public final Collection u() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        p0(13);
        throw null;
    }

    @Override // Mf.AbstractC0997f
    public final boolean y() {
        return false;
    }
}
