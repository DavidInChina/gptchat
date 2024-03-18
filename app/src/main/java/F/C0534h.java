package F;

import E0.AbstractC0461u;
import E0.j0;
import Mb.C0972p;
import N.AbstractC1038w;
import N.f0;
import S0.P;
import S0.Q;
import Z.AbstractC1725n;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import jf.C3959i;
import jh.L1;
import l0.AbstractC4313e;
import mh.C4671a;
import mh.C4672b;
import mh.C4674d;
import mh.C4686p;
import q0.C5251c;
import wf.AbstractC6216a;

/* renamed from: F.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0534h extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f4927Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f4928Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0534h(int i10, Object obj) {
        super(4);
        this.f4927Y = i10;
        this.f4928Z = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x037a, code lost:
        if (r6 <= r5) goto L120;
     */
    @Override // wf.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        float f6;
        boolean z10;
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        long h10;
        jf.y yVar = jf.y.f36177a;
        int i11 = this.f4927Y;
        Object obj5 = this.f4928Z;
        switch (i11) {
            case 0:
                AbstractC0528b abstractC0528b = (AbstractC0528b) obj;
                ((Number) obj2).intValue();
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
                int intValue = ((Number) obj4).intValue();
                if ((intValue & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(abstractC0528b)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue |= i10;
                }
                if ((intValue & 651) == 130) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                ((wf.o) obj5).invoke(abstractC0528b, abstractC1725n, Integer.valueOf(intValue & 14));
                return yVar;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                AbstractC0461u abstractC0461u = (AbstractC0461u) obj2;
                long j6 = ((C5251c) obj3).f43623a;
                AbstractC1038w abstractC1038w = (AbstractC1038w) obj4;
                long j10 = abstractC0461u.j();
                float f11 = (int) (j10 >> 32);
                float f12 = (int) (j10 & 4294967295L);
                float d10 = C5251c.d(j6);
                if (0.0f <= d10 && d10 <= f11) {
                    float e10 = C5251c.e(j6);
                    if (0.0f <= e10) {
                        break;
                    }
                }
                if (C5251c.d(j6) < 0.0f) {
                    f11 = 0.0f;
                } else if (C5251c.d(j6) <= f11) {
                    f11 = C5251c.d(j6);
                }
                if (C5251c.e(j6) < 0.0f) {
                    f6 = 0.0f;
                } else if (C5251c.e(j6) > f12) {
                    f6 = f12;
                } else {
                    f6 = C5251c.e(j6);
                }
                j6 = R4.b.r(f11, f6);
                f0 f0Var = (f0) obj5;
                long a5 = f0.a(f0Var, abstractC0461u, j6);
                if (R4.b.z1(a5)) {
                    f0Var.j(booleanValue);
                    f0Var.f12332r = null;
                    f0Var.m(a5, C5251c.f43621d, false, abstractC1038w);
                    f0Var.f12322h.a();
                    f0Var.k(false);
                }
                return yVar;
            case 2:
                V0.c cVar = (V0.c) obj5;
                Q b10 = ((S0.t) cVar.f17994e).b((S0.s) obj, (S0.D) obj2, ((S0.z) obj3).f16061a, ((S0.A) obj4).f15966a);
                if (!(b10 instanceof P)) {
                    U3.u uVar = new U3.u(b10, cVar.f17999j);
                    cVar.f17999j = uVar;
                    Object obj6 = uVar.f17494i0;
                    AbstractC3557B.a0("null cannot be cast to non-null type android.graphics.Typeface", obj6);
                    return (Typeface) obj6;
                }
                Object value = b10.getValue();
                AbstractC3557B.a0("null cannot be cast to non-null type android.graphics.Typeface", value);
                return (Typeface) value;
            case 3:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                AbstractC3557B.Z(sQLiteQuery);
                ((B3.h) obj5).h(new x3.w(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 4:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj3;
                ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (C0972p) obj);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                Ad.l.r((AbstractC6216a) obj5, kotlin.jvm.internal.m.F(R.drawable.arrow_left, abstractC1725n2), io.sentry.compose.b.a("CreateAccountScreen"), abstractC1725n2, 64, 4);
                return yVar;
            case 5:
                ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (Ad.s) obj);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                ((wf.n) obj5).invoke((AbstractC1725n) obj3, 0);
                return yVar;
            default:
                float floatValue = ((Number) obj).floatValue();
                long j11 = ((C5251c) obj2).f43623a;
                ((Number) obj3).floatValue();
                long j12 = ((C5251c) obj4).f43623a;
                if (R4.b.v1(j11) && !Float.isInfinite(floatValue) && !Float.isNaN(floatValue) && R4.b.v1(j12)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C4686p c4686p = (C4686p) obj5;
                if (z10) {
                    i0.r rVar2 = C4686p.f39480r;
                    C4671a d11 = c4686p.d();
                    if (d11 != null) {
                        C4674d g10 = c4686p.g();
                        if (g10 != null) {
                            f10 = g10.f39438b;
                        } else {
                            f10 = 1.0f;
                        }
                        long j13 = d11.f39433a;
                        C4672b c4672b = new C4672b(j13, f10);
                        long b11 = c4672b.b();
                        float a10 = j0.a(b11);
                        if (!Float.isInfinite(a10) && !Float.isNaN(a10) && a10 >= 0.0f) {
                            float b12 = j0.b(b11);
                            if (!Float.isInfinite(b12) && !Float.isNaN(b12) && b12 >= 0.0f) {
                                if (floatValue < 1.0f) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (floatValue > 1.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                boolean c10 = c4672b.c(c4686p.j().f39506d);
                                mh.r rVar3 = c4686p.j().f39506d;
                                AbstractC3557B.c0("range", rVar3);
                                long b13 = c4672b.b();
                                float max = Math.max(j0.a(b13), j0.b(b13));
                                long b14 = L1.n(j13, rVar3).b();
                                if (max - Math.max(j0.a(b14), j0.b(b14)) < 0.01f) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (c4686p.j().f39504b) {
                                    if (z12 && c10) {
                                        floatValue = (floatValue / 250) + 1.0f;
                                    } else if (z11 && z13) {
                                        floatValue = 1.0f - (floatValue / 250);
                                    }
                                }
                                C4672b c4672b2 = new C4672b(j13, f10 * floatValue);
                                if (c4686p.j().f39504b && (z13 || c10)) {
                                    c4672b2 = c4672b2.a(c4686p.j().f39506d, 0.1f, 0.4f);
                                }
                                long b15 = c4672b2.b();
                                float a11 = j0.a(b15);
                                if (!Float.isInfinite(a11) && !Float.isNaN(a11) && a11 >= 0.0f) {
                                    float b16 = j0.b(b15);
                                    if (!Float.isInfinite(b16) && !Float.isNaN(b16) && b16 >= 0.0f && Math.min(j0.a(b15), j0.b(b15)) > 0.0f) {
                                        C4674d g11 = c4686p.g();
                                        if (g11 != null) {
                                            h10 = g11.f39437a;
                                        } else {
                                            long a12 = ((AbstractC4313e) c4686p.f39485e.getValue()).a(P4.a.F0(androidx.compose.ui.layout.a.m(c4686p.h().d(), j13)), P4.a.F0(c4686p.e()), (Z0.l) c4686p.f39489i.getValue());
                                            long e11 = c4686p.h().e();
                                            int i12 = Z0.i.f22798c;
                                            h10 = C5251c.h(e11, P4.a.J(C5251c.k(R4.b.r((int) (a12 >> 32), (int) (a12 & 4294967295L))), c4672b));
                                        }
                                        c4686p.f39487g.setValue(new C4674d(c4686p.b(c4686p.m(h10, j12, j11, c4672b, c4672b2), c4672b2), c4672b2.f39435b, j12, c4686p.i().a(c4686p.e())));
                                    }
                                }
                                throw new IllegalStateException(("New zoom is invalid/infinite = " + c4672b2 + ". " + c4686p.c(new C3959i("zoomDelta", Float.valueOf(floatValue)))).toString());
                            }
                        }
                        throw new IllegalStateException("Old zoom is invalid/infinite. ".concat(c4686p.c(new C3959i[0])).toString());
                    }
                    return yVar;
                }
                String j14 = C5251c.j(j11);
                String j15 = C5251c.j(j12);
                i0.r rVar4 = C4686p.f39480r;
                throw new IllegalStateException(("Can't transform with zoomDelta=" + floatValue + ", panDelta=" + j14 + ", centroid=" + j15 + ". " + c4686p.c(new C3959i[0])).toString());
        }
    }
}
