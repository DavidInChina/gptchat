package x4;

import java.util.ArrayList;
import java.util.List;
import y4.AbstractC6541a;

/* loaded from: classes.dex */
public final class s implements c, AbstractC6541a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f48888a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f48889b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final int f48890c;

    /* renamed from: d  reason: collision with root package name */
    public final y4.h f48891d;

    /* renamed from: e  reason: collision with root package name */
    public final y4.h f48892e;

    /* renamed from: f  reason: collision with root package name */
    public final y4.h f48893f;

    public s(E4.b bVar, D4.p pVar) {
        pVar.getClass();
        this.f48888a = pVar.f3416e;
        this.f48890c = pVar.f3412a;
        y4.e s10 = pVar.f3413b.s();
        this.f48891d = (y4.h) s10;
        y4.e s11 = pVar.f3414c.s();
        this.f48892e = (y4.h) s11;
        y4.e s12 = pVar.f3415d.s();
        this.f48893f = (y4.h) s12;
        bVar.d(s10);
        bVar.d(s11);
        bVar.d(s12);
        s10.a(this);
        s11.a(this);
        s12.a(this);
    }

    @Override // y4.AbstractC6541a
    public final void a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48889b;
            if (i10 < arrayList.size()) {
                ((AbstractC6541a) arrayList.get(i10)).a();
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(AbstractC6541a abstractC6541a) {
        this.f48889b.add(abstractC6541a);
    }

    @Override // x4.c
    public final void b(List list, List list2) {
    }
}
