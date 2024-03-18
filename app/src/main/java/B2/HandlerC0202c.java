package B2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Set;
import s2.AbstractC5530A;
import s2.C5536f;
import x8.L;
import x8.N;

/* renamed from: B2.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC0202c extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0203d f1749a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0202c(C0203d c0203d, Looper looper) {
        super(looper);
        this.f1749a = c0203d;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Set<n> set;
        Set<n> set2;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 == 1) {
                C0203d c0203d = this.f1749a;
                if (obj == c0203d.f1773x && c0203d.i()) {
                    c0203d.f1773x = null;
                    if (obj2 instanceof Exception) {
                        c0203d.k((Exception) obj2, false);
                        return;
                    }
                    try {
                        byte[] bArr = (byte[]) obj2;
                        if (c0203d.f1754e == 3) {
                            y yVar = c0203d.f1751b;
                            byte[] bArr2 = c0203d.f1772w;
                            int i11 = AbstractC5530A.f45131a;
                            yVar.m(bArr2, bArr);
                            C5536f c5536f = c0203d.f1758i;
                            synchronized (c5536f.f45153Y) {
                                set2 = c5536f.f45155h0;
                            }
                            for (n nVar : set2) {
                                nVar.b();
                            }
                            return;
                        }
                        byte[] m10 = c0203d.f1751b.m(c0203d.f1771v, bArr);
                        int i12 = c0203d.f1754e;
                        if ((i12 == 2 || (i12 == 0 && c0203d.f1772w != null)) && m10 != null && m10.length != 0) {
                            c0203d.f1772w = m10;
                        }
                        c0203d.f1765p = 4;
                        C5536f c5536f2 = c0203d.f1758i;
                        synchronized (c5536f2.f45153Y) {
                            set = c5536f2.f45155h0;
                        }
                        for (n nVar2 : set) {
                            nVar2.a();
                        }
                        return;
                    } catch (Exception e10) {
                        c0203d.k(e10, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        C0203d c0203d2 = this.f1749a;
        if (obj == c0203d2.f1774y) {
            if (c0203d2.f1765p == 2 || c0203d2.i()) {
                c0203d2.f1774y = null;
                boolean z10 = obj2 instanceof Exception;
                U3.u uVar = c0203d2.f1752c;
                if (z10) {
                    uVar.K((Exception) obj2, false);
                    return;
                }
                try {
                    c0203d2.f1751b.n((byte[]) obj2);
                    uVar.f17493h0 = null;
                    N V10 = N.V((Set) uVar.f17492Z);
                    ((Set) uVar.f17492Z).clear();
                    L listIterator = V10.listIterator(0);
                    while (listIterator.hasNext()) {
                        C0203d c0203d3 = (C0203d) listIterator.next();
                        if (c0203d3.l()) {
                            c0203d3.h(true);
                        }
                    }
                } catch (Exception e11) {
                    uVar.K(e11, true);
                }
            }
        }
    }
}
