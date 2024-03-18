package io.ktor.websocket;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public enum s {
    f33672Z("TEXT"),
    f33673h0("BINARY"),
    f33674i0("CLOSE"),
    f33675j0("PING"),
    f33676k0("PONG");
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f33678Y;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
        r10 = null;
     */
    static {
        s sVar;
        s[] values = values();
        if (values.length == 0) {
            sVar = null;
        } else {
            sVar = values[0];
            int l32 = kf.q.l3(values);
            if (l32 != 0) {
                int i10 = sVar.f33678Y;
                Cf.f it = new Cf.e(1, l32, 1).iterator();
                while (it.f3111h0) {
                    s sVar2 = values[it.a()];
                    int i11 = sVar2.f33678Y;
                    if (i10 < i11) {
                        sVar = sVar2;
                        i10 = i11;
                    }
                }
            }
        }
        AbstractC3557B.Z(sVar);
        int i12 = sVar.f33678Y + 1;
        s[] sVarArr = new s[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            s[] values2 = values();
            int length = values2.length;
            int i14 = 0;
            boolean z10 = false;
            s sVar3 = null;
            while (true) {
                if (i14 < length) {
                    s sVar4 = values2[i14];
                    if (sVar4.f33678Y == i13) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        sVar3 = sVar4;
                    }
                    i14++;
                } else if (z10) {
                }
            }
            sVarArr[i13] = sVar3;
        }
    }

    s(String str) {
        this.f33678Y = r2;
    }
}
