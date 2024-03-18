package fh;

import id.AbstractC3557B;

/* renamed from: fh.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3085l {

    /* renamed from: a  reason: collision with root package name */
    public final C3058A f30883a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f30884b = true;

    public C3085l(C3058A c3058a) {
        AbstractC3557B.c0("writer", c3058a);
        this.f30883a = c3058a;
    }

    public void a() {
        this.f30884b = true;
    }

    public void b() {
        this.f30884b = false;
    }

    public void c() {
        this.f30884b = false;
    }

    public void d(byte b10) {
        long j6 = b10;
        C3058A c3058a = this.f30883a;
        c3058a.getClass();
        c3058a.c(String.valueOf(j6));
    }

    public final void e(char c10) {
        C3058A c3058a = this.f30883a;
        c3058a.a(c3058a.f30793b, 1);
        char[] cArr = c3058a.f30792a;
        int i10 = c3058a.f30793b;
        c3058a.f30793b = i10 + 1;
        cArr[i10] = c10;
    }

    public void f(int i10) {
        long j6 = i10;
        C3058A c3058a = this.f30883a;
        c3058a.getClass();
        c3058a.c(String.valueOf(j6));
    }

    public void g(long j6) {
        C3058A c3058a = this.f30883a;
        c3058a.getClass();
        c3058a.c(String.valueOf(j6));
    }

    public final void h(String str) {
        AbstractC3557B.c0("v", str);
        this.f30883a.c(str);
    }

    public void i(short s10) {
        long j6 = s10;
        C3058A c3058a = this.f30883a;
        c3058a.getClass();
        c3058a.c(String.valueOf(j6));
    }

    public void j(String str) {
        int i10;
        AbstractC3557B.c0("value", str);
        C3058A c3058a = this.f30883a;
        c3058a.getClass();
        c3058a.a(c3058a.f30793b, str.length() + 2);
        char[] cArr = c3058a.f30792a;
        int i11 = c3058a.f30793b;
        int i12 = i11 + 1;
        cArr[i11] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i12);
        int i13 = length + i12;
        int i14 = i12;
        while (i14 < i13) {
            char c10 = cArr[i14];
            byte[] bArr = AbstractC3072O.f30846b;
            if (c10 < bArr.length && bArr[c10] != 0) {
                int length2 = str.length();
                for (int i15 = i14 - i12; i15 < length2; i15++) {
                    c3058a.a(i14, 2);
                    char charAt = str.charAt(i15);
                    byte[] bArr2 = AbstractC3072O.f30846b;
                    if (charAt < bArr2.length) {
                        byte b10 = bArr2[charAt];
                        if (b10 == 0) {
                            i10 = i14 + 1;
                            c3058a.f30792a[i14] = charAt;
                        } else {
                            if (b10 == 1) {
                                String str2 = AbstractC3072O.f30845a[charAt];
                                AbstractC3557B.Z(str2);
                                c3058a.a(i14, str2.length());
                                str2.getChars(0, str2.length(), c3058a.f30792a, i14);
                                int length3 = str2.length() + i14;
                                c3058a.f30793b = length3;
                                i14 = length3;
                            } else {
                                char[] cArr2 = c3058a.f30792a;
                                cArr2[i14] = '\\';
                                cArr2[i14 + 1] = (char) b10;
                                i14 += 2;
                                c3058a.f30793b = i14;
                            }
                        }
                    } else {
                        i10 = i14 + 1;
                        c3058a.f30792a[i14] = charAt;
                    }
                    i14 = i10;
                }
                c3058a.a(i14, 1);
                c3058a.f30792a[i14] = '\"';
                c3058a.f30793b = i14 + 1;
                return;
            }
            i14++;
        }
        cArr[i13] = '\"';
        c3058a.f30793b = i13 + 1;
    }

    public void k() {
    }

    public void l() {
    }
}
