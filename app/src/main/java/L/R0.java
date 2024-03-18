package L;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class R0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f10057a = 100000;

    /* renamed from: b  reason: collision with root package name */
    public U3.c f10058b;

    /* renamed from: c  reason: collision with root package name */
    public U3.c f10059c;

    /* renamed from: d  reason: collision with root package name */
    public int f10060d;

    /* renamed from: e  reason: collision with root package name */
    public Long f10061e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10062f;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[LOOP:0: B:28:0x0061->B:34:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[EDGE_INSN: B:38:0x0076->B:35:0x0076 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(T0.z zVar) {
        T0.z zVar2;
        String str;
        U3.c cVar;
        U3.c cVar2;
        T0.z zVar3;
        this.f10062f = false;
        U3.c cVar3 = this.f10058b;
        if (cVar3 != null) {
            zVar2 = (T0.z) cVar3.f17397h0;
        } else {
            zVar2 = null;
        }
        if (AbstractC3557B.K(zVar, zVar2)) {
            return;
        }
        String str2 = zVar.f16830a.f12512Y;
        U3.c cVar4 = this.f10058b;
        if (cVar4 != null && (zVar3 = (T0.z) cVar4.f17397h0) != null) {
            str = zVar3.f16830a.f12512Y;
        } else {
            str = null;
        }
        if (AbstractC3557B.K(str2, str)) {
            U3.c cVar5 = this.f10058b;
            if (cVar5 != null) {
                cVar5.f17397h0 = zVar;
                return;
            }
            return;
        }
        this.f10058b = new U3.c(this.f10058b, 2, zVar);
        this.f10059c = null;
        int length = zVar.f16830a.f12512Y.length() + this.f10060d;
        this.f10060d = length;
        if (length > this.f10057a) {
            U3.c cVar6 = this.f10058b;
            if (cVar6 != null) {
                cVar = (U3.c) cVar6.f17396Z;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                while (true) {
                    if (cVar6 != null) {
                        U3.c cVar7 = (U3.c) cVar6.f17396Z;
                        if (cVar7 != null) {
                            cVar2 = (U3.c) cVar7.f17396Z;
                            if (cVar2 != null) {
                                break;
                            }
                            cVar6 = (U3.c) cVar6.f17396Z;
                        }
                    }
                    cVar2 = null;
                    if (cVar2 != null) {
                    }
                }
                if (cVar6 != null) {
                    cVar6.f17396Z = null;
                }
            }
        }
    }
}
