package g;

import id.AbstractC3557B;
import java.util.ListIterator;
import kf.C4288m;

/* renamed from: g.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3127t extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30998Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3104C f30999Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3127t(C3104C c3104c, int i10) {
        super(1);
        this.f30998Y = i10;
        this.f30999Z = c3104c;
    }

    public final void a(C3109b c3109b) {
        int i10 = this.f30998Y;
        Object obj = null;
        C3104C c3104c = this.f30999Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("backEvent", c3109b);
                C4288m c4288m = c3104c.f30929b;
                ListIterator listIterator = c4288m.listIterator(c4288m.r());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        if (((AbstractC3126s) previous).f30995a) {
                            obj = previous;
                        }
                    }
                }
                c3104c.f30930c = (AbstractC3126s) obj;
                return;
            default:
                AbstractC3557B.c0("backEvent", c3109b);
                if (c3104c.f30930c == null) {
                    C4288m c4288m2 = c3104c.f30929b;
                    ListIterator listIterator2 = c4288m2.listIterator(c4288m2.r());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            Object previous2 = listIterator2.previous();
                            if (((AbstractC3126s) previous2).f30995a) {
                                obj = previous2;
                            }
                        }
                    }
                    AbstractC3126s abstractC3126s = (AbstractC3126s) obj;
                    return;
                }
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f30998Y) {
            case 0:
                a((C3109b) obj);
                return yVar;
            default:
                a((C3109b) obj);
                return yVar;
        }
    }
}
