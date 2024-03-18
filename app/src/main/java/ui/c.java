package ui;

import java.util.regex.Pattern;
import p3.H;
import ti.l;
import wi.s;
import wi.y;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f46820a = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    @Override // ui.h
    public final i a(l lVar) {
        H h10 = lVar.f46293e;
        h10.j();
        char m10 = h10.m();
        if (m10 == '\n') {
            h10.j();
            return i.a(new s(), h10.n());
        } else if (f46820a.matcher(String.valueOf(m10)).matches()) {
            h10.j();
            return i.a(new y(String.valueOf(m10)), h10.n());
        } else {
            return i.a(new y("\\"), h10.n());
        }
    }
}
