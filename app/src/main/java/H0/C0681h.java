package H0;

import id.AbstractC3557B;
import java.text.BreakIterator;

/* renamed from: H0.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0681h extends AbstractC0669b {

    /* renamed from: d  reason: collision with root package name */
    public static C0681h f6958d;

    /* renamed from: c  reason: collision with root package name */
    public BreakIterator f6959c;

    @Override // H0.AbstractC0679g
    public final int[] a(int i10) {
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (!g(i10) && (!g(i10) || (i10 != 0 && g(i10 - 1)))) {
            BreakIterator breakIterator = this.f6959c;
            if (breakIterator != null) {
                i10 = breakIterator.following(i10);
                if (i10 == -1) {
                    return null;
                }
            } else {
                AbstractC3557B.C2("impl");
                throw null;
            }
        }
        BreakIterator breakIterator2 = this.f6959c;
        if (breakIterator2 != null) {
            int following = breakIterator2.following(i10);
            if (following == -1 || !f(following)) {
                return null;
            }
            return c(i10, following);
        }
        AbstractC3557B.C2("impl");
        throw null;
    }

    @Override // H0.AbstractC0679g
    public final int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && !g(i10 - 1) && !f(i10)) {
            BreakIterator breakIterator = this.f6959c;
            if (breakIterator != null) {
                i10 = breakIterator.preceding(i10);
                if (i10 == -1) {
                    return null;
                }
            } else {
                AbstractC3557B.C2("impl");
                throw null;
            }
        }
        BreakIterator breakIterator2 = this.f6959c;
        if (breakIterator2 != null) {
            int preceding = breakIterator2.preceding(i10);
            if (preceding == -1 || !g(preceding) || (preceding != 0 && g(preceding - 1))) {
                return null;
            }
            return c(preceding, i10);
        }
        AbstractC3557B.C2("impl");
        throw null;
    }

    public final void e(String str) {
        this.f6906a = str;
        BreakIterator breakIterator = this.f6959c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            AbstractC3557B.C2("impl");
            throw null;
        }
    }

    public final boolean f(int i10) {
        if (i10 > 0 && g(i10 - 1) && (i10 == d().length() || !g(i10))) {
            return true;
        }
        return false;
    }

    public final boolean g(int i10) {
        if (i10 >= 0 && i10 < d().length()) {
            return Character.isLetterOrDigit(d().codePointAt(i10));
        }
        return false;
    }
}
