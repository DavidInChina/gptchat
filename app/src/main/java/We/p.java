package We;

import id.AbstractC3557B;
import java.util.Date;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f21043Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ w f21044Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(w wVar, int i10) {
        super(2);
        this.f21043Y = i10;
        this.f21044Z = wVar;
    }

    public final void a(String str, String str2) {
        int i10 = this.f21043Y;
        w wVar = this.f21044Z;
        switch (i10) {
            case 1:
                if (!AbstractC3557B.K(str, str2)) {
                    x xVar = wVar.f21073o;
                    wVar.f21062d.a(new Te.e(wVar, str2), wVar.f21061c);
                    return;
                }
                return;
            default:
                if (!AbstractC3557B.K(str, str2)) {
                    wVar.f21062d.a(new Te.f(wVar, str), wVar.f21061c);
                    return;
                }
                return;
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f21043Y;
        w wVar = this.f21044Z;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue != ((Boolean) obj2).booleanValue()) {
                    x xVar = wVar.f21073o;
                    wVar.f21062d.a(new Te.m(wVar), wVar.f21061c);
                    if (booleanValue) {
                        wVar.f21072n.h(Long.valueOf(new Date().getTime()), w.f21058q[8]);
                    }
                }
                return yVar;
            case 1:
                a((String) obj, (String) obj2);
                return yVar;
            case 2:
                a((String) obj, (String) obj2);
                return yVar;
            default:
                z zVar = (z) obj;
                z zVar2 = (z) obj2;
                if (!AbstractC3557B.K(zVar, zVar2)) {
                    wVar.f21062d.a(new Te.g(wVar, zVar, zVar2), wVar.f21061c);
                }
                return yVar;
        }
    }
}
