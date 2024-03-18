package Wf;

import Bg.A;
import Bg.j0;
import Hg.AbstractC0732e;
import Hg.AbstractC0734g;
import Hg.C0733f;
import Hg.C0738k;
import Hg.z;
import Mf.AbstractC0992a;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Mf.AbstractC1013w;
import Mf.V;
import Nf.i;
import Pf.AbstractC1146d;
import Pf.AbstractC1165x;
import Pf.C1164w;
import Pf.S;
import Pf.T;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kg.C4294f;

/* loaded from: classes2.dex */
public final class f extends T implements a {

    /* renamed from: L0  reason: collision with root package name */
    public static final e f21082L0 = new Object();

    /* renamed from: M0  reason: collision with root package name */
    public static final e f21083M0 = new Object();

    /* renamed from: J0  reason: collision with root package name */
    public int f21084J0;

    /* renamed from: K0  reason: collision with root package name */
    public final boolean f21085K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AbstractC1003l abstractC1003l, T t10, i iVar, C4294f c4294f, int i10, V v10, boolean z10) {
        super(abstractC1003l, t10, iVar, c4294f, i10, v10);
        if (abstractC1003l != null) {
            if (iVar != null) {
                if (c4294f != null) {
                    if (i10 != 0) {
                        this.f21084J0 = 0;
                        this.f21085K0 = z10;
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

    public static /* synthetic */ void C(int i10) {
        String str;
        int i11;
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 != 13) {
            if (i10 != 18) {
                if (i10 != 21) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                } else {
                    objArr[1] = "enhance";
                }
            } else {
                objArr[1] = "createSubstitutedCopy";
            }
        } else {
            objArr[1] = "initialize";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 13 || i10 == 18 || i10 == 21) {
            throw new IllegalStateException(format);
        }
    }

    public static f L0(AbstractC1003l abstractC1003l, Xf.d dVar, C4294f c4294f, Rf.h hVar, boolean z10) {
        if (abstractC1003l != null) {
            if (c4294f != null) {
                return new f(abstractC1003l, null, dVar, c4294f, 1, hVar, z10);
            }
            C(7);
            throw null;
        }
        C(5);
        throw null;
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC0993b
    public final boolean B() {
        return R.a.k(this.f21084J0);
    }

    @Override // Wf.a
    public final a G(A a5, ArrayList arrayList, A a10, C3959i c3959i) {
        S s10;
        ArrayList p02 = AbstractC3557B.p0(arrayList, S(), this);
        if (a5 == null) {
            s10 = null;
        } else {
            s10 = R4.b.h0(this, a5, Nf.h.f12822a);
        }
        C1164w C02 = C0(j0.f2127b);
        C02.f14142g = p02;
        C02.n(a10);
        C02.f14144i = s10;
        C02.f14151p = true;
        C02.f14150o = true;
        f fVar = (f) C02.f14159x.z0(C02);
        if (c3959i != null) {
            fVar.D0((AbstractC0992a) c3959i.f36155Y, c3959i.f36156Z);
        }
        if (fVar != null) {
            return fVar;
        }
        C(21);
        throw null;
    }

    @Override // Pf.T
    public final T K0(S s10, AbstractC1146d abstractC1146d, List list, List list2, List list3, A a5, Mf.A a10, AbstractC1007p abstractC1007p, Map map) {
        AbstractC0734g abstractC0734g;
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (abstractC1007p != null) {
                        super.K0(s10, abstractC1146d, list, list2, list3, a5, a10, abstractC1007p, map);
                        for (C0738k c0738k : z.f7799g) {
                            c0738k.getClass();
                            C4294f c4294f = c0738k.f7778a;
                            if (c4294f == null || AbstractC3557B.K(getName(), c4294f)) {
                                Lg.i iVar = c0738k.f7779b;
                                if (iVar != null) {
                                    String b10 = getName().b();
                                    AbstractC3557B.b0("asString(...)", b10);
                                    if (!iVar.b(b10)) {
                                        continue;
                                    }
                                }
                                Collection collection = c0738k.f7780c;
                                if (collection == null || collection.contains(getName())) {
                                    AbstractC0732e[] abstractC0732eArr = c0738k.f7782e;
                                    int length = abstractC0732eArr.length;
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < length) {
                                            if (abstractC0732eArr[i10].b(this) != null) {
                                                abstractC0734g = new AbstractC0734g(false);
                                                break;
                                            }
                                            i10++;
                                        } else if (((String) c0738k.f7781d.invoke(this)) != null) {
                                            abstractC0734g = new AbstractC0734g(false);
                                        } else {
                                            abstractC0734g = C0733f.f7773c;
                                        }
                                    }
                                    this.f14177r0 = abstractC0734g.f7774a;
                                    return this;
                                }
                            }
                        }
                        abstractC0734g = C0733f.f7772b;
                        this.f14177r0 = abstractC0734g.f7774a;
                        return this;
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
        C(9);
        throw null;
    }

    public final void M0(boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                i10 = 4;
            } else {
                i10 = 2;
            }
        } else if (z11) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f21084J0 = i10;
    }

    @Override // Pf.T, Pf.AbstractC1165x
    public final AbstractC1165x y0(int i10, AbstractC1003l abstractC1003l, AbstractC1013w abstractC1013w, V v10, i iVar, C4294f c4294f) {
        if (abstractC1003l != null) {
            if (i10 != 0) {
                if (iVar != null) {
                    T t10 = (T) abstractC1013w;
                    if (c4294f == null) {
                        c4294f = getName();
                    }
                    f fVar = new f(abstractC1003l, t10, iVar, c4294f, i10, v10, this.f21085K0);
                    int i11 = this.f21084J0;
                    fVar.M0(R.a.j(i11), R.a.k(i11));
                    return fVar;
                }
                C(16);
                throw null;
            }
            C(15);
            throw null;
        }
        C(14);
        throw null;
    }
}
