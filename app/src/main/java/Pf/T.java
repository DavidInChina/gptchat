package Pf;

import Bg.j0;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Mf.AbstractC1012v;
import Mf.AbstractC1013w;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg.C4294f;

/* loaded from: classes2.dex */
public class T extends AbstractC1165x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(AbstractC1003l abstractC1003l, T t10, Nf.i iVar, C4294f c4294f, int i10, Mf.V v10) {
        super(i10, abstractC1003l, t10, v10, iVar, c4294f);
        if (abstractC1003l != null) {
            if (iVar != null) {
                if (c4294f != null) {
                    if (i10 != 0) {
                        if (v10 != null) {
                            return;
                        } else {
                            C(4);
                            throw null;
                        }
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
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 != 13 && i10 != 18 && i10 != 23) {
            if (i10 != 24) {
                if (i10 != 29) {
                    if (i10 != 30) {
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                    } else {
                        objArr[1] = "newCopyBuilder";
                    }
                } else {
                    objArr[1] = "copy";
                }
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "initialize";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) {
            throw new IllegalStateException(format);
        }
    }

    public static T H0(AbstractC1003l abstractC1003l, C4294f c4294f, int i10, Mf.V v10) {
        Nf.g gVar = Nf.h.f12822a;
        if (abstractC1003l != null) {
            if (c4294f != null) {
                if (i10 != 0) {
                    if (v10 != null) {
                        return new T(abstractC1003l, null, gVar, c4294f, i10, v10);
                    }
                    C(9);
                    throw null;
                }
                C(8);
                throw null;
            }
            C(7);
            throw null;
        }
        C(5);
        throw null;
    }

    /* renamed from: I0 */
    public final T p0() {
        T t10 = (T) super.mo24a();
        if (t10 != null) {
            return t10;
        }
        C(24);
        throw null;
    }

    /* renamed from: J0 */
    public final T B0(S s10, AbstractC1146d abstractC1146d, List list, List list2, List list3, Bg.A a5, Mf.A a10, AbstractC1007p abstractC1007p) {
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (abstractC1007p != null) {
                        return K0(s10, abstractC1146d, list, list2, list3, a5, a10, abstractC1007p, null);
                    }
                    C(17);
                    throw null;
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

    public T K0(S s10, AbstractC1146d abstractC1146d, List list, List list2, List list3, Bg.A a5, Mf.A a10, AbstractC1007p abstractC1007p, Map map) {
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (abstractC1007p != null) {
                        super.B0(s10, abstractC1146d, list, list2, list3, a5, a10, abstractC1007p);
                        if (map != null && !map.isEmpty()) {
                            this.f14168I0 = new LinkedHashMap(map);
                        }
                        return this;
                    }
                    C(22);
                    throw null;
                }
                C(21);
                throw null;
            }
            C(20);
            throw null;
        }
        C(19);
        throw null;
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC1013w
    public AbstractC1012v m0() {
        return C0(j0.f2127b);
    }

    @Override // Pf.AbstractC1165x
    public AbstractC1165x y0(int i10, AbstractC1003l abstractC1003l, AbstractC1013w abstractC1013w, Mf.V v10, Nf.i iVar, C4294f c4294f) {
        if (abstractC1003l != null) {
            if (i10 != 0) {
                if (iVar != null) {
                    T t10 = (T) abstractC1013w;
                    if (c4294f == null) {
                        c4294f = getName();
                    }
                    return new T(abstractC1003l, t10, iVar, c4294f, i10, v10);
                }
                C(27);
                throw null;
            }
            C(26);
            throw null;
        }
        C(25);
        throw null;
    }
}
