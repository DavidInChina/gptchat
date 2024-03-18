package I9;

import Df.AbstractC0408g;
import android.net.Uri;
import id.AbstractC3557B;
import na.N1;
import wd.C6205s;
import za.C6798o;
import za.C6802s;
import za.C6805v;

/* loaded from: classes2.dex */
public final class c1 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8314Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC0408g f8315Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(AbstractC0408g abstractC0408g, int i10) {
        super(1);
        this.f8314Y = i10;
        this.f8315Z = abstractC0408g;
    }

    public final void a(T0.z zVar) {
        int i10 = this.f8314Y;
        AbstractC0408g abstractC0408g = this.f8315Z;
        switch (i10) {
            case 4:
                AbstractC3557B.c0("it", zVar);
                ((wf.k) abstractC0408g).invoke(new C6805v(zVar));
                return;
            default:
                AbstractC3557B.c0("it", zVar);
                ((wf.k) abstractC0408g).invoke(new C6805v(zVar));
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f8314Y;
        AbstractC0408g abstractC0408g = this.f8315Z;
        switch (i10) {
            case 0:
                C6205s c6205s = (C6205s) obj;
                AbstractC3557B.c0("it", c6205s);
                ((wf.k) abstractC0408g).invoke(new W0(c6205s));
                return yVar;
            case 1:
                Qb.e eVar = (Qb.e) obj;
                AbstractC3557B.c0("it", eVar);
                ((wf.k) abstractC0408g).invoke(new na.K(eVar.f14564c, N1.f39841Z));
                return yVar;
            case 2:
                invoke((String) obj);
                return yVar;
            case 3:
                invoke((String) obj);
                return yVar;
            case 4:
                a((T0.z) obj);
                return yVar;
            case 5:
                a((T0.z) obj);
                return yVar;
            case 6:
                Uri uri = (Uri) obj;
                switch (i10) {
                    case 6:
                        ((wf.k) abstractC0408g).invoke(new C6798o(uri));
                        break;
                    default:
                        ((wf.k) abstractC0408g).invoke(new C6802s(uri));
                        break;
                }
                return yVar;
            default:
                Uri uri2 = (Uri) obj;
                switch (i10) {
                    case 6:
                        ((wf.k) abstractC0408g).invoke(new C6798o(uri2));
                        break;
                    default:
                        ((wf.k) abstractC0408g).invoke(new C6802s(uri2));
                        break;
                }
                return yVar;
        }
    }

    public final void invoke(String str) {
        int i10 = this.f8314Y;
        AbstractC0408g abstractC0408g = this.f8315Z;
        switch (i10) {
            case 2:
                AbstractC3557B.c0("it", str);
                ((wf.k) abstractC0408g).invoke(new na.K(str, N1.f39842h0));
                return;
            default:
                AbstractC3557B.c0("it", str);
                ((wf.k) abstractC0408g).invoke(new na.Y(str));
                return;
        }
    }
}
