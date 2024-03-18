package x9;

import i0.r;
import i0.s;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kf.t;
import kf.v;
import l8.AbstractC4344b;
import q0.C5251c;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final r f49685a;

    static {
        m mVar = m.f49684Y;
        g gVar = g.f49659h0;
        r rVar = s.f32436a;
        f49685a = new r(mVar, gVar);
    }

    public static final float a(long j6, long j10) {
        return Math.min(((int) (j10 >> 32)) / ((int) (j6 >> 32)), ((int) (j10 & 4294967295L)) / ((int) (j6 & 4294967295L)));
    }

    public static final List b(f fVar, long j6) {
        if (Z0.k.a(j6, 0L)) {
            return v.f37483Y;
        }
        Object[] objArr = new Object[4];
        List<C5251c> list = fVar.f49654a;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        for (C5251c c5251c : list) {
            long j10 = c5251c.f43623a;
            arrayList.add(new C5251c(R4.b.r(C5251c.d(j10) / ((int) (j6 >> 32)), C5251c.e(j10) / ((int) (4294967295L & j6)))));
        }
        objArr[0] = arrayList;
        objArr[1] = Float.valueOf(fVar.f49655b / ((int) (j6 >> 32)));
        objArr[2] = Integer.valueOf(androidx.compose.ui.graphics.a.s(fVar.f49656c));
        objArr[3] = Float.valueOf(fVar.f49657d);
        return AbstractC4344b.G0(objArr);
    }

    public static final f c(long j6, List list) {
        Object obj = list.get(0);
        Object obj2 = list.get(1);
        Object obj3 = list.get(2);
        Object obj4 = list.get(3);
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.geometry.Offset>", obj);
        List<C5251c> list2 = (List) obj;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list2, 10));
        for (C5251c c5251c : list2) {
            long j10 = c5251c.f43623a;
            arrayList.add(new C5251c(R4.b.r(C5251c.d(j10) * ((int) (j6 >> 32)), C5251c.e(j10) * ((int) (4294967295L & j6)))));
        }
        ArrayList M22 = t.M2(arrayList);
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Float", obj2);
        float floatValue = ((Float) obj2).floatValue() * ((int) (j6 >> 32));
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Int", obj3);
        long b10 = androidx.compose.ui.graphics.a.b(((Integer) obj3).intValue());
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Float", obj4);
        return new f(M22, floatValue, b10, ((Float) obj4).floatValue());
    }
}
