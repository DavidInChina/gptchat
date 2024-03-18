package z1;

import java.util.ArrayList;
import w.C6049A;

/* renamed from: z1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6746e implements C1.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f51445a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f51446b;

    public /* synthetic */ C6746e(int i10, Object obj) {
        this.f51445a = i10;
        this.f51446b = obj;
    }

    public final void a(C6747f c6747f) {
        switch (this.f51445a) {
            case 0:
                if (c6747f == null) {
                    c6747f = new C6747f(-3);
                }
                ((U3.e) this.f51446b).A(c6747f);
                return;
            default:
                synchronized (AbstractC6748g.f51451c) {
                    try {
                        C6049A c6049a = AbstractC6748g.f51452d;
                        ArrayList arrayList = (ArrayList) c6049a.get((String) this.f51446b);
                        if (arrayList != null) {
                            c6049a.remove((String) this.f51446b);
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                ((C1.a) arrayList.get(i10)).accept(c6747f);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    @Override // C1.a
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f51445a) {
            case 0:
                a((C6747f) obj);
                return;
            default:
                a((C6747f) obj);
                return;
        }
    }
}
