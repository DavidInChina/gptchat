package Q3;

import H0.C0672c0;
import K4.o;
import S3.m;
import U3.q;
import android.graphics.Path;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kf.t;
import l8.AbstractC4344b;
import org.json.JSONArray;
import org.json.JSONObject;
import wi.s;
import wi.w;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14417a;

    /* renamed from: b  reason: collision with root package name */
    public List f14418b;

    public j(int i10) {
        this.f14417a = i10;
        if (i10 == 4) {
            this.f14418b = new ArrayList();
        } else if (i10 == 5) {
        } else {
            if (i10 != 6) {
                this.f14418b = new ArrayList();
            } else {
                this.f14418b = new ArrayList();
            }
        }
    }

    public final void a(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f14418b == null) {
            this.f14418b = new ArrayList();
        }
        if (this.f14418b.isEmpty()) {
            this.f14418b.addAll(list);
            return;
        }
        int size = this.f14418b.size() - 1;
        w wVar = (w) this.f14418b.get(size);
        w wVar2 = (w) list.get(0);
        int i10 = wVar.f48616a;
        if (i10 == wVar2.f48616a) {
            int i11 = wVar.f48617b;
            int i12 = wVar.f48618c;
            if (i11 + i12 == wVar2.f48617b) {
                this.f14418b.set(size, new w(i10, i11, i12 + wVar2.f48618c));
                this.f14418b.addAll(list.subList(1, list.size()));
                return;
            }
        }
        this.f14418b.addAll(list);
    }

    public final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(((s) it.next()).d());
        }
    }

    public final void c(Path path) {
        for (int size = this.f14418b.size() - 1; size >= 0; size--) {
            x4.s sVar = (x4.s) this.f14418b.get(size);
            C0672c0 c0672c0 = I4.g.f8055a;
            if (sVar != null && !sVar.f48888a) {
                I4.g.a(path, sVar.f48891d.h() / 100.0f, sVar.f48892e.h() / 100.0f, sVar.f48893f.h() / 360.0f);
            }
        }
    }

    public final boolean d(q qVar) {
        List list = this.f14418b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            R3.d dVar = (R3.d) obj;
            dVar.getClass();
            if (dVar.b(qVar) && dVar.c(dVar.f15034a.a())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            L3.s d10 = L3.s.d();
            String str = l.f14423a;
            d10.a(str, "Work " + qVar.f17450a + " constrained by " + t.m2(arrayList, null, null, null, f.f14408Y, 31));
        }
        return arrayList.isEmpty();
    }

    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f14418b.size(); i10++) {
            if (i10 != 0) {
                sb2.append('\n');
            }
            sb2.append(((xi.d) this.f14418b.get(i10)).f50076a);
        }
        return sb2.toString();
    }

    public final List f() {
        switch (this.f14417a) {
            case 5:
                List list = this.f14418b;
                if (list == null) {
                    return Collections.emptyList();
                }
                return list;
            default:
                ArrayList arrayList = new ArrayList();
                for (xi.d dVar : this.f14418b) {
                    w wVar = dVar.f50077b;
                    if (wVar != null) {
                        arrayList.add(wVar);
                    }
                }
                return arrayList;
        }
    }

    public j(int i10, List list) {
        this.f14417a = i10;
        if (i10 != 3) {
            this.f14418b = list;
        } else {
            this.f14418b = list;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(m mVar) {
        this(0, AbstractC4344b.G0(r4, r5, r6, new R3.a(r12, 2), new R3.a(r12, 3), new R3.f(r12), new R3.e(r12)));
        this.f14417a = 0;
        AbstractC3557B.c0("trackers", mVar);
        R3.a aVar = new R3.a(mVar.f16129a, 0);
        R3.a aVar2 = new R3.a(mVar.f16130b);
        R3.a aVar3 = new R3.a(mVar.f16132d, 4);
        S3.f fVar = mVar.f16131c;
    }

    public j(JSONArray jSONArray) {
        this.f14417a = 2;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new o(optJSONObject));
                }
            }
        }
        this.f14418b = arrayList;
    }
}
