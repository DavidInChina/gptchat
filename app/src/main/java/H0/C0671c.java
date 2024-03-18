package H0;

import id.AbstractC3557B;
import java.text.BreakIterator;

/* renamed from: H0.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0671c extends AbstractC0669b {

    /* renamed from: d  reason: collision with root package name */
    public static C0671c f6908d;

    /* renamed from: c  reason: collision with root package name */
    public BreakIterator f6909c;

    @Override // H0.AbstractC0679g
    public final int[] a(int i10) {
        int length = d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        do {
            BreakIterator breakIterator = this.f6909c;
            if (breakIterator != null) {
                if (!breakIterator.isBoundary(i10)) {
                    BreakIterator breakIterator2 = this.f6909c;
                    if (breakIterator2 != null) {
                        i10 = breakIterator2.following(i10);
                    } else {
                        AbstractC3557B.C2("impl");
                        throw null;
                    }
                } else {
                    BreakIterator breakIterator3 = this.f6909c;
                    if (breakIterator3 != null) {
                        int following = breakIterator3.following(i10);
                        if (following == -1) {
                            return null;
                        }
                        return c(i10, following);
                    }
                    AbstractC3557B.C2("impl");
                    throw null;
                }
            } else {
                AbstractC3557B.C2("impl");
                throw null;
            }
        } while (i10 != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f6909c;
            if (breakIterator != null) {
                if (!breakIterator.isBoundary(i10)) {
                    BreakIterator breakIterator2 = this.f6909c;
                    if (breakIterator2 != null) {
                        i10 = breakIterator2.preceding(i10);
                    } else {
                        AbstractC3557B.C2("impl");
                        throw null;
                    }
                } else {
                    BreakIterator breakIterator3 = this.f6909c;
                    if (breakIterator3 != null) {
                        int preceding = breakIterator3.preceding(i10);
                        if (preceding == -1) {
                            return null;
                        }
                        return c(preceding, i10);
                    }
                    AbstractC3557B.C2("impl");
                    throw null;
                }
            } else {
                AbstractC3557B.C2("impl");
                throw null;
            }
        } while (i10 != -1);
        return null;
    }

    public final void e(String str) {
        this.f6906a = str;
        BreakIterator breakIterator = this.f6909c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            AbstractC3557B.C2("impl");
            throw null;
        }
    }
}
