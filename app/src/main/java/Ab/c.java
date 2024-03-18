package Ab;

import aa.C1939b;
import ca.AbstractC2318j;
import ca.C2317i;
import ca.C2325q;
import com.google.android.gms.internal.play_billing.N;
import e9.C2814g;
import fa.C2969F;
import ha.C3357J;
import ha.K;
import ha.M;
import java.util.List;
import java.util.ListIterator;
import jf.C3963m;
import jf.y;
import nf.AbstractC4825e;
import oa.C4972C;
import of.EnumC5000a;
import yb.AbstractC6574a;

/* loaded from: classes.dex */
public final class c implements AbstractC6574a {

    /* renamed from: a  reason: collision with root package name */
    public final T9.a f753a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f754b;

    /* renamed from: c  reason: collision with root package name */
    public final ld.i f755c;

    /* renamed from: d  reason: collision with root package name */
    public final C3963m f756d = R4.b.D1(new d9.h(17, this));

    public c(T9.a aVar, p000if.a aVar2, ld.i iVar) {
        this.f753a = aVar;
        this.f754b = aVar2;
        this.f755c = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z10, AbstractC4825e abstractC4825e) {
        a aVar;
        int i10;
        c cVar;
        ListIterator listIterator;
        Object obj;
        AbstractC2318j abstractC2318j;
        C2317i c2317i;
        N n10;
        C2325q c2325q;
        C1939b c1939b;
        M m10;
        List list;
        Object obj2;
        C3357J c3357j;
        String str;
        if (abstractC4825e instanceof a) {
            aVar = (a) abstractC4825e;
            int i11 = aVar.f749j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f749j0 = i11 - Integer.MIN_VALUE;
                Object obj3 = aVar.f747h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = aVar.f749j0;
                y yVar = y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj3);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = aVar.f746Z;
                    cVar = aVar.f745Y;
                    N.B0(obj3);
                } else {
                    N.B0(obj3);
                    C2814g c2814g = ((C4972C) this.f753a).f41060o;
                    aVar.f745Y = this;
                    aVar.f746Z = z10;
                    aVar.f749j0 = 1;
                    obj3 = L4.a.m0(c2814g, aVar);
                    if (obj3 == enumC5000a) {
                        return enumC5000a;
                    }
                    cVar = this;
                }
                T9.c cVar2 = (T9.c) obj3;
                List list2 = cVar2.f16971f;
                listIterator = list2.listIterator(list2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        AbstractC2318j abstractC2318j2 = (AbstractC2318j) obj;
                        if ((abstractC2318j2 instanceof C2317i) && (((C2317i) abstractC2318j2).f26395d instanceof C2325q)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                abstractC2318j = (AbstractC2318j) obj;
                if (abstractC2318j != null) {
                    if (abstractC2318j instanceof C2317i) {
                        c2317i = (C2317i) abstractC2318j;
                    } else {
                        c2317i = null;
                    }
                    if (c2317i != null) {
                        n10 = c2317i.f26395d;
                    } else {
                        n10 = null;
                    }
                    if (n10 instanceof C2325q) {
                        c2325q = (C2325q) n10;
                    } else {
                        c2325q = null;
                    }
                    if (c2325q != null && (c1939b = c2325q.f26412g) != null && (m10 = c1939b.f24021a) != null && (list = m10.f32023g) != null) {
                        ListIterator listIterator2 = list.listIterator(list.size());
                        while (true) {
                            if (listIterator2.hasPrevious()) {
                                obj2 = listIterator2.previous();
                                if (((K) obj2) instanceof C3357J) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        K k10 = (K) obj2;
                        if (k10 != null) {
                            if (k10 instanceof C3357J) {
                                c3357j = (C3357J) k10;
                            } else {
                                c3357j = null;
                            }
                            if (c3357j == null || (str = c3357j.f32015e) == null) {
                                C2969F c2969f = (C2969F) kf.t.h2(((C2317i) abstractC2318j).f26393b);
                                if (c2969f != null) {
                                    str = c2969f.f30008a;
                                } else {
                                    str = null;
                                }
                            }
                            String str2 = cVar2.f16966a;
                            if (str2 == null) {
                                return yVar;
                            }
                            C2969F C02 = K8.d.C0("oauth_success", c1939b.f24022b, str, null, str2);
                            if (z10) {
                                Ad.l.O0(cVar.f755c, null, null, new b(cVar, C02, null), 3);
                            } else {
                                T9.a aVar2 = cVar.f753a;
                                aVar.f745Y = null;
                                aVar.f749j0 = 2;
                                if (((C4972C) aVar2).m(C02, aVar) == enumC5000a) {
                                    return enumC5000a;
                                }
                            }
                        }
                    }
                }
                return yVar;
            }
        }
        aVar = new a(this, abstractC4825e);
        Object obj32 = aVar.f747h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = aVar.f749j0;
        y yVar2 = y.f36177a;
        if (i10 == 0) {
        }
        T9.c cVar22 = (T9.c) obj32;
        List list22 = cVar22.f16971f;
        listIterator = list22.listIterator(list22.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
            }
        }
        abstractC2318j = (AbstractC2318j) obj;
        if (abstractC2318j != null) {
        }
        return yVar2;
    }
}
