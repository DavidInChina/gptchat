package S8;

import E0.o0;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l8.AbstractC4344b;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class V extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16276Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f16277Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f16278h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f16279i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(int i10, List list, float f6, wf.k kVar) {
        super(2);
        this.f16276Y = i10;
        this.f16277Z = list;
        this.f16278h0 = f6;
        this.f16279i0 = kVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        o0 o0Var = (o0) obj;
        long j6 = ((Z0.a) obj2).f22782a;
        AbstractC3557B.c0("$this$SubcomposeLayout", o0Var);
        Boolean bool = Boolean.FALSE;
        List list = this.f16277Z;
        int i10 = this.f16276Y;
        int i11 = 0;
        ArrayList Q22 = kf.t.Q2(o0Var.z(bool, new C3288a(new U(list, i10, 0), true, -223867091)), i10, i10);
        if (Q22.size() == list.size()) {
            if (Z0.a.d(j6)) {
                float f6 = this.f16278h0;
                float h10 = (Z0.a.h(j6) - ((i10 + 1) * f6)) / i10;
                float size = f6 * (Q22.size() + 1);
                long r02 = A7.b.r0(A7.b.n(0, AbstractC4344b.Y0(h10), 0, 0, 13), j6);
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(Q22, 10));
                Iterator it = Q22.iterator();
                while (it.hasNext()) {
                    List<E0.M> list2 = (List) it.next();
                    ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list2, 10));
                    for (E0.M m10 : list2) {
                        arrayList2.add(m10.o(r02));
                    }
                    arrayList.add(arrayList2);
                }
                ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((List) it2.next()).iterator();
                    if (!it3.hasNext()) {
                        obj3 = null;
                    } else {
                        Object next = it3.next();
                        if (!it3.hasNext()) {
                            obj3 = next;
                        } else {
                            int i12 = ((E0.d0) next).f4054Z;
                            do {
                                Object next2 = it3.next();
                                int i13 = ((E0.d0) next2).f4054Z;
                                if (i12 < i13) {
                                    next = next2;
                                    i12 = i13;
                                }
                            } while (it3.hasNext());
                            obj3 = next;
                        }
                    }
                    AbstractC3557B.Z(obj3);
                    arrayList3.add(Integer.valueOf(((E0.d0) obj3).f4054Z));
                }
                int h11 = Z0.a.h(j6);
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    i11 += ((Number) it4.next()).intValue();
                }
                int Y02 = AbstractC4344b.Y0(i11 + size);
                return o0Var.j0(h11, Y02, kf.w.f37484Y, new T(this.f16278h0, arrayList, o0Var, h11, Y02, arrayList3, h10, this.f16279i0));
            }
            throw new IllegalStateException("Table must have bounded width".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
