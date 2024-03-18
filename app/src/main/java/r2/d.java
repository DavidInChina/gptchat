package r2;

import K4.C0822j;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import xe.C6421j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int f44376a;

    /* renamed from: b  reason: collision with root package name */
    public String f44377b;

    public d(String str) {
        AbstractC3557B.c0("source", str);
        this.f44377b = str;
    }

    public final boolean a(C6421j c6421j) {
        boolean d10 = d(c6421j);
        if (d10) {
            this.f44376a++;
        }
        return d10;
    }

    public final void b(C6421j c6421j) {
        if (!d(c6421j)) {
            return;
        }
        while (d(c6421j)) {
            this.f44376a++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [K4.j, java.lang.Object] */
    public final C0822j c() {
        ?? obj = new Object();
        obj.f9439a = this.f44376a;
        obj.f9440b = this.f44377b;
        return obj;
    }

    public final boolean d(C6421j c6421j) {
        if (this.f44376a < this.f44377b.length() && ((Boolean) c6421j.invoke(Character.valueOf(this.f44377b.charAt(this.f44376a)))).booleanValue()) {
            return true;
        }
        return false;
    }

    public /* synthetic */ d(String str, int i10, int i11) {
        this(str, (i11 & 2) != 0 ? 0 : i10, false);
    }

    public d(String str, int i10, boolean z10) {
        AbstractC3557B.c0("regexRaw", str);
        this.f44377b = z10 ? android.gov.nist.core.a.h(Separators.LPAREN, str, ')') : str;
        this.f44376a = z10 ? i10 + 1 : i10;
    }

    public d(String str, int i10) {
        this.f44377b = str;
        this.f44376a = i10;
    }

    public d(int i10, String str) {
        this.f44376a = i10;
        this.f44377b = str;
    }
}
