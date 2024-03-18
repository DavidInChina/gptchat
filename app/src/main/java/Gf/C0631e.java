package Gf;

import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import Mf.AbstractC1001j;
import Mf.AbstractC1002k;
import Mf.AbstractC1003l;
import Mf.AbstractC1005n;
import Mf.AbstractC1007p;
import Mf.AbstractC1013w;
import Mf.EnumC0998g;
import Pf.AbstractC1165x;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kg.AbstractC4296h;
import kg.C4294f;
import ng.AbstractC4838e;

/* renamed from: Gf.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0631e implements AbstractC1005n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6407a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6408b;

    public C0631e(H h10) {
        AbstractC3557B.c0("container", h10);
        this.f6408b = h10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    @Override // Mf.AbstractC1005n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(AbstractC1002k abstractC1002k, Object obj) {
        boolean z10;
        boolean z11;
        AbstractC0996e M10;
        ArrayList arrayList;
        switch (this.f6407a) {
            case 0:
                return c(abstractC1002k, obj);
            default:
                StringBuilder sb2 = (StringBuilder) obj;
                AbstractC3557B.c0("constructorDescriptor", abstractC1002k);
                mg.m mVar = (mg.m) this.f6408b;
                mg.m mVar2 = mg.m.f39296c;
                mVar.getClass();
                mVar.y(sb2, abstractC1002k, null);
                mg.s sVar = mVar.f39299a;
                sVar.getClass();
                Df.v[] vVarArr = mg.s.f39322X;
                if (((Boolean) sVar.f39356o.a(sVar, vVarArr[13])).booleanValue() || abstractC1002k.x().h() != Mf.A.f12052h0) {
                    AbstractC1007p visibility = ((AbstractC1165x) abstractC1002k).getVisibility();
                    AbstractC3557B.b0("getVisibility(...)", visibility);
                    if (mVar.h0(visibility, sb2)) {
                        z10 = true;
                        mVar.J(abstractC1002k, sb2);
                        if (((Boolean) sVar.P.a(sVar, vVarArr[40])).booleanValue() && abstractC1002k.v() && !z10) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            sb2.append(mVar.I("constructor"));
                        }
                        AbstractC1001j mo20k = abstractC1002k.mo20k();
                        AbstractC3557B.b0("getContainingDeclaration(...)", mo20k);
                        if (((Boolean) sVar.f39323A.a(sVar, vVarArr[25])).booleanValue()) {
                            if (z11) {
                                sb2.append(Separators.SP);
                            }
                            mVar.P(mo20k, sb2, true);
                            mVar.d0(((AbstractC1165x) abstractC1002k).getTypeParameters(), sb2, false);
                        }
                        AbstractC1165x abstractC1165x = (AbstractC1165x) abstractC1002k;
                        List S = abstractC1165x.S();
                        AbstractC3557B.b0("getValueParameters(...)", S);
                        mVar.g0(S, abstractC1002k.B(), sb2);
                        if (((Boolean) sVar.f39358q.a(sVar, vVarArr[15])).booleanValue() && !abstractC1002k.v() && (mo20k instanceof AbstractC0997f) && (M10 = ((AbstractC0997f) mo20k).M()) != null) {
                            List S10 = ((AbstractC1165x) M10).S();
                            AbstractC3557B.b0("getValueParameters(...)", S10);
                            arrayList = new ArrayList();
                            for (Object obj2 : S10) {
                                Pf.b0 b0Var = (Pf.b0) ((Mf.h0) obj2);
                                if (!b0Var.w0() && b0Var.f14085o0 == null) {
                                    arrayList.add(obj2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                sb2.append(" : ");
                                sb2.append(mVar.I("this"));
                                sb2.append(kf.t.m2(arrayList, ", ", Separators.LPAREN, Separators.RPAREN, mg.k.f39294Y, 24));
                            }
                        }
                        if (((Boolean) sVar.f39323A.a(sVar, mg.s.f39322X[25])).booleanValue()) {
                            mVar.i0(sb2, abstractC1165x.getTypeParameters());
                        }
                        return jf.y.f36177a;
                    }
                }
                z10 = false;
                mVar.J(abstractC1002k, sb2);
                if (((Boolean) sVar.P.a(sVar, vVarArr[40])).booleanValue()) {
                }
                z11 = true;
                if (z11) {
                }
                AbstractC1001j mo20k2 = abstractC1002k.mo20k();
                AbstractC3557B.b0("getContainingDeclaration(...)", mo20k2);
                if (((Boolean) sVar.f39323A.a(sVar, vVarArr[25])).booleanValue()) {
                }
                AbstractC1165x abstractC1165x2 = (AbstractC1165x) abstractC1002k;
                List S11 = abstractC1165x2.S();
                AbstractC3557B.b0("getValueParameters(...)", S11);
                mVar.g0(S11, abstractC1002k.B(), sb2);
                if (((Boolean) sVar.f39358q.a(sVar, vVarArr[15])).booleanValue()) {
                    List S102 = ((AbstractC1165x) M10).S();
                    AbstractC3557B.b0("getValueParameters(...)", S102);
                    arrayList = new ArrayList();
                    while (r1.hasNext()) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                }
                if (((Boolean) sVar.f39323A.a(sVar, mg.s.f39322X[25])).booleanValue()) {
                }
                return jf.y.f36177a;
        }
    }

    public final jf.y b(AbstractC0997f abstractC0997f, Object obj) {
        boolean z10;
        AbstractC0996e M10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String str;
        switch (this.f6407a) {
            case 0:
                return null;
            default:
                StringBuilder sb2 = (StringBuilder) obj;
                AbstractC3557B.c0("descriptor", abstractC0997f);
                mg.m mVar = (mg.m) this.f6408b;
                mg.m mVar2 = mg.m.f39296c;
                mVar.getClass();
                if (abstractC0997f.e() == EnumC0998g.f12087i0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!mVar.q()) {
                    mVar.y(sb2, abstractC0997f, null);
                    List r02 = abstractC0997f.r0();
                    AbstractC3557B.b0("getContextReceivers(...)", r02);
                    mVar.B(sb2, r02);
                    if (!z10) {
                        AbstractC1007p visibility = abstractC0997f.getVisibility();
                        AbstractC3557B.b0("getVisibility(...)", visibility);
                        mVar.h0(visibility, sb2);
                    }
                    if ((abstractC0997f.e() != EnumC0998g.f12085Z || abstractC0997f.h() != Mf.A.f12054j0) && (!abstractC0997f.e().a() || abstractC0997f.h() != Mf.A.f12051Z)) {
                        Mf.A h10 = abstractC0997f.h();
                        AbstractC3557B.b0("getModality(...)", h10);
                        mVar.L(h10, sb2, mg.m.u(abstractC0997f));
                    }
                    mVar.K(abstractC0997f, sb2);
                    if (mVar.p().contains(mg.n.f39307m0) && abstractC0997f.I()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    mVar.N(sb2, z11, "inner");
                    if (mVar.p().contains(mg.n.f39309o0) && abstractC0997f.t0()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    mVar.N(sb2, z12, "data");
                    if (mVar.p().contains(mg.n.f39310p0) && abstractC0997f.isInline()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    mVar.N(sb2, z13, "inline");
                    if (mVar.p().contains(mg.n.f39316v0) && abstractC0997f.F()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    mVar.N(sb2, z14, "value");
                    if (mVar.p().contains(mg.n.f39315u0) && abstractC0997f.y()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    mVar.N(sb2, z15, "fun");
                    if (abstractC0997f instanceof Mf.a0) {
                        str = "typealias";
                    } else if (abstractC0997f.q()) {
                        str = "companion object";
                    } else {
                        int ordinal = abstractC0997f.e().ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        if (ordinal != 4) {
                                            if (ordinal == 5) {
                                                str = "object";
                                            } else {
                                                throw new RuntimeException();
                                            }
                                        } else {
                                            str = "annotation class";
                                        }
                                    } else {
                                        str = "enum entry";
                                    }
                                } else {
                                    str = "enum class";
                                }
                            } else {
                                str = "interface";
                            }
                        } else {
                            str = "class";
                        }
                    }
                    sb2.append(mVar.I(str));
                }
                boolean l10 = AbstractC4838e.l(abstractC0997f);
                mg.s sVar = mVar.f39299a;
                if (!l10) {
                    if (!mVar.q()) {
                        mg.m.X(sb2);
                    }
                    mVar.P(abstractC0997f, sb2, true);
                } else {
                    if (((Boolean) sVar.f39329G.a(sVar, mg.s.f39322X[31])).booleanValue()) {
                        if (mVar.q()) {
                            sb2.append("companion object");
                        }
                        mg.m.X(sb2);
                        AbstractC1003l mo20k = abstractC0997f.mo20k();
                        if (mo20k != null) {
                            sb2.append("of ");
                            C4294f name = mo20k.getName();
                            AbstractC3557B.b0("getName(...)", name);
                            sb2.append(mVar.O(name, false));
                        }
                    }
                    if (mVar.t() || !AbstractC3557B.K(abstractC0997f.getName(), AbstractC4296h.f37512b)) {
                        if (!mVar.q()) {
                            mg.m.X(sb2);
                        }
                        C4294f name2 = abstractC0997f.getName();
                        AbstractC3557B.b0("getName(...)", name2);
                        sb2.append(mVar.O(name2, true));
                    }
                }
                if (!z10) {
                    List o10 = abstractC0997f.o();
                    AbstractC3557B.b0("getDeclaredTypeParameters(...)", o10);
                    mVar.d0(o10, sb2, false);
                    mVar.z(abstractC0997f, sb2);
                    if (!abstractC0997f.e().a() && ((Boolean) sVar.f39350i.a(sVar, mg.s.f39322X[7])).booleanValue() && (M10 = abstractC0997f.M()) != null) {
                        sb2.append(Separators.SP);
                        mVar.y(sb2, M10, null);
                        AbstractC1165x abstractC1165x = (AbstractC1165x) M10;
                        AbstractC1007p visibility2 = abstractC1165x.getVisibility();
                        AbstractC3557B.b0("getVisibility(...)", visibility2);
                        mVar.h0(visibility2, sb2);
                        sb2.append(mVar.I("constructor"));
                        List S = abstractC1165x.S();
                        AbstractC3557B.b0("getValueParameters(...)", S);
                        mVar.g0(S, M10.B(), sb2);
                    }
                    if (!((Boolean) sVar.f39365x.a(sVar, mg.s.f39322X[22])).booleanValue() && !Jf.l.E(abstractC0997f.n())) {
                        Collection l11 = abstractC0997f.f().l();
                        AbstractC3557B.b0("getSupertypes(...)", l11);
                        if (!l11.isEmpty() && (l11.size() != 1 || !Jf.l.x((Bg.A) l11.iterator().next()))) {
                            mg.m.X(sb2);
                            sb2.append(": ");
                            kf.t.l2(l11, sb2, ", ", null, null, new mg.j(mVar, 1), 60);
                        }
                    }
                    mVar.i0(sb2, o10);
                }
                return jf.y.f36177a;
        }
    }

    public final Object c(AbstractC1013w abstractC1013w, Object obj) {
        switch (this.f6407a) {
            case 0:
                AbstractC3557B.c0("descriptor", abstractC1013w);
                AbstractC3557B.c0("data", (jf.y) obj);
                return new J((H) this.f6408b, abstractC1013w);
            default:
                d(abstractC1013w, (StringBuilder) obj);
                return jf.y.f36177a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bb, code lost:
        if (((java.lang.Boolean) r2.f39337O.a(r2, mg.s.f39322X[39])).booleanValue() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ff, code lost:
        if (((java.lang.Boolean) r2.f39337O.a(r2, mg.s.f39322X[39])).booleanValue() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01b1, code lost:
        if (Jf.l.D(r1, Jf.p.f9171d) == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AbstractC1013w abstractC1013w, StringBuilder sb2) {
        String str;
        boolean z10;
        AbstractC3557B.c0("descriptor", abstractC1013w);
        AbstractC3557B.c0("builder", sb2);
        mg.m mVar = (mg.m) this.f6408b;
        mg.m mVar2 = mg.m.f39296c;
        boolean q10 = mVar.q();
        mg.s sVar = mVar.f39299a;
        if (!q10) {
            mg.q qVar = sVar.f39348g;
            Df.v[] vVarArr = mg.s.f39322X;
            if (!((Boolean) qVar.a(sVar, vVarArr[5])).booleanValue()) {
                mVar.y(sb2, abstractC1013w, null);
                List d02 = abstractC1013w.d0();
                AbstractC3557B.b0("getContextReceiverParameters(...)", d02);
                mVar.B(sb2, d02);
                AbstractC1007p visibility = abstractC1013w.getVisibility();
                AbstractC3557B.b0("getVisibility(...)", visibility);
                mVar.h0(visibility, sb2);
                mVar.M(abstractC1013w, sb2);
                if (((Boolean) sVar.S.a(sVar, vVarArr[43])).booleanValue()) {
                    mVar.K(abstractC1013w, sb2);
                }
                mVar.S(abstractC1013w, sb2);
                if (((Boolean) sVar.S.a(sVar, vVarArr[43])).booleanValue()) {
                    boolean z11 = false;
                    if (abstractC1013w.isOperator()) {
                        Collection m10 = abstractC1013w.m();
                        AbstractC3557B.b0("getOverriddenDescriptors(...)", m10);
                        Collection collection = m10;
                        if (!collection.isEmpty()) {
                            Iterator it = collection.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (((AbstractC1013w) it.next()).isOperator()) {
                                }
                            }
                        }
                        z10 = true;
                        if (abstractC1013w.isInfix()) {
                            Collection m11 = abstractC1013w.m();
                            AbstractC3557B.b0("getOverriddenDescriptors(...)", m11);
                            Collection collection2 = m11;
                            if (!collection2.isEmpty()) {
                                Iterator it2 = collection2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if (((AbstractC1013w) it2.next()).isInfix()) {
                                    }
                                }
                            }
                            z11 = true;
                        }
                        mVar.N(sb2, abstractC1013w.L(), "tailrec");
                        mVar.N(sb2, abstractC1013w.isSuspend(), "suspend");
                        mVar.N(sb2, abstractC1013w.isInline(), "inline");
                        mVar.N(sb2, z11, "infix");
                        mVar.N(sb2, z10, "operator");
                    }
                    z10 = false;
                    if (abstractC1013w.isInfix()) {
                    }
                    mVar.N(sb2, abstractC1013w.L(), "tailrec");
                    mVar.N(sb2, abstractC1013w.isSuspend(), "suspend");
                    mVar.N(sb2, abstractC1013w.isInline(), "inline");
                    mVar.N(sb2, z11, "infix");
                    mVar.N(sb2, z10, "operator");
                } else {
                    mVar.N(sb2, abstractC1013w.isSuspend(), "suspend");
                }
                mVar.J(abstractC1013w, sb2);
                if (mVar.t()) {
                    if (abstractC1013w.g0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (abstractC1013w.l0()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(mVar.I("fun"));
            sb2.append(Separators.SP);
            List typeParameters = abstractC1013w.getTypeParameters();
            AbstractC3557B.b0("getTypeParameters(...)", typeParameters);
            mVar.d0(typeParameters, sb2, true);
            mVar.V(sb2, abstractC1013w);
        }
        mVar.P(abstractC1013w, sb2, true);
        List S = abstractC1013w.S();
        AbstractC3557B.b0("getValueParameters(...)", S);
        mVar.g0(S, abstractC1013w.B(), sb2);
        mVar.W(sb2, abstractC1013w);
        Bg.A returnType = abstractC1013w.getReturnType();
        mg.q qVar2 = sVar.f39353l;
        Df.v[] vVarArr2 = mg.s.f39322X;
        if (!((Boolean) qVar2.a(sVar, vVarArr2[10])).booleanValue()) {
            if (!((Boolean) sVar.f39352k.a(sVar, vVarArr2[9])).booleanValue() && returnType != null) {
                C4294f c4294f = Jf.l.f9117e;
            }
            sb2.append(": ");
            if (returnType == null) {
                str = "[NULL]";
            } else {
                str = mVar.Y(returnType);
            }
            sb2.append(str);
        }
        List typeParameters2 = abstractC1013w.getTypeParameters();
        AbstractC3557B.b0("getTypeParameters(...)", typeParameters2);
        mVar.i0(sb2, typeParameters2);
    }

    public final void e(Mf.O o10, StringBuilder sb2, String str) {
        mg.m mVar = (mg.m) this.f6408b;
        mg.s sVar = mVar.f39299a;
        int ordinal = ((mg.x) sVar.f39330H.a(sVar, mg.s.f39322X[32])).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                d(o10, sb2);
                return;
            }
            return;
        }
        mVar.K(o10, sb2);
        sb2.append(str.concat(" for "));
        Mf.P w02 = ((Pf.M) o10).w0();
        AbstractC3557B.b0("getCorrespondingProperty(...)", w02);
        mg.m.n(mVar, w02, sb2);
    }

    public C0631e(mg.m mVar) {
        this.f6408b = mVar;
    }
}
