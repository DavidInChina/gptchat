package f4;

import id.AbstractC3557B;
import java.util.List;
import jf.C3959i;
import k4.AbstractC4164f;
import k4.AbstractC4165g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final List f29593a;

    /* renamed from: b  reason: collision with root package name */
    public final List f29594b;

    /* renamed from: c  reason: collision with root package name */
    public final List f29595c;

    /* renamed from: d  reason: collision with root package name */
    public final List f29596d;

    /* renamed from: e  reason: collision with root package name */
    public final List f29597e;

    public c(List list, List list2, List list3, List list4, List list5) {
        this.f29593a = list;
        this.f29594b = list2;
        this.f29595c = list3;
        this.f29596d = list4;
        this.f29597e = list5;
    }

    public final C3959i a(Object obj, q4.n nVar, i iVar, int i10) {
        List list = this.f29596d;
        int size = list.size();
        while (i10 < size) {
            C3959i c3959i = (C3959i) list.get(i10);
            AbstractC4164f abstractC4164f = (AbstractC4164f) c3959i.f36155Y;
            if (((Class) c3959i.f36156Z).isAssignableFrom(obj.getClass())) {
                AbstractC3557B.a0("null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>", abstractC4164f);
                AbstractC4165g a5 = abstractC4164f.a(obj, nVar, iVar);
                if (a5 != null) {
                    return new C3959i(a5, Integer.valueOf(i10));
                }
            }
            i10++;
        }
        return null;
    }
}
