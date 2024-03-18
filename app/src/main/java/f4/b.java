package f4;

import java.util.ArrayList;
import jf.C3959i;
import k4.AbstractC4164f;
import kf.t;
import n4.C4715a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f29588a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f29589b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f29590c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f29591d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f29592e;

    public b(c cVar) {
        this.f29588a = t.M2(cVar.f29593a);
        this.f29589b = t.M2(cVar.f29594b);
        this.f29590c = t.M2(cVar.f29595c);
        this.f29591d = t.M2(cVar.f29596d);
        this.f29592e = t.M2(cVar.f29597e);
    }

    public final void a(AbstractC4164f abstractC4164f, Class cls) {
        this.f29591d.add(new C3959i(abstractC4164f, cls));
    }

    public final void b(C4715a c4715a, Class cls) {
        this.f29589b.add(new C3959i(c4715a, cls));
    }
}
