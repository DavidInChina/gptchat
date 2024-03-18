package x9;

import Df.H;
import Ng.Q;
import Z.C1718j0;
import Z.C1724m0;
import Z.o1;
import Z8.AbstractC1809m0;
import Z8.P0;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import j0.C3878C;
import j0.u;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import jf.C3961k;
import kf.q;
import kf.t;
import kf.w;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import q0.C5251c;
import r0.r;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final String f49675a;

    /* renamed from: b  reason: collision with root package name */
    public final u f49676b = new u();

    /* renamed from: c  reason: collision with root package name */
    public final u f49677c = new u();

    /* renamed from: d  reason: collision with root package name */
    public final u f49678d = new u();

    /* renamed from: e  reason: collision with root package name */
    public final C1718j0 f49679e = H.h0(1.0f);

    /* renamed from: f  reason: collision with root package name */
    public final C1718j0 f49680f = H.h0(10.0f);

    /* renamed from: g  reason: collision with root package name */
    public final C1724m0 f49681g = AbstractC4828h.Z(new r(r.f44254b), o1.f22665a);

    /* renamed from: h  reason: collision with root package name */
    public long f49682h = 0;

    /* renamed from: i  reason: collision with root package name */
    public long f49683i = 0;

    public l(String str) {
        AbstractC3557B.c0("image", str);
        this.f49675a = str;
    }

    public final void a(long j6) {
        AbstractC1809m0.a().b(P0.f23267c, w.f37484Y);
        u<C5251c> uVar = new u();
        uVar.addAll(q.z3(new C5251c[]{new C5251c(j6)}));
        f fVar = new f(uVar, this.f49680f.h(), ((r) this.f49681g.getValue()).f44265a, this.f49679e.h());
        this.f49676b.add(fVar);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(uVar, 10));
        for (C5251c c5251c : uVar) {
            long j10 = c5251c.f43623a;
            float a5 = n.a(this.f49682h, this.f49683i);
            arrayList.add(new C5251c(R4.b.r(C5251c.d(j10) / a5, C5251c.e(j10) / a5)));
        }
        this.f49678d.add(f.a(fVar, t.M2(arrayList), 0.0f, 14));
        this.f49677c.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, Uri uri, AbstractC4825e abstractC4825e) {
        h hVar;
        int i10;
        if (abstractC4825e instanceof h) {
            hVar = (h) abstractC4825e;
            int i11 = hVar.f49663h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f49663h0 = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f49661Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = hVar.f49663h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    Tg.d dVar = Q.f12906c;
                    i iVar = new i(context, this, uri, null);
                    hVar.f49663h0 = 1;
                    obj = Ad.l.n1(hVar, dVar, iVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return ((C3961k) obj).f36158Y;
            }
        }
        hVar = new h(this, abstractC4825e);
        Object obj2 = hVar.f49661Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = hVar.f49663h0;
        if (i10 == 0) {
        }
        return ((C3961k) obj2).f36158Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, Uri uri, AbstractC4825e abstractC4825e) {
        j jVar;
        int i10;
        if (abstractC4825e instanceof j) {
            jVar = (j) abstractC4825e;
            int i11 = jVar.f49670h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f49670h0 = i11 - Integer.MIN_VALUE;
                Object obj = jVar.f49668Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = jVar.f49670h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    Tg.d dVar = Q.f12906c;
                    k kVar = new k(context, this, uri, null);
                    jVar.f49670h0 = 1;
                    obj = Ad.l.n1(jVar, dVar, kVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return ((C3961k) obj).f36158Y;
            }
        }
        jVar = new j(this, abstractC4825e);
        Object obj2 = jVar.f49668Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = jVar.f49670h0;
        if (i10 == 0) {
        }
        return ((C3961k) obj2).f36158Y;
    }

    public final void d(long j6) {
        long j10 = this.f49683i;
        this.f49683i = j6;
        if (!Z0.k.a(j10, j6) && !Z0.k.a(this.f49682h, 0L)) {
            float a5 = n.a(this.f49682h, j6);
            u uVar = this.f49678d;
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(uVar, 10));
            ListIterator listIterator = uVar.listIterator();
            while (true) {
                C3878C c3878c = (C3878C) listIterator;
                if (c3878c.hasNext()) {
                    f fVar = (f) c3878c.next();
                    float f6 = fVar.f49655b * a5;
                    List<C5251c> list = fVar.f49654a;
                    ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list, 10));
                    for (C5251c c5251c : list) {
                        long j11 = c5251c.f43623a;
                        float a10 = n.a(this.f49682h, this.f49683i);
                        arrayList2.add(new C5251c(R4.b.r(C5251c.d(j11) * a10, C5251c.e(j11) * a10)));
                    }
                    arrayList.add(f.a(fVar, t.M2(arrayList2), f6, 12));
                } else {
                    u uVar2 = this.f49676b;
                    uVar2.clear();
                    uVar2.addAll(arrayList);
                    return;
                }
            }
        }
    }

    public final void e(long j6) {
        u uVar = this.f49676b;
        if (!uVar.isEmpty()) {
            ((f) t.o2(uVar)).f49654a.add(new C5251c(j6));
            List list = ((f) t.o2(this.f49678d)).f49654a;
            float a5 = n.a(this.f49682h, this.f49683i);
            list.add(new C5251c(R4.b.r(C5251c.d(j6) / a5, C5251c.e(j6) / a5)));
        }
    }
}
