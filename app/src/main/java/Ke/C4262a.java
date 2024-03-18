package ke;

import Ng.AbstractC1070k;
import Ng.C1072l;
import Wh.AbstractC1661f;
import Wh.D;
import Wh.z;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import ii.C3591f;
import ii.C3592g;
import java.io.IOException;
import java.net.SocketTimeoutException;
import le.C4434a;
import me.M;
import me.O;
import me.P;
import me.Q;
import te.C5761e;

/* renamed from: ke.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4262a implements AbstractC1661f {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37371Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f37372Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f37373h0;

    public C4262a(C5761e c5761e, C1072l c1072l) {
        AbstractC3557B.c0("requestData", c5761e);
        this.f37372Z = c5761e;
        this.f37373h0 = c1072l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r0 == null) goto L26;
     */
    @Override // Wh.AbstractC1661f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ai.j jVar, IOException iOException) {
        Throwable c4434a;
        Object obj;
        int i10 = this.f37371Y;
        Object obj2 = this.f37372Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("call", jVar);
                AbstractC1070k abstractC1070k = (AbstractC1070k) this.f37373h0;
                if (!abstractC1070k.m()) {
                    C5761e c5761e = (C5761e) obj2;
                    if (iOException instanceof r) {
                        c4434a = iOException.getCause();
                        break;
                    } else {
                        if (iOException instanceof SocketTimeoutException) {
                            String message = iOException.getMessage();
                            if (message != null && Lg.n.Z1(message, "connect", true)) {
                                Ei.a aVar = Q.f39187a;
                                AbstractC3557B.c0("request", c5761e);
                                StringBuilder sb2 = new StringBuilder("Connect timeout has expired [url=");
                                sb2.append(c5761e.f46131a);
                                sb2.append(", connect_timeout=");
                                O o10 = P.f39182d;
                                M m10 = (M) c5761e.a();
                                if (m10 == null || (obj = m10.f39176b) == null) {
                                    obj = "unknown";
                                }
                                sb2.append(obj);
                                sb2.append(" ms]");
                                c4434a = new C4434a(sb2.toString(), iOException);
                                iOException = c4434a;
                            } else {
                                iOException = Q.a(c5761e, iOException);
                            }
                        }
                        abstractC1070k.resumeWith(N.w(iOException));
                        return;
                    }
                } else {
                    return;
                }
                break;
            default:
                AbstractC3557B.c0("call", jVar);
                ((C3591f) obj2).c(iOException, null);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [Cf.g, Cf.e] */
    @Override // Wh.AbstractC1661f
    public final void c(ai.j jVar, D d10) {
        String str;
        switch (this.f37371Y) {
            case 0:
                if (!jVar.f24270u0) {
                    ((AbstractC1070k) this.f37373h0).resumeWith(d10);
                    return;
                }
                return;
            default:
                ai.e eVar = d10.f21142r0;
                try {
                    ((C3591f) this.f37372Z).a(d10, eVar);
                    ai.l b10 = eVar.b();
                    Wh.q qVar = d10.f21135k0;
                    AbstractC3557B.c0("responseHeaders", qVar);
                    int size = qVar.size();
                    int i10 = 0;
                    int i11 = 0;
                    boolean z10 = false;
                    boolean z11 = false;
                    boolean z12 = false;
                    boolean z13 = false;
                    Integer num = null;
                    Integer num2 = null;
                    while (i11 < size) {
                        if (Lg.n.f2(qVar.y(i11), "Sec-WebSocket-Extensions")) {
                            String T = qVar.T(i11);
                            int i12 = i10;
                            while (i12 < T.length()) {
                                int g10 = Xh.b.g(T, ',', i12, i10, 4);
                                int e10 = Xh.b.e(';', i12, g10, T);
                                String z14 = Xh.b.z(i12, e10, T);
                                int i13 = e10 + 1;
                                if (Lg.n.f2(z14, "permessage-deflate")) {
                                    if (z10) {
                                        z13 = true;
                                    }
                                    i12 = i13;
                                    while (i12 < g10) {
                                        int e11 = Xh.b.e(';', i12, g10, T);
                                        int e12 = Xh.b.e('=', i12, e11, T);
                                        String z15 = Xh.b.z(i12, e12, T);
                                        if (e12 < e11) {
                                            str = Lg.n.x2(Xh.b.z(e12 + 1, e11, T));
                                        } else {
                                            str = null;
                                        }
                                        i12 = e11 + 1;
                                        if (Lg.n.f2(z15, "client_max_window_bits")) {
                                            if (num != null) {
                                                z13 = true;
                                            }
                                            if (str != null) {
                                                num = Lg.m.W1(str);
                                            } else {
                                                num = null;
                                            }
                                            if (num == null) {
                                                z13 = true;
                                            }
                                        } else if (Lg.n.f2(z15, "client_no_context_takeover")) {
                                            if (z11) {
                                                z13 = true;
                                            }
                                            if (str != null) {
                                                z13 = true;
                                            }
                                            z11 = true;
                                        } else if (Lg.n.f2(z15, "server_max_window_bits")) {
                                            if (num2 != null) {
                                                z13 = true;
                                            }
                                            if (str != null) {
                                                num2 = Lg.m.W1(str);
                                            } else {
                                                num2 = null;
                                            }
                                            if (num2 == null) {
                                                z13 = true;
                                            }
                                        } else if (!Lg.n.f2(z15, "server_no_context_takeover")) {
                                            z13 = true;
                                        } else {
                                            if (z12) {
                                                z13 = true;
                                            }
                                            if (str != null) {
                                                z13 = true;
                                            }
                                            z12 = true;
                                        }
                                    }
                                    z10 = true;
                                } else {
                                    z13 = true;
                                    i12 = i13;
                                }
                                i10 = 0;
                            }
                        }
                        i11++;
                        i10 = 0;
                    }
                    ((C3591f) this.f37372Z).f33272e = new C3592g(z10, num, z11, num2, z12, z13);
                    if (z13 || num != null || (num2 != null && !new Cf.e(8, 15, 1).s(num2.intValue()))) {
                        C3591f c3591f = (C3591f) this.f37372Z;
                        synchronized (c3591f) {
                            c3591f.f33283p.clear();
                            c3591f.b(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        ((C3591f) this.f37372Z).d(Xh.b.f22002g + " WebSocket " + ((z) this.f37373h0).f21336a.g(), b10);
                        Object obj = this.f37372Z;
                        ((C3591f) obj).f33269b.f((C3591f) obj, d10);
                        ((C3591f) this.f37372Z).e();
                        return;
                    } catch (Exception e13) {
                        ((C3591f) this.f37372Z).c(e13, null);
                        return;
                    }
                } catch (IOException e14) {
                    ((C3591f) this.f37372Z).c(e14, d10);
                    Xh.b.c(d10);
                    if (eVar != null) {
                        eVar.a(true, true, null);
                        return;
                    }
                    return;
                }
        }
    }

    public C4262a(C3591f c3591f, z zVar) {
        this.f37372Z = c3591f;
        this.f37373h0 = zVar;
    }
}
