package x9;

import Ng.H;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import q0.C5251c;
import r0.r;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class g extends o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final g f49658Z = new g(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final g f49659h0 = new g(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f49660Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10) {
        super(1);
        this.f49660Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f49660Y) {
            case 0:
                return new C5251c(((C5251c) obj).f43623a);
            default:
                List list = (List) obj;
                AbstractC3557B.c0("restored", list);
                Object obj2 = list.get(0);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.String", obj2);
                Object obj3 = list.get(1);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Float", obj3);
                float floatValue = ((Float) obj3).floatValue();
                Object obj4 = list.get(2);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Float", obj4);
                float floatValue2 = ((Float) obj4).floatValue();
                Object obj5 = list.get(3);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Int", obj5);
                int intValue = ((Integer) obj5).intValue();
                Object obj6 = list.get(4);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<*>", obj6);
                List list2 = (List) obj6;
                Object obj7 = list.get(5);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<*>", obj7);
                List list3 = (List) obj7;
                Object obj8 = list.get(6);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<*>", obj8);
                List list4 = (List) obj8;
                Object obj9 = list.get(7);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Int", obj9);
                int intValue2 = ((Integer) obj9).intValue();
                Object obj10 = list.get(8);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Int", obj10);
                int intValue3 = ((Integer) obj10).intValue();
                Object obj11 = list.get(9);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Int", obj11);
                int intValue4 = ((Integer) obj11).intValue();
                Object obj12 = list.get(10);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Int", obj12);
                int intValue5 = ((Integer) obj12).intValue();
                l lVar = new l((String) obj2);
                lVar.f49679e.i(floatValue);
                lVar.f49680f.i(floatValue2);
                lVar.f49682h = H.c(intValue4, intValue5);
                lVar.d(H.c(intValue2, intValue3));
                lVar.f49681g.setValue(new r(androidx.compose.ui.graphics.a.b(intValue)));
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list2, 10));
                for (Object obj13 : list2) {
                    AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<com.openai.draw.ImageDrawPath>", obj13);
                    arrayList.add(n.c(lVar.f49683i, (List) obj13));
                }
                lVar.f49676b.addAll(arrayList);
                ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list3, 10));
                for (Object obj14 : list3) {
                    AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<com.openai.draw.ImageDrawPath>", obj14);
                    arrayList2.add(n.c(lVar.f49683i, (List) obj14));
                }
                lVar.f49678d.addAll(arrayList2);
                ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(list4, 10));
                for (Object obj15 : list4) {
                    AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<com.openai.draw.ImageDrawPath>", obj15);
                    arrayList3.add(n.c(lVar.f49683i, (List) obj15));
                }
                lVar.f49677c.addAll(arrayList3);
                return lVar;
        }
    }
}
