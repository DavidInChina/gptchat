package y;

import L.C0840c;
import W.AbstractC1638x2;
import W.AbstractC1643y2;
import Z.l1;
import android.os.SystemClock;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import l0.C4323o;
import q0.C5254f;
import t0.AbstractC5646e;
import t0.AbstractC5648g;
import t0.AbstractC5650i;
import t0.C5643b;
import t0.C5644c;
import xe.C6419h;
import z.C6694e;

/* renamed from: y.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6484w extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50307Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f50308Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f50309h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6484w(long j6, Object obj, int i10) {
        super(1);
        this.f50307Y = i10;
        this.f50308Z = j6;
        this.f50309h0 = obj;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        float j6;
        long j10;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f50307Y;
        long j11 = this.f50308Z;
        Object obj2 = this.f50309h0;
        switch (i10) {
            case 0:
                E0.c0.f((E0.c0) obj, (E0.d0) obj2, j11);
                return yVar;
            case 1:
            default:
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.A a5 = (kotlin.jvm.internal.A) obj2;
                a5.f37621Y = (SystemClock.uptimeMillis() - j11) + a5.f37621Y;
                x8.W.M(Pc.e.a(), "Disconnected from websocket", null, 6);
                return yVar;
            case 2:
                long j12 = ((Z0.i) ((C6694e) obj).e()).f22799a;
                long c10 = kotlin.jvm.internal.m.c(((int) (j12 >> 32)) - ((int) (j11 >> 32)), ((int) (j12 & 4294967295L)) - ((int) (j11 & 4294967295L)));
                int i11 = G.r.f5550n;
                ((G.r) obj2).c(c10);
                return yVar;
            case 3:
                AbstractC5648g.k((AbstractC5650i) obj, this.f50308Z, 0L, 0L, ((Number) ((l1) obj2).getValue()).floatValue(), 118);
                return yVar;
            case 4:
                AbstractC5646e abstractC5646e = (AbstractC5646e) obj;
                float d10 = C5254f.d(j11);
                if (d10 > 0.0f) {
                    G0.J j13 = (G0.J) abstractC5646e;
                    float R10 = j13.R(AbstractC1643y2.f20631a);
                    float R11 = j13.R(((E.g0) obj2).b(j13.getLayoutDirection())) - R10;
                    float f6 = 2;
                    float f10 = (R10 * f6) + d10 + R11;
                    Z0.l layoutDirection = j13.getLayoutDirection();
                    int[] iArr = AbstractC1638x2.f20599a;
                    int i12 = iArr[layoutDirection.ordinal()];
                    C5644c c5644c = j13.f5596Y;
                    if (i12 == 1) {
                        j6 = C5254f.d(c5644c.g()) - f10;
                    } else {
                        j6 = com.google.android.gms.internal.play_billing.N.j(R11, 0.0f);
                    }
                    float f11 = j6;
                    if (iArr[j13.getLayoutDirection().ordinal()] == 1) {
                        f10 = C5254f.d(c5644c.g()) - com.google.android.gms.internal.play_billing.N.j(R11, 0.0f);
                    }
                    float b10 = C5254f.b(j11);
                    float f12 = (-b10) / f6;
                    float f13 = b10 / f6;
                    C5643b c5643b = c5644c.f45612Z;
                    long b11 = c5643b.b();
                    c5643b.a().h();
                    c5643b.f45609a.a(f11, f12, f10, f13, 0);
                    j13.a();
                    c5643b.a().q();
                    c5643b.c(b11);
                } else {
                    ((G0.J) abstractC5646e).a();
                }
                return yVar;
            case 5:
                S8.a0 a0Var = (S8.a0) obj;
                AbstractC3557B.c0("layoutResult", a0Var);
                C4323o c4323o = C4323o.f37719b;
                S8.c0 c0Var = (S8.c0) obj2;
                r0.r rVar = c0Var.f16316c;
                AbstractC3557B.Z(rVar);
                long j14 = r0.r.f44263k;
                long j15 = rVar.f44265a;
                if (j15 != j14) {
                    j10 = j15;
                } else {
                    j10 = j11;
                }
                float floatValue = c0Var.f16317d.floatValue();
                N0.E e10 = S8.Z.f16288a;
                return androidx.compose.ui.draw.a.d(c4323o, new S8.Y(a0Var.f16297a, a0Var.f16298b, j10, floatValue));
            case 6:
                hb.t tVar = (hb.t) obj;
                AbstractC3557B.c0("$this$setState", tVar);
                return hb.t.e(tVar, false, false, (String) obj2, this.f50308Z, false, false, null, false, 499);
            case 7:
                Vc.p pVar = (Vc.p) obj;
                AbstractC3557B.c0("current", pVar);
                ArrayList M22 = kf.t.M2(Ad.l.r0(pVar));
                kf.s.R1(new C0840c(j11, 5), M22);
                Iterator it = M22.iterator();
                long j16 = Long.MAX_VALUE;
                while (it.hasNext()) {
                    He.b bVar = ((C6419h) it.next()).f49892e;
                    if (bVar != null) {
                        j16 = Math.min(j16, bVar.f7676n0);
                    }
                }
                ((Yc.t) obj2).f22282Z.set(j16);
                return Ad.l.K(M22);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6484w(Object obj, long j6, int i10) {
        super(1);
        this.f50307Y = i10;
        this.f50309h0 = obj;
        this.f50308Z = j6;
    }
}
