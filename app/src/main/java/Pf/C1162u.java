package Pf;

import Bg.C0221n;
import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import Mf.AbstractC1007p;
import Mf.C1008q;
import Mf.EnumC0998g;
import Mf.f0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kg.C4294f;

/* renamed from: Pf.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1162u extends AbstractC1155m {

    /* renamed from: m0  reason: collision with root package name */
    public final C0221n f14132m0;

    /* renamed from: n0  reason: collision with root package name */
    public final C1161t f14133n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Ag.s f14134o0;

    /* renamed from: p0  reason: collision with root package name */
    public final Nf.i f14135p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1162u(Ag.u uVar, AbstractC0997f abstractC0997f, Bg.D d10, C4294f c4294f, Ag.s sVar, Nf.i iVar, Mf.V v10) {
        super(uVar, abstractC0997f, c4294f, v10);
        if (uVar != null) {
            if (abstractC0997f != null) {
                if (d10 != null) {
                    if (c4294f != null) {
                        if (sVar != null) {
                            this.f14135p0 = iVar;
                            this.f14132m0 = new C0221n(this, Collections.emptyList(), Collections.singleton(d10), uVar);
                            this.f14133n0 = new C1161t(this, uVar);
                            this.f14134o0 = sVar;
                            return;
                        }
                        p0(10);
                        throw null;
                    }
                    p0(9);
                    throw null;
                }
                p0(8);
                throw null;
            }
            p0(7);
            throw null;
        }
        p0(6);
        throw null;
    }

    public static /* synthetic */ void p0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static C1162u x0(Ag.u uVar, AbstractC0997f abstractC0997f, C4294f c4294f, Ag.s sVar, Nf.i iVar, Mf.V v10) {
        if (uVar != null) {
            if (abstractC0997f != null) {
                if (c4294f != null) {
                    if (sVar != null) {
                        return new C1162u(uVar, abstractC0997f, abstractC0997f.n(), c4294f, sVar, iVar, v10);
                    }
                    p0(3);
                    throw null;
                }
                p0(2);
                throw null;
            }
            p0(1);
            throw null;
        }
        p0(0);
        throw null;
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
        return EnumC0998g.f12087i0;
    }

    @Override // Mf.AbstractC1000i
    public final Bg.Y f() {
        C0221n c0221n = this.f14132m0;
        if (c0221n != null) {
            return c0221n;
        }
        p0(17);
        throw null;
    }

    @Override // Nf.a
    public final Nf.i getAnnotations() {
        Nf.i iVar = this.f14135p0;
        if (iVar != null) {
            return iVar;
        }
        p0(21);
        throw null;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1006o, Mf.AbstractC1016z
    public final AbstractC1007p getVisibility() {
        C1008q c1008q = Mf.r.f12105e;
        if (c1008q != null) {
            return c1008q;
        }
        p0(20);
        throw null;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1016z
    public final Mf.A h() {
        return Mf.A.f12051Z;
    }

    @Override // Mf.AbstractC0997f
    public final Collection i() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        p0(23);
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
        C1161t c1161t = this.f14133n0;
        if (c1161t != null) {
            return c1161t;
        }
        p0(14);
        throw null;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1001j
    public final List o() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        p0(22);
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
        return "enum entry " + getName();
    }

    @Override // Mf.AbstractC0997f
    public final Collection u() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        p0(16);
        throw null;
    }

    @Override // Mf.AbstractC0997f
    public final boolean y() {
        return false;
    }
}
