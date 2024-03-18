package Bg;

import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kg.C4294f;
import rg.AbstractC5493d;

/* renamed from: Bg.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0209b extends AbstractC0218k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0209b(Ag.u uVar) {
        super(uVar);
        if (uVar != null) {
        } else {
            p(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void p(int i10) {
        String str;
        int i11;
        String format;
        if (i10 != 1 && i10 != 3 && i10 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 1 && i10 != 3 && i10 != 4) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3 && i10 != 4) {
                    objArr[0] = "storageManager";
                }
            } else {
                objArr[0] = "classifier";
            }
            if (i10 == 1) {
                if (i10 != 3 && i10 != 4) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
                } else {
                    objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
                }
            } else {
                objArr[1] = "getBuiltIns";
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3 && i10 != 4) {
                        objArr[2] = "<init>";
                    }
                } else {
                    objArr[2] = "isSameClassifier";
                }
            }
            format = String.format(str, objArr);
            if (i10 != 1 || i10 == 3 || i10 == 4) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        if (i10 == 1) {
        }
        if (i10 != 1) {
        }
        format = String.format(str, objArr);
        if (i10 != 1) {
        }
        throw new IllegalStateException(format);
    }

    @Override // Bg.AbstractC0218k
    public final A c() {
        AbstractC0997f k10 = k();
        if (k10 != null) {
            C4294f c4294f = Jf.l.f9117e;
            if (Jf.l.b(k10, Jf.p.f9165a) || Jf.l.b(k10, Jf.p.f9167b)) {
                return null;
            }
            return j().e();
        }
        Jf.l.a(108);
        throw null;
    }

    @Override // Bg.AbstractC0218k
    public final Collection e(boolean z10) {
        AbstractC1003l mo20k = k().mo20k();
        if (!(mo20k instanceof AbstractC0997f)) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            p(3);
            throw null;
        }
        Ig.f fVar = new Ig.f();
        AbstractC0997f abstractC0997f = (AbstractC0997f) mo20k;
        fVar.add(abstractC0997f.n());
        AbstractC0997f P = abstractC0997f.P();
        if (z10 && P != null) {
            fVar.add(P.n());
        }
        return fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
        return true;
     */
    @Override // Bg.AbstractC0218k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(AbstractC1000i abstractC1000i) {
        if (abstractC1000i instanceof AbstractC0997f) {
            AbstractC0997f k10 = k();
            AbstractC3557B.c0("first", k10);
            if (AbstractC3557B.K(k10.getName(), abstractC1000i.getName())) {
                AbstractC1003l mo20k = k10.mo20k();
                AbstractC1003l mo20k2 = abstractC1000i.mo20k();
                while (true) {
                    if (mo20k != null && mo20k2 != null) {
                        if (mo20k instanceof Mf.B) {
                            if (mo20k2 instanceof Mf.B) {
                                break;
                            }
                        } else if (mo20k2 instanceof Mf.B) {
                            break;
                        } else if (mo20k instanceof Mf.G) {
                            if (!(mo20k2 instanceof Mf.G) || !AbstractC3557B.K(((Pf.I) ((Mf.G) mo20k)).f14010j0, ((Pf.I) ((Mf.G) mo20k2)).f14010j0)) {
                                break;
                            }
                        } else if ((mo20k2 instanceof Mf.G) || !AbstractC3557B.K(mo20k.getName(), mo20k2.getName())) {
                            break;
                        } else {
                            mo20k = mo20k.mo20k();
                            mo20k2 = mo20k2.mo20k();
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Override // Bg.Y
    public final Jf.l j() {
        Jf.l e10 = AbstractC5493d.e(k());
        if (e10 != null) {
            return e10;
        }
        p(1);
        throw null;
    }

    /* renamed from: q */
    public abstract AbstractC0997f k();
}
