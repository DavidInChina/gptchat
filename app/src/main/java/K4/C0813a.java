package K4;

import A.AbstractC0044t0;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.android.core.AbstractC3612c;
import java.util.IllegalFormatException;
import java.util.Locale;
import qh.AbstractC5327a;

/* renamed from: K4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0813a implements K8.n, AbstractC5327a, Gh.b {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9397Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f9398Z;

    public static int d(String str, int i10, Ph.a aVar) {
        int i11;
        char charAt;
        int i12 = i10 + 1;
        char charAt2 = str.charAt(i10);
        if (charAt2 != 'F') {
            if (charAt2 != 'L') {
                if (charAt2 != 'V' && charAt2 != 'I' && charAt2 != 'J' && charAt2 != 'S') {
                    if (charAt2 != 'T') {
                        if (charAt2 != 'Z') {
                            if (charAt2 != '[') {
                                switch (charAt2) {
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                        break;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            } else {
                                return d(str, i12, aVar.a());
                            }
                        }
                    } else {
                        int indexOf = str.indexOf(59, i12);
                        aVar.q(str.substring(i12, indexOf));
                        return indexOf + 1;
                    }
                }
            } else {
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    int i13 = i12;
                    while (true) {
                        i11 = i12 + 1;
                        charAt = str.charAt(i12);
                        if (charAt == '.' || charAt == ';') {
                            break;
                        } else if (charAt == '<') {
                            String substring = str.substring(i13, i12);
                            if (z11) {
                                aVar.i(substring);
                            } else {
                                aVar.e(substring);
                            }
                            i12 = i11;
                            while (true) {
                                char charAt3 = str.charAt(i12);
                                if (charAt3 == '>') {
                                    break;
                                } else if (charAt3 != '*') {
                                    if (charAt3 != '+' && charAt3 != '-') {
                                        i12 = d(str, i12, aVar.o('='));
                                    } else {
                                        i12 = d(str, i12 + 1, aVar.o(charAt3));
                                    }
                                } else {
                                    i12++;
                                    aVar.p();
                                }
                            }
                            z10 = true;
                        } else {
                            i12 = i11;
                        }
                    }
                    if (!z10) {
                        String substring2 = str.substring(i13, i12);
                        if (z11) {
                            aVar.i(substring2);
                        } else {
                            aVar.e(substring2);
                        }
                    }
                    if (charAt == ';') {
                        aVar.f();
                        return i11;
                    }
                    z10 = false;
                    z11 = true;
                    i12 = i11;
                }
            }
        }
        aVar.b(charAt2);
        return i12;
    }

    public static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                AbstractC3612c.d("PlayCore", "Unable to format ".concat(str2), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return android.gov.nist.core.a.j(str, " : ", str2);
    }

    @Override // qh.AbstractC5327a
    public final void a(Q4.a aVar) {
        throw new IllegalStateException("Could not resolve dispatcher: " + this.f9398Z);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Ph.a aVar) {
        char charAt;
        String str = this.f9398Z;
        int length = str.length();
        int i10 = 0;
        if (str.charAt(0) == '<') {
            i10 = 2;
            do {
                int indexOf = str.indexOf(58, i10);
                aVar.h(str.substring(i10 - 1, indexOf));
                int i11 = indexOf + 1;
                char charAt2 = str.charAt(i11);
                if (charAt2 == 'L' || charAt2 == '[' || charAt2 == 'T') {
                    i11 = d(str, i11, aVar.c());
                }
                while (true) {
                    i10 = i11 + 1;
                    charAt = str.charAt(i11);
                    if (charAt == ':') {
                        i11 = d(str, i10, aVar.k());
                    }
                }
            } while (charAt != '>');
            if (str.charAt(i10) != '(') {
                int i12 = i10 + 1;
                while (str.charAt(i12) != ')') {
                    i12 = d(str, i12, aVar.l());
                }
                int d10 = d(str, i12 + 1, aVar.m());
                while (d10 < length) {
                    d10 = d(str, d10 + 1, aVar.g());
                }
                return;
            }
            int d11 = d(str, i10, aVar.n());
            while (d11 < length) {
                d11 = d(str, d11, aVar.j());
            }
        } else if (str.charAt(i10) != '(') {
        }
    }

    public final String c() {
        switch (this.f9397Y) {
            case 0:
                return this.f9398Z;
            default:
                return this.f9398Z;
        }
    }

    public final void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", f(this.f9398Z, str, objArr));
        }
    }

    @Override // K8.n
    public final Object i() {
        throw new RuntimeException(this.f9398Z);
    }

    @Override // qh.AbstractC5327a
    public final void j(O4.a aVar, byte[] bArr, R4.a aVar2, Q4.a aVar3, S4.b bVar) {
        throw new IllegalStateException("Could not resolve dispatcher: " + this.f9398Z);
    }

    public final String toString() {
        switch (this.f9397Y) {
            case 7:
                return R.a.t(new StringBuilder("Phase('"), this.f9398Z, "')");
            default:
                return super.toString();
        }
    }

    public C0813a(String str, int i10) {
        this.f9397Y = i10;
        if (i10 != 7) {
            this.f9398Z = AbstractC0044t0.y("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
        } else {
            this.f9398Z = str;
        }
    }

    public /* synthetic */ C0813a(String str, int i10, int i11) {
        this.f9397Y = i10;
        this.f9398Z = str;
    }

    public C0813a() {
        this.f9397Y = 4;
        this.f9398Z = "client";
    }
}
