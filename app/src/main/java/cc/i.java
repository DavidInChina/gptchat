package cc;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import jf.y;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import rc.C5463l;
import rc.C5472v;
import wd.C6189g;
import wd.C6200m;

/* loaded from: classes.dex */
public final class i extends AbstractC2389d {

    /* renamed from: j  reason: collision with root package name */
    public final xd.b f26574j;

    /* renamed from: k  reason: collision with root package name */
    public final xd.a f26575k;

    public i(xd.b bVar, xd.a aVar) {
        super(m.f26580a);
        this.f26574j = bVar;
        this.f26575k = aVar;
        L4.a.E0(L4.a.I0(new f(this, null), ((C5472v) bVar).f44935e), AbstractC4828h.Q(this));
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        AbstractC2387b abstractC2387b = (AbstractC2387b) iVar;
        AbstractC3557B.c0("intent", abstractC2387b);
        if (AbstractC3557B.K(abstractC2387b, C2386a.f26561a)) {
            h(new h(this, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(xd.e eVar, AbstractC4825e abstractC4825e) {
        g gVar;
        EnumC5000a enumC5000a;
        int i10;
        i iVar;
        C6200m c6200m;
        Map map;
        Collection values;
        if (abstractC4825e instanceof g) {
            gVar = (g) abstractC4825e;
            int i11 = gVar.f26571i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f26571i0 = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f26569Z;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = gVar.f26571i0;
                y yVar = y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = gVar.f26568Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    l(new C2390e(eVar, 1));
                    gVar.f26568Y = this;
                    gVar.f26571i0 = 1;
                    obj = ((C5463l) this.f26575k).a(gVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    iVar = this;
                }
                c6200m = (C6200m) obj;
                if (c6200m != null && (map = c6200m.f48441a) != null && (values = map.values()) != null) {
                    gVar.f26568Y = null;
                    gVar.f26571i0 = 2;
                    if (iVar.n(values, gVar) != enumC5000a) {
                        return enumC5000a;
                    }
                }
                return yVar;
            }
        }
        gVar = new g(this, abstractC4825e);
        Object obj2 = gVar.f26569Z;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = gVar.f26571i0;
        y yVar2 = y.f36177a;
        if (i10 == 0) {
        }
        c6200m = (C6200m) obj2;
        if (c6200m != null) {
            gVar.f26568Y = null;
            gVar.f26571i0 = 2;
            if (iVar.n(values, gVar) != enumC5000a) {
            }
        }
        return yVar2;
    }

    public final Object n(Collection collection, AbstractC4825e abstractC4825e) {
        Object obj;
        Object b10;
        Iterator it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!((C6189g) obj).f48417h) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C6189g c6189g = (C6189g) obj;
        if (c6189g != null && (b10 = ((C5472v) this.f26574j).b(c6189g.f48410a, abstractC4825e)) == EnumC5000a.f41328Y) {
            return b10;
        }
        return y.f36177a;
    }
}
