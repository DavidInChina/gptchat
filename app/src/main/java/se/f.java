package se;

import Ad.l;
import Fe.n;
import Fe.t;
import Pg.s;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.EOFException;
import java.util.List;
import k6.AbstractC4194d;
import nf.C4832l;
import pf.AbstractC5163j;
import te.C5757a;
import xe.AbstractC6432u;
import xe.AbstractC6435x;
import xe.C6433v;
import xe.C6434w;
import ze.AbstractC6845d;

/* loaded from: classes.dex */
public final class f extends AbstractC6845d {

    /* renamed from: a  reason: collision with root package name */
    public final C6434w f45557a;

    /* JADX WARN: Type inference failed for: r2v15, types: [pf.j, wf.n] */
    public f() {
        int i10;
        Throwable th2;
        R4.b.D1(C5757a.f46116Z);
        StringBuilder sb2 = new StringBuilder();
        char[] cArr = n.f5337a;
        Me.c cVar = new Me.c();
        while (true) {
            try {
                i10 = 16;
                if ((cVar.f12044j0 - cVar.f12046l0) + cVar.f12047m0 >= 16) {
                    break;
                }
                String str = (String) s.b(t.f5362b.e());
                if (str == null) {
                    t.f5363c.start();
                    str = (String) l.a1(C4832l.f40334Y, new AbstractC5163j(2, null));
                }
                N.E0(cVar, str, 0, str.length(), Lg.a.f11131a);
            } catch (Throwable th3) {
                cVar.close();
                throw th3;
            }
        }
        Me.d p10 = cVar.p();
        AbstractC3557B.c0("<this>", p10);
        byte[] bArr = new byte[16];
        boolean z10 = true;
        Ne.c b10 = Ne.d.b(p10, 1);
        if (b10 != null) {
            int i11 = 0;
            while (true) {
                try {
                    int min = Math.min(i10, b10.f12023c - b10.f12022b);
                    R4.b.P1(b10, bArr, i11, min);
                    i10 -= min;
                    i11 += min;
                    if (i10 > 0) {
                        try {
                            b10 = Ne.d.c(p10, b10);
                            if (b10 == null) {
                                break;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            z10 = false;
                            if (z10) {
                                Ne.d.a(p10, b10);
                            }
                            throw th2;
                        }
                    } else {
                        Ne.d.a(p10, b10);
                        break;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
        }
        if (i10 <= 0) {
            sb2.append(Fe.c.c(bArr));
            String sb3 = sb2.toString();
            AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
            C6433v c6433v = new C6433v();
            List list = AbstractC6435x.f49956a;
            c6433v.f("Upgrade", "websocket");
            c6433v.f("Connection", "Upgrade");
            c6433v.f("Sec-WebSocket-Key", sb3);
            c6433v.f("Sec-WebSocket-Version", "13");
            this.f45557a = c6433v.n();
            return;
        }
        throw new EOFException(AbstractC4194d.v("Premature end of stream: expected ", i10, " bytes"));
    }

    @Override // ze.AbstractC6848g
    public final AbstractC6432u c() {
        return this.f45557a;
    }

    public final String toString() {
        return "WebSocketContent";
    }
}
