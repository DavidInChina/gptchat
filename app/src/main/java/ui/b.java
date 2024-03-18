package ui;

import D1.C0373t;
import Q3.j;
import java.util.regex.Pattern;
import p3.H;
import ti.l;
import wi.o;
import wi.y;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f46818a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f46819b = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");

    @Override // ui.h
    public final i a(l lVar) {
        String str;
        H h10 = lVar.f46293e;
        h10.j();
        C0373t n10 = h10.n();
        if (h10.b('>') > 0) {
            j e10 = h10.e(n10, h10.n());
            String e11 = e10.e();
            h10.j();
            if (f46818a.matcher(e11).matches()) {
                str = e11;
            } else if (f46819b.matcher(e11).matches()) {
                str = R.a.r("mailto:", e11);
            } else {
                str = null;
            }
            if (str != null) {
                o oVar = new o(str, null);
                y yVar = new y(e11);
                yVar.g(e10.f());
                oVar.c(yVar);
                return i.a(oVar, h10.n());
            }
        }
        return null;
    }
}
