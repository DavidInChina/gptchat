package R;

import L.C0862n;
import M3.H;
import Wh.p;
import X1.e;
import X1.k;
import X1.m;
import Y0.b;
import Y0.n;
import Y0.o;
import Z.AbstractC1710f0;
import Z.C1737t0;
import Z.O;
import Z.r;
import Z0.g;
import Z0.h;
import Z1.C1778u;
import Z1.C1781x;
import Z1.C1782y;
import Z1.E0;
import Z1.k0;
import Z1.x0;
import a1.AbstractC1913a;
import a1.AbstractC1914b;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import jf.C3959i;
import jf.C3970t;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import q0.C5254f;
import w.C6050B;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ Iterator A() {
        try {
            return Arrays.asList(new Og.a()).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static /* synthetic */ String B(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return "CALLBACK";
                        }
                        throw null;
                    }
                    return "FOREGROUND_SERVICE";
                }
                return "SERVICE";
            }
            return "BROADCAST";
        }
        return "ACTIVITY";
    }

    public static /* synthetic */ String C(int i10) {
        switch (i10) {
            case 1:
                return "NEW";
            case 2:
                return "OK";
            case 3:
                return "KEY_RATCHETED";
            case 4:
                return "MISSING_KEY";
            case 5:
                return "ENCRYPTION_FAILED";
            case 6:
                return "DECRYPTION_FAILED";
            case 7:
                return "INTERNAL_ERROR";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String D(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "DEBUG";
            }
            return "WARNING";
        }
        return "ERROR";
    }

    public static /* synthetic */ String E(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "REMOVING";
            }
            return "ADDING";
        }
        return "NONE";
    }

    public static /* synthetic */ String F(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "null";
                    }
                    return "INVISIBLE";
                }
                return "GONE";
            }
            return "VISIBLE";
        }
        return "REMOVED";
    }

    public static /* synthetic */ String G(int i10) {
        switch (i10) {
            case 1:
                return "v1";
            case 2:
                return "v2";
            case 3:
                return "v3";
            case 4:
                return "v4";
            case 5:
                return "v5";
            case 6:
                return "v6";
            case 7:
                return "v7";
            case 8:
                return "v8";
            case 9:
                return "v9";
            case 10:
                return "v10";
            case 11:
                return "v11";
            case 12:
                return "v12";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String H(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "Indefinite";
            }
            return "Long";
        }
        return "Short";
    }

    public static /* synthetic */ String I(int i10) {
        switch (i10) {
            case 1:
                return "FLOAT";
            case 2:
                return "INT";
            case 3:
                return "BOOL";
            case 4:
                return "FLOAT_VEC2";
            case 5:
                return "FLOAT_VEC3";
            case 6:
                return "FLOAT_VEC4";
            case 7:
                return "INT_VEC2";
            case 8:
                return "INT_VEC3";
            case 9:
                return "INT_VEC4";
            case 10:
                return "MAT3";
            case 11:
                return "MAT4";
            case 12:
                return "MAT3x4";
            case 13:
                return "SAMPLER_2D";
            case 14:
                return "SAMPLER_OES";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String J(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "null";
                    }
                    return "MatchParent";
                }
                return "Expand";
            }
            return "Fixed";
        }
        return "Wrap";
    }

    public static /* synthetic */ int K(String str) {
        if (str != null) {
            if (str.equals("ACTIVITY")) {
                return 1;
            }
            if (str.equals("BROADCAST")) {
                return 2;
            }
            if (str.equals("SERVICE")) {
                return 3;
            }
            if (str.equals("FOREGROUND_SERVICE")) {
                return 4;
            }
            if (str.equals("CALLBACK")) {
                return 5;
            }
            throw new IllegalArgumentException("No enum constant androidx.glance.appwidget.action.ActionTrampolineType.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    public static o a(o oVar, o oVar2) {
        boolean z10 = oVar2 instanceof b;
        if (z10 && (oVar instanceof b)) {
            b bVar = (b) oVar2;
            float a5 = oVar2.a();
            n nVar = new n(oVar, 0);
            if (Float.isNaN(a5)) {
                a5 = ((Number) nVar.mo122invoke()).floatValue();
            }
            return new b(bVar.f22015a, a5);
        } else if (z10 && !(oVar instanceof b)) {
            return oVar2;
        } else {
            if (z10 || !(oVar instanceof b)) {
                return oVar2.c(new n(oVar, 1));
            }
            return oVar;
        }
    }

    public static int b(float f6, Z0.b bVar) {
        float R10 = bVar.R(f6);
        if (Float.isInfinite(R10)) {
            return Integer.MAX_VALUE;
        }
        return AbstractC4344b.Y0(R10);
    }

    public static m c(m mVar, m mVar2) {
        if (mVar2 != k.f21752b) {
            return new e(mVar, mVar2);
        }
        return mVar;
    }

    public static float d(long j6, Z0.b bVar) {
        if (Z0.o.a(Z0.n.b(j6), 4294967296L)) {
            C6050B c6050b = AbstractC1914b.f23844a;
            if (bVar.O() >= AbstractC1914b.f23846c && !((Boolean) h.f22796a.getValue()).booleanValue()) {
                AbstractC1913a a5 = AbstractC1914b.a(bVar.O());
                float c10 = Z0.n.c(j6);
                if (a5 == null) {
                    return bVar.O() * c10;
                }
                return a5.b(c10);
            }
            return bVar.O() * Z0.n.c(j6);
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public static long e(long j6, Z0.b bVar) {
        int i10 = C5254f.f43639d;
        if (j6 != C5254f.f43638c) {
            return AbstractC4828h.g(bVar.K(C5254f.d(j6)), bVar.K(C5254f.b(j6)));
        }
        int i11 = g.f22794d;
        return g.f22793c;
    }

    public static float f(long j6, Z0.b bVar) {
        if (Z0.o.a(Z0.n.b(j6), 4294967296L)) {
            return bVar.R(bVar.t(j6));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public static long g(long j6, Z0.b bVar) {
        int i10 = g.f22794d;
        if (j6 != g.f22793c) {
            return AbstractC4828h.i(bVar.R(g.b(j6)), bVar.R(g.a(j6)));
        }
        int i11 = C5254f.f43639d;
        return C5254f.f43638c;
    }

    public static long h(float f6, Z0.b bVar) {
        boolean z10;
        float f10;
        C6050B c6050b = AbstractC1914b.f23844a;
        if (bVar.O() >= AbstractC1914b.f23846c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !((Boolean) h.f22796a.getValue()).booleanValue()) {
            AbstractC1913a a5 = AbstractC1914b.a(bVar.O());
            if (a5 != null) {
                f10 = a5.a(f6);
            } else {
                f10 = f6 / bVar.O();
            }
            return H.b0(f10, 4294967296L);
        }
        return H.b0(f6 / bVar.O(), 4294967296L);
    }

    public static final void i(int i10, View view) {
        ViewGroup viewGroup;
        int f6 = AbstractC6708l.f(i10);
        if (f6 != 0) {
            if (f6 != 1) {
                if (f6 != 2) {
                    if (f6 == 3) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
            }
            viewGroup.removeView(view);
        }
    }

    public static /* synthetic */ boolean j(int i10) {
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3) {
            return false;
        }
        if (i10 == 4) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ boolean k(int i10) {
        if (i10 == 1 || i10 == 2) {
            return false;
        }
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ int l(int i10) {
        switch (i10) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            default:
                throw null;
        }
    }

    public static int m(float f6, float f10, float f11) {
        return AbstractC4344b.Y0((f6 + f10) * f11);
    }

    public static int n(long j6, int i10, int i11) {
        return (C3970t.a(j6) + i10) * i11;
    }

    public static C0862n o(AbstractC1710f0 abstractC1710f0, int i10, r rVar) {
        C0862n c0862n = new C0862n(abstractC1710f0, i10);
        rVar.h0(c0862n);
        return c0862n;
    }

    public static p p(int i10, float f6, float f10) {
        p pVar = new p(i10);
        pVar.p(f6, f10);
        return pVar;
    }

    public static C1737t0 q(long j6, O o10) {
        return o10.b(new r0.r(j6));
    }

    public static String r(String str, String str2) {
        return str + str2;
    }

    public static String s(StringBuilder sb2, int i10, String str, String str2, String str3) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String t(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder u(String str, String str2) {
        AbstractC3557B.b0(str, str2);
        return new StringBuilder();
    }

    public static /* synthetic */ Iterator v() {
        try {
            return Arrays.asList(new Og.b()).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static C3959i w(int i10, int i11, Integer num) {
        return AbstractC3557B.D2(new E0(i10, i11), num);
    }

    public static C3959i x(int i10, C1778u c1778u) {
        return AbstractC3557B.D2(c1778u, new k0(i10));
    }

    public static C3959i y(int i10, C1782y c1782y) {
        return AbstractC3557B.D2(c1782y, new C1781x(i10));
    }

    public static C3959i z(int i10, x0 x0Var) {
        return AbstractC3557B.D2(x0Var, new k0(i10));
    }
}
