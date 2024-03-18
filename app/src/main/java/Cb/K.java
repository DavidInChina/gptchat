package Cb;

import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f2886Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F f2887Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(F f6, int i10) {
        super(1);
        this.f2886Y = i10;
        this.f2887Z = f6;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        String str;
        Object obj2;
        switch (this.f2886Y) {
            case 0:
                Y y10 = (Y) obj;
                AbstractC3557B.c0("it", y10);
                return Y.a(y10, null, null, null, null, null, null, this.f2887Z, 63);
            default:
                Mb.G g10 = (Mb.G) obj;
                AbstractC3557B.c0("$this$setState", g10);
                F f6 = this.f2887Z;
                List list = f6.f2875f;
                Iterator it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    str = f6.f2873d;
                    if (hasNext) {
                        obj2 = it.next();
                        if (AbstractC3557B.K(((Fb.f) obj2).f5145a, str)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                return Mb.G.e(g10, null, null, null, null, null, (Fb.f) obj2, list, false, false, false, AbstractC3557B.K(str, "KR"), f6.f2870a, 927);
        }
    }
}
