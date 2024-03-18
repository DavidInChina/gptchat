package Pf;

import Bg.j0;
import Gf.C0631e;
import Mf.AbstractC0994c;
import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import Mf.AbstractC1002k;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Mf.AbstractC1013w;
import Mf.C1008q;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kg.AbstractC4296h;
import kg.C4294f;

/* renamed from: Pf.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1154l extends AbstractC1165x implements AbstractC0996e {

    /* renamed from: J0  reason: collision with root package name */
    public final boolean f14108J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1154l(AbstractC0997f abstractC0997f, AbstractC1002k abstractC1002k, Nf.i iVar, boolean z10, int i10, Mf.V v10) {
        super(i10, abstractC0997f, abstractC1002k, v10, iVar, AbstractC4296h.f37515e);
        if (abstractC0997f != null) {
            if (iVar != null) {
                if (i10 != 0) {
                    if (v10 != null) {
                        this.f14108J0 = z10;
                        return;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void C(int i10) {
        String str;
        int i11;
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i10 != 21 && i10 != 27) {
                switch (i10) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        i11 = 3;
                        break;
                }
                Object[] objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case 5:
                    case 8:
                    case 25:
                        objArr[0] = "annotations";
                        break;
                    case 2:
                    case 24:
                        objArr[0] = "kind";
                        break;
                    case 3:
                    case 6:
                    case 9:
                    case 26:
                        objArr[0] = "source";
                        break;
                    case 4:
                    case 7:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 10:
                    case 13:
                        objArr[0] = "unsubstitutedValueParameters";
                        break;
                    case 11:
                    case 14:
                        objArr[0] = "visibility";
                        break;
                    case 12:
                        objArr[0] = "typeParameterDescriptors";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 27:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                        break;
                    case 20:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 22:
                        objArr[0] = "overriddenDescriptors";
                        break;
                    case 23:
                        objArr[0] = "newOwner";
                        break;
                }
                if (i10 == 21) {
                    if (i10 != 27) {
                        switch (i10) {
                            case 15:
                            case 16:
                                objArr[1] = "calculateContextReceiverParameters";
                                break;
                            case 17:
                                objArr[1] = "getContainingDeclaration";
                                break;
                            case 18:
                                objArr[1] = "getConstructedClass";
                                break;
                            case 19:
                                objArr[1] = "getOriginal";
                                break;
                            default:
                                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                                break;
                        }
                    } else {
                        objArr[1] = "copy";
                    }
                } else {
                    objArr[1] = "getOverriddenDescriptors";
                }
                switch (i10) {
                    case 4:
                    case 5:
                    case 6:
                        objArr[2] = "create";
                        break;
                    case 7:
                    case 8:
                    case 9:
                        objArr[2] = "createSynthesized";
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        objArr[2] = "initialize";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 27:
                        break;
                    case 20:
                        objArr[2] = "substitute";
                        break;
                    case 22:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 21 && i10 != 27) {
                    switch (i10) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
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
            if (i10 == 21) {
            }
            switch (i10) {
            }
            String format2 = String.format(str, objArr2);
            if (i10 != 21) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 21) {
            switch (i10) {
            }
            Object[] objArr22 = new Object[i11];
            switch (i10) {
            }
            if (i10 == 21) {
            }
            switch (i10) {
            }
            String format22 = String.format(str, objArr22);
            if (i10 != 21) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        Object[] objArr222 = new Object[i11];
        switch (i10) {
        }
        if (i10 == 21) {
        }
        switch (i10) {
        }
        String format222 = String.format(str, objArr222);
        if (i10 != 21) {
        }
        throw new IllegalStateException(format222);
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC0994c
    public final AbstractC0994c D(AbstractC1003l abstractC1003l, Mf.A a5, C1008q c1008q) {
        return (AbstractC0996e) w0(abstractC1003l, a5, c1008q);
    }

    /* renamed from: H0 */
    public C1154l y0(int i10, AbstractC1003l abstractC1003l, AbstractC1013w abstractC1013w, Mf.V v10, Nf.i iVar, C4294f c4294f) {
        if (abstractC1003l != null) {
            if (i10 != 0) {
                if (iVar != null) {
                    if (i10 != 1 && i10 != 4) {
                        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + abstractC1003l + "\nkind: " + E9.f.S(i10));
                    }
                    return new C1154l((AbstractC0997f) abstractC1003l, this, iVar, this.f14108J0, 1, v10);
                }
                C(25);
                throw null;
            }
            C(24);
            throw null;
        }
        C(23);
        throw null;
    }

    /* renamed from: I0 */
    public final AbstractC0997f mo20k() {
        AbstractC0997f abstractC0997f = (AbstractC0997f) super.mo20k();
        if (abstractC0997f != null) {
            return abstractC0997f;
        }
        C(17);
        throw null;
    }

    /* renamed from: J0 */
    public final AbstractC0996e p0() {
        AbstractC0996e abstractC0996e = (AbstractC0996e) super.mo24a();
        if (abstractC0996e != null) {
            return abstractC0996e;
        }
        C(19);
        throw null;
    }

    public final void K0(List list, AbstractC1007p abstractC1007p) {
        if (list != null) {
            if (abstractC1007p != null) {
                L0(list, abstractC1007p, mo20k().o());
                return;
            } else {
                C(14);
                throw null;
            }
        }
        C(13);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L0(List list, AbstractC1007p abstractC1007p, List list2) {
        AbstractC1146d abstractC1146d;
        AbstractC0997f mo20k;
        List emptyList;
        if (list != null) {
            if (abstractC1007p != null) {
                if (list2 != null) {
                    AbstractC0997f mo20k2 = mo20k();
                    if (mo20k2.I()) {
                        AbstractC1003l mo20k3 = mo20k2.mo20k();
                        if (mo20k3 instanceof AbstractC0997f) {
                            abstractC1146d = ((AbstractC0997f) mo20k3).v0();
                            mo20k = mo20k();
                            if (mo20k.r0().isEmpty()) {
                                emptyList = mo20k.r0();
                                if (emptyList == null) {
                                    C(15);
                                    throw null;
                                }
                            } else {
                                emptyList = Collections.emptyList();
                                if (emptyList == null) {
                                    C(16);
                                    throw null;
                                }
                            }
                            B0(null, abstractC1146d, emptyList, list2, list, null, Mf.A.f12051Z, abstractC1007p);
                            return;
                        }
                    }
                    abstractC1146d = null;
                    mo20k = mo20k();
                    if (mo20k.r0().isEmpty()) {
                    }
                    B0(null, abstractC1146d, emptyList, list2, list, null, Mf.A.f12051Z, abstractC1007p);
                    return;
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

    /* renamed from: M0 */
    public final AbstractC0996e c(j0 j0Var) {
        if (j0Var != null) {
            return (AbstractC0996e) super.c(j0Var);
        }
        C(20);
        throw null;
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC0994c
    public final void h0(Collection collection) {
        if (collection != null) {
            return;
        }
        C(22);
        throw null;
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC0994c, Mf.AbstractC0993b
    public final Collection m() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        C(21);
        throw null;
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC1003l
    public final Object u0(C0631e c0631e, Object obj) {
        return c0631e.a(this, obj);
    }

    @Override // Mf.AbstractC1002k
    public final boolean v() {
        return this.f14108J0;
    }

    @Override // Mf.AbstractC1002k
    public final AbstractC0997f x() {
        AbstractC0997f mo20k = mo20k();
        if (mo20k != null) {
            return mo20k;
        }
        C(18);
        throw null;
    }
}
