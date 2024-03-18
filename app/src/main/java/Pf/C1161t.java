package Pf;

import Bg.AbstractC0218k;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kg.C4294f;
import ng.C4846m;
import ug.C5925g;

/* renamed from: Pf.t */
/* loaded from: classes2.dex */
public final class C1161t extends ug.o {

    /* renamed from: b */
    public final Ag.n f14128b;

    /* renamed from: c */
    public final Ag.n f14129c;

    /* renamed from: d */
    public final Ag.l f14130d;

    /* renamed from: e */
    public final /* synthetic */ C1162u f14131e;

    public C1161t(C1162u c1162u, Ag.u uVar) {
        if (uVar != null) {
            this.f14131e = c1162u;
            Ag.q qVar = (Ag.q) uVar;
            this.f14128b = qVar.b(new r(this, 0));
            this.f14129c = qVar.b(new r(this, 1));
            this.f14130d = new Ag.l(qVar, new Jf.j(this, 2, c1162u));
            return;
        }
        h(0);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void h(int i10) {
        String str;
        int i11;
        if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
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
            if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
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
                    case 4:
                    case 5:
                    case 8:
                    case 10:
                        objArr[0] = "name";
                        break;
                    case 2:
                    case 6:
                        objArr[0] = "location";
                        break;
                    case 3:
                    case 7:
                    case 9:
                    case 12:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                    case 11:
                        objArr[0] = "fromSupertypes";
                        break;
                    case 13:
                        objArr[0] = "kindFilter";
                        break;
                    case 14:
                        objArr[0] = "nameFilter";
                        break;
                    case 20:
                        objArr[0] = "p";
                        break;
                    default:
                        objArr[0] = "storageManager";
                        break;
                }
                if (i10 == 3) {
                    if (i10 != 7) {
                        if (i10 != 9) {
                            if (i10 != 12) {
                                switch (i10) {
                                    case 15:
                                        objArr[1] = "getContributedDescriptors";
                                        break;
                                    case 16:
                                        objArr[1] = "computeAllDeclarations";
                                        break;
                                    case 17:
                                        objArr[1] = "getFunctionNames";
                                        break;
                                    case 18:
                                        objArr[1] = "getClassifierNames";
                                        break;
                                    case 19:
                                        objArr[1] = "getVariableNames";
                                        break;
                                    default:
                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                                        break;
                                }
                            } else {
                                objArr[1] = "resolveFakeOverrides";
                            }
                        } else {
                            objArr[1] = "getSupertypeScope";
                        }
                    } else {
                        objArr[1] = "getContributedFunctions";
                    }
                } else {
                    objArr[1] = "getContributedVariables";
                }
                switch (i10) {
                    case 1:
                    case 2:
                        objArr[2] = "getContributedVariables";
                        break;
                    case 3:
                    case 7:
                    case 9:
                    case 12:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    case 4:
                        objArr[2] = "computeProperties";
                        break;
                    case 5:
                    case 6:
                        objArr[2] = "getContributedFunctions";
                        break;
                    case 8:
                        objArr[2] = "computeFunctions";
                        break;
                    case 10:
                    case 11:
                        objArr[2] = "resolveFakeOverrides";
                        break;
                    case 13:
                    case 14:
                        objArr[2] = "getContributedDescriptors";
                        break;
                    case 20:
                        objArr[2] = "printScopeStructure";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
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
            if (i10 == 3) {
            }
            switch (i10) {
            }
            String format2 = String.format(str, objArr2);
            if (i10 != 3) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 3) {
            switch (i10) {
            }
            Object[] objArr22 = new Object[i11];
            switch (i10) {
            }
            if (i10 == 3) {
            }
            switch (i10) {
            }
            String format22 = String.format(str, objArr22);
            if (i10 != 3) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        Object[] objArr222 = new Object[i11];
        switch (i10) {
        }
        if (i10 == 3) {
        }
        switch (i10) {
        }
        String format222 = String.format(str, objArr222);
        if (i10 != 3) {
        }
        throw new IllegalStateException(format222);
    }

    @Override // ug.o, ug.n
    public final Collection a(C4294f c4294f, Tf.d dVar) {
        if (c4294f != null) {
            return (Collection) this.f14128b.invoke(c4294f);
        }
        h(5);
        throw null;
    }

    @Override // ug.o, ug.n
    public final Set b() {
        Set set = (Set) this.f14131e.f14134o0.mo122invoke();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // ug.o, ug.n
    public final Set c() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        h(18);
        throw null;
    }

    @Override // ug.o, ug.p
    public final Collection d(C5925g c5925g, wf.k kVar) {
        if (c5925g != null) {
            if (kVar != null) {
                Collection collection = (Collection) this.f14130d.mo122invoke();
                if (collection != null) {
                    return collection;
                }
                h(15);
                throw null;
            }
            h(14);
            throw null;
        }
        h(13);
        throw null;
    }

    @Override // ug.o, ug.n
    public final Collection f(C4294f c4294f, Tf.d dVar) {
        if (c4294f != null) {
            return (Collection) this.f14129c.invoke(c4294f);
        }
        h(1);
        throw null;
    }

    @Override // ug.o, ug.n
    public final Set g() {
        Set set = (Set) this.f14131e.f14134o0.mo122invoke();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    public final ug.n i() {
        ug.n R10 = ((Bg.A) ((AbstractC0218k) this.f14131e.f()).l().iterator().next()).R();
        if (R10 != null) {
            return R10;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(Collection collection, C4294f c4294f) {
        if (c4294f != null) {
            if (collection != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C4846m.f40356d.h(c4294f, collection, Collections.emptySet(), this.f14131e, new C1160s(this, linkedHashSet));
                return linkedHashSet;
            }
            h(11);
            throw null;
        }
        h(10);
        throw null;
    }
}
