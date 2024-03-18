package kh;

import E0.j0;
import N.b0;
import com.google.android.gms.internal.play_billing.N;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jf.y;
import kf.v;
import l8.AbstractC4344b;
import lh.AbstractC4471A;
import lh.u;
import mh.w;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5252d;
import r0.z;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class q extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ w f37575Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Map f37576Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ lh.s f37577h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ lh.q f37578i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f37579j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4471A f37580k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ l f37581l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(lh.s sVar, lh.q qVar, long j6, AbstractC4471A abstractC4471A, l lVar, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f37577h0 = sVar;
        this.f37578i0 = qVar;
        this.f37579j0 = j6;
        this.f37580k0 = abstractC4471A;
        this.f37581l0 = lVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC4471A abstractC4471A = this.f37580k0;
        l lVar = this.f37581l0;
        q qVar = new q(this.f37577h0, this.f37578i0, this.f37579j0, abstractC4471A, lVar, (AbstractC4825e) obj3);
        qVar.f37575Y = (w) obj;
        qVar.f37576Z = (Map) obj2;
        return qVar.invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0118 A[LOOP:2: B:39:0x0112->B:41:0x0118, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1 A[SYNTHETIC] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC4471A abstractC4471A;
        u uVar;
        z zVar;
        lh.w a5;
        u uVar2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        w wVar = this.f37575Y;
        Map map = this.f37576Z;
        oh.l lVar = (oh.l) wVar;
        long j6 = lVar.f41426b;
        int W6 = Bi.c.W(Math.max(j0.a(j6), j0.b(j6)));
        lh.s sVar = this.f37577h0;
        List list = (List) sVar.f38506b.get(new lh.t(W6));
        if (list == null) {
            list = v.f37483Y;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i10 = 0;
        while (true) {
            abstractC4471A = this.f37580k0;
            if (i10 >= size) {
                break;
            }
            lh.r rVar = (lh.r) list.get(i10);
            int i11 = i10;
            C5252d d12 = Ad.l.d1(rVar.f38504b, lVar.f41426b, lVar.f41428d);
            if (d12.f43627c > 0.0f) {
                long j10 = this.f37579j0;
                if (((int) (j10 >> 32)) > d12.f43625a && d12.f43628d > 0.0f && ((int) (4294967295L & j10)) > d12.f43626b) {
                    uVar2 = new u((z) map.get(rVar), rVar, d12, false, abstractC4471A.a());
                    if (uVar2 == null) {
                        arrayList.add(uVar2);
                    }
                    i10 = i11 + 1;
                }
            }
            uVar2 = null;
            if (uVar2 == null) {
            }
            i10 = i11 + 1;
        }
        boolean isEmpty = arrayList.isEmpty();
        lh.r rVar2 = sVar.f38505a;
        if (!isEmpty) {
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                if (((u) arrayList.get(i12)).f38508a != null) {
                }
            }
            uVar = null;
            List F02 = AbstractC4344b.F0(rVar2);
            List<u> F22 = kf.t.F2(arrayList, new b0(9, wVar));
            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(F22, 10));
            for (u uVar3 : F22) {
                arrayList2.add(uVar3.f38509b);
            }
            ArrayList w22 = kf.t.w2(arrayList2, F02);
            lh.q qVar = this.f37578i0;
            qVar.getClass();
            qVar.f38501c.t(w22);
            return kf.t.w2(arrayList, AbstractC4344b.H0(uVar));
        }
        z zVar2 = (z) map.get(rVar2);
        C5252d d13 = Ad.l.d1(rVar2.f38504b, lVar.f41426b, lVar.f41428d);
        if (zVar2 == null) {
            zVar = this.f37581l0.e0();
        } else {
            zVar = zVar2;
        }
        if (zVar2 == null) {
            a5 = lh.w.f38515Z;
        } else {
            a5 = abstractC4471A.a();
        }
        uVar = new u(zVar, rVar2, d13, true, a5);
        List F022 = AbstractC4344b.F0(rVar2);
        List<u> F222 = kf.t.F2(arrayList, new b0(9, wVar));
        ArrayList arrayList22 = new ArrayList(AbstractC6583a.H1(F222, 10));
        while (r1.hasNext()) {
        }
        ArrayList w222 = kf.t.w2(arrayList22, F022);
        lh.q qVar2 = this.f37578i0;
        qVar2.getClass();
        qVar2.f38501c.t(w222);
        return kf.t.w2(arrayList, AbstractC4344b.H0(uVar));
    }
}
