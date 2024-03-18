package Ii;

import android.os.Trace;
import android.util.Printer;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final /* synthetic */ class H implements Printer {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f8635Y;

    public /* synthetic */ H(kotlin.jvm.internal.x xVar) {
        this.f8635Y = xVar;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        String str2;
        kotlin.jvm.internal.x xVar = this.f8635Y;
        AbstractC3557B.c0("$currentlyTracing", xVar);
        if (!xVar.f37645Y) {
            if (Hi.q.d()) {
                AbstractC3557B.b0("log", str);
                if (Lg.n.J2(str, '>')) {
                    String v22 = Lg.n.v2(">>>>> Dispatching to ", str);
                    int p22 = Lg.n.p2(v22, ": ", 6);
                    int l22 = Lg.n.l2(v22, "} ", 0, false, 6);
                    String substring = v22.substring(0, l22 + 1);
                    AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
                    String substring2 = v22.substring(p22 + 2);
                    AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring2);
                    String substring3 = v22.substring(l22 + 2, p22);
                    AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring3);
                    if (AbstractC3557B.K(substring3, "null")) {
                        str2 = substring + ' ' + substring2;
                    } else {
                        int l23 = Lg.n.l2(substring3, "Continuation at ", 0, false, 6);
                        if (l23 != -1) {
                            substring3 = substring3.substring(l23 + 16);
                            AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring3);
                        }
                        str2 = substring3 + ' ' + substring + ' ' + substring2;
                    }
                    Hi.q.b(str2);
                    xVar.f37645Y = true;
                    return;
                }
                return;
            }
            return;
        }
        xVar.f37645Y = false;
        if (Hi.q.d()) {
            Trace.endSection();
        }
    }
}
