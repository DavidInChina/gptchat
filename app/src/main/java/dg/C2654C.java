package dg;

import Mf.V;
import id.AbstractC3557B;
import java.util.Map;

/* renamed from: dg.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2654C implements V {

    /* renamed from: b  reason: collision with root package name */
    public final Yf.q f28289b;

    public C2654C(Yf.q qVar) {
        AbstractC3557B.c0("packageFragment", qVar);
        this.f28289b = qVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Yf.q qVar = this.f28289b;
        sb2.append(qVar);
        sb2.append(": ");
        sb2.append(((Map) A7.b.X0(qVar.f22380n0, Yf.q.f22377r0[0])).keySet());
        return sb2.toString();
    }
}
