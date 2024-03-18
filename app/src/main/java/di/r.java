package di;

import id.AbstractC3557B;
import ii.C3591f;
import ii.C3595j;
import java.io.IOException;
import java.net.SocketTimeoutException;
import ji.C4138m;

/* loaded from: classes2.dex */
public final class r extends Zh.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f28615e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f28616f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f28617g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(String str, Object obj, long j6, int i10) {
        super(str, true);
        this.f28615e = i10;
        this.f28617g = obj;
        this.f28616f = j6;
    }

    private long b() {
        Object obj;
        boolean z10;
        synchronized (((t) this.f28617g)) {
            obj = this.f28617g;
            if (((t) obj).f28641s0 < ((t) obj).f28640r0) {
                z10 = true;
            } else {
                ((t) obj).f28640r0++;
                z10 = false;
            }
        }
        if (z10) {
            ((t) obj).h(null);
            return -1L;
        }
        t tVar = (t) obj;
        tVar.getClass();
        try {
            tVar.f28625D0.m(1, 0, false);
        } catch (IOException e10) {
            tVar.h(e10);
        }
        return this.f28616f;
    }

    @Override // Zh.a
    public final long a() {
        int i10;
        switch (this.f28615e) {
            case 0:
                return b();
            default:
                C3591f c3591f = (C3591f) this.f28617g;
                synchronized (c3591f) {
                    try {
                        if (!c3591f.f33288u) {
                            C3595j c3595j = c3591f.f33278k;
                            if (c3595j != null) {
                                if (c3591f.f33290w) {
                                    i10 = c3591f.f33289v;
                                } else {
                                    i10 = -1;
                                }
                                c3591f.f33289v++;
                                c3591f.f33290w = true;
                                if (i10 != -1) {
                                    StringBuilder sb2 = new StringBuilder("sent ping but didn't receive pong within ");
                                    sb2.append(c3591f.f33271d);
                                    sb2.append("ms (after ");
                                    c3591f.c(new SocketTimeoutException(android.gov.nist.core.a.l(sb2, i10 - 1, " successful ping/pongs)")), null);
                                } else {
                                    try {
                                        C4138m c4138m = C4138m.f36722i0;
                                        AbstractC3557B.c0("payload", c4138m);
                                        c3595j.a(9, c4138m);
                                    } catch (IOException e10) {
                                        c3591f.c(e10, null);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return this.f28616f;
        }
    }
}
