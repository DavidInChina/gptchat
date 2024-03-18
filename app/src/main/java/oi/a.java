package oi;

import Ci.c;
import Ci.d;
import io.sentry.android.core.z;
import java.util.List;
import wi.o;
import wi.s;
import wi.w;
import wi.y;

/* loaded from: classes2.dex */
public final class a extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public int f41487j = 0;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ b f41488k;

    public a(b bVar) {
        this.f41488k = bVar;
    }

    @Override // L4.a
    public final void W0(o oVar) {
        this.f41487j++;
        Y0(oVar);
        this.f41487j--;
    }

    @Override // L4.a
    public final void X0(y yVar) {
        w wVar;
        if (this.f41487j == 0) {
            b bVar = this.f41488k;
            bVar.getClass();
            String str = yVar.f48620g;
            List d10 = yVar.d();
            if (d10.size() == 1) {
                wVar = (w) d10.get(0);
            } else {
                wVar = null;
            }
            z zVar = bVar.f41489a;
            zVar.getClass();
            if (str != null) {
                Ci.b bVar2 = new Ci.b(str, new Ci.a(zVar, str));
                y yVar2 = yVar;
                while (bVar2.hasNext()) {
                    d dVar = (d) bVar2.next();
                    if (yVar2 != yVar || bVar2.hasNext() || (dVar instanceof Di.a)) {
                        int beginIndex = dVar.getBeginIndex();
                        int endIndex = dVar.getEndIndex();
                        y yVar3 = new y(str.substring(beginIndex, endIndex));
                        if (wVar != null) {
                            yVar3.b(new w(wVar.f48616a, beginIndex, endIndex - beginIndex));
                        }
                        if (dVar instanceof Di.a) {
                            String str2 = yVar3.f48620g;
                            if (((Di.a) dVar).f3728a == c.f3173Z) {
                                str2 = R.a.r("mailto:", str2);
                            }
                            s oVar = new o(str2, null);
                            oVar.c(yVar3);
                            oVar.g(yVar3.d());
                            yVar2.e(oVar);
                            yVar2 = oVar;
                        } else {
                            yVar2.e(yVar3);
                            yVar2 = yVar3;
                        }
                    } else {
                        return;
                    }
                }
                yVar.i();
                return;
            }
            throw new NullPointerException("input must not be null");
        }
    }
}
