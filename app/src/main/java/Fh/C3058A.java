package fh;

import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.Arrays;

/* renamed from: fh.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3058A {

    /* renamed from: a  reason: collision with root package name */
    public char[] f30792a;

    /* renamed from: b  reason: collision with root package name */
    public int f30793b;

    public final void a(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f30792a;
        if (cArr.length <= i12) {
            int i13 = i10 * 2;
            if (i12 < i13) {
                i12 = i13;
            }
            char[] copyOf = Arrays.copyOf(cArr, i12);
            AbstractC3557B.b0("copyOf(...)", copyOf);
            this.f30792a = copyOf;
        }
    }

    public final void b() {
        C3082i c3082i = C3082i.f30875c;
        char[] cArr = this.f30792a;
        c3082i.getClass();
        AbstractC3557B.c0("array", cArr);
        synchronized (c3082i) {
            int i10 = c3082i.f30874b;
            if (cArr.length + i10 < AbstractC3079f.f30871a) {
                c3082i.f30874b = i10 + cArr.length;
                c3082i.f30873a.addLast(cArr);
            }
        }
    }

    public final void c(String str) {
        AbstractC3557B.c0(ParameterNames.TEXT, str);
        int length = str.length();
        if (length == 0) {
            return;
        }
        a(this.f30793b, length);
        str.getChars(0, str.length(), this.f30792a, this.f30793b);
        this.f30793b += length;
    }

    public final String toString() {
        return new String(this.f30792a, 0, this.f30793b);
    }
}
