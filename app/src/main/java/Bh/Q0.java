package Bh;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Q0 extends io.sentry.vendor.b {

    /* renamed from: d  reason: collision with root package name */
    public G0 f2246d;

    @Override // io.sentry.vendor.b
    public final void a(int i10, int i11, String str, String str2, String str3, String[] strArr) {
        boolean z10;
        boolean z11;
        K0 k02;
        H0 h02;
        ph.f h10 = ph.f.h(i10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new J0(h10));
        if (str.endsWith("/package-info")) {
            arrayList.add(L0.f2231Y);
        } else if ((i11 & 8192) != 0) {
            if (h10.d(ph.f.f43189k0)) {
                if (h10.d(ph.f.f43192n0)) {
                    h02 = H0.JAVA_8;
                } else {
                    h02 = H0.CLASSIC;
                }
                arrayList.add(h02);
            } else {
                throw new IllegalStateException("Cannot define an annotation type for class file version " + h10);
            }
        } else if ((i11 & 512) != 0) {
            if (h10.d(ph.f.f43192n0)) {
                k02 = K0.JAVA_8;
            } else {
                k02 = K0.CLASSIC;
            }
            arrayList.add(k02);
        } else if ((i11 & 1024) != 0) {
            arrayList.add(I0.ABSTRACT);
        } else {
            arrayList.add(I0.MANIFEST);
        }
        boolean z12 = false;
        if ((65536 & i11) != 0) {
            arrayList.add(M0.f2233Y);
            z10 = true;
        } else {
            z10 = false;
        }
        G0 g02 = new G0(arrayList);
        this.f2246d = g02;
        if (strArr != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (str2 != null) {
            z12 = true;
        }
        g02.o(i11, z11, z12);
        if (z10) {
            this.f2246d.g();
        }
        super.a(i10, i11, str, str2, str3, strArr);
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b d(String str, boolean z10) {
        this.f2246d.i();
        return super.d(str, z10);
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b j(int i10, Object obj, String str, String str2, String str3) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Class cls;
        int i11;
        int i12;
        if (obj != null) {
            char charAt = str2.charAt(0);
            if (charAt != 'F') {
                if (charAt != 'S' && charAt != 'Z' && charAt != 'I') {
                    if (charAt != 'J') {
                        switch (charAt) {
                            case 'B':
                            case 'C':
                                break;
                            case 'D':
                                cls = Double.class;
                                break;
                            default:
                                if (str2.equals("Ljava/lang/String;")) {
                                    cls = String.class;
                                    break;
                                } else {
                                    throw new IllegalStateException(R.a.r("Cannot define a default value for type of field ", str));
                                }
                        }
                    } else {
                        cls = Long.class;
                    }
                }
                cls = Integer.class;
            } else {
                cls = Float.class;
            }
            if (cls.isInstance(obj)) {
                if (cls == Integer.class) {
                    char charAt2 = str2.charAt(0);
                    if (charAt2 != 'B') {
                        if (charAt2 != 'C') {
                            if (charAt2 != 'S') {
                                if (charAt2 != 'Z') {
                                    i12 = Integer.MIN_VALUE;
                                    i11 = Integer.MAX_VALUE;
                                } else {
                                    i11 = 1;
                                }
                            } else {
                                i12 = -32768;
                                i11 = 32767;
                            }
                        } else {
                            i11 = 65535;
                        }
                        i12 = 0;
                    } else {
                        i12 = -128;
                        i11 = 127;
                    }
                    Integer num = (Integer) obj;
                    if (num.intValue() < i12 || num.intValue() > i11) {
                        throw new IllegalStateException("Field " + str + " defines an incompatible default value " + obj);
                    }
                }
            } else {
                throw new IllegalStateException("Field " + str + " defines an incompatible default value " + obj);
            }
        }
        G0 g02 = this.f2246d;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((i10 & 16) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (str3 != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        g02.k(str, z10, z11, z12, z13);
        io.sentry.vendor.b j6 = super.j(i10, obj, str, str2, str3);
        if (j6 == null) {
            return null;
        }
        return new O0(this, j6);
    }

    @Override // io.sentry.vendor.b
    public final Nh.l m(int i10, String str, String str2, String str3, String[] strArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        G0 g02 = this.f2246d;
        if ((i10 & 1024) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((i10 & 2) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((i10 & 8) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!str.equals("<init>") && !str.equals("<clinit>") && (i10 & 10) == 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        boolean equals = str.equals("<init>");
        if (str2.startsWith("()") && !str2.endsWith(TokenNames.f24320V)) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (str3 != null) {
            z16 = true;
        } else {
            z16 = false;
        }
        g02.b(str, z10, z11, z12, z13, z14, equals, z15, z16);
        Nh.l m10 = super.m(i10, str, str2, str3, strArr);
        if (m10 == null) {
            return null;
        }
        return new P0(this, m10, str);
    }

    @Override // io.sentry.vendor.b
    public final void o(String str) {
        this.f2246d.n();
        super.o(str);
    }

    @Override // io.sentry.vendor.b
    public final void p(String str) {
        this.f2246d.n();
        super.p(str);
    }

    @Override // io.sentry.vendor.b
    public final void t(String str) {
        this.f2246d.c();
        super.t(str);
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b y(int i10, I5.h hVar, String str, boolean z10) {
        this.f2246d.p();
        return super.y(i10, hVar, str, z10);
    }
}
