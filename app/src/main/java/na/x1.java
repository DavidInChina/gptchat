package na;

import cb.C2334C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nf.AbstractC4825e;
import oa.C4972C;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.AbstractC6211y;
import wd.C6190g0;
import yf.AbstractC6583a;
import za.AbstractC6790g;
import za.C6786c;
import za.C6788e;
import za.C6808y;

/* loaded from: classes2.dex */
public final class x1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f40146Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f40147Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f40148h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ N1 f40149i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(B1 b1, String str, N1 n12, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f40147Z = b1;
        this.f40148h0 = str;
        this.f40149i0 = n12;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new x1(this.f40147Z, this.f40148h0, this.f40149i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((x1) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        String str;
        ArrayList arrayList;
        Qb.f fVar;
        List<Qb.e> list;
        C6788e c6788e;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f40146Y;
        jf.y yVar = jf.y.f36177a;
        B1 b1 = this.f40147Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    b1.l(C4745d0.f39943A0);
                    return yVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            D1 d12 = (D1) b1.f808e.getValue();
            Map map = d12.f39773l;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = map.entrySet().iterator();
            while (true) {
                AbstractC6211y abstractC6211y = null;
                if (!it.hasNext()) {
                    break;
                }
                AbstractC6790g abstractC6790g = ((C6786c) ((Map.Entry) it.next()).getValue()).f51784b;
                if (abstractC6790g instanceof C6788e) {
                    c6788e = (C6788e) abstractC6790g;
                } else {
                    c6788e = null;
                }
                if (c6788e != null) {
                    abstractC6211y = c6788e.f51786a;
                }
                if (abstractC6211y != null) {
                    arrayList2.add(abstractC6211y);
                }
            }
            Sc.n a5 = d12.f39767f.a();
            if (a5 != null) {
                str = a5.f16534b;
            } else {
                C6190g0.Companion.getClass();
                str = "text-davinci-002-render-sha";
            }
            String str2 = str;
            C2334C c2334c = d12.f39769h;
            if (c2334c == null) {
                c2334c = d12.f39759N;
            }
            C2334C c2334c2 = c2334c;
            if (w1.f40142a[this.f40149i0.ordinal()] == 1 && (fVar = d12.f39774m) != null && (list = fVar.f14566a) != null) {
                ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(list, 10));
                for (Qb.e eVar : list) {
                    arrayList3.add(eVar.f14564c);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            this.f40146Y = 1;
            if (((C4972C) b1.f39710k).l(this.f40148h0, str2, arrayList2, c2334c2, d12.f39756K, arrayList, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        C6808y c6808y = b1.f39715p;
        C4745d0 c4745d0 = C4745d0.f39963z0;
        this.f40146Y = 2;
        c6808y.a(c4745d0);
        if (yVar == enumC5000a) {
            return enumC5000a;
        }
        b1.l(C4745d0.f39943A0);
        return yVar;
    }
}
