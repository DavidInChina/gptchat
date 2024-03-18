package Zh;

import ai.m;
import ai.n;
import di.t;
import id.AbstractC3557B;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f23765e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f23766f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, String str) {
        super(str, true);
        this.f23765e = 1;
        this.f23766f = nVar;
    }

    @Override // Zh.a
    public final long a() {
        int i10 = 0;
        switch (this.f23765e) {
            case 0:
                ((AbstractC6216a) this.f23766f).mo122invoke();
                return -1L;
            case 1:
                n nVar = (n) this.f23766f;
                long nanoTime = System.nanoTime();
                Iterator it = nVar.f24298e.iterator();
                long j6 = Long.MIN_VALUE;
                m mVar = null;
                int i11 = 0;
                while (it.hasNext()) {
                    m mVar2 = (m) it.next();
                    AbstractC3557B.b0("connection", mVar2);
                    synchronized (mVar2) {
                        if (nVar.b(mVar2, nanoTime) > 0) {
                            i11++;
                        } else {
                            i10++;
                            long j10 = nanoTime - mVar2.f24293q;
                            if (j10 > j6) {
                                mVar = mVar2;
                                j6 = j10;
                            }
                        }
                    }
                }
                long j11 = nVar.f24295b;
                if (j6 < j11 && i10 <= nVar.f24294a) {
                    if (i10 > 0) {
                        return j11 - j6;
                    }
                    if (i11 <= 0) {
                        return -1L;
                    }
                    return j11;
                }
                AbstractC3557B.Z(mVar);
                synchronized (mVar) {
                    if (!(!mVar.f24292p.isEmpty())) {
                        if (mVar.f24293q + j6 == nanoTime) {
                            mVar.f24286j = true;
                            nVar.f24298e.remove(mVar);
                            Socket socket = mVar.f24280d;
                            AbstractC3557B.Z(socket);
                            Xh.b.d(socket);
                            if (nVar.f24298e.isEmpty()) {
                                nVar.f24296c.a();
                            }
                        }
                    }
                }
                return 0L;
            default:
                t tVar = (t) this.f23766f;
                tVar.getClass();
                try {
                    tVar.f28625D0.m(2, 0, false);
                } catch (IOException e10) {
                    tVar.h(e10);
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i10, Object obj) {
        super(str, true);
        this.f23765e = i10;
        this.f23766f = obj;
    }
}
