package z4;

import E0.AbstractC0454m;
import E0.j0;
import Ng.H;
import Z.AbstractC1710f0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import jf.y;
import l0.AbstractC4313e;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import q0.C5254f;
import r0.AbstractC5340d;
import r0.AbstractC5352p;
import t0.AbstractC5650i;
import v4.C5971a;
import wf.AbstractC6216a;

/* renamed from: z4.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6772k extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Rect f51657Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC0454m f51658Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4313e f51659h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Matrix f51660i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ v4.l f51661j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ boolean f51662k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ boolean f51663l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f51664m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int f51665n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ C5971a f51666o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ Map f51667p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ boolean f51668q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ boolean f51669r0;

    /* renamed from: s0  reason: collision with root package name */
    public final /* synthetic */ boolean f51670s0;

    /* renamed from: t0  reason: collision with root package name */
    public final /* synthetic */ boolean f51671t0;

    /* renamed from: u0  reason: collision with root package name */
    public final /* synthetic */ boolean f51672u0;

    /* renamed from: v0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f51673v0;

    /* renamed from: w0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f51674w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6772k(Rect rect, AbstractC0454m abstractC0454m, AbstractC4313e abstractC4313e, Matrix matrix, v4.l lVar, boolean z10, boolean z11, int i10, int i11, C5971a c5971a, Map map, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, AbstractC6216a abstractC6216a, AbstractC1710f0 abstractC1710f0) {
        super(1);
        this.f51657Y = rect;
        this.f51658Z = abstractC0454m;
        this.f51659h0 = abstractC4313e;
        this.f51660i0 = matrix;
        this.f51661j0 = lVar;
        this.f51662k0 = z10;
        this.f51663l0 = z11;
        this.f51664m0 = i10;
        this.f51665n0 = i11;
        this.f51666o0 = c5971a;
        this.f51667p0 = map;
        this.f51668q0 = z12;
        this.f51669r0 = z13;
        this.f51670s0 = z14;
        this.f51671t0 = z15;
        this.f51672u0 = z16;
        this.f51673v0 = abstractC6216a;
        this.f51674w0 = abstractC1710f0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x021a, code lost:
        if (r1.f4464H != r7.d()) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x021c, code lost:
        r3.execute(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0240, code lost:
        if (r1.f4464H != r7.d()) goto L72;
     */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z10;
        AbstractC5650i abstractC5650i = (AbstractC5650i) obj;
        AbstractC3557B.c0("$this$Canvas", abstractC5650i);
        AbstractC5352p a5 = abstractC5650i.V().a();
        Rect rect = this.f51657Y;
        long i10 = AbstractC4828h.i(rect.width(), rect.height());
        long c10 = H.c(AbstractC4344b.Y0(C5254f.d(abstractC5650i.g())), AbstractC4344b.Y0(C5254f.b(abstractC5650i.g())));
        long a10 = this.f51658Z.a(i10, abstractC5650i.g());
        long a11 = this.f51659h0.a(H.c((int) (j0.a(a10) * C5254f.d(i10)), (int) (j0.b(a10) * C5254f.b(i10))), c10, abstractC5650i.getLayoutDirection());
        Matrix matrix = this.f51660i0;
        matrix.reset();
        int i11 = Z0.i.f22798c;
        matrix.preTranslate((int) (a11 >> 32), (int) (a11 & 4294967295L));
        matrix.preScale(j0.a(a10), j0.b(a10));
        v4.l lVar = this.f51661j0;
        boolean z11 = lVar.f47216n0;
        boolean z12 = this.f51662k0;
        if (z11 != z12) {
            lVar.f47216n0 = z12;
            if (lVar.f47208Y != null) {
                lVar.a();
            }
        }
        lVar.f47211i0 = this.f51663l0;
        lVar.f47206P0 = this.f51664m0;
        lVar.b();
        lVar.f47207Q0 = this.f51665n0;
        C5971a c5971a = lVar.f47208Y;
        boolean z13 = true;
        C5971a c5971a2 = this.f51666o0;
        I4.d dVar = lVar.f47209Z;
        if (c5971a != c5971a2) {
            lVar.f47199I0 = true;
            if (dVar.f8052r0) {
                dVar.cancel();
                if (!lVar.isVisible()) {
                    lVar.f47205O0 = 1;
                }
            }
            lVar.f47208Y = null;
            lVar.f47219q0 = null;
            lVar.f47213k0 = null;
            lVar.f47204N0 = -3.4028235E38f;
            dVar.f8051q0 = null;
            dVar.f8049o0 = -2.14748365E9f;
            dVar.f8050p0 = 2.14748365E9f;
            lVar.invalidateSelf();
            lVar.f47208Y = c5971a2;
            lVar.a();
            if (dVar.f8051q0 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f8051q0 = c5971a2;
            if (z10) {
                dVar.t(Math.max(dVar.f8049o0, c5971a2.f47159l), Math.min(dVar.f8050p0, c5971a2.f47160m));
            } else {
                dVar.t((int) c5971a2.f47159l, (int) c5971a2.f47160m);
            }
            float f6 = dVar.f8047m0;
            dVar.f8047m0 = 0.0f;
            dVar.f8046l0 = 0.0f;
            dVar.r((int) f6);
            dVar.j();
            lVar.i(dVar.getAnimatedFraction());
            ArrayList arrayList = lVar.f47212j0;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                v4.k kVar = (v4.k) it.next();
                if (kVar != null) {
                    kVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            c5971a2.f47148a.f1738a = false;
            lVar.b();
            Drawable.Callback callback = lVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(lVar);
            }
        }
        Map map = lVar.f47215m0;
        Map map2 = this.f51667p0;
        if (map2 != map) {
            lVar.f47215m0 = map2;
            lVar.invalidateSelf();
        }
        AbstractC2469q0.p(this.f51674w0.getValue());
        boolean z14 = lVar.f47221s0;
        boolean z15 = this.f51668q0;
        if (z14 != z15) {
            lVar.f47221s0 = z15;
            E4.c cVar = lVar.f47219q0;
            if (cVar != null) {
                cVar.n(z15);
            }
        }
        lVar.f47222t0 = this.f51669r0;
        lVar.f47217o0 = this.f51670s0;
        boolean z16 = lVar.f47218p0;
        boolean z17 = this.f51671t0;
        if (z17 != z16) {
            lVar.f47218p0 = z17;
            E4.c cVar2 = lVar.f47219q0;
            if (cVar2 != null) {
                cVar2.f4465I = z17;
            }
            lVar.invalidateSelf();
        }
        boolean z18 = lVar.f47223u0;
        boolean z19 = this.f51672u0;
        if (z19 != z18) {
            lVar.f47223u0 = z19;
            lVar.invalidateSelf();
        }
        lVar.i(((Number) this.f51673v0.mo122invoke()).floatValue());
        lVar.setBounds(0, 0, rect.width(), rect.height());
        Canvas a12 = AbstractC5340d.a(a5);
        E4.c cVar3 = lVar.f47219q0;
        C5971a c5971a3 = lVar.f47208Y;
        if (cVar3 != null && c5971a3 != null) {
            int i12 = lVar.f47207Q0;
            if (i12 == 0 || i12 != 2) {
                z13 = false;
            }
            ThreadPoolExecutor threadPoolExecutor = v4.l.f47190T0;
            Semaphore semaphore = lVar.f47200J0;
            v4.h hVar = lVar.f47203M0;
            if (z13) {
                try {
                    semaphore.acquire();
                    if (lVar.j()) {
                        lVar.i(dVar.d());
                    }
                } catch (InterruptedException unused) {
                    if (z13) {
                        semaphore.release();
                    }
                } catch (Throwable th2) {
                    if (z13) {
                        semaphore.release();
                        if (cVar3.f4464H != dVar.d()) {
                            threadPoolExecutor.execute(hVar);
                        }
                    }
                    throw th2;
                }
            }
            if (lVar.f47224v0) {
                a12.save();
                a12.concat(matrix);
                lVar.f(a12, cVar3);
                a12.restore();
            } else {
                cVar3.e(a12, matrix, lVar.f47220r0);
            }
            lVar.f47199I0 = false;
            if (z13) {
                semaphore.release();
            }
        }
        return y.f36177a;
    }
}
