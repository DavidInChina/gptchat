package J2;

import android.os.Handler;
import android.os.Message;
import s2.AbstractC5530A;
import y2.C6527n;

/* loaded from: classes.dex */
public final class h implements Handler.Callback {

    /* renamed from: Y  reason: collision with root package name */
    public final Handler f8752Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ j f8753Z;

    public h(j jVar, C2.j jVar2) {
        this.f8753Z = jVar;
        Handler l10 = AbstractC5530A.l(this);
        this.f8752Y = l10;
        jVar2.a(this, l10);
    }

    public final void a(long j6) {
        j jVar = this.f8753Z;
        if (this == jVar.f8789s2 && jVar.f2591Q0 != null) {
            if (j6 == Long.MAX_VALUE) {
                jVar.f2574E1 = true;
                return;
            }
            try {
                jVar.s0(j6);
                jVar.B0(jVar.f8783m2);
                jVar.f2578G1.f50593e++;
                jVar.A0();
                jVar.a0(j6);
            } catch (C6527n e10) {
                jVar.f2576F1 = e10;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i10 = message.arg1;
        int i11 = message.arg2;
        int i12 = AbstractC5530A.f45131a;
        a(((i10 & 4294967295L) << 32) | (4294967295L & i11));
        return true;
    }
}
