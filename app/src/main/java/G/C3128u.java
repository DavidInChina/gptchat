package g;

import java.util.ListIterator;
import kf.C4288m;
import wf.AbstractC6216a;

/* renamed from: g.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3128u extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31000Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3104C f31001Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3128u(C3104C c3104c, int i10) {
        super(0);
        this.f31000Y = i10;
        this.f31001Z = c3104c;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        Object obj;
        int i10 = this.f31000Y;
        C3104C c3104c = this.f31001Z;
        switch (i10) {
            case 0:
                c3104c.c();
                return;
            case 1:
                if (c3104c.f30930c == null) {
                    C4288m c4288m = c3104c.f30929b;
                    ListIterator listIterator = c4288m.listIterator(c4288m.r());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj = listIterator.previous();
                            if (((AbstractC3126s) obj).f30995a) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    AbstractC3126s abstractC3126s = (AbstractC3126s) obj;
                }
                c3104c.f30930c = null;
                return;
            default:
                c3104c.c();
                return;
        }
    }
}
