package ui;

import D1.C0373t;
import p3.H;
import ti.l;
import wi.s;
import wi.y;

/* loaded from: classes.dex */
public final class d implements h {
    /* JADX WARN: Type inference failed for: r0v2, types: [wi.s, wi.d] */
    @Override // ui.h
    public final i a(l lVar) {
        H h10 = lVar.f46293e;
        C0373t n10 = h10.n();
        int h11 = h10.h('`');
        C0373t n11 = h10.n();
        while (h10.b('`') > 0) {
            C0373t n12 = h10.n();
            if (h10.h('`') == h11) {
                ?? sVar = new s();
                String replace = h10.e(n11, n12).e().replace('\n', ' ');
                if (replace.length() >= 3) {
                    int i10 = 0;
                    if (replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
                        int length = replace.length();
                        while (true) {
                            if (i10 < length) {
                                if (replace.charAt(i10) != ' ') {
                                    break;
                                }
                                i10++;
                            } else {
                                i10 = length;
                                break;
                            }
                        }
                        if (i10 != length) {
                            replace = replace.substring(1, replace.length() - 1);
                        }
                    }
                }
                sVar.f48590g = replace;
                return new i(sVar, h10.n());
            }
        }
        return new i(new y(h10.e(n10, n11).e()), n11);
    }
}
